package bzh.bmv.bcf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.ProjectStepContract;

/**
 * <h1>ProjetStep class</h1>
 * The class projectStep implements one projectStep.
 * A projectStep contain one image.
 * @author REVEREAU, LE DOUJET
 * @since 2018-09-10
 */
@Entity
@Table(name=ProjectStepContract.TABLENAME)
public class ProjectStep {
	
	/**
	 * ProjectStep identifier
	 * Long
	 * Auto-increment
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projectStepId;
	/**
	 * ProjectStep level
	 * Integer
	 * Not null
	 */
	@Column(nullable=false)
	private Integer projectStepLevel;
	/**
	 * ProjectStep name
	 * String
	 * Not null
	 */
	@Column(nullable=false)
	private String projectStepName;
	/**
	 * ProjectStep description
	 * String
	 * Not null
	 */
	@Column(nullable=false)
	private String projectStepDescription;
	/**
	 * ProjectStep image
	 * {@link Image Image.class}
	 */
	@OneToOne(targetEntity = Image.class)
	private Image projectStepImage;
	
	/**
	 * Get the projectStep level
	 * @return Integer
	 */
	public Integer getProjectStepLevel() {
		return projectStepLevel;
	}
	/**
	 * Set a new projectStep level
	 * @param projectStepLevel Integer
	 */
	public void setProjectStepLevel(Integer projectStepLevel) {
		this.projectStepLevel = projectStepLevel;
	}
	/**
	 * Get the projectStep name
	 * @return String
	 */
	public String getProjectStepName() {
		return projectStepName;
	}
	/**
	 * Set a new projectStep name
	 * @param projectStepName String
	 */
	public void setProjectStepName(String projectStepName) {
		this.projectStepName = projectStepName;
	}
	/**
	 * Get the projectStep description
	 * @return String
	 */
	public String getProjectStepDescription() {
		return projectStepDescription;
	}
	/**
	 * Set the projectStep description
	 * @param projectStepDescription String
	 */
	public void setProjectStepDescription(String projectStepDescription) {
		this.projectStepDescription = projectStepDescription;
	}
	/**
	 * Get the projectStep image
	 * @return {@link Image Image.class}
	 */
	public Image getProjectStepImage() {
		return projectStepImage;
	}
	/**
	 * Set a new projectStep image
	 * @param projectStepImage {@link Image Image.class}
	 */
	public void setProjectStepImage(Image projectStepImage) {
		this.projectStepImage = projectStepImage;
	}
	/**
	 * Get the projectStep identifier
	 * @return Long
	 */
	public Long getProjectStepId() {
		return projectStepId;
	}
	
	/**
	 * ProjectStep constructor
	 */
	public ProjectStep() {
		super();
	}
	/**
	 * ProjectStep constructor specifying attribute
	 * @param projectStepLevel Integer
	 * @param projectStepName String
	 * @param projectStepDescription String
	 * @param projectStepImage {@link Image Image.class}
	 */
	public ProjectStep(Integer projectStepLevel, String projectStepName,
			String projectStepDescription, Image projectStepImage) {
		super();
		this.projectStepLevel = projectStepLevel;
		this.projectStepName = projectStepName;
		this.projectStepDescription = projectStepDescription;
		this.projectStepImage = projectStepImage;
	} 

	
}
