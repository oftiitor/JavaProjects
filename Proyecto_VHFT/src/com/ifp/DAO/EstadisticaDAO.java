package com.ifp.DAO;

import java.util.List;

import com.ifp.modelo.Estadistica;
import com.ifp.modelo.Jugador;

/**
 * 
 * @author V�ctor Henry Fall Turrientes
 * @version 1.0.0
 *
 */

public interface EstadisticaDAO {

	/**
	 * 
	 * @param codigoJugador - Recibe por par�metro el c�digo de un jugador del que posteriormente mostrar� por pantalla todas las estad�sticas de dicho jugador.
	 * @return List<Estadistica> - Devuelve un listado de todas las estad�sticas disponibles para el jugador recibido por par�metro.
	 */
	
	List<Estadistica> findbyID(int codigoJugador);
	
	/**
	 * 
	 * @param pais - Recibe por par�metro un pa�s cualquiera del que se obtendr�n y se mostrar�n todos los jugadores de ese mismo pa�s.
	 * @return List<Estadistica> - Devuelve un listado de todas las estad�sticas del pa�s introducido por par�metro.
	 */
	
	List<Estadistica> findbyCountry(String pais); 
	
	/**
	 * 
	 * @param nombre - Recibe por par�metro el nombre de un equipo y devuelve todas las estad�sticas disponibles para dicho equipo.
	 * @return List<Estadistica> - Devuelve un listado de todas las estad�sticas del equipo que se ha introducido por par�metro.
	 */
	
	List<Estadistica> findByEquipo(String nombre);
	
	/**
	 * 
	 * @param j - Recibe por par�metro un objeto de tipo Jugador el se usar� para sacar la media de puntos que realiza dicho jugador cada partido.
	 * @return double - Devuelve la media de puntos por partido del jugador introducido por par�metro.
	 */
	
	double mediaPuntosPartido(Jugador j);
	
	/**
	 * 
	 * @param j - Recibe por par�metro un objeto de tipo Jugador el se usar� para sacar la media de asistencias que realiza dicho jugador cada partido.
	 * @return double - Devuelve la media de asistencias por partido del jugador introducido por par�metro.
	 */
	
	double mediaAsistencias(Jugador j);
	
	/**
	 * 
	 * @param j - Recibe por par�metro un objeto de tipo Jugador el se usar� para sacar la media de tapones que realiza dicho jugador cada partido.
	 * @return double - Devuelve la media de tapones por partido del jugador introducido por par�metro.
	 */
	
	double mediaTapones(Jugador j);
	
	/**
	 * 
	 * @param j - Recibe por par�metro un objeto de tipo Jugador el se usar� para sacar la media de rebotes que realiza dicho jugador cada partido.
	 * @return double - Devuelve la media de rebotes por partido del jugador introducido por par�metro.
	 */
	
	double mediaRebotes(Jugador j);
	
}