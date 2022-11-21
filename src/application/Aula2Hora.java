package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula2Hora {

	public static void main(String[] args) {
		LocalDate d04= LocalDate.parse("2022-10-24");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-24T08:58:30");
		Instant d06 = Instant.parse("2022-10-24T08:58:30Z");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//considero a zona local do computador que está rodando o programa
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		//iso date time é uma hora local logo não podemos usar o instant sem dizer qual é o fuso horário
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		
		System.out.println("d04="+d04);
		System.out.println("d04="+d04.format(fmt1));
		System.out.println("d04="+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//instancio o objeto na hora de rodar
		System.out.println("d04="+fmt1.format(d04));//outra forma
		System.out.println("d05="+d05.toString());
		System.out.println("d05="+d05.format(fmt2));//instancio o objeto na hora de rodar
		System.out.println("d06="+d06.toString());
		//como o método instant não tem format eu tenho q chamar a partir do fmt3
		System.out.println("d06="+ fmt3.format(d06));
		System.out.println("d05="+ fmt4.format(d05));
		System.out.println("d06="+ fmt5.format(d06));

	}

}
