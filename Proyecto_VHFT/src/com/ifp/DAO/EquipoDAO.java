package com.ifp.DAO;

import java.util.List;

import com.ifp.modelo.Equipo;

/**
 * 
 * @author V�ctor Henry Fall Turrientes
 * @version 1.0.0
 *
 */

public interface EquipoDAO {

	/**
	 * 
	 * @param nombreEquipo - Recibe por par�metro el nombre del equipo con el que posteriormente mostrar� por pantalla toda la informaci�n del mismo.
	 * @return Equipo - Devuelve un objeto Equipo en el cu�l encontraremos el nombre, la ciudad, la conferencia y la divisi�n del equipo.
	 */
	
	Equipo findbyID(String nombreEquipo);
	
	/**
	 * 
	 * @return List<Equipo> - Devuelve un listado de todos los equipos disponibles en la base de datos.
	 */
	
	List<Equipo> findAll();
	
	/**
	 * 
	 * @param eq - Recibe por par�metro un objeto de tipo Equipo y lo inserta en la base de datos.
	 * @return boolean - Devuelve true si el nuevo equipo se ha insertado correctamente o false, si por el contrario, el equipo no se ha insertado correctamente en la base de datos.
	 */
	
	boolean crearEquipo(Equipo eq);
	
	/**
	 * 
	 * @param eq - Recibe por par�metro un objeto de tipo Equipo el cual ya debe existir en la base de datos. Se actualiza el valor de la columna de divisi�n por el nuevo valor que haya introducido el usuario.
	 * @return boolean - Devuelve true si la divisi�n del equipo se ha actualizado correctamente o false, si por el contrario, la divisi�n del equipo no se ha actualizado correctamente.
	 */
	
	boolean cambioDivision(Equipo eq);
	
	/**
	 * 
	 * @param nombre - Recibe por par�metro el nombre de un equipo que seguidamente ser� eliminado de la base de datos.
	 * @return int - Devuelve el n�mero 1 si el equipo se ha eliminado correctamente de la base de datos, o devuelve 0 si el equipo no se ha eliminado correctamente de la base de datos.
	 */
	
	int eliminarEquipo(String nombre);
	
}