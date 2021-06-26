package pe.edu.upc.velapp.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cartera")
public class Cartera {
	@Id 
	@Column(name = "CCartera", length = 6, nullable = false)
	private Integer CCartera;
	
	@Column(name = "PerTasaEfectiva", length = 20, nullable = true)
	private Float PerTasaEfectiva;
	
	@Column(name = "PerTasaNominal", length = 20, nullable = true)
	private Float PerTasaNominal;
	
	@Column(name = "NumDiasPeriodoCapitalizacion", length = 40, nullable = true)
	private Integer NumDiasPeriodoCapitalizacion;
	
	@Column(name = "DDescuento")
	private Date DDescuento;
	
	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario Usuario; 
	
	@ManyToOne
	@JoinColumn(name = "CTipoCalendario", nullable = false)
	private TipoCalendario TipoCalendario; 
	
	@ManyToOne
	@JoinColumn(name = "CTasa", nullable = false)
	private Tasa Tasa; 
	
	@ManyToOne
	@JoinColumn(name = "CTipoMoneda", nullable = false)
	private TipoMoneda TipoMoneda; 
	
	@OneToMany(mappedBy = "Cartera", fetch = FetchType.LAZY)
	private List<Operacion> operaciones;
	
	@OneToMany(mappedBy = "Cartera", fetch = FetchType.LAZY)
	private List<Gasto> gastos;


}



	
	

