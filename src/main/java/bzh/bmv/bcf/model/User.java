package bzh.bmv.bcf.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String userPassword;
	private Boolean isActivate;
	private String userLogin;
	private String userFamilyName;
    private String userFirstName;
    private Date userBirthDate;
    private String phoneNumber;
    private String userEmail;
	
    // getter and setter
	public Long getUserId() {
		return userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Boolean getIsActivate() {
		return isActivate;
	}
	public void setIsActivate(Boolean isActivate) {
		this.isActivate = isActivate;
	}
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public void setUserFamilyName(String userFamilyName) {
		this.userFamilyName = userFamilyName;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public Date getUserBirthDate() {
		return userBirthDate;
	}
	public void setUserBirthDate(Date userBirthDate) {
		this.userBirthDate = userBirthDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserFamilyName() {
		return userFamilyName;
	}
	
	// constructor
	public User() {
		super();
	}
	public User(String userPassword, Boolean isActivate, String userLogin, String userFamilyName,
			String userFirstName, Date userBirthDate, String phoneNumber, String userEmail) {
		super();
		this.userPassword = userPassword;
		this.isActivate = isActivate;
		this.userLogin = userLogin;
		this.userFamilyName = userFamilyName;
		this.userFirstName = userFirstName;
		this.userBirthDate = userBirthDate;
		this.phoneNumber = phoneNumber;
		this.userEmail = userEmail;
	}
	

	
}
