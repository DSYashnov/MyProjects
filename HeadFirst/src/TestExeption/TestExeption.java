package TestException;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.Exception;

class TestException {
	public static void main(String[]args) {
		String test = "No";
		try {
			System.out.println("Начало try");
			doRisky(test);
			System.out.println("Конец try");
		} catch (Exception ex) {
			System.out.println("Жуткое исключение");
		} finally {
			System.out.println("finally");
		}
		System.out.println("конец main");
	}
	static void doRisky(String test) throws Exception {
		System.out.println("Начало опасного метода");
		if ("yes".equals(test)) {
			throw new Exception();
		}
		System.out.println("Конец опасного метода");
		return;
	}
}
		