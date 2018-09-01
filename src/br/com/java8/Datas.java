package br.com.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();

		LocalDate copaCatar = LocalDate.of(2022, Month.NOVEMBER, 21);

		Period periodo = Period.between(hoje, copaCatar);

		System.out.println("Falta: " + periodo.getYears() + " Anos " + periodo.getMonths() + " Meses e "
				                              + periodo.getDays() + " Dias para a proxima Copa do Mundo");
		
		
		LocalDate nextCopa = copaCatar.plusYears(4);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Copa Depois do Catar: "+ nextCopa.format(formatador));

	}
}
