package org.escoladeltreball.fourthassignmenttopics;

public interface Manager {
	
	/**
	 * 
	 * @return el siguiente vehículo en funcion de la fecha y hora del sistema
	 * @throws Exception
	 */
	public abstract ITV getNext() throws Exception;
}
