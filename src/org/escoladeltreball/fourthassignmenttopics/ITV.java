/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author iaw21752927
 *
 */
public class ITV  implements Comparable<ITV>{

	private long id;
	private String matricula;
	private LocalDate fecha;
	private LocalTime hora;
	private String lugar;
	
	/**
	 * @param id
	 * @param matricula
	 * @param fecha
	 * @param hora
	 * @param lugar
	 */
	public ITV(long id, String matricula, LocalDate fecha, LocalTime hora, String lugar) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.fecha = fecha;
		this.hora = hora;
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
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public LocalTime getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
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
		if (fecha == null) {
			if (other.fecha != null) {
				return false;
			}
		} else if (!fecha.equals(other.fecha)) {
			return false;
		}
		if (hora == null) {
			if (other.hora != null) {
				return false;
			}
		} else if (!hora.equals(other.hora)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (lugar == null) {
			if (other.lugar != null) {
				return false;
			}
		} else if (!lugar.equals(other.lugar)) {
			return false;
		}
		if (matricula == null) {
			if (other.matricula != null) {
				return false;
			}
		} else if (!matricula.equals(other.matricula)) {
			return false;
		}
		return true;
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
		return String.format("ITV [id=%s, matricula=%s, fecha=%s, hora=%s, lugar=%s]", id, matricula, fecha, hora,
				lugar);
	}


	
	

}
