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
	private Integer CUsuario;
	
	@Column(name = "Username", length = 20)
	private String Username;
	
	@Column(name = "Password", length = 20)
	private String Password;
	
	@OneToMany(mappedBy = "Usuario", fetch = FetchType.LAZY)
	private List<Cartera> carteras;

	public Integer getCUsuario() {
		return CUsuario;
	}

	public void setCUsuario(Integer cUsuario) {
		CUsuario = cUsuario;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public List<Cartera> getCarteras() {
		return carteras;
	}

	public void setCarteras(List<Cartera> carteras) {
		this.carteras = carteras;
	}

	public Usuario(Integer cUsuario, String username, String password, List<Cartera> carteras) {
		super();
		CUsuario = cUsuario;
		Username = username;
		Password = password;
		this.carteras = carteras;
	}
	
	
}
