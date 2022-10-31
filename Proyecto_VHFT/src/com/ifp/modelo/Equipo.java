package com.ifp.modelo;

import java.util.ArrayList;

/**
 * 
 * @author V�ctor Henry Fall Turrientes
 * @version 1.0.0
 *
 */

public class Equipo {

	/**
	 * Declaramos las variables privadas que tendr�n todos los equipos de la base de datos.
	 * Y, a parte, un ArrayList de jugadores donde se almacenar�n todos los jugadores de cada equipo.
	 */
	
	private String nombre, ciudad, conferencia, division;
	private ArrayList<Jugador> jugadores;

	/**
	 * Creamos el pertinente constructor vac�o.
	 */
	
	public Equipo() {
		super();
	}

	/**
	 * 
	 * @param equipo - Creamos un constructor que tan s�lo reciba por par�metro el equipo para luego implementarlo en el m�todo findByID de la clase EquipoDAO.
	 */
	
	public Equipo(String equipo) {
		super();
		this.nombre = equipo;
	}

	/**
	 * 
	 * @param nombre - Recibe por par�metro el nombre del equipo y le da dicho valor a la variable "nombre" de la clase.
	 * @param ciudad - Recibe por par�metro la ciudad del equipo y le da dicho valor a la variable "ciudad" de la clase.
	 * @param conferencia - Recibe por par�metro la conferencia del equipo y le da dicho valor a la variable "conferencia" de la clase.
	 * @param division - Recibe por par�metro la divisi�n del equipo y le da dicho valor a la variable "division" de la clase.
	 */
	
	public Equipo(String nombre, String ciudad, String conferencia, String division) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.conferencia = conferencia;
		this.division = division;
	}

	/**
	 * 
	 * @return String - Devuelve la variable que almacena el nombre del equipo.
	 */
	
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre - Recibe por par�metro el nombre de un equipo y le cambia el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return String - Devuelve la variable que almacena la ciudad del equipo.
	 */
	
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * 
	 * @param ciudad - Recibe por par�metro la ciudad de un equipo y le cambia el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * 
	 * @return String - Devuelve la variable que almacena la conferencia del equipo.
	 */
	
	public String getConferencia() {
		return conferencia;
	}

	/**
	 * 
	 * @param conferencia - Recibe por par�metro la conferencia de un equipo y le cambia el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	/**
	 * 
	 * @return String - Devuelve la variable que almacena la division del equipo.
	 */
	
	public String getDivision() {
		return division;
	}

	/**
	 * 
	 * @param division - Recibe por par�metro la divisi�n de un equipo y le cambia el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setDivision(String division) {
		this.division = division;
	}

	/**
	 * 
	 * @return String - Devuelve un listado de todos los jugadores almacenados en el equipo.
	 */
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	/**
	 * 
	 * @param jugadores - Recibe por par�metro un listado de jugadores de un equipo y le cambia el valor de la variable global por el nuevo valor introducido.
	 */
	
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	/**
	 * El m�todo ToString sirve para mostrar por pantalla los datos que previamente se hayan introducido / modificado en la clase.
	 */
	
	@Override
	public String toString() {
		return "Equipo:\n � Nombre: " + nombre + "\n � Ciudad: " + ciudad + "\n � Conferencia: " + conferencia + "\n � Divisi�n: " + division + "\n";
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
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((conferencia == null) ? 0 : conferencia.hashCode());
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Equipo))
			return false;
		Equipo other = (Equipo) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (conferencia == null) {
			if (other.conferencia != null)
				return false;
		} else if (!conferencia.equals(other.conferencia))
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}