package bzh.bmv.bcf.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * a project
 */

@Entity
@Table(name ="project")

public class Project {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Long projectId;
    private String projectName;
    private Date projectTerm;
    private Double projectFundingGoal;
    private String[] projectTypeName;
    
    // getters and setters
    //////////////////////
    
	public Long getProjectId() {
		return projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getProjectTerm() {
		return projectTerm;
	}

	public void setProjectTerm(Date projectTerm) {
		this.projectTerm = projectTerm;
	}

	public Double getProjectFundingGoal() {
		return projectFundingGoal;
	}

	public void setProjectFundingGoal(Double projectFundingGoal) {
		this.projectFundingGoal = projectFundingGoal;
	}

	public String[] getProjectTypeName() {
		return projectTypeName;
	}

	public void setProjectTypeName(String[] projectTypeName) {
		this.projectTypeName = projectTypeName;
	}
    
	// constructors
	///////////////
    
    public Project() {
    }
    
    public Project(String projectName, Date projectTerm, Double projectFundingGoal, String[] projectTypeName) {
		super();
		this.projectName = projectName;
		this.projectTerm = projectTerm;
		this.projectFundingGoal = projectFundingGoal;
		this.projectTypeName = projectTypeName;
	}

}
