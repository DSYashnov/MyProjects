package Calendar;

public class Calendar {
	public static void main(String[]args) {
		java.util.Calendar c = java.util.Calendar.getInstance();
		c.set(2004, 0, 7, 15, 40);
		long day1 = c.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		c.setTimeInMillis(day1);
		System.out.println("New time" + c.get(c.HOUR_OF_DAY));
		c.add(c.DATE, 35);
		System.out.println("Add 35 day" + c.getTime());
		c.roll(c.DATE, 35);
		System.out.println("Roll 35 day" + c.getTime());
		c.set(c.DATE, 1);
		System.out.println("Set date in 1" + c.getTime());
	}
}
		
	