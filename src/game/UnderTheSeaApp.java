package game;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UnderTheSeaApp {

	Scanner sc = new Scanner(System.in);
	Text text = new Text();
	Controls controls = new Controls();
	Character player = new Player("", 15, 15, 50);
	Character jelly = new Monster("Jelificent", 14.0, 17.0, 50.0);
	Character angler = new Monster("Anglerina", 15.0, 12.0, 65.0);
	Character crab = new Monster("Crabalicious", 18.0, 13.0, 45.0);
	double playerStartingHealth = player.getHp();

	public static void main(String[] args) {

		UnderTheSeaApp uts = new UnderTheSeaApp();

		uts.run();

	}

	public void run() {

		OpeningMenu();
		FightCrab();
		text.Story1();
		FightAngler();
		text.Story2();
		FightJelly();
		

	}

	public void playerDies() {
		System.out.println("Continue? \n1: Yes.\n2: No");
		int userChoice = sc.nextInt();

		switch (userChoice) {
		case 1:
			run();
			break;
		case 2:
			System.out.println("Thanks for playing");
			break;
		default:
			System.out.println("Pick 1 or 2");
			userChoice = sc.nextInt();

		}
	}

	private void OpeningMenu() {
		text.screenCheck();
		controls.buttonPress(sc.nextLine());
		if (controls.playerWantsToContinue()) {
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
		}
		text.startStory(player.getName());
		controls.buttonPress(sc.nextLine());
		if (controls.playerWantsToContinue()) {
			text.storyPt1(player.getName());
			controls.unpressButton();
		}

	}

	private void FightCrab() {
		boolean fightingCrab = true;

		
		text.crabIntro();
		while (fightingCrab) {
			CrabHpMovementCheck();
			System.out.println("Your HP: " + player.getHp() + "             Crab HP: " + crab.getHp());
			controls.CombatMoves();

			controls.buttonPress(sc.nextLine());
			if (controls.playerWantsToContinue()) {
				double damageDoneToMonster = Combatable.combat(player.getAtk(), crab.getDef());
				System.out.println("you hit the crab for " + damageDoneToMonster + " damage");
				crab.setHp(crab.getHp() - damageDoneToMonster);
				if (crab.getHp() <= 0) {

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

	private void FightAngler() {
		boolean fightingAngler = true;

		System.out.println("You come across a very angry angler.");
		text.anglerIntro();
		while (fightingAngler) {
		AnglerHpMovementCheck();
			System.out.println("Your HP: " + player.getHp() + "             Angler HP: " + angler.getHp());
			controls.CombatMoves();

			controls.buttonPress(sc.nextLine());
			if (controls.playerWantsToContinue()) {
				double damageDoneToMonster = Combatable.combat(player.getAtk(), angler.getDef());
				System.out.println("you hit the angler for " + damageDoneToMonster + " damage");
				angler.setHp(angler.getHp() - damageDoneToMonster);
				if (angler.getHp() <= 0) {

					System.out.println("you beat the angler");
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

			}

			if (player.getHp() <= 0) {
				System.out.println("Continue? \n1: Yes.\n2: No");
				int userChoice = sc.nextInt();
				switch (userChoice) {
				case 1:
					run();
					break;
				case 2:
					System.out.println("Thanks for playing");
					break;
				default:
					System.out.println("Pick 1 or 2");
					break;

				}
			}

		}

	}

	private void FightJelly() {
		boolean fightingJelly = true;

		System.out.println("You come across a very angry Jelly.");
		text.JellyIntro();
		while (fightingJelly) {
			JellyHpMovementCheck();
			System.out.println("Your HP: " + player.getHp() + "             Jelly HP: " + jelly.getHp());
			controls.CombatMoves();

			controls.buttonPress(sc.nextLine());
			if (controls.playerWantsToContinue()) {
				double damageDoneToMonster = Combatable.combat(player.getAtk(), jelly.getDef());
				System.out.println("you hit the jelly for " + damageDoneToMonster + " damage");
				jelly.setHp(jelly.getHp() - damageDoneToMonster);
				if (jelly.getHp() <= 0) {

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

			}

			if (player.getHp() <= 0) {
				System.out.println("Continue? \n1: Yes.\n2: No");
				int userChoice = sc.nextInt();
				switch (userChoice) {
				case 1:
					run();
					break;
				case 2:
					System.out.println("Thanks for playing");
					break;
				default:
					System.out.println("Pick 1 or 2");
					break;

				}
			}

		}

	}
}
