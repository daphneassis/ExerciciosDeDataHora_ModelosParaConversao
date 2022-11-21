package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Modelos {

	public static void main(String[] args) {
		
		//agora-> data hora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03= Instant.now();
		//texto ISO 8601-> data hora
		LocalDate d04= LocalDate.parse("2022-10-24");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-24T08:58:30");
		Instant d06 = Instant.parse("2022-10-24T08:58:30Z");
		//qnd eu quero especificar um horário a partir do GMT corto o Z
		//SP q é 3 horas a - horário de Londres 
		//Instant d07 = Instant.parse("2022-10-24T08:58:30-03:00");
		//o retorno dele mostra a diferença do horário pra Londres q não roda
		// texto customizado pra data-hora
		
		System.out.println("outra maneira de converter pro nosso formato");
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hojeformatado = hoje.format(formatter);
        System.out.println(hojeformatado);
        System.out.println("hoje formatado com hora");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String agoraformatado = agora.format(formatter);
        System.out.println(agoraformatado);

		System.out.println("continuando com Nélio ,data formatter");
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("24/10/2022",fm1);
        System.out.println(d08.toString());	// tem um erro no do nélio	
		System.out.println(d08.format(fm1));
		System.out.println("----------------");
		LocalDate d10 = LocalDate.of(2022,07,31);
		//pra caixas separadas
		LocalDateTime d11= LocalDateTime.of(1931, 11, 11, 8, 30);
		
		
		System.out.println("----------------");
		System.out.println("d01="+d01.toString());
		System.out.println("d02="+d02.toString());
		System.out.println("d03="+d03.toString());
		System.out.println("d04="+d04.toString());
		System.out.println("d05="+d05.toString());
		System.out.println("d06="+d06.toString());
		//System.out.println("d07="+d07.toString());
		System.out.println("d10="+d10.toString());
		System.out.println("d11="+d11.toString());
		
	
		
		
		
	}

}
