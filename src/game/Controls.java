package game;

public class Controls {

	private boolean playerWantsToContinue = false;
	private boolean playerWantsToGoBack = false;
	private boolean playerWantsInfo = false;

	public void buttonPress(String button) {
		if (button.equalsIgnoreCase("c")) {
			playerWantsToContinue = true;

		} else if (button.equalsIgnoreCase("b")) {
			playerWantsToGoBack = true;
		} else if (button.equalsIgnoreCase("i")) {
			playerWantsInfo = true;
		}
	}

	public void unpressButton() {
		playerWantsToContinue = false;
		playerWantsToGoBack = false;
		playerWantsInfo = false;
	}

	public void CombatMoves() {
		System.out.println("Press 'C' to fight!");
		System.out.println("Press 'B' to run!");
	}
	public void error() {
		System.out.println("not a valid input");
	}

	public boolean playerWantsToContinue() {
		return playerWantsToContinue;
	}

	public void setPlayerWantsToContinue(boolean playerWantsToContinue) {
		this.playerWantsToContinue = playerWantsToContinue;
	}

	public boolean playerWantsToGoBack() {
		return playerWantsToGoBack;
	}

	public void setPlayerWantsToGoBack(boolean playerWantsToGoBack) {
		this.playerWantsToGoBack = playerWantsToGoBack;
	}

	public boolean playerWantsInfo() {
		return playerWantsInfo;
	}

	public void setPlayerWantsInfo(boolean playerWantsInfo) {
		this.playerWantsInfo = playerWantsInfo;
	}



}
