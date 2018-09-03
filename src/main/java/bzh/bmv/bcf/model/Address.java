package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * a user address
 */

@Entity
@Table(name ="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long addressId;
	private String addressStreet;
    private String addressCountry;
    private String adressCity;
    private String addressZipCode;
    private String state;
    private String addressNumber;

	// getters and setters
    //////////////////////
    
    public String getAddressStreet() {
		return addressStreet;
	}
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	public String getAdressCity() {
		return adressCity;
	}
	public void setAdressCity(String adressCity) {
		this.adressCity = adressCity;
	}
	public String getAddressZipCode() {
		return addressZipCode;
	}
	public void setAddressZipCode(String addressZipCode) {
		this.addressZipCode = addressZipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}
	public Long getAddressId() {
		return addressId;
	}


    // constructors
	///////////////
	
    public Address() {
    }
    
    public Address(String addressStreet, String addressCountry, String adressCity,
			String addressZipCode, String state, String addressNumber) {
		super();
		this.addressStreet = addressStreet;
		this.addressCountry = addressCountry;
		this.adressCity = adressCity;
		this.addressZipCode = addressZipCode;
		this.state = state;
		this.addressNumber = addressNumber;
	}
}
