package bzh.bmv.bcf.model;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.CreditCardContract;

/**
 * <h1>CreditCard class</h1>
 * The class creditCard represents one credit card.
 * A credit card may contain contribution(s).
 * @author REVEREAU, LE DOUJET
 * @since 2018-09-07
 */
@Entity
@Table(name = CreditCardContract.TABLENAME)
public class CreditCard {

	/**
	 * CreditCard identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long creditCardId;

	/**
	 * CreditCard number.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false)
	private String creditCardNb;

	/**
	 * CreditCard expiration month.
	 * Integer.
	 * Not null.
	 */
	@Column(nullable = false)
	private Integer creditCardExpMth;

	/**
	 * CreditCard expiration year.
	 * Integer.
	 * Not null.
	 */
	@Column(nullable = false)
	private Integer creditCardExpYear;

	/**
	 * CreditCard security code.
	 * Integer.
	 * Not null.
	 */
	private Integer creditCardVerificationSecurityCode;

	/**
	 * CreditCard owner.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false)
	private String creditCardOwner;

	/**
	 * CreditCard contribution(s).
	 * Collection<{@link Contribution Contribution.class}>.
	 */
	@OneToMany(targetEntity = Contribution.class)
    private Collection<Contribution> creditCardContributions;

	/**
	 * Get the creditCard number.
	 * @return String.
	 */
	public String getCreditCardNb() {
		return creditCardNb;
	}

	/**
	 * Set a new creditCard number.
	 * @param creditCardNb String.
	 */
	public void setCreditCardNb(String creditCardNb) {
		this.creditCardNb = creditCardNb;
	}

	/**
	 * Get the creditCard expiration month.
	 * @return Integer.
	 */
	public Integer getCreditCardExpMth() {
		return creditCardExpMth;
	}

	/**
	 * Set a new creditCard expiration month.
	 * @param creditCardExpMth Integer.
	 */
	public void setCreditCardExpMth(Integer creditCardExpMth) {
		this.creditCardExpMth = creditCardExpMth;
	}

	/**
	 * Get the creditCard expiration year.
	 * @return Integer.
	 */
	public Integer getCreditCardExpYear() {
		return creditCardExpYear;
	}

	/**
	 * Set a new creditCard expiration year.
	 * @param creditCardExpYear Integer.
	 */
	public void setCreditCardExpYear(Integer creditCardExpYear) {
		this.creditCardExpYear = creditCardExpYear;
	}

	/**
	 * Get the creditCard security code.
	 * @return Integer.
	 */
	public Integer getCreditCardVerificationSecurityCode() {
		return creditCardVerificationSecurityCode;
	}

	/**
	 * Set a new creditCard security code.
	 * @param creditCardVerificationSecurityCode Integer.
	 */
	public void setCreditCardVerificationSecurityCode(Integer creditCardVerificationSecurityCode) {
		this.creditCardVerificationSecurityCode = creditCardVerificationSecurityCode;
	}

	/**
	 * Get the creditCard owner.
	 * @return String.
	 */
	public String getCreditCardOwner() {
		return creditCardOwner;
	}

	/**
	 * Set a new creditCard owner.
	 * @param creditCardOwner String.
	 */
	public void setCreditCardOwner(String creditCardOwner) {
		this.creditCardOwner = creditCardOwner;
	}

	/**
	 * Get the creditCard contribution(s).
	 * @return Collection<{@link Contribution Contribution.class}>.
	 */
	public Collection<Contribution> getCreditCardContributions() {
		return creditCardContributions;
	}

	/**
	 * Set a new creditCard contribution(s).
	 * @param counterpartContributions Collection<{@link Contribution Contribution.class}>.
	 */
	public void setCreditCardContributions(Collection<Contribution> creditCardContributions) {
		this.creditCardContributions = creditCardContributions;
	}

	/**
	 * Get the creditCard identifier.
	 * @return Long.
	 */
	public Long getCreditCardId() {
		return creditCardId;
	}

	/**
	 * CreditCard constructor specifying attribute.
	 * @param creditCardNb String.
	 * @param creditCardExpMth Integer.
	 * @param creditCardExpYear Integer.
	 * @param creditCardVerificationSecurityCode Integer.
	 * @param creditCardOwner String.
	 * @param creditCardContributions Collection<{@link Contribution Contribution.class}>.
	 */
	public CreditCard(String creditCardNb, Integer creditCardExpMth, Integer creditCardExpYear,
			Integer creditCardVerificationSecurityCode, String creditCardOwner,
			Collection<Contribution> creditCardContributions) {
		super();
		this.creditCardNb = creditCardNb;
		this.creditCardExpMth = creditCardExpMth;
		this.creditCardExpYear = creditCardExpYear;
		this.creditCardVerificationSecurityCode = creditCardVerificationSecurityCode;
		this.creditCardOwner = creditCardOwner;
		this.creditCardContributions = creditCardContributions;
	}

	/**
	 * CreditCard constructor.
	 */
	public CreditCard() {
		super();
	}

}
