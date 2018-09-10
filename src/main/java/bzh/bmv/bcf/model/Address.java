package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.AddressContract;

/**
 * <h1>Address class</h1>
 * The class addresses implements an postal address
 * @author REVEREAU
 * @since 2018-09-07
 */
@Entity
@Table(name = AddressContract.TABLENAME)
public class Address {

	/**
	 * Address identifier
	 * Long
	 * Auto-increment
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	/**
	 * Address street name
	 * String
	 */
	private String addressStreet;
	/**
	 * Address country name
	 * String
	 */
	private String addressCountry;
	/**
	 * Address city name
	 * String
	 */
	private String addressCity;
	/**
	 * Address zip code number
	 * String
	 */
	private String addressZipCode;
	/**
	 * Address state name
	 * String
	 */
	private String addressState;
	/**
	 * Address number
	 * String
	 */
	private String addressNumber;
	
	
	/**
	 * Get the address street name
	 * @return String
	 */
	public String getAddressStreet() {
		return addressStreet;
	}
	/**
	 * Set a new address street name
	 * @param addressStreet String
	 */
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	/**
	 * Get the address country name
	 * @return String
	 */
	public String getAddressCountry() {
		return addressCountry;
	}
	/**
	 * Set a new address country name
	 * @param addressCountry String
	 */
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	/**
	 * Get the address city name
	 * @return String
	 */
	public String getAddressCity() {
		return addressCity;
	}
	/**
	 * Set a new address city name
	 * @param addressCity String
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	/**
	 * Get the address zip code number
	 * @return String
	 */
	public String getAddressZipCode() {
		return addressZipCode;
	}
	/**
	 * Set a new address zip code number
	 * @param addressZipCode String
	 */
	public void setAddressZipCode(String addressZipCode) {
		this.addressZipCode = addressZipCode;
	}
	/**
	 * Get the address state name
	 * @return String
	 */
	public String getAddressState() {
		return addressState;
	}
	/**
	 * Set a new address state name
	 * @param addressState String
	 */
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	/**
	 * Get the address number
	 * @return String
	 */
	public String getAddressNumber() {
		return addressNumber;
	}
	/**
	 * Set a new address number
	 * @param addressNumber String
	 */
	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}
	/**
	 * Get the address identifier
	 * @return Long
	 */
	public Long getAddressId() {
		return addressId;
	}
	
	/**
	 * Address constructor
	 */
	public Address() {
		super();
	}
	/**
	 * Address constructor specifying attribute
	 * @param addressStreet String
	 * @param addressCountry String
	 * @param addressCity String
	 * @param addressZipCode String
	 * @param addressState String
	 * @param addressNumber String
	 */
	public Address(String addressStreet, String addressCountry, String addressCity, String addressZipCode,
			String addressState, String addressNumber) {
		super();
		this.addressStreet = addressStreet;
		this.addressCountry = addressCountry;
		this.addressCity = addressCity;
		this.addressZipCode = addressZipCode;
		this.addressState = addressState;
		this.addressNumber = addressNumber;
	}
		
}
