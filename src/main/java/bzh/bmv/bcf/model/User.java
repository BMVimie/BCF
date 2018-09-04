package bzh.bmv.bcf.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.UserContract;

@Entity
@Table(name=UserContract.TABLENAME)
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
    private String userPhoneNumber;
    private String userEmail;
    @OneToMany(targetEntity=Address.class)
    private Collection<Address> addresses;
    @OneToMany(targetEntity=CreditCard.class)
    private Collection<CreditCard> creditCards;
	
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
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String phoneNumber) {
		this.userPhoneNumber = phoneNumber;
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
	public Collection<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}
	
	// constructor
	public User() {
		super();
	}
	public User(String userPassword, Boolean isActivate, String userLogin, String userFamilyName,
			String userFirstName, Date userBirthDate, String phoneNumber, String userEmail, Collection<Address> addresses) {
		super();
		this.userPassword = userPassword;
		this.isActivate = isActivate;
		this.userLogin = userLogin;
		this.userFamilyName = userFamilyName;
		this.userFirstName = userFirstName;
		this.userBirthDate = userBirthDate;
		this.userPhoneNumber = phoneNumber;
		this.userEmail = userEmail;
		this.addresses = addresses;
	}
	

	
}
