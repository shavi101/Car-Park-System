import java.io.Serializable;
import java.util.Scanner;

public class DateTime implements Serializable {
	transient Scanner sc = new Scanner(System.in);
	private static final long serialVersionUID = 7959033417193915915L;
	private int day;
	private int month;
	private int year;
	private int seconds;
	private int minutes;
	private int hours;

	public int getDay() {
		System.out.println("Enter Current Day: ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Input!Please Re-enter!");
			sc.next();
		}
		day = sc.nextInt();
		while (day < 1 || day > 31) {
			System.out.println("Invalid Input!Please Re-enter!");
			day = sc.nextInt();
		}
		return day;
	}

	public int getMonth() {

		System.out.println("Enter Current Month: ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Input!Please Re-enter!");
			sc.next();
		}
		month = sc.nextInt();
		while (month < 1 || month > 12) {
			System.out.println("Invalid Input!Please Re-enter!");
			month = sc.nextInt();
		}
		return month;
	}

	public int getYear() {
		System.out.println("Enter Current Year: ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Input!Please Re-enter!");
			sc.next();
		}
		year = sc.nextInt();
		return year;

	}

	public String getDate() {
		System.out.println("Enter current date below");
		return String.valueOf(getYear() + "/" + getMonth() + "/" + getDay());
	}

	public int getHours() {
		System.out.println("Enter Current Time: ");
		System.out.println("Hours: ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Input!Please Re-enter!");
			sc.next();
		}
		hours = sc.nextInt();
		while (hours < 0 || hours > 23) {
			System.out.println("Invalid Input!Please Re-enter!");
			hours = sc.nextInt();
		}
		return hours;
	}

	public int getMinutes() {
		System.out.println("Minutes: ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Input!Please Re-enter!");
			sc.next();
		}
		minutes = sc.nextInt();
		while (minutes < 0 || day > 59) {
			System.out.println("Invalid Input!Please Re-enter!");
			minutes = sc.nextInt();
		}
		return minutes;
	}

	public int getSeconds() {
		System.out.println("Seconds: ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Input!Please Re-enter!");
			sc.next();
		}
		seconds = sc.nextInt();
		while (seconds < 0 || seconds > 59) {
			System.out.println("Invalid Input!Please Re-enter!");
			seconds = sc.nextInt();
		}
		return seconds;
	}

	public String getTime() {
		System.out.println("Enter current time below");
		return String.valueOf(getHours() + ":" + getMinutes() + ":" + getSeconds());

	}

	public double getMilliseconds() {
		long start_time = System.currentTimeMillis();
		long end_time = System.currentTimeMillis();
		double difference = (end_time - start_time);
		System.out.print(difference);
		return difference;
	}
}
