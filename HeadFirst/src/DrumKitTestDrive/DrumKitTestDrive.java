class DrumKit {
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare() {
		System.out.println ("бах бах ба-бах");
	}
	void playTopHat() {
		System.out.println("динь динб ди-динь");
	}
}
	class DrumKitTestDrive {
		public static void main (String[]args){
		DrumKit d = new DrumKit();
		d.playSnare();
		d.snare = false;
		d.playTopHat();
		
		if (d.snare == true) {
			d.playSnare();
		}
	}
	}
