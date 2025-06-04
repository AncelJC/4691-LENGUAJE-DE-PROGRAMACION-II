package model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="estudiantes")
@NamedQuery(name="Estudiante.findAll", query="SELECT e FROM Estudiante e")

public class Estudiante implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEst;
	private String carrera;
	private String nombreApe;
	private String nroDocumento;
	private String telefono;
	private String tipoDocumento;
	
	public Estudiante () {
		 
	}
	
	public int getIdEst() {
		return this.idEst;
	}
	
	public void setIdEst(int idEst) {
		this.idEst = idEst;
	}
	
	public String getNombreApe() {
		return this.nombreApe;
	}
	
	public void setNombreApe(String nombreApe) {
		this.nombreApe = nombreApe;
	}
	
	public String getCarrera() {
		return this.carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public String getNroDocumento() {
		return this.nroDocumento;
	}
	
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getTipoDocumento() {
		return this.tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	
	
}
