package game;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UnderTheSeaApp {

	Scanner sc = new Scanner(System.in);
	Text text = new Text();
	Controls controls = new Controls();
	Character player = new Player("", 16, 16, 60);
	Character jelly = new Monster("Jelificent", 14.0, 18.0, 50.0);
	Character angler = new Monster("Anglerina", 15.0, 12.0, 65.0);
	Character crab = new Monster("Crabalicious", 20.0, 13.0, 45.0);
	double playerStartingHealth = player.getHp();

	public static void main(String[] args) {

		UnderTheSeaApp uts = new UnderTheSeaApp();

		uts.run();

	}

	public void run() {

		OpeningMenu();
		mainRoom();

	}

	public void playerDies() {
		System.out.println("Respawn? \n1: Yes.\n2: No");
		int userChoice = sc.nextInt();
		switch (userChoice) {
		case 1:
			player = new Player("", 15, 15, 55);
			jelly.setHp(50);
			angler.setHp(65);
			crab.setHp(45);
			UnderTheSeaApp uts=new UnderTheSeaApp();
			uts.run();
			break;
		case 2:
			System.out.println("Thanks for playing");
			System.exit(0);
			break;
		default:
			System.out.println("Pick 1 or 2");
			break;

		}
	}

	public void OpeningMenu() {

		System.out.println("                  ");
		System.out.println("     _            ");
		System.out.println("   _/-\\_            ");
		System.out.println("     0            ");
		System.out.println("    -l-            ");
		System.out.println("     /\\           ");

		System.out.println("Please enter your name");
		player.setName(sc.nextLine());
		text.welcomePlayer(player.getName());
		controls.unpressButton();

		text.startStory(player.getName());
		controls.buttonPress(sc.nextLine());
		if (controls.playerWantsToContinue()) {
			text.storyPt1(player.getName());
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			controls.unpressButton();
		}

	}

	public void FightCrab() {
		boolean fightingCrab = true;
		if (crab.getHp() <= 0) {
			fightingCrab = false;
			System.out.println("You see a dead crab, you wonder if there is any melted butter nearby");
		} else {
			text.crabIntro();
		}
		while (fightingCrab) {
			CrabHpMovementCheck();
			System.out.println("Your HP: " + player.getHp() + "             Crab HP: " + crab.getHp());
			controls.CombatMoves();

			controls.buttonPress(sc.nextLine());
			if (controls.playerWantsToContinue()) {
				double damageDoneToMonster = Combatable.combat(player.getAtk(), crab.getDef());
				System.out.println("you hit the crab for " + damageDoneToMonster + " damage");
				crab.setHp(crab.getHp() - damageDoneToMonster);
				if (areAllMonstersDead()) {
					fightingCrab = false;
					break;
				}
				if (crab.getHp() <= 0&& !areAllMonstersDead()) {

					System.out.println("you beat the crab");

					

					text.CrabReward();
					player.setAtk(player.getAtk() + 7);
					player.setHp(playerStartingHealth);
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					fightingCrab = false;
				} else {

					double damageTakenByPlayer = Combatable.combat(crab.getAtk(), player.getDef());
					System.out.println("Crab hits back for " + damageTakenByPlayer + " damage.");
					player.setHp(player.getHp() - damageTakenByPlayer);

					System.out.println("Your HP: " + player.getHp() + "\nCrab HP: " + crab.getHp());

					if (player.getHp() <= 0) {
						text.playerDeadvsCrab();
						System.out.println("you die");
						fightingCrab = false;
					}
				}

			} else if (controls.playerWantsToGoBack()) {
				mainRoom();
			}

			if (player.getHp() <= 0) {
				playerDies();
			}

		}

	}

	public void CrabHpMovementCheck() {
		if (player.getHp() <= 0) {
			text.playerDeadvsCrab();
		} else if (player.getHp() > playerStartingHealth * .50) {
			text.playerAtFullHPvsCrab();
		} else if (player.getHp() <= playerStartingHealth * .50 && player.getHp() > 0) {
			text.playerAtHalfHPvsCrab();
		}
	}

	public void AnglerHpMovementCheck() {
		if (player.getHp() <= 0) {
			text.playerDeadvsAngler();
		} else if (player.getHp() > playerStartingHealth * .50) {
			text.playerAtFullHPvsAngler();
		} else if (player.getHp() <= playerStartingHealth * .50 && player.getHp() > 0) {
			text.playerAtHalfHPvsAngler();
		}
	}

	public void JellyHpMovementCheck() {
		if (player.getHp() <= 0) {
			text.playerDeadvsJelly();
		} else if (player.getHp() > playerStartingHealth * .50) {
			text.playerAtFullHPvsJelly();
		} else if (player.getHp() <= playerStartingHealth * .50 && player.getHp() > 0) {
			text.playerAtHalfHPvsJelly();
		}
	}

	public void FightAngler() {
		boolean fightingAngler = true;
		if (angler.getHp() <= 0) {
			fightingAngler = false;
			System.out.println(
					"You are not sure what you are looking at, but it has too many teeth and youre glad its dead");
		} else {
			text.anglerIntro();
		}
		while (fightingAngler) {
			AnglerHpMovementCheck();
			System.out.println("Your HP: " + player.getHp() + "             Angler HP: " + angler.getHp());
			controls.CombatMoves();

			controls.buttonPress(sc.nextLine());
			if (controls.playerWantsToContinue()) {
				double damageDoneToMonster = Combatable.combat(player.getAtk(), angler.getDef());
				System.out.println("you hit the angler for " + damageDoneToMonster + " damage");
				angler.setHp(angler.getHp() - damageDoneToMonster);
				System.out.println("you beat the angler");
				if (areAllMonstersDead()) {
					fightingAngler = false;
					break;
				}
				if (angler.getHp() <= 0 && !areAllMonstersDead()) {

					text.Story2();
					try {
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					text.AnglerReward();
					player.setHp(playerStartingHealth);
					player.setHp(player.getHp() + 10);
					playerStartingHealth = player.getHp();
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					fightingAngler = false;
				} else {

					double damageTakenByPlayer = Combatable.combat(angler.getAtk(), player.getDef());
					System.out.println("Angler hits back for " + damageTakenByPlayer + " damage.");
					player.setHp(player.getHp() - damageTakenByPlayer);

					if (player.getHp() <= 0) {
						text.playerDeadvsAngler();
						System.out.println("you die");

						fightingAngler = false;
					}
				}

			} else if (controls.playerWantsToGoBack()) {
				mainRoom();
			}

			if (player.getHp() <= 0) {
				playerDies();
			}

		}

	}

	public void FightJelly() {
		boolean fightingJelly = true;
		if (jelly.getHp() <= 0) {
			fightingJelly = false;
			System.out.println("You see some weird gelatinous stingers lying around.");
			System.out.println("You think \"I probably shouldnt touch this\"");
		} else {
			text.JellyIntro();
		}
		while (fightingJelly) {
			JellyHpMovementCheck();
			System.out.println("Your HP: " + player.getHp() + "             Jelly HP: " + jelly.getHp());
			controls.CombatMoves();

			controls.buttonPress(sc.nextLine());
			if (controls.playerWantsToContinue()) {
				double damageDoneToMonster = Combatable.combat(player.getAtk(), jelly.getDef());
				System.out.println("you hit the jelly for " + damageDoneToMonster + " damage");
				jelly.setHp(jelly.getHp() - damageDoneToMonster);
				if (areAllMonstersDead()) {
					fightingJelly = false;
					break;
				}
				
				if (jelly.getHp() <= 0&&!areAllMonstersDead()) {
					System.out.println("you beat the jelly");
					
					text.JellyReward();

					player.setHp(playerStartingHealth);
					player.setDef(player.getDef() + 7);
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					fightingJelly = false;
				} else {

					double damageTakenByPlayer = Combatable.combat(jelly.getAtk(), player.getDef());
					System.out.println("Jelly hits back for " + damageTakenByPlayer + " damage.");
					player.setHp(player.getHp() - damageTakenByPlayer);

					if (player.getHp() <= 0) {
						text.playerDeadvsJelly();
						System.out.println("you die");

						fightingJelly = false;
					}
				}

			} else if (controls.playerWantsToGoBack()) {
				mainRoom();
			}

			if (player.getHp() <= 0) {
				playerDies();
			}

		}

	}

	public void coinFlip() {
		// I made this code week 1
		int rng = 1 + (int) (Math.random() * 20);
		double coinFlip = rng % 2;

		System.out.println("While walking along the ocean floor you find a coin and flip it!");
		System.out.println("Press 1 for heads");
		System.out.println("Press 2 for tails");
		String userChoice = sc.nextLine();

		if (coinFlip == 1) {
			System.out.println("Its tails");
		} else {
			System.out.println("its heads");
		}

		if (userChoice.equals("1") && (coinFlip == 0) || userChoice.equals("2") && (coinFlip == 1)) {
			System.out.println("You win");
		} else {
			System.out.println("You lose");
		}
	}

	public void underwaterTavern() {
		System.out.println("You come across an underwater tavern");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("You see a card table with ghosts sitting around");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("You decide to join them for a game");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new BJApp(sc).run();
	}

	public void mainRoom() {

		text.clearScreen();
		text.clearScreen();
		text.clearScreen();
		System.out.println("You are on the bottom of the ocean, is cold and dark, where will you go?");
		System.out.println("Do you want to go N, E, S, W ?");
		System.out.println("Type the letter to head that way.");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			northRoomOne();
			break;
		case "S":
			southRoomFour();
			break;
		case "E":
			southRoomOne();
			break;
		case "W":
			southRoomTwo();
			break;
		default:
			System.out.println("Not a valid choice");
			northRoomOne();
		}

	}

	public void northRoomOne() {
		text.shipWreck();
		System.out.println("Do you want to go N, S ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			northRoomTwo();
			break;
		case "S":
			mainRoom();
			break;
		default:
			System.out.println("Not a valid choice");
			northRoomOne();
		}
	}

	public void northRoomTwo() {
		text.whirlPool();
		System.out.println("Do you want to go N, S, E, W ?");

		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			northRoomFour();
			break;
		case "S":
			northRoomOne();
			break;

		case "E":
			northRoomFive();
			break;
		case "W":
			northRoomThree();
			break;
		default:
			System.out.println("Not a valid choice");
			northRoomTwo();
		}
	}

	public void northRoomThree() {
		text.sharkAttack();
		System.out.println("Do you want to go E ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "E":
			northRoomTwo();
			break;
		default:
			System.out.println("Not a valid choice");
			northRoomThree();
		}
	}

	public void northRoomFour() {
		FightAngler();
		
		System.out.println("Do you want to go N, S ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			northRoomSix();
			break;
		case "S":
			northRoomTwo();
			break;
		default:
			System.out.println("Not a valid choice");
			northRoomFour();
		}

	}

	public void northRoomFive() {
		coinFlip();

		System.out.println("Do you want to go N, S ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			northRoomSix();
			break;
		case "S":
			northRoomTwo();
			break;
		default:
			System.out.println("Not a valid choice");
			northRoomFive();
		}

	}

	public void northRoomSix() {
		text.nemo();
		System.out.println("Do you want to go S, E ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "S":
			northRoomFour();
			break;
		case "E":
			northRoomFive();
			break;
		default:
			System.out.println("Not a valid choice");
			northRoomSix();
		}
	}

	public void southRoomOne() {
		underwaterTavern();
		System.out.println("Do you want to go S, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "S":
			southRoomFive();
			break;
		case "W":
			mainRoom();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomOne();
		}
	}

	public void southRoomTwo() {
		FightCrab();
		if (crab.getHp() > 0) {
			text.Story1();
		}
		System.out.println("Do you want to go S, E ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "S":
			southRoomThree();
			break;

		case "E":
			mainRoom();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomTwo();
		}
	}

	public void southRoomThree() {
		text.karaoke();
		System.out.println("Do you want to go N, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			southRoomTwo();
			break;
		case "W":
			southRoomSix();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomThree();
		}
	}

	public void southRoomFour() {
		System.out.println("You swim into complete darkness");
		System.out.println("Too dark to see where to go, I might just guess?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			mainRoom();
			break;
		case "S":
			southRoomNine();
			break;
		case "E":
			southRoomFive();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomFour();
		}
	}

	public void southRoomFive() {
		text.ariel();
		System.out.println("Do you want to go N, S, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			southRoomOne();
			break;
		case "S":
			southRoomTen();
			break;
		case "W":
			southRoomFour();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomFive();
		}
	}

	public void southRoomSix() {

		FightJelly();
		System.out.println("Do you want to go S, E ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "S":
			southRoomSeven();
			break;
		case "E":
			southRoomThree();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomSix();
		}
	}

	public void southRoomSeven() {
		System.out.println("Something smells fishy in here");
		System.out.println("Do you want to go N, S, E ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			southRoomSix();
			break;
		case "S":
			southRoomThirteen();
			break;
		case "E":
			southRoomEight();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomSeven();
		}
	}

	public void southRoomEight() {
		FightAngler();
		System.out.println("Do you want to go E, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {

		case "E":
			southRoomNine();
			break;
		case "W":
			southRoomSeven();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomEight();
		}
	}

	public void southRoomNine() {
		text.caligula();
		System.out.println("Do you want to go N, S, E, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			northRoomFour();
			break;
		case "S":
			southRoomTwelve();
			break;

		case "E":
			southRoomTen();
			break;
		case "W":
			southRoomEight();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomNine();
		}
	}

	public void southRoomTen() {
		text.shipWreck();
		System.out.println("Do you want to go N, S, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			northRoomFive();
			break;
		case "S":
			southRoomEleven();
			break;
		case "W":
			southRoomNine();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomTen();
		}
	}

	public void southRoomEleven() {
		System.out.println("You hear clacking and snapping in the distance.");
		System.out.println("Do you want to go N, E, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			southRoomTen();
			break;

		case "E":
			southRoomFourteen();
			break;
		case "W":
			southRoomTwelve();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomEleven();
		}
	}

	public void southRoomTwelve() {
		System.out.println("You see a fellow pirate wandering around.");
		System.out.println("Hes muttering \"Why is all the rum gone?\"");
		System.out.println("Do you want to go N, E, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {
		case "N":
			southRoomNine();
			break;
		case "E":
			southRoomEleven();
			break;
		case "W":
			southRoomThirteen();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomTwelve();
		}
	}

	public void southRoomThirteen() {
		text.krustyKrab();
		System.out.println("Do you want to go E, W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {

		case "E":
			southRoomTwelve();
			break;
		case "W":
			southRoomSeven();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomThirteen();
		}
	}

	public void southRoomFourteen() {
		text.underWaterCave();
		System.out.println("Do you want to go W ?");
		String direction = sc.nextLine().toUpperCase();
		switch (direction) {

		case "W":
			southRoomEleven();
			break;
		default:
			System.out.println("Not a valid choice");
			southRoomFourteen();
		}

	}

	public boolean areAllMonstersDead() {
		String choice;
		boolean isCrabDead = crab.getHp() <= 0;
		boolean isJellyDead = jelly.getHp() <= 0;
		boolean isAnglerDead = angler.getHp() <= 0;

		if (isCrabDead && isJellyDead && isAnglerDead) {
			System.out.println("\n\nYou have conquered the monsters of the sea.");
			System.out.println("You see 3 ghosts of the slain monsters. They ask you for forgiveness.");
			System.out.println("Do you forgive them?");
			System.out.println("1: Yes 2: No");
			choice = sc.nextLine();
			switch (choice) {
			case "1":
				text.learnsToForgive();
				break;
			case "2":
				text.doesNotForgive();
				break;
			default:
				System.out.println("Not a valid choice, pick 1 or 2");
				choice = sc.nextLine();
			}
		}
		return isCrabDead && isJellyDead && isAnglerDead;
	}
}