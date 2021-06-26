package pe.edu.upc.velapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TipoCalendario")
public class TipoCalendario {
	@Id 
	@Column(name = "CTipoCalendario", length = 4, nullable = false)
	private Integer CTipoCalendario;
	
	@Column(name = "NTipoCalendario", length = 20)
	private String TipoCalendario;
	
	@OneToMany(mappedBy = "TipoCalendario", fetch = FetchType.LAZY)
	private List<Cartera> carteras;
}
