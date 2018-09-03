package bzh.bmv.bcf.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentInfos")
public class PaymentInfos {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long creditCardId;
	private String creditCardNb;
	private Integer creditCardExpMth;
	private Integer creditCardExpYear;
	private Integer creditCardVerificationSecurityCode;
	private String creditCardOwner;
	
	
	//////////////////////////
	public Long getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(Long creditCardId) {
		this.creditCardId = creditCardId;
	}
	public String getCreditCardNb() {
		return creditCardNb;
	}
	public void setCreditCardNb(String creditCardNb) {
		this.creditCardNb = creditCardNb;
	}
	public Integer getCreditCardExpMth() {
		return creditCardExpMth;
	}
	public void setCreditCardExpMth(Integer creditCardExpMth) {
		this.creditCardExpMth = creditCardExpMth;
	}
	public Integer getCreditCardExpYear() {
		return creditCardExpYear;
	}
	public void setCreditCardExpYear(Integer creditCardExpYear) {
		this.creditCardExpYear = creditCardExpYear;
	}
	public Integer getCreditCardVerificationSecurityCode() {
		return creditCardVerificationSecurityCode;
	}
	public void setCreditCardVerificationSecurityCode(Integer creditCardVerificationSecurityCode) {
		this.creditCardVerificationSecurityCode = creditCardVerificationSecurityCode;
	}
	public String getCreditCardOwner() {
		return creditCardOwner;
	}
	public void setCreditCardOwner(String creditCardOwner) {
		this.creditCardOwner = creditCardOwner;
	}
	
	
	
	//////////////////////////
	//Constructor without primary key for it will be created automatically
	public PaymentInfos(String creditCardNb, Integer creditCardExpMth, Integer creditCardExpYear,
			Integer creditCardVerificationSecurityCode, String creditCardOwner) {
		super();
		this.creditCardNb = creditCardNb;
		this.creditCardExpMth = creditCardExpMth;
		this.creditCardExpYear = creditCardExpYear;
		this.creditCardVerificationSecurityCode = creditCardVerificationSecurityCode;
		this.creditCardOwner = creditCardOwner;
	}
	public PaymentInfos() {
		super();
	}
	
	
	
}
