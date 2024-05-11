class SimpleDotComTestDrive {
	public static void main (String[]args){
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
	}
}

public class SimpleDotCom {
	int[] locationsCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs){
		locationsCells = locs;
	}
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "Fall";
		for (int cell : locationsCells) {
			if (guess == cell) {
				result = "yup";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationsCells.length) {
			result = "Pizda korably";
		}
		System.out.println(result);
		return result;
	}
}