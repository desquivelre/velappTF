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

	public Operacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operacion(Integer cOperacion, Date dEmision, Date dPago, Float valorNominal, Float retencion,
			pe.edu.upc.velapp.entities.Cartera cartera) {
		super();
		COperacion = cOperacion;
		DEmision = dEmision;
		DPago = dPago;
		ValorNominal = valorNominal;
		Retencion = retencion;
		Cartera = cartera;
	}

	public Integer getCOperacion() {
		return COperacion;
	}

	public void setCOperacion(Integer cOperacion) {
		COperacion = cOperacion;
	}

	public Date getDEmision() {
		return DEmision;
	}

	public void setDEmision(Date dEmision) {
		DEmision = dEmision;
	}

	public Date getDPago() {
		return DPago;
	}

	public void setDPago(Date dPago) {
		DPago = dPago;
	}

	public Float getValorNominal() {
		return ValorNominal;
	}

	public void setValorNominal(Float valorNominal) {
		ValorNominal = valorNominal;
	}

	public Float getRetencion() {
		return Retencion;
	}

	public void setRetencion(Float retencion) {
		Retencion = retencion;
	}

	public Cartera getCartera() {
		return Cartera;
	}

	public void setCartera(Cartera cartera) {
		Cartera = cartera;
	} 
	
	
	
}
