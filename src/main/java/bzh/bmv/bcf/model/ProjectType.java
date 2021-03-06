package bzh.bmv.bcf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.ProjectTypeContract;

/**
 * <h1>ProjectType class</h1>
 * The class projectType implements one project type.
 * @author REVEREAU
 * @since 2018-09-10
 */
@Entity
@Table(name=ProjectTypeContract.TABLENAME)
public class ProjectType {
	
	/**
	 * ProjectType identifier
	 * Long
	 * Auto-increment
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long projectTypeId;
	/**
	 * ProjectType name
	 * String
	 * Not null
	 */
	@Column(nullable=false)
	private String projectTypeName;
	
	/**
	 * Get the projectType name
	 * @return String
	 */
	public String getProjectTypeName() {
		return projectTypeName;
	}
	/**
	 * Set a new projectType name
	 * @param projectTypeName String
	 */
	public void setProjectTypeName(String projectTypeName) {
		this.projectTypeName = projectTypeName;
	}
	/**
	 * Get the projectType identifier
	 * @return Long
	 */
	public Long getProjectTypeId() {
		return projectTypeId;
	}
	
	/**
	 * ProjectType constructor
	 */
	public ProjectType() {
		super();
	}
	/**
	 * ProjectType constructor specifying attribute
	 * @param projectTypeName String
	 */
	public ProjectType(String projectTypeName) {
		super();
		this.projectTypeName = projectTypeName;
	}
	
	
	
}
