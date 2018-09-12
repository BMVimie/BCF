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
public class SecurityRole{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="securityRoleId")
	private Long securityRoleId;
	private String role;

	@ManyToMany(targetEntity=User.class)
	@JoinTable(name = "users_securityroles",
    	joinColumns = @JoinColumn(name = "securityRoleId"),
    	inverseJoinColumns = @JoinColumn(name = "securityUserId"))
	private Set<User> users;

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public SecurityRole() {
	}
}
