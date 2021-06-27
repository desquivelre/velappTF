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

	public Cartera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cartera(Integer cCartera, Float perTasaEfectiva, Float perTasaNominal, Integer numDiasPeriodoCapitalizacion,
			Date dDescuento, pe.edu.upc.velapp.entities.Usuario usuario,
			pe.edu.upc.velapp.entities.TipoCalendario tipoCalendario, pe.edu.upc.velapp.entities.Tasa tasa,
			pe.edu.upc.velapp.entities.TipoMoneda tipoMoneda, List<Operacion> operaciones, List<Gasto> gastos) {
		super();
		CCartera = cCartera;
		PerTasaEfectiva = perTasaEfectiva;
		PerTasaNominal = perTasaNominal;
		NumDiasPeriodoCapitalizacion = numDiasPeriodoCapitalizacion;
		DDescuento = dDescuento;
		Usuario = usuario;
		TipoCalendario = tipoCalendario;
		Tasa = tasa;
		TipoMoneda = tipoMoneda;
		this.operaciones = operaciones;
		this.gastos = gastos;
	}

	public Integer getCCartera() {
		return CCartera;
	}

	public void setCCartera(Integer cCartera) {
		CCartera = cCartera;
	}

	public Float getPerTasaEfectiva() {
		return PerTasaEfectiva;
	}

	public void setPerTasaEfectiva(Float perTasaEfectiva) {
		PerTasaEfectiva = perTasaEfectiva;
	}

	public Float getPerTasaNominal() {
		return PerTasaNominal;
	}

	public void setPerTasaNominal(Float perTasaNominal) {
		PerTasaNominal = perTasaNominal;
	}

	public Integer getNumDiasPeriodoCapitalizacion() {
		return NumDiasPeriodoCapitalizacion;
	}

	public void setNumDiasPeriodoCapitalizacion(Integer numDiasPeriodoCapitalizacion) {
		NumDiasPeriodoCapitalizacion = numDiasPeriodoCapitalizacion;
	}

	public Date getDDescuento() {
		return DDescuento;
	}

	public void setDDescuento(Date dDescuento) {
		DDescuento = dDescuento;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}

	public TipoCalendario getTipoCalendario() {
		return TipoCalendario;
	}

	public void setTipoCalendario(TipoCalendario tipoCalendario) {
		TipoCalendario = tipoCalendario;
	}

	public Tasa getTasa() {
		return Tasa;
	}

	public void setTasa(Tasa tasa) {
		Tasa = tasa;
	}

	public TipoMoneda getTipoMoneda() {
		return TipoMoneda;
	}

	public void setTipoMoneda(TipoMoneda tipoMoneda) {
		TipoMoneda = tipoMoneda;
	}

	public List<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public List<Gasto> getGastos() {
		return gastos;
	}

	public void setGastos(List<Gasto> gastos) {
		this.gastos = gastos;
	}

	

}



	
	

