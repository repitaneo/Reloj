package tictac;


public class Reloj {

	// Atributos de mis relojes
	private int hora = 0;
	private int minutos = 0;
	private int segundos = 0;
	
	
	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}
	
	
	
	public void setHora(int hora) {
		if((hora>=0)&(hora<=23)) {
			this.hora = hora;
		}
	}
	
	
	public void setMinutos(int minutos) {
		if((minutos>=0)&(minutos<=59)) {
			this.minutos = minutos;
		}
	}
	
	public void setSegundos(int nuevosSegundos) {
		if((nuevosSegundos>=0)&(nuevosSegundos<=59)) {
			segundos = nuevosSegundos;
		}
	}

	
	
	
	public void addSegundos() {
		
		segundos++;
		
		// arreglo los segundos si son 60
		if(segundos==60) {
			segundos = 0;
			minutos++;
			
			// arreglo los minutos si son 60
			if(minutos==60) {
				minutos=0;
				hora++;
				
				// arreglo las horas si son 24
				if(hora==24) {
					hora=0;
				}
			}
		}
	}
	
	
	

	public void subSegundos() {
		
		segundos--;
		
		// arreglo los segundos si son -1
		if(segundos==-1) {
			segundos = 59;
			minutos--;
			
			// arreglo los minutos si son -1
			if(minutos==-1) {
				minutos=59;
				hora--;
				
				// arreglo las horas si son -1
				if(hora==-1) {
					hora=23;
				}
			}
		}
	}
	
	
	
	
	
	public Reloj sumarRelojes(Reloj sumando) {

		int horas = this.hora + sumando.hora;
		int minutos = this.minutos + sumando.minutos;
		int segundos = this.segundos + sumando.segundos;
		
		if(segundos>=60) {
			segundos-=60;
			minutos++;
		}
		if(minutos>=60) {
			minutos-=60;
			horas++;
		}
		
		Reloj devolver = new Reloj();
		devolver.hora = horas;
		devolver.minutos = minutos;
		devolver.segundos = segundos;
		
		return devolver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString()  {
		
		return hora+":"+minutos+":"+segundos;
	}
	

		
}

