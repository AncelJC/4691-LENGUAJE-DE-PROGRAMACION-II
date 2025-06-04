package model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Index;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="producto" ,
indexes = {@Index(name= "idx_prod", columnList =  "descripcion", unique = true) })
@NameQuery(name="Producto.finAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable{
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(Strategy = GenerationType.IDENTITY)
	@COLUMN(name ="idProd")
	private int idProducto;
	
	private String description;
	
	@Column(name= "estado", nullable = false)
	@Enumerated(value = EnumType.STRING)
	private Date fechaIng;
	
	private BigDecimal precio;
	private int stock;
	public Producto () {
		
	}
	
}
