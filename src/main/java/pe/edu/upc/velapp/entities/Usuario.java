package pe.edu.upc.velapp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="Users")
public class Usuario {
    @Id 
    @NotNull
    @Range(min=10000000,max=99999999)
    @Column(name = "id", length = 8, nullable = false)
    private Integer id;

    @NotEmpty
    @Column(name = "Username", length = 120)
    private String username;

    @NotEmpty
    @Column(name = "Password", length = 120)
    private String password;

    @OneToMany(mappedBy = "Usuario", fetch = FetchType.LAZY)
    private List<Cartera> carteras;


    @OneToMany(mappedBy = "usuario",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    private List<Authority>authorities;

    private boolean enable;

    public Usuario() {
        super();
        // TODO Auto-generated constructor stub
        this.enable=true;
        this.authorities= new ArrayList<>();
    }

    public Usuario(Integer cUsuario, String username, String password, List<Cartera> carteras,
            List<Authority> authorities, boolean enable) {
        super();
        this.id = cUsuario;
        this.username = username;
        this.password = password;
        this.carteras = carteras;
        this.enable=true;
        this.authorities= new ArrayList<>();
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

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }



}