/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author iaw21752927
 *
 */
public class ITV  implements Comparable<ITV> {

	//Comparable, orden natural
	//Comparator, qualsevol ordre, ordenat per el camp indicat
	
	private long id;
	private String matricula;
	private LocalDateTime fecha;
	private String lugar;
	
	/**
	 * @param id
	 * @param matricula
	 * @param fecha
	 * @param hora
	 * @param lugar
	 */
	public ITV(long id, String matricula, LocalDateTime fecha, String lugar) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.fecha = fecha;
		this.lugar = lugar;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	/**
	 * devolvera un int negativo si el id de la itv es mas pequeño que el id de la ITV o
	 * 0 si son iguales
	 * positivo si el id de la itv es mas grande que el id de la ITV o
	 */
	@Override
	public int compareTo(ITV o) {
		return (int) (id - o.id);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("ITV [id=%s, matricula=%s, fecha=%s, lugar=%s]", id, matricula, fecha, lugar);
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ITV)) {
			return false;
		}
		ITV other = (ITV) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}


	
	

}
