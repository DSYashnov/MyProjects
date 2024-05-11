class TapeDeck {
	boolean canRecord = false;
	
	void playTape() {
		System.out.println ("Пленка проигрывается");
	}
	void recordTape() {
		System.out.println("Идет запись на пленку");
	}
}
class TapeDeckTestDrive {
	public static void main (String [] args) {
		TapeDeck t = new TapeDeck();
		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true){
			t.recordTape();
		}
	}
}