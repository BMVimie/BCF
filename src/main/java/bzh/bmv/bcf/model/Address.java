package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.AddressContract;

/**
 * a user address
 */

@Entity
@Table(name = AddressContract.TABLENAME)
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	private String addressStreet;
	private String addressCountry;
	private String addressCity;
	private String addressZipCode;
	private String addressState;
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

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String adressCity) {
		this.addressCity = adressCity;
	}

	public String getAddressZipCode() {
		return addressZipCode;
	}

	public void setAddressZipCode(String addressZipCode) {
		this.addressZipCode = addressZipCode;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String state) {
		this.addressState = state;
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

	public Address(String addressStreet, String addressCountry, String adressCity, String addressZipCode, String addressState,
			String addressNumber) {
		super();
		this.addressStreet = addressStreet;
		this.addressCountry = addressCountry;
		this.addressCity = adressCity;
		this.addressZipCode = addressZipCode;
		this.addressState = addressState;
		this.addressNumber = addressNumber;
	}
}
