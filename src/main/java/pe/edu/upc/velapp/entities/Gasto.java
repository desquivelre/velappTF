package pe.edu.upc.velapp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Gasto")
public class Gasto {
	@Id 
	@Column(name = "CGasto", length = 4, nullable = false)
	private Integer CGasto;
	
	@Column(name = "MGasto", length = 20)
	private Float MGasto;
	
	@ManyToOne
	@JoinColumn(name = "CCartera", nullable = false)
	private Cartera Cartera; 
	
	@ManyToOne
	@JoinColumn(name = "CTipoGasto", nullable = false)
	private TipoGasto TipoGasto; 
}
