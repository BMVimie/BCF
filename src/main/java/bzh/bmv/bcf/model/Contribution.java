package bzh.bmv.bcf.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import bzh.bmv.bcf.contract.ContributionContract;

/**
 * <h1>Contribution Class</h1>
 * The class contribution represents one contribution.
 * @author REVEREAU
 * @since 2018-09-07
 */
@Entity
@Table(name = ContributionContract.TABLENAME)
public class Contribution {

	/**
	 * Contribution identifier.
	 * Long.
	 * Not null.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long contributionId;

	/**
	 * Contribution gift.
	 * Double.
	 * Not null.
	 */
	@Column(nullable = false)
	private Double contributionGift;

	/**
	 * Contribution date.
	 * Date.
	 * Not null.
	 */
	@Column(nullable = false)
	private Date contributionDate;

	/**
	 * Get the contribution gift.
	 * @return Double.
	 */
	public Double getContributionGift() {
		return contributionGift;
	}

	/**
	 * Set a new contribution gift.
	 * @param contributionGift Double.
	 */
	public void setContributionGift(Double contributionGift) {
		this.contributionGift = contributionGift;
	}

	/**
	 * Get the contribution date.
	 * @return Date.
	 */
	public Date getContributionDate() {
		return contributionDate;
	}

	/**
	 * Set a new contributionDate.
	 * @param contributionDate Date.
	 */
	public void setContributionDate(Date contributionDate) {
		this.contributionDate = contributionDate;
	}

	/**
	 * Get the contribution identifier.
	 * @return the contributionId.
	 */
	public Long getContributionId() {
		return contributionId;
	}

	/**
	 * Contribution constructor specifying attribute.
	 * @param contributionGift Double.
	 * @param contributionDate Date.
	 */
	public Contribution(Double contributionGift, Date contributionDate) {
		super();
		this.contributionGift = contributionGift;
		this.contributionDate = contributionDate;
	}

	/**
	 * Contribution constructor.
	 */
	public Contribution() {
		super();
	}

}
