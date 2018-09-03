package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="counterpart")
public class CounterPart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long counterPartId;
	private Integer quantity;
	private String counterPartDescription;
	private String counterPartName;
	private Double counterPartPrice;
	
	// getter and setter
	public Long getCounterPartId() {
		return counterPartId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
	public CounterPart(Integer quantity, String counterPartDescription, String counterPartName,
			Double counterPartPrice) {
		super();
		this.quantity = quantity;
		this.counterPartDescription = counterPartDescription;
		this.counterPartName = counterPartName;
		this.counterPartPrice = counterPartPrice;
	}

}
