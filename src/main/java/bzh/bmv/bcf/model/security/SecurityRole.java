package bzh.bmv.bcf.model.security;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import bzh.bmv.bcf.model.User;

@Entity
@Table(name = "security_role")
public class SecurityRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "securityRoleId")
	private Long securityRoleId;
	private String securityRoleRole;

	@ManyToMany(targetEntity = User.class)
	@JoinTable(name = "users_securityroles",
    	joinColumns = @JoinColumn(name = "securityRoleId"),
    	inverseJoinColumns = @JoinColumn(name = "securityUserId"))
	private Set<User> securityRoleUsers;

	/**
	 * @return the role.
	 */
	public String getSecurityRoleRole() {
		return securityRoleRole;
	}

	/**
	 * @param role the role to set.
	 */
	public void setSecurityRoleRole(String role) {
		this.securityRoleRole = role;
	}

	/**
	 * @return the users.
	 */
	public Set<User> getSecurityRoleUsers() {
		return securityRoleUsers;
	}

	/**
	 * @param users the users to set.
	 */
	public void setSecurityRoleUsers(Set<User> users) {
		this.securityRoleUsers = users;
	}

	public SecurityRole() {
	}
}
