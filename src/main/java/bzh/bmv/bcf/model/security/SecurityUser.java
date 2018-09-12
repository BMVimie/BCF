package bzh.bmv.bcf.model.security;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import bzh.bmv.bcf.converter.CryptoConverter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// If abstract
@MappedSuperclass
@Inheritance
//@Entity
//@Table(name = "security_user")
public abstract class SecurityUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="securityUserId")
	private Long securityUserId;
	private String login;
	@Convert(converter=CryptoConverter.class)
	private String password;
	private Boolean enable;

	@ManyToMany(targetEntity=SecurityRole.class)
	@JoinTable(name = "users_securityroles",
		joinColumns = @JoinColumn(name = "user_id"),
		inverseJoinColumns = @JoinColumn(name = "role_id"))
	@JsonIgnoreProperties(allowSetters = true, value = {"users"})
	private Set<SecurityRole> roles;

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the enable
	 */
	public Boolean getEnable() {
		return enable;
	}

	/**
	 * @param enable the enable to set
	 */
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * @return the roles
	 */
	public Set<SecurityRole> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<SecurityRole> roles) {
		this.roles = roles;
	}

	public SecurityUser() {
	}
}
