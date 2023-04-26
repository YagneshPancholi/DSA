package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DemoForDateTimeApi
{

	public static void main(String[] args)
	{
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalTime lm = LocalTime.now();
		System.out.println(lm);
		System.out.println(LocalTime.now(ZoneId.of("Asia/Tokyo")));
		for(String s : ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
