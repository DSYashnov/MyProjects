import java.io.*;

public class GameSaverTest {
	public static void main (String[]args) {
		GameCharacter one = new GameCharacter (50, "Elf", new String[] {"bow", "sword", "kastet"});
		GameCharacter two = new GameCharacter (200, "Troll", new String[] {"hand", "big axe"});
		GameCharacter three = new GameCharacter (50, "Magician", new String[] {"Magick", "nonvisible"});
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		one = null;
		two = null;
		three = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
			GameCharacter oneRestore = (GameCharacter) is.readObject();
			GameCharacter twoRestore = (GameCharacter) is.readObject();
			GameCharacter threeRestore = (GameCharacter) is.readObject();
			
			System.out.println("Тип первого:" + oneRestore.getType());
			System.out.println("Тип второго:" + twoRestore.getType());
			System.out.println("Тип третьего:" + threeRestore.getType());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


public static class GameCharacter implements Serializable {
	int power;
	String type;
	String[] weapons;
	
	public GameCharacter(int p, String t, String[] w) {
		power = p;
		type = t;
		weapons = w;
	}
	public int getPower() {
		return power;
	}
	public String getType() {
		return type;
	}
	public String getWeapons() {
		String weaponList = "";
		
		for (int i = 0; i < weapons.length; i++) {
			weaponList += weapons[i] + "";
		}
		return weaponList;
		}
	}
}
	
	