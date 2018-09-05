package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.ProjectStepContract;

@Entity
@Table(name=ProjectStepContract.TABLENAME)
public class ProjectStep {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projectStepId;
	private Integer projectStepLevel;
	private String projectStepName;
	private String projectStepDescription;
	
	
	////////////////////////////
	public Long getProjectStepId() {
		return projectStepId;
	}

	public Integer getProjectStepLevel() {
		return projectStepLevel;
	}
	public void setProjectStepLevel(Integer projectStepLevel) {
		this.projectStepLevel = projectStepLevel;
	}
	public String getProjectStepName() {
		return projectStepName;
	}
	public void setProjectStepName(String projectStepName) {
		this.projectStepName = projectStepName;
	}
	public String getProjectStepDescription() {
		return projectStepDescription;
	}
	public void setProjectStepDescription(String projectStepDescription) {
		this.projectStepDescription = projectStepDescription;
	}
	
	
	
	////////////////////////////////
	public ProjectStep(Integer projectStepLevel, String projectStepName,
			String projectStepDescription) {
		super();
		this.projectStepLevel = projectStepLevel;
		this.projectStepName = projectStepName;
		this.projectStepDescription = projectStepDescription;
	}
	public ProjectStep() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
