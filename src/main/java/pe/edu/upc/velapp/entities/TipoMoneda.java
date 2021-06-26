package pe.edu.upc.velapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TipoMoneda")
public class TipoMoneda {
	@Id 
	@Column(name = "CTipoMoneda", length = 4, nullable = false)
	private Integer CTipoMoneda;
	
	@Column(name = "NTipoMoneda", length = 20)
	private String NTipoMoneda;
	
	@OneToMany(mappedBy = "TipoMoneda", fetch = FetchType.LAZY)
	private List<Cartera> carteras;
	
}
