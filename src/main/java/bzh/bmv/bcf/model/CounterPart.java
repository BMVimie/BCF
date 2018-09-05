package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.CounterPartContract;

@Entity
@Table(name=CounterPartContract.TABLENAME)
public class CounterPart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long counterPartId;
	private Integer counterPartQuantity;
	private String counterPartDescription;
	private String counterPartName;
	private Double counterPartPrice;
	
	// getter and setter
	public Long getCounterPartId() {
		return counterPartId;
	}
	public Integer getCounterPartQuantity() {
		return counterPartQuantity;
	}
	public void setCounterPartQuantity(Integer quantity) {
		this.counterPartQuantity = quantity;
	}
	public String getCounterPartDescription() {
		return counterPartDescription;
	}
	public void setCounterPartDescription(String counterPartDescription) {
		this.counterPartDescription = counterPartDescription;
	}
	public String getCounterPartName() {
		return counterPartName;
	}
	public void setCounterPartName(String counterPartName) {
		this.counterPartName = counterPartName;
	}
	public Double getCounterPartPrice() {
		return counterPartPrice;
	}
	public void setCounterPartPrice(Double counterPartPrice) {
		this.counterPartPrice = counterPartPrice;
	}

	
	// constructor
	public CounterPart() {
		super();
	}
	public CounterPart(Integer counterPartQuantity, String counterPartDescription, String counterPartName,
			Double counterPartPrice) {
		super();
		this.counterPartQuantity = counterPartQuantity;
		this.counterPartDescription = counterPartDescription;
		this.counterPartName = counterPartName;
		this.counterPartPrice = counterPartPrice;
	}

}
