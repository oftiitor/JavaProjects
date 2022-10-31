package com.ifp.DAO;

import java.util.List;

import com.ifp.modelo.Jugador;

/**
 * 
 * @author V�ctor Henry Fall Turrientes
 * @version 1.0.0
 *
 */

public interface JugadorDAO {

	/**
	 * 
	 * @param codigo - Recibe por par�metro el c�digo de un jugador del que posteriormente mostrar� por pantalla toda la informaci�n del mismo.
	 * @return Jugador - Devuelve un objeto Jugador en el cu�l encontraremos el c�digo, el nombre, la procedencia, la altura, el peso, la posici�n y el nombre del equipo.
	 */
	
	Jugador findbyID(int codigo);
	
	/**
	 * 
	 * @return List<Jugador> - Devuelve un listado de todos los jugadores disponibles en la base de datos. 
	 */
	
	List<Jugador> findAll();
	
	/**
	 * 
	 * @param nombreEquipo - Recibe por par�metro el nombre de un equipo y muestra todos los jugadores pertenecientes a dicho equipo.
	 * @return List<Jugador> - Devuelve un listado de todos los jugadores del equipo que se ha introducido por par�metro.
	 */
	
	List<Jugador> findbyTeams(String nombreEquipo);
	
	/**
	 * 
	 * @param j - Recibe por par�metro un objeto de tipo Jugador el cual servir� para a�adir un nuevo jugador a la base de datos.
	 * @return boolean - Devuelve true si el nuevo jugador se ha insertado correctamente o false, si por el contrario, el jugador no se ha insertado correctamente en la base de datos.
	 */
	
	boolean crearJugador(Jugador j);
	
	/**
	 * 
	 * @param j - Recibe por par�metro un objeto de tipo Jugador el cual servir� para cambiar el equipo a un jugador ya existente en la base de datos.
	 * @return boolean - Devuelve true si el jugador ha cambiado correctamente de equipo o false, si por el contrario, el jugador no ha cambiado de equipo.
	 */
	
	boolean ficharJugador(Jugador j);
	
	/**
	 * 
	 * @param j - Recibe por par�metro un objeto de tipo Jugador el cual servir� para cambiar el peso a un jugador en el caso de que haya cambiado al realizar las pruebas f�sicas.
	 * @return boolean - Devuelve true si el jugador ha cambiado correctamente de peso o false, si por el contrario, el jugador se mantiene en su peso.
	 */
	
	boolean pruebasFisicasJugador(Jugador j);
	
	/**
	 * 
	 * @param codigo - Recibe por par�metro el c�digo de un jugador ya existente en la base de datos y borrar� toda la informaci�n almacenada de dicho jugador.
	 * @return int - Devuelve el n�mero 1 si el jugador se ha eliminado correctamente de la base de datos, o devuelve 0 si el jugador no se ha eliminado correctamente de la base de datos.
	 */
	
	int retirarJugador(int codigo);
	
	
}