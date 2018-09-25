package bzh.bmv.bcf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.CounterpartTypeContract;

/**
 * <h1>CounterpartType class</h1>
 * The class counterpartType represents one counterpartType.
 * @author REVEREAU
 * @since 2018-09-07
 */
@Entity
@Table(name = CounterpartTypeContract.TABLENAME)
public class CounterpartType {

	/**
	 * CounterpartType identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long counterpartTypeId;

	/**
	 * CounterpartType name.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false)
	private String counterpartTypeName;

	/**
	 * Get the counterpartType name.
	 * @return String
	 */
	public String getCounterpartTypeName() {
		return counterpartTypeName;
	}

	/**
	 * Set a new counterpartType name.
	 * @param counterpartTypeName String
	 */
	public void setCounterpartTypeName(String counterpartTypeName) {
		this.counterpartTypeName = counterpartTypeName;
	}

	/**
	 * Get the counterpartType identifier.
	 * @return Long
	 */
	public Long getCounterpartTypeId() {
		return counterpartTypeId;
	}

	/**
	 * CounterpartType constructor specifying attribute.
	 * @param counterpartTypeName String
	 */
	public CounterpartType(String counterpartTypeName) {
		super();
		this.counterpartTypeName = counterpartTypeName;
	}

	/**
	 * CounterpartType constructor.
	 */
	public CounterpartType() {
		super();
	}

}
