package bzh.bmv.bcf.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import bzh.bmv.bcf.contract.ImprovAdviceContract;

/**
 * <h1>ImprovAdvice class</h1>
 * The class improvAdvice implements improve advice.
 * @author REVEREAU
 * @since 2018-09-10
 */
@Entity
@Table(name = ImprovAdviceContract.TABLENAME)
public class ImprovAdvice {

	/**
	 * ImprovAdvice identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long improvId;

	/**
	 * ImprovAdvice text.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false)
	private String improvText;

	/**
	 * ImprovAdvice Name.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false)
	private String improvName;

	/**
	 * ImprovAdvice date.
	 * Date.
	 * Not null.
	 */
	@Column(nullable = false)
	private Date improvDate;

	/**
	 * ImprovAdvice reply.
	 * String.
	 */
	private String improvReply;

	/**
	 * Get the improvAdvice text.
	 * @return String.
	 */
	public String getImprovText() {
		return improvText;
	}

	/**
	 * Set a new improvAdvice text.
	 * @param improvText String.
	 */
	public void setImprovText(String improvText) {
		this.improvText = improvText;
	}

	/**
	 * Get the improvAdvice name.
	 * @return String.
	 */
	public String getImprovName() {
		return improvName;
	}

	/**
	 * Set a new improvAdvice name.
	 * @param improvName String.
	 */
	public void setImprovName(String improvName) {
		this.improvName = improvName;
	}

	/**
	 * Get the improvAdvice date.
	 * @return Date.
	 */
	public Date getImprovDate() {
		return improvDate;
	}

	/**
	 * Set a new improvAdvice date.
	 * @param improvDate Date.
	 */
	public void setImprovDate(Date improvDate) {
		this.improvDate = improvDate;
	}

	/**
	 * Get the improvAdvice reply.
	 * @return String.
	 */
	public String getImprovReply() {
		return improvReply;
	}

	/**
	 * Set the improvAdvice reply.
	 * @param improvReply String.
	 */
	public void setImprovReply(String improvReply) {
		this.improvReply = improvReply;
	}

	/**
	 * Get the improvAdvice identifier.
	 * @return Long.
	 */
	public Long getImprovId() {
		return improvId;
	}

	/**
	 * ImprovAdvice constructor specifying attribute.
	 * @param improvText String.
	 * @param improvName String.
	 * @param improvDate Date.
	 * @param improvReply String.
	 */
	public ImprovAdvice(String improvText, String improvName, Date improvDate, String improvReply) {
		super();
		this.improvText = improvText;
		this.improvName = improvName;
		this.improvDate = improvDate;
		this.improvReply = improvReply;
	}

	/**
	 * ImprovAdvice constructor.
	 */
	public ImprovAdvice() {
		super();
	}

}
