public class Loopy{
public static void main (String[]args){
	int x = 1;
	System.out.println("before start");
	while(x < 4) {
		System.out.println("in cicle");
		System.out.println("x = " + x);
		x = x + 1;
	}
	System.out.println("after finish");
}
}