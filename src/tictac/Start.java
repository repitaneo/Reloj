package tictac;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {


		Reloj miReloj = new Reloj();
		
		miReloj.setHora(23);
		miReloj.setMinutos(59);
		miReloj.setSegundos(59);
		System.out.println(miReloj);
		
		
		Reloj miOtroReloj = new Reloj();
		miOtroReloj.setHora(10);
		miOtroReloj.setMinutos(10);
		miOtroReloj.setSegundos(10);
		System.out.println(miOtroReloj);
		
		
		
		Reloj sumados = miReloj.sumarRelojes(miOtroReloj);
		System.out.println(sumados);
		
		
		Reloj sumadosAlReves = miOtroReloj.sumarRelojes(miReloj);
		System.out.println(sumadosAlReves);
		
		
		
		
	}
}

