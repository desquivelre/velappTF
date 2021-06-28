package pe.edu.upc.velapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Usuario {
	@Id 
	@Column(name = "id", length = 4, nullable = false)
	private Integer id;
	
	@Column(name = "Username", length = 120)
	private String username;
	
	@Column(name = "Password", length = 120)
	private String password;
	

	public boolean enable;
	
	@OneToMany(mappedBy = "Usuario", fetch = FetchType.LAZY)
	private List<Cartera> carteras;
	
	
	

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer id, String username, String password, List<Cartera> carteras) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.carteras = carteras;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Cartera> getCarteras() {
		return carteras;
	}

	public void setCarteras(List<Cartera> carteras) {
		this.carteras = carteras;
	}

	
	
	
}
