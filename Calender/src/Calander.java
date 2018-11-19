import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calander
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		System.out.println(today);
		System.out.println(date);
		date = date.minusDays(today - 1);
		System.out.println(date);
		DayOfWeek weekday = date.getDayOfWeek();
		System.out.println(weekday);
		int value = weekday.getValue();
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 1; i < value; i++)
			System.out.println(" ");
		while (date.getMonthValue() == month)
		{
			System.out.printf("%3d", date.getDayOfMonth());
		if (date.getDayOfMonth() == today)
			System.out.print("*");
		else System.out.print(" "); 
		date = date.plusDays(1);
		if (date.getDayOfWeek().getValue() == 1)
			System.out.println();
		}
	}
}
