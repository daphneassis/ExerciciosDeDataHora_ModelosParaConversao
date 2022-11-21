package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula4 {

	public static void main(String[] args) {
		LocalDate d04= LocalDate.parse("2022-10-24");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-24T08:58:30");
		Instant d06 = Instant.parse("2022-10-24T08:58:30Z");
		
		LocalDate pastweek= d04.minusDays(7);
		System.out.println(pastweek);
		
		LocalDate nextweek = d04.plusMonths(1);
		System.out.println(nextweek);
		
		LocalDateTime pastweekLocalDateTime= d05.minusDays(7);
		LocalDateTime nextweekLocalDateTime = d05.plusMonths(1);
		System.out.println("pastweekLocalDateTime= "+ pastweekLocalDateTime);
		System.out.println("nextweekLocalDateTime= "+ nextweekLocalDateTime);

		Instant pastweekInstant= d06.minus(7, ChronoUnit.DAYS);
		Instant nextweekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("pastweekInstant= "+pastweekInstant);
		System.out.println("nextweekInstant= "+nextweekInstant);
		Duration t3 =Duration.between(pastweekInstant, d06);
		System.out.println("t3= "+ t3.toDays());
		
		
	Duration t1= Duration.between(pastweekLocalDateTime, d05);
	Duration t2= Duration.between(pastweek.atTime(0,0),d04.atStartOfDay());
	//os dois de cima são localdate e não tem informação de tempo pra fazer a conta de duração
	//entre os tempos preciso converte-los em localdatetime, por isso eu ponho.atTime(0,0);
	//ou posso usar o .StartOfDay();
	System.out.println("duração = "+t1.toDays());
	System.out.println("duração = "+t2.toDays());
	}

}
