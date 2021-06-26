package pe.edu.upc.velapp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Operacion")
public class Operacion {
	@Id 
	@Column(name = "COperacion", length = 4, nullable = false)
	private Integer COperacion;
	
	@Column(name = "DEmision")
	private Date DEmision;
	
	@Column(name = "DPago")
	private Date DPago;
	
	@Column(name = "ValorNominal", length = 30)
	private Float ValorNominal;
	
	@Column(name = "Retencion", length = 30)
	private Float Retencion; 
	
	@ManyToOne
	@JoinColumn(name = "CCartera", nullable = false)
	private Cartera Cartera; 
}
