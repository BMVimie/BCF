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
	@Column(name = "securityUserId")
	private Long securityUserId;
	private String securityUserLogin;
	
	@Convert(converter = CryptoConverter.class)
	private String securityUserPassword;
	private Boolean securityUserEnable;

	@ManyToMany(targetEntity = SecurityRole.class)
	@JoinTable(name = "users_securityroles",
		joinColumns = @JoinColumn(name = "user_id"),
		inverseJoinColumns = @JoinColumn(name = "role_id"))
	@JsonIgnoreProperties(allowSetters = true, value = {"users"})
	private Set<SecurityRole> securityUserRoles;

	/**
	 * @return the login.
	 */
	public String getSecurityUserLogin() {
		return securityUserLogin;
	}

	/**
	 * @param login.
	 * the login to set.
	 */
	public void setSecurityUserLogin(String login) {
		this.securityUserLogin = login;
	}

	/**
	 * @return the password.
	 */
	public String getSecurityUserPassword() {
		return securityUserPassword;
	}

	/**
	 * @param password.
	 * the password to set.
	 */
	public void setSecurityUserPassword(String password) {
		this.securityUserPassword = password;
	}

	/**
	 * @return the enable.
	 */
	public Boolean getSecurityUserEnable() {
		return securityUserEnable;
	}

	/**
	 * @param enable the enable to set.
	 */
	public void setSecurityUserEnable(Boolean enable) {
		this.securityUserEnable = enable;
	}

	/**
	 * @return the roles.
	 */
	public Set<SecurityRole> getSecurityUserRoles() {
		return securityUserRoles;
	}

	/**
	 * @param roles the roles to set.
	 */
	public void setSecurityUserRoles(Set<SecurityRole> roles) {
		this.securityUserRoles = roles;
	}

	public SecurityUser() {
	}
}
