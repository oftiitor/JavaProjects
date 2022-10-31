package com.ifp.modelo;

/**
 * 
 * @author V�ctor Henry Fall Turrientes
 * @version 1.0.0
 *
 */

public class Estadistica {

	/**
	 * Declaramos las variables privadas que tendr�n todas las estad�sticas de la base de datos.
	 */
	
	private String temporada;
	private int jugador;
	private double puntos_por_partido, asistencias_por_partido, tapones_por_partido, rebotes_por_partido;
	
	/**
	 * Creamos el pertinente constructor vac�o.
	 */
	
	public Estadistica() {
		super();
	}

	/**
	 * 
	 * @param temporada - Recibe por par�metro la temporada de donde se sacan las estad�sticas y le da dicho valor a la variable "temporada" de la clase.
	 * @param jugador - Recibe por par�metro el jugador del que se sacan las estad�sticas y le da dicho valor a la variable "jugador" de la clase.
	 * @param puntos_por_partido - Recibe por par�metro los puntos por partido y le da dicho valor a la variable "puntos_por_partido" de la clase.
	 * @param asistencias_por_partido - Recibe por par�metro las asistencias por partido y le da dicho valor a la variable "asistencias_por_partido" de la clase.
	 * @param tapones_por_partido - Recibe por par�metro los tapones por partido y le da dicho valor a la variable "tapones_por_partido" de la clase.
	 * @param rebotes_por_partido - Recibe por par�metro los rebotes por partido y le da dicho valor a la variable "rebotes_por_partido" de la clase.
	 */
	
	public Estadistica(String temporada, int jugador, double puntos_por_partido, double asistencias_por_partido, double tapones_por_partido, double rebotes_por_partido) {
		super();
		this.temporada = temporada;
		this.jugador = jugador;
		this.puntos_por_partido = puntos_por_partido;
		this.asistencias_por_partido = asistencias_por_partido;
		this.tapones_por_partido = tapones_por_partido;
		this.rebotes_por_partido = rebotes_por_partido;
	}

	/**
	 * 
	 * @return String - Devuelve la variable que almacena la temporada de la que sacar� las estad�sticas.
	 */
	
	public String getTemporada() {
		return temporada;
	}

	/**
	 * 
	 * @param temporada - Recibe por par�metro una temporada de la cual cambiar� el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	/**
	 * 
	 * @return int - Devuelve la variable que almacena el c�digo del jugador del que se sacar�n las estad�sticas.
	 */
	
	public int getJugador() {
		return jugador;
	}

	/**
	 * 
	 * @param jugador - Recibe por par�metro el c�digo de un jugador de la cual cambiar� el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setJugador(int jugador) {
		this.jugador = jugador;
	}

	/**
	 * 
	 * @return double - Devuelve la variable que almacena los puntos por partido.
	 */
	
	public double getPuntos_por_partido() {
		return puntos_por_partido;
	}

	/**
	 * 
	 * @param puntos_por_partido - Recibe por par�metro los puntos por partido y cambiar� el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setPuntos_por_partido(double puntos_por_partido) {
		this.puntos_por_partido = puntos_por_partido;
	}

	/**
	 * 
	 * @return double - Devuelve la variable que almacena las asitencias por partido.
	 */
	
	public double getAsistencias_por_partido() {
		return asistencias_por_partido;
	}

	/**
	 * 
	 * @param asistencias_por_partido - Recibe por par�metro las asistencias por partido y cambiar� el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setAsistencias_por_partido(double asistencias_por_partido) {
		this.asistencias_por_partido = asistencias_por_partido;
	}

	/**
	 * 
	 * @return double - Devuelve la variable que almacena los tapones por partido.
	 */
	
	public double getTapones_por_partido() {
		return tapones_por_partido;
	}

	/**
	 * 
	 * @param tapones_por_partido - Recibe por par�metro los tapones por partido y cambiar� el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setTapones_por_partido(double tapones_por_partido) {
		this.tapones_por_partido = tapones_por_partido;
	}

	/**
	 * 
	 * @return double - Devuelve la variable que almacena los rebotes por partido.
	 */
	
	public double getRebotes_por_partido() {
		return rebotes_por_partido;
	}

	/**
	 * 
	 * @param rebotes_por_partido - Recibe por par�metro los rebotes por partido y cambiar� el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setRebotes_por_partido(double rebotes_por_partido) {
		this.rebotes_por_partido = rebotes_por_partido;
	}
	
	/**
	 * El m�todo ToString sirve para mostrar por pantalla los datos que previamente se hayan introducido / modificado en la clase.
	 */
	@Override
	public String toString() {
		return "Estad�stica:\n � Temporada: " + temporada + "\n � Jugador: " + jugador + "\n � Puntos por partido: " + puntos_por_partido + "\n � Asistencias por partido: " + asistencias_por_partido + "\n � Tapones por partido: " + tapones_por_partido + "\n � Rebotes por partido: " + rebotes_por_partido + "\n\n";
	}

	/**
	 * Los m�todos HashCode y Equals sirven para comparar objetos m�s f�cil y r�pidamente en estructuras Hash. 
	 * Cuando se comparan dos objetos en estructuras de tipo hash primero se invoca al m�todo hashcode el cu�l si devuelve diferente hash no seguir� comparando puesto que los objetos ser�n distintos.
	 * Pero, en el caso que los objetos compartan el mismo hashcode, pasar� a realizar el m�todo equals el cu�l revisar� al detalle si se cumple la igualdad.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(asistencias_por_partido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + jugador;
		temp = Double.doubleToLongBits(puntos_por_partido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rebotes_por_partido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tapones_por_partido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((temporada == null) ? 0 : temporada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Estadistica))
			return false;
		Estadistica other = (Estadistica) obj;
		if (Double.doubleToLongBits(asistencias_por_partido) != Double.doubleToLongBits(other.asistencias_por_partido))
			return false;
		if (jugador != other.jugador)
			return false;
		if (Double.doubleToLongBits(puntos_por_partido) != Double.doubleToLongBits(other.puntos_por_partido))
			return false;
		if (Double.doubleToLongBits(rebotes_por_partido) != Double.doubleToLongBits(other.rebotes_por_partido))
			return false;
		if (Double.doubleToLongBits(tapones_por_partido) != Double.doubleToLongBits(other.tapones_por_partido))
			return false;
		if (temporada == null) {
			if (other.temporada != null)
				return false;
		} else if (!temporada.equals(other.temporada))
			return false;
		return true;
	}
		
}