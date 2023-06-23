//package game;
//
//import java.util.Scanner;
//
//public class UnderWaterMap {
//	Scanner sc = new Scanner(System.in);
//	Text text = new Text();
//
//	public void mainRoom() {
//
//		System.out.println("WELCOME TO THE MAIN ROOM ");
//		System.out.println("Do you want to go N, E, S, W ?");
//		System.out.println("Type the letter to head that way.");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			northRoomOne();
//			break;
//		case "S":
//			southRoomFour();
//			break;
//		case "E":
//			southRoomOne();
//			break;
//		case "W":
//			southRoomTwo();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//
//	}
//
//	public void northRoomOne() {
//		text.shipWreck();
//		System.out.println("Do you want to go N, S ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			northRoomTwo();
//			break;
//		case "S":
//			mainRoom();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void northRoomTwo() {
//		text.whirlPool();
//		System.out.println("Do you want to go N, S, E, W ?");
//
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			northRoomFour();
//			break;
//		case "S":
//			southRoomOne();
//			break;
//
//		case "E":
//			northRoomFive();
//			break;
//		case "W":
//			southRoomThree();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void northRoomThree() {
//		text.sharkAttack();
//		System.out.println("Do you want to go E ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "E":
//			northRoomTwo();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void northRoomFour() {
//		app.FightAngler();
//		text.Story2();
//		System.out.println("Do you want to go N, S ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			northRoomSix();
//			break;
//		case "S":
//			southRoomTwo();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//
//	}
//
//	public void northRoomFive() {
//		System.out.println("Man there are sure a lot of bubbles in here");
//
//		System.out.println("Do you want to go N, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			southRoomSix();
//			break;
//		case "W":
//			southRoomTwo();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//
//	}
//
//	public void northRoomSix() {
//		text.nemo();
//		System.out.println("Do you want to go S, E ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "S":
//			southRoomFour();
//			break;
//		case "E":
//			southRoomOne();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomOne() {
//		app.underwaterTavern();
//		System.out.println("Do you want to go S, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "S":
//			southRoomFour();
//			break;
//		case "W":
//			southRoomTwo();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomTwo() {
//		app.FightCrab();
//		text.Story1();
//		System.out.println("Do you want to go S, E ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "S":
//			southRoomThree();
//			break;
//
//		case "E":
//			mainRoom();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomThree() {
//		text.karaoke();
//		System.out.println("Do you want to go N, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			southRoomTwo();
//			break;
//		case "W":
//			southRoomSix();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomFour() {
//		System.out.println("You swim into complete darkness");
//		System.out.println("To dark to see where to go, I might just guess?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			mainRoom();
//			break;
//		case "S":
//			southRoomNine();
//			break;
//		case "E":
//			southRoomFive();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomFive() {
//		text.ariel();
//		System.out.println("Do you want to go N, S, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			southRoomOne();
//			break;
//		case "S":
//			southRoomTen();
//			break;
//		case "W":
//			southRoomFour();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomSix() {
//
//		app.FightJelly();
//		System.out.println("Do you want to go S, E ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "S":
//			southRoomSeven();
//			break;
//		case "E":
//			southRoomThree();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomSeven() {
//		System.out.println("Something smells fishy in here");
//		System.out.println("Do you want to go N, S, E ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			northRoomSix();
//			break;
//		case "S":
//			southRoomThirteen();
//			break;
//		case "E":
//			southRoomEight();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomEight() {
//		app.FightAngler();
//		text.Story2();
//		System.out.println("Do you want to go E, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//
//		case "E":
//			southRoomNine();
//			break;
//		case "W":
//			southRoomSeven();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomNine() {
//		text.caligula();
//		System.out.println("Do you want to go N, S, E, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			northRoomFour();
//			break;
//		case "S":
//			southRoomTwelve();
//			break;
//
//		case "E":
//			southRoomTen();
//			break;
//		case "W":
//			southRoomEight();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomTen() {
//		text.shipWreck();
//		System.out.println("Do you want to go N, S, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			northRoomFive();
//			break;
//		case "S":
//			southRoomEleven();
//			break;
//		case "W":
//			southRoomNine();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomEleven() {
//		System.out.println("You hear clacking and snapping in the distance.");
//		System.out.println("Do you want to go N, E, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			southRoomTen();
//			break;
//
//		case "E":
//			southRoomFourteen();
//			break;
//		case "W":
//			southRoomTwelve();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomTwelve() {
////		app.FightCrab();
//		System.out.println("Do you want to go N, E, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//		case "N":
//			southRoomNine();
//			break;
//		case "E":
//			southRoomEleven();
//			break;
//		case "W":
//			southRoomThirteen();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomThirteen() {
//		text.krustyKrab();
//		System.out.println("Do you want to go N, W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//
//		case "E":
//			southRoomTwelve();
//			break;
//		case "W":
//			southRoomSeven();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//	}
//
//	public void southRoomFourteen() {
//		text.underWaterCave();
//		System.out.println("Do you want to go W ?");
//		String direction = sc.nextLine().toUpperCase();
//		switch (direction) {
//
//		case "W":
//			southRoomEleven();
//			break;
//		default:
//			System.out.println("Not a valid choice");
//			northRoomOne();
//		}
//
//	}
//}