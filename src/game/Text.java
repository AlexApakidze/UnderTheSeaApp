package game;

import java.util.concurrent.TimeUnit;

public class Text {
	public void screenCheck() {
		System.out.println("------------------Top------------------");
		System.out.println("                                       |");
		System.out.println("                                       |");
		System.out.println("                                       |");
		System.out.println("                                       |");
		System.out.println("Please make sure you can see           |");
		System.out.println("the top and bottom of this screen.     |");
		System.out.println("                                       |");
		System.out.println("                                       |");
		System.out.println("-----------------Bottom----------------");
		System.out.println("press 'C' to continue...");
	}

	public void welcomePlayer(String userName) {

		System.out.println(userName + " was an unforgiving Pirate. Who traveled the world causing mayhem.\n" + userName
				+ " never once apologized for any wrong they have done\n" + "Until one day " + userName
				+ " ran into a witch...");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("      ,_           ");
		System.out.println("      \\ \\        ");
		System.out.println("    __/[]\\__      ");
		System.out.println("      {'>'}        ");
		System.out.println("     -//\\\\-      ");
		System.out.println("     //TT\\\\      ");
//		System.out.println("press 'C' to continue...");
	}

	public void startStory(String userName) {
		System.out.println("Witch: " + userName
				+ " I can sense an unforgiving aura around you, you must learn to forgive or it will cost you.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("" + userName + ": Go kick rocks old lady.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Witch: I warned ya...");
		System.out.println("press 'C' to continue...");

	}

	public void storyPt1(String userName) {
		System.out.println("Next day.....");
		System.out.println(
				userName + " loads up their ship and goes out sailing. They hit a bad storm, and the ship went under. "
						+ userName + " wakes up at the bottom of the ocean.\n");
	}

	public void crabIntro() {
		System.out.println("You come across a very cranky crab.");
		System.out.println("                  ");
		System.out.println("                  ");
		System.out.println("  \\/   O   O   \\/ ");
		System.out.println("   \\ __|___|___/ ");
		System.out.println("    |__________|  ");
		System.out.println("     //     \\\\    ");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();

		System.out.println("                  " + "\t \t\t\t\t\t\t\t\t                 ");
		System.out.println("     _            " + " \t\t\t\t\t\t\t\t\t                 ");
		System.out.println("   _/-\\_            " + "\t\t\t\t\t\t\t\t\t  \\/   O  O   \\/ ");
		System.out.println("   | 0            " + "  \t\t\t\t\t\t\t\t\t   \\___|__|___/ ");
		System.out.println("   $-l-;``'        " + " \t\t\t\t\t\t\t\t\t   |__________|  ");
		System.out.println("     /\\           " + "  \t\t\t\t\t\t\t\t\t     //     \\\\    ");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		clearScreen();
		System.out.println("                  " + "\t \t\t\t\t\t\t                 ");
		System.out.println("     _            " + " \t\t\t\t\t\t\t                 ");
		System.out.println("   _/-\\_            " + "\t\t\t\t\t\t\t  \\/   O  O   \\/ ");
		System.out.println("   | 0            " + "  \t\t\t\t\t\t\t   \\___|__|___/ ");
		System.out.println("   $-l-;``'        " + " \t\t\t\t\t\t\t   |__________|  ");
		System.out.println("     /\\           " + "  \t\t\t\t\t\t\t     \\\\     //    ");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();
		System.out.println("                  " + "\t \t\t\t\t\t                 ");
		System.out.println("     _            " + " \t\t\t\t\t\t                 ");
		System.out.println("   _/-\\_            " + "\t\t\t\t\t\t  \\/   O  O   \\/ ");
		System.out.println("   | 0            " + "  \t\t\t\t\t\t   \\___|__|___/ ");
		System.out.println("   $-l-;``'        " + " \t\t\t\t\t\t   |__________|  ");
		System.out.println("     /\\           " + "  \t\t\t\t\t\t     //     \\\\    ");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();
		System.out.println("     _            " + " \t\t\t\t                 ");
		System.out.println("   _/-\\_            " + "\t\t\t\t   \\/   O  O   \\/ ");
		System.out.println("   | 0            " + " \t\t\t\t    \\___|__|___/ ");
		System.out.println("   $-l-;``'        " + " \t\t\t\t    |__________|  ");
		System.out.println("     /\\           " + "  \t\t\t\t      \\\\     //    ");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();

	}

	public void fightCrab() {
		clearScreen();
		System.out.println("                  " + "\t \t\t\t\t\t                 ");
		System.out.println("     _            " + " \t\t\t\t\t\t                 ");
		System.out.println("   _/-\\_            " + "\t\t\t\t\t\t  \\/   O  O   \\/ ");
		System.out.println("   | 0            " + "  \t\t\t\t\t\t   \\___|__|___/ ");
		System.out.println("   $-l-;``'        " + " \t\t\t\t\t\t   |__________|  ");
		System.out.println("     /\\           " + "  \t\t\t\t\t\t     //     \\\\    ");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();
		System.out.println("                  " + " \t\t\t\t                 ");
		System.out.println("     _            " + " \t\t\t\t                 ");
		System.out.println("   _/-\\_            " + "\t\t\t\t   \\/   O  O   \\/ ");
		System.out.println("   | 0            " + " \t\t\t\t    \\___|__|___/ ");
		System.out.println("   $-l-;``'        " + " \t\t\t\t    |__________|  ");
		System.out.println("     /\\           " + "  \t\t\t\t      \\\\     //    ");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();
		System.out.println("                  \t\t " + "                  ");
		System.out.println("     _            \t\t" + "                  ");
		System.out.println("   _/-\\_         \t \t " + "   \\/   O  O   \\/ ");
		System.out.println("   | 0            \t\t" + "     \\___|__|___/ ");
		System.out.println("   $-l-;``'       \t\t" + "     |__________|  ");
		System.out.println("     /\\          \t\t" + "       //     \\\\    ");

		//////////////////////////////////////////////////
		System.out.println("                  " + "                  ");
		System.out.println("     _            " + "                  ");
		System.out.println("   _/-\\_            " + "  \\/   O  O   \\/ ");
		System.out.println("   | 0            " + "     \\___|__|___/ ");
		System.out.println("   $-l-;``'        " + "    |__________|  ");
		System.out.println("     /\\           " + "       //     \\\\    ");

	}

	public void playerAtFullHPvsCrab() {
		System.out.println("     _            " + " \t\t\t\t                 ");
		System.out.println("   _/-\\_            " + "\t\t\t\t   \\/   O  O   \\/ ");
		System.out.println("   | 0            " + " \t\t\t\t    \\___|__|___/ ");
		System.out.println("   $-l-;``'        " + " \t\t\t\t    |__________|  ");
		System.out.println("     /\\           " + "  \t\t\t\t      \\\\     //    ");
	}

	public void playerAtHalfHPvsCrab() {
		System.out.println("                  \t\t " + "                  ");
		System.out.println("     _            \t\t" + "                  ");
		System.out.println("   _/-\\_         \t \t " + "   \\/   O  O   \\/ ");
		System.out.println("   | 0            \t\t" + "     \\___|__|___/ ");
		System.out.println("   $-l-;``'       \t\t" + "     |__________|  ");
		System.out.println("     /\\          \t\t" + "       //     \\\\    ");
	}

	public void playerDeadvsCrab() {
		System.out.println("    RIP         " + "                ");
		System.out.println("     _      " + "                ");
		System.out.println("   _/-\\_     " + " \\/   O  O   \\/ ");
		System.out.println("   | X      " + "   \\___|__|___/ ");
		System.out.println("   $-l-;``' " + "   |__________|  ");
		System.out.println("     /\\    " + "     //     \\\\    ");
	}

	public void Story1() {
		System.out.println(
				"After your long battle with the crab you keep going and come across a shipwreck. \nYou stop to tend your wounds before proceeding\n\n");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void Story2() {
		System.out.println(
				"Your heroic defeat of the dreaded Angler Fish leaves you contemplating the error of the sordid schemes of the stinking sea-dog...\n"
						+ "As you float through the pitch black deep you nurse your wounds and begin to find peace in the deprivation. Your peace is shattered by\n"
						+ "a sting of your hand as the pain rips through your body... ");
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void fightAngler() {
		System.out.println("                  " + "      ___          ");
		System.out.println("     _            " + "     /    \\        ");
		System.out.println("   _/-\\_          " + "    O    --^-  /\\ ");
		System.out.println("   | 0            " + "           o  \\/  | ");
		System.out.println("   $-l-;``'       " + "       \\WW <  /\\  | ");
		System.out.println("     /\\           " + "        \\\\___/  \\/");

	}

	public void anglerIntro() {
		System.out.println("You come across a very pissy fishy.");
		System.out.println("      ___          ");
		System.out.println("     /    \\        ");
		System.out.println("    O   ,--^-.  /\\ ");
		System.out.println("           o  \\/  | ");
		System.out.println("       \\WW <  /\\  | ");
		System.out.println("        \\\\___/  \\/");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();
		System.out.println("                  " + " \t\t\t\t\t\t\t\t\t      ___          ");
		System.out.println("     _            " + " \t\t\t\t\t\t\t\t\t     /    \\        ");
		System.out.println("   _/-\\_          " + "\t\t\t\t\t\t\t\t\t    O    --^-  /\\ ");
		System.out.println("   | 0            " + "  \t\t\t\t\t\t\t\t\t          o  \\/  | ");
		System.out.println("   $-l-;``'       " + " \t\t\t\t\t\t\t\t\t      \\WW <  /\\  | ");
		System.out.println("     /\\           " + "\t\t\t\t\t\t\t\t\t       \\\\___/  \\/");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();
		System.out.println("                  " + " \t\t\t\t\t\t\t      ___          ");
		System.out.println("     _            " + " \t\t\t\t\t\t\t     /    \\        ");
		System.out.println("   _/-\\_          " + "\t\t\t\t\t\t\t    O    --^-  /\\ ");
		System.out.println("   | 0            " + "  \t\t\t\t\t\t\t          o  \\/ | ");
		System.out.println("   $-l-;``'       " + " \t\t\t\t\t\t\t      \\WW >  /\\ | ");
		System.out.println("     /\\           " + "\t\t\t\t\t\t\t       \\\\___/  \\/");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		clearScreen();
		System.out.println("                  " + " \t\t\t\t      ___          ");
		System.out.println("     _            " + " \t\t\t\t     /    \\        ");
		System.out.println("   _/-\\_          " + "\t\t\t\t    O    --^-  /\\ ");
		System.out.println("   | 0            " + "  \t\t\t\t          o  \\/  | ");
		System.out.println("   $-l-;``'       " + " \t\t\t\t      \\WW <  /\\  | ");
		System.out.println("     /\\           " + "\t\t\t\t       \\\\___/  \\/");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();

	}

	public void fightJelly() {
		System.out.println("                  " + "     _______    ");
		System.out.println("     _            " + "    / %%%%%% \\  ");
		System.out.println("   _/-\\_          " + "   / %%%%%%%% \\ ");
		System.out.println("   | 0            " + "   ~~~~~~~~~~~~ ");
		System.out.println("   $-l-;``'       " + "    \\ /  / \\ |  ");
		System.out.println("     /\\           " + "    | | |  |  \\ ");

	}

	public void JellyIntro() {
		System.out.println("You come across a very jealous Jelly.");

		System.out.println("     _______    ");
		System.out.println("    / %%%%%% \\  ");
		System.out.println("   / %%%%%%%% \\ ");
		System.out.println("   ~~~~~~~~~~~~ ");
		System.out.println("    \\ /  / \\ |  ");
		System.out.println("    | | |  |  \\ ");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();

		System.out.println("                  " + "\t\t\t\t\t\t\t\t\t     _______    ");
		System.out.println("     _            " + "\t\t\t\t\t\t\t\t\t    / %%%%%% \\  ");
		System.out.println("   _/-\\_          " + "\t\t\t\t\t\t\t\t\t   / %%%%%%%% \\ ");
		System.out.println("   | 0            " + "\t\t\t\t\t\t\t\t\t   ~~~~~~~~~~~~ ");
		System.out.println("   $-l-;``'       " + "\t\t\t\t\t\t\t\t\t    \\ /  / \\ |  ");
		System.out.println("     /\\           " + "\t\t\t\t\t\t\t\t\t    | | |  |  \\ ");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();

		System.out.println("                  " + "\t\t\t\t\t\t\t     _______    ");
		System.out.println("     _            " + "\t\t\t\t\t\t\t    / %%%%%% \\  ");
		System.out.println("   _/-\\_          " + "\t\t\t\t\t\t\t   / %%%%%%%% \\ ");
		System.out.println("   | 0            " + "\t\t\t\t\t\t\t   ~~~~~~~~~~~~ ");
		System.out.println("   $-l-;``'       " + "\t\t\t\t\t\t\t    \\ /  / \\ |  ");
		System.out.println("     /\\           " + "\t\t\t\t\t\t\t    | | |  | / ");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		clearScreen();
		System.out.println("                  " + "\t\t\t\t     _______    ");
		System.out.println("     _            " + "\t\t\t\t    / %%%%%% \\  ");
		System.out.println("   _/-\\_          " + "\t\t\t\t   / %%%%%%%% \\ ");
		System.out.println("   | 0            " + "\t\t\t\t   ~~~~~~~~~~~~ ");
		System.out.println("   $-l-;``'       " + "\t\t\t\t    \\ /  / \\ |  ");
		System.out.println("     /\\           " + "\t\t\t\t    | | |  |  \\ ");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();

	}

	public void FightKraken() {
		System.out.println("                  " + "  ____________                  ");
		System.out.println("     _            " + "   ~~~~~~~~~~~\\______/\\_      ");
		System.out.println("   _/-\\_          " + "    ~~~~~~~~~~}   @/ ~~~\\      ");
		System.out.println("   | 0            " + "  ~~~~~~~~~~~~}   @\\ ~~~ }>    ");
		System.out.println("   $-l-;``'       " + "    ~~~~~~~~~~}_________/       ");
		System.out.println("     /\\           " + "   __________/       \\/        ");

	}

	public void KrakenIntro() {
		System.out.println("      ________                  ");
		System.out.println("     ~~~~~~~~~\\______/\\_      ");
		System.out.println("      ~~~~~~~~}   @/ ~~~\\      ");
		System.out.println("    ~~~~~~~~~~}   @\\ ~~~ }>    ");
		System.out.println("      ~~~~~~~~}_________/       ");
		System.out.println("      _______/       \\/        ");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void CrabReward() {
		System.out.println("                  ");
		System.out.println("                  ");
		System.out.println("       /  \\       ");
		System.out.println("       \\  /      ");
		System.out.println("        \\/        ");
		System.out.println("        /          ");
		System.out.println("       /          ");
		System.out.println("You loot a crab claw, you feel stronger.\n\n");
	}

	public void JellyReward() {
		System.out.println("                  ");
		System.out.println("     ________    ");
		System.out.println("    / %%%%%% \\   ");
		System.out.println("   / %%%%%%%% \\  ");
		System.out.println("   ~~~~~~~~~~~~   ");
		System.out.println("                  ");
		System.out.println("You loot the Jellys hood, you feel tougher.\n\n");
	}

	public void AnglerReward() {
		System.out.println("                  ");
		System.out.println("                  ");
		System.out.println("         ____      ");
		System.out.println("       /      \\   ");
		System.out.println("      /        O    ");
		System.out.println("     /             ");
		System.out.println("You loot the Anglers light, you feel healthier.\n\n");
	}

	public void clearScreen() {

		{
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		}

	}

	public void playerDeadvsAngler() {

		System.out.println("    RIP     " + "   ___          ");
		System.out.println("     _      " + "  /    \\        ");
		System.out.println("   _/-\\_    " + " O    --^-  /\\ ");
		System.out.println("   | X      " + "        o  \\/  | ");
		System.out.println("   $-l-;``' " + "    \\WW <  /\\  | ");
		System.out.println("     /\\     " + "     \\\\___/  \\/");

	}

	public void playerAtFullHPvsAngler() {

		System.out.println("                  " + " \t\t\t\t      ___          ");
		System.out.println("     _            " + " \t\t\t\t     /    \\        ");
		System.out.println("   _/-\\_          " + "\t\t\t\t    O    --^-  /\\ ");
		System.out.println("   | 0            " + "  \t\t\t\t          o  \\/  | ");
		System.out.println("   $-l-;``'       " + " \t\t\t\t      \\WW <  /\\  | ");
		System.out.println("     /\\           " + "\t\t\t\t       \\\\___/  \\/");

	}

	public void playerAtHalfHPvsAngler() {
		System.out.println("                  " + " \t\t      ___          ");
		System.out.println("     _            " + " \t\t     /    \\        ");
		System.out.println("   _/-\\_          " + "\t\t    O    --^-  /\\ ");
		System.out.println("   | 0            " + "  \t\t          o  \\/  | ");
		System.out.println("   $-l-;``'       " + " \t\t      \\WW <  /\\  | ");
		System.out.println("     /\\           " + "\t\t       \\\\___/  \\/");

	}

	public void playerAtHalfHPvsJelly() {
		System.out.println("                  " + "\t\t     _______    ");
		System.out.println("     _            " + "\t\t    / %%%%%% \\  ");
		System.out.println("   _/-\\_          " + "\t\t   / %%%%%%%% \\ ");
		System.out.println("   | 0            " + "\t\t   ~~~~~~~~~~~~ ");
		System.out.println("   $-l-;``'       " + "\t\t    \\ /  / \\ |  ");
		System.out.println("     /\\           " + "\t\t    | | |  |  \\ ");

	}

	public void playerAtFullHPvsJelly() {
		System.out.println("                  " + "\t\t\t\t     _______    ");
		System.out.println("     _            " + "\t\t\t\t    / %%%%%% \\  ");
		System.out.println("   _/-\\_          " + "\t\t\t\t   / %%%%%%%% \\ ");
		System.out.println("   | 0            " + "\t\t\t\t   ~~~~~~~~~~~~ ");
		System.out.println("   $-l-;``'       " + "\t\t\t\t    \\ /  / \\ |  ");
		System.out.println("     /\\           " + "\t\t\t\t    | | |  |  \\ ");

	}

	public void playerDeadvsJelly() {
		System.out.println("    RIP    " + "     _______    ");
		System.out.println("     _     " + "    / %%%%%% \\  ");
		System.out.println("   _/-\\_   " + "   / %%%%%%%% \\ ");
		System.out.println("   | X     " + "   ~~~~~~~~~~~~ ");
		System.out.println("   $-l-;``'" + "    \\ /  / \\ |  ");
		System.out.println("     /\\    " + "    | | |  |  \\ ");

	}
	
	public void underWaterCave() {
		System.out.println("You find an underwater cave and decide to enter.");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("You look around and see a skeleton, someone did not have a good time");
	}
	

}
