package tictac;


public class Reloj {

	// Atributos de mis relojes
	private int hora = 0;
	private int minutos = 0;
	private int segundos = 0;
	private boolean modoCronometro = false;
	
	
	/*
	 * 
	 * ESTOS SON LOS GETTERS Y SETTERS
	 */
	public boolean isModoCronometro() {
		return modoCronometro;
	}

	public void setModoCronometro(boolean modoCronometro) {
		this.modoCronometro = modoCronometro;
	}

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

		hora = 0;
		// permito cambiar valores si estoy en modo 
		// reloj y se cumplen los rangos
		if((modoCronometro==false)&(hora>=0)&(hora<=23)) {
			this.hora = hora;
		}
	}
	
	
	public void setMinutos(int minutos) {
		
		minutos = 0;
		// permito cambiar valores si estoy en modo 
		// reloj y se cumplen los rangos
		if((modoCronometro==false)&(minutos>=0)&(minutos<=59)) {
			this.minutos = minutos;
		}
	}
	
	public void setSegundos(int nuevosSegundos) {
		
		segundos = 0;
		// permito cambiar valores si estoy en modo 
		// reloj y se cumplen los rangos
		if((modoCronometro==false)&(nuevosSegundos>=0)&(nuevosSegundos<=59)) {
			segundos = nuevosSegundos;
		}
	}


	/*
	 ******************************** 
	 ********************************
	 *
	 * OPERACIONES DE AÑADIR SEGUNDOS AL RELOJ
	 * 
	 */
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
				
				// en modo reloj permito el arreglo
				//if(modoCronometro==false) {
				if(!modoCronometro) {
					// arreglo las horas si son 24
					if(hora==24) {
						hora=0;
					}
				}
			}
		}
	}
	
	
	

	/*
	 ******************************** 
	 ********************************
	 *
	 * OPERACIONES DE RESTAR SEGUNDOS AL RELOJ
	 * 
	 */
	public void subSegundos() {
		
		// en modo coronometro esta operación 
		// no tiene sentido
		//if(modoCronometro==false) { 
		if(!modoCronometro) { 
		
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
	}
	
	
	
	
	
	/*
	 ******************************** 
	 ********************************
	 *
	 * OPERACION DE SUMAR RELOJES
	 * 
	 */
	public Reloj sumarRelojes(Reloj sumando) {

		// sumamos los diferentes parametros
		// de los relojes
		int horas = this.hora + sumando.hora;
		int minutos = this.minutos + sumando.minutos;
		int segundos = this.segundos + sumando.segundos;
		
		// arreglamos los errores que haya
		if(segundos>=60) {
			// si nos pasamos en 1 minutos, 
			// descontamos 60s y sumamos el minuto
			segundos-=60;
			minutos++;
		}
		if(minutos>=60) {
			// si nos pasamos en 1 hora, 
			// descontamos 60min y sumamos la hora
			minutos-=60;
			horas++;
		}

		// creo un nuevo reloj y establezco
		// los valores que he calculado
		Reloj devolver = new Reloj();
		devolver.hora = horas;
		devolver.minutos = minutos;
		devolver.segundos = segundos;

		// devuelvo el objeto creado
		return devolver;
	}
	
	

	public String toString()  {
		
		return hora+":"+minutos+":"+segundos;
	}
	

		
}

