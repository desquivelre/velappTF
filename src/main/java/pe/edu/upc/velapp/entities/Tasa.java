package pe.edu.upc.velapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Tasa")
public class Tasa {
	@Id 
	@Column(name = "CTasa", length = 4, nullable = false)
	private Integer CTasa;
	
	@Column(name = "NTasa", length = 20)
	private String NTasa;
	
	@Column(name = "NumPlazoDias", length = 20)
	private Integer NumPlazoDias;
	
	@OneToMany(mappedBy = "Tasa", fetch = FetchType.LAZY)
	private List<Cartera> carteras;
}
