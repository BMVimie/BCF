package bzh.bmv.bcf.model;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.CounterpartContract;

/**
 * <h1>Counterpart class</h1>
 * The class counterpart implements one counterpart.
 * An counterpart may contain contribution(s).
 * @author REVEREAU, DUPITIER
 * @since 2018-09-07
 */
@Entity
@Table(name = CounterpartContract.TABLENAME)
public class Counterpart {

	/**
	 * Counterpart identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long counterpartId;

	/**
	 * Counterpart quantity.
	 * Integer.
	 * Not null.
	 */
	@Column(nullable = false)
	private Integer counterpartQuantity;

	/**
	 * Counterpart description.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false, length=2000)
	private String counterpartDescription;

	/**
	 * Counterpart name.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false)
	private String counterpartName;

	/**
	 * Counterpart price.
	 * Double.
	 * Not null.
	 */
	@Column(nullable = false)
	private Double counterpartPrice;

	/**
	 * Counterpart type.
	 * {@link CounterpartType CounterpartType.class}.
	 */
	@OneToOne(targetEntity = CounterpartType.class)
	private CounterpartType counterpartType;

	/**
	 * Counterpart contribution(s).
	 * Collection<{@link Contribution Contribution.class}>.
	 */
	@OneToMany(targetEntity = Contribution.class)
    private Collection<Contribution> counterpartContributions;

	/**
	 * Get the counterpart quantity.
	 * @return Integer.
	 */
	public Integer getCounterpartQuantity() {
		return counterpartQuantity;
	}

	/**
	 * Set a new counterpart quantity.
	 * @param counterpartQuantity Integer.
	 */
	public void setCounterpartQuantity(Integer counterpartQuantity) {
		this.counterpartQuantity = counterpartQuantity;
	}

	/**
	 * Get the counterpart description.
	 * @return String.
	 */
	public String getCounterpartDescription() {
		return counterpartDescription;
	}

	/**
	 * Set a new counterpart description.
	 * @param counterpartDescription String.
	 */
	public void setCounterpartDescription(String counterpartDescription) {
		this.counterpartDescription = counterpartDescription;
	}

	/**
	 * Get the counterpart name.
	 * @return String.
	 */
	public String getCounterpartName() {
		return counterpartName;
	}

	/**
	 * Set a new counterpart name.
	 * @param counterpartName String.
	 */
	public void setCounterpartName(String counterpartName) {
		this.counterpartName = counterpartName;
	}

	/**
	 * Get counterpart price.
	 * @return Double.
	 */
	public Double getCounterpartPrice() {
		return counterpartPrice;
	}

	/**
	 * Set a new counterpart price.
	 * @param counterpartPrice Double.
	 */
	public void setCounterpartPrice(Double counterpartPrice) {
		this.counterpartPrice = counterpartPrice;
	}

	/**
	 * Get the counterpart counterpartType.
	 * @return {@link CounterpartType CounterpartType.class}.
	 */
	public CounterpartType getCounterpartType() {
		return counterpartType;
	}

	/**
	 * Set a new counterpart counterpartType.
	 * @param counterpartType {@link CounterpartType CounterpartType.class}.
	 */
	public void setCounterpartType(CounterpartType counterpartType) {
		this.counterpartType = counterpartType;
	}

	/**
	 * Get the counterpart contribution(s).
	 * @return Collection<{@link Contribution Contribution.class}>.
	 */
	public Collection<Contribution> getCounterpartContributions() {
		return counterpartContributions;
	}

	/**
	 * Set a new counterpart contribution(s).
	 * @param counterpartContributions Collection<{@link Contribution Contribution.class}>.
	 */
	public void setCounterpartContributions(Collection<Contribution> counterpartContributions) {
		this.counterpartContributions = counterpartContributions;
	}

	/**
	 * Get the counterpart identifier.
	 * @return Long.
	 */
	public Long getCounterpartId() {
		return counterpartId;
	}

	/**
	 * Counterpart constructor specifying attribute.
	 * @param counterpartQuantity Integer.
	 * @param counterpartDescription String.
	 * @param counterpartName String.
	 * @param counterpartPrice Double.
	 * @param counterpartType CounterpartType.
	 * @param counterpartContributions Collection<{@link Contribution Contribution.class}>.
	 */
	public Counterpart(Integer counterpartQuantity, String counterpartDescription, String counterpartName,
			Double counterpartPrice, CounterpartType counterpartType,
			Collection<Contribution> counterpartContributions) {
		super();
		this.counterpartQuantity = counterpartQuantity;
		this.counterpartDescription = counterpartDescription;
		this.counterpartName = counterpartName;
		this.counterpartPrice = counterpartPrice;
		this.counterpartType = counterpartType;
		this.counterpartContributions = counterpartContributions;
	}

	/**
	 * Counterpart constructor.
	 */
	public Counterpart() {
		super();
	}

}
