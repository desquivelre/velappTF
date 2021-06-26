package pe.edu.upc.velapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TipoGasto")
public class TipoGasto {
	@Id 
	@Column(name = "CTipoGasto", length = 4, nullable = false)
	private Integer CTipoGasto;
	
	@Column(name = "NTipoGasto", length = 20)
	private String NTipoGasto;
	
	@OneToMany(mappedBy = "TipoGasto", fetch = FetchType.LAZY)
	private List<Gasto> gastos;
	
}
