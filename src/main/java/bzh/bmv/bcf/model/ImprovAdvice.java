package bzh.bmv.bcf.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.ImprovAdviceContract;

@Entity
@Table(name=ImprovAdviceContract.TABLENAME)
public class ImprovAdvice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long improvId;
	private String improvText;
	private String improvName;
	private Date improvDate;
	private String improvReply;
	
	
	public Long getImprovId() {
		return improvId;
	}
	public void setImprovId(Long improvId) {
		this.improvId = improvId;
	}
	public String getImprovText() {
		return improvText;
	}
	public void setImprovText(String improvText) {
		this.improvText = improvText;
	}
	public String getImprovName() {
		return improvName;
	}
	public void setImprovName(String improvName) {
		this.improvName = improvName;
	}
	public String getImprovReply() {
		return improvReply;
	}
	public void setImprovReply(String improvReply) {
		this.improvReply = improvReply;
	}
	public Date getImprovDate() {
		return improvDate;
	}
	
	public ImprovAdvice() {
		super();
	}
	public ImprovAdvice(String improvText, String improvName, Date improvDate, String improvReply) {
		super();
		this.improvText = improvText;
		this.improvName = improvName;
		this.improvDate = improvDate;
		this.improvReply = improvReply;
	}

	
	
	
	
}
