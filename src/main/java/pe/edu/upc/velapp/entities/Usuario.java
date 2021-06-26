package pe.edu.upc.velapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	@Id 
	@Column(name = "CUsuario", length = 4, nullable = false)
	private Integer CCartera;
	
	@Column(name = "Username", length = 20)
	private String Username;
	
	@Column(name = "Password", length = 20)
	private String Password;
	
	@OneToMany(mappedBy = "Usuario", fetch = FetchType.LAZY)
	private List<Cartera> carteras;
}
