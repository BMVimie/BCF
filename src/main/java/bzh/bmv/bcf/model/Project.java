package bzh.bmv.bcf.model;

import java.sql.Date;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import bzh.bmv.bcf.contract.ProjectContract;
import bzh.bmv.bcf.contract.ProjectTypeContract;
import bzh.bmv.bcf.contract.UserContract;


/**
 * <h1>Project class</h1>
 * The class project implements one project.
 * A project may contain projectType(s).
 * A project may contain User(s).
 * A project may contain contribution(s).
 * A project may contain counterpart(s).
 * A project may contain projectStep(s).
 * A project may contain Article(s).
 * A project contain one header.
 * A project may contain one footer.
 * A project may contain comments.
 * @author REVEREAU
 * @since 2018-09-10
 */
@Entity
@Table(name =ProjectContract.TABLENAME)
public class Project {

	/**
	 * Project identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;

	/**
	 * Project name.
	 * String.
	 * Not null, unique.
	 */
	@Column(nullable = false, unique = true)
    private String projectName;

	/**
	 * Project end date.
	 * Date.
	 * Not null.
	 */
	@Column(nullable = false)
    private Date projectTerm;

	/**
	 * Project funding goal.
	 * Double.
	 * Not null.
	 */
	@Column(nullable = false)
    private Double projectFundingGoal;

		/**
		 * Project types.
		 * Collection<{@link ProjectType ProjectType.class}>.
		 */
	@JsonIgnore
    @ManyToMany(targetEntity = ProjectType.class, mappedBy=ProjectTypeContract.PROJECTTYPEPROJECT)
    private Collection<ProjectType> projectProjectTypes;
   
		/**
		 * Project users.
		 * Collection<{@link User User.class}>.
		 */
    @JsonIgnore
    @OneToMany(targetEntity = User.class)
    @JsonIgnoreProperties(allowSetters = true, value = {UserContract.USERPROJECTS})
    private Collection<User> projectUsers;
   
		/**
		 * Project contributions.
		 * Collection<{@link Contribution Contribution.class}>.
		 */
    @JsonIgnore
    @OneToMany(targetEntity = Contribution.class)
    private Collection<Contribution> projectContributions;

		/**
		 * Project counterparts.
		 * Collection<{@link Counterpart Counterpart.class}>.
		 */
    @JsonIgnore
    @OneToMany(targetEntity = Counterpart.class)
    private Collection<Counterpart> projectCounterparts;

		/**
		 * Project steps.
		 * Collection<{@link ProjectStep ProjectStep.class}>.
		 */
    @JsonIgnore
    @OneToMany(targetEntity = ProjectStep.class)
    private Collection<ProjectStep> projectProjectSteps;

		/**
		 * Project articles.
		 * Collection<{@link Article Article.class}>.
		 */
    @JsonIgnore
    @OneToMany(targetEntity = Article.class)
    private Collection<Article> projectArticles;

		/**
		 * Project header.
		 * {@link Header Header.class}.
		 */
    @OneToOne(targetEntity = Header.class)
    private Header projectHeader;

    /**
     * Project footer.
     * {@link Footer Footer.class}.
     */
    @OneToOne(targetEntity = Footer.class)
    private Footer projectFooter;

    /**
     * Project comments.
     * Collection<{@link Comment Comment.class}>.
     */
    @JsonIgnore
    @OneToMany(targetEntity = Comment.class)
    private Collection<Comment> comments;
   
	/**
	 * Get the project name.
	 * @return String.
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * Set a new project name.
	 * @param projectName String.
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * Get the project end date.
	 * @return Date.
	 */
	public Date getProjectTerm() {
		return projectTerm;
	}

	/**
	 * Set a new project end date.
	 * @param projectTerm Date.
	 */
	public void setProjectTerm(Date projectTerm) {
		this.projectTerm = projectTerm;
	}

	/**
	 * Get the project funding goal.
	 * @return Double.
	 */
	public Double getProjectFundingGoal() {
		return projectFundingGoal;
	}

	/**
	 * Set a new project funding goal.
	 * @param projectFundingGoal Double.
	 */
	public void setProjectFundingGoal(Double projectFundingGoal) {
		this.projectFundingGoal = projectFundingGoal;
	}

	/**
	 * Get the project types.
	 * @return Collection<{@link ProjectType ProjectType.class}>.
	 */
	public Collection<ProjectType> getProjectProjectTypes() {
		return projectProjectTypes;
	}

	/**
	 * Set a new project types.
	 * @param projectProjectTypes Collection<{@link ProjectType ProjectType.class}>.
	 */
	public void setProjectProjectTypes(Collection<ProjectType> projectProjectTypes) {
		this.projectProjectTypes = projectProjectTypes;
	}

	/**
	 * Get the project users.
	 * @return Collection<{@link User User.class}>.
	 */
	public Collection<User> getProjectUsers() {
		return projectUsers;
	}

	/**
	 * Set a new project users.
	 * @param projectUsers Collection<{@link User User.class}>.
	 */
	public void setProjectUsers(Collection<User> projectUsers) {
		this.projectUsers = projectUsers;
	}

	/**
	 * Get the project contributions.
	 * @return Collection<{@link Contribution Contribution.class}>.
	 */
	public Collection<Contribution> getProjectContributions() {
		return projectContributions;
	}

	/**
	 * Set a new project contributions.
	 * @param projectContributions Collection<{@link Contribution Contribution.class}>.
	 */
	public void setProjectContributions(Collection<Contribution> projectContributions) {
		this.projectContributions = projectContributions;
	}

	/**
	 * Get the project counterparts.
	 * @return Collection<{@link Counterpart Counterpart.class}>.
	 */
	public Collection<Counterpart> getProjectCounterparts() {
		return projectCounterparts;
	}

	/**
	 * Set a new project counterparts.
	 * @param projectCounterparts Collection<{@link Counterpart Counterpart.class}>.
	 */
	public void setProjectCounterparts(Collection<Counterpart> projectCounterparts) {
		this.projectCounterparts = projectCounterparts;
	}

	/**
	 * Get the project steps.
	 * @return Collection<{@link ProjectStep ProjectStep.class}>.
	 */
	public Collection<ProjectStep> getProjectProjectSteps() {
		return projectProjectSteps;
	}

	/**
	 * Set a new project steps.
	 * @param projectProjectSteps Collection<{@link ProjectStep ProjectStep.class}>.
	 */
	public void setProjectProjectSteps(Collection<ProjectStep> projectProjectSteps) {
		this.projectProjectSteps = projectProjectSteps;
	}

	/**
	 * Get the project articles.
	 * @return Collection<{@link Article Article.class}>.
	 */
	public Collection<Article> getProjectArticles() {
		return projectArticles;
	}

	/**
	 * Set a new project articles.
	 * @param projectArticles Collection<{@link Article Article.class}>.
	 */
	public void setProjectArticles(Collection<Article> projectArticles) {
		this.projectArticles = projectArticles;
	}

	/**
	 * Get the project header.
	 * @return {@link Header Header.class}.
	 */
	public Header getProjectHeader() {
		return projectHeader;
	}

	/**
	 * Set a new project header.
	 * @param projectHeader {@link Header Header.class}.
	 */
	public void setProjectHeader(Header projectHeader) {
		this.projectHeader = projectHeader;
	}

	/**
	 * Get the project footer.
	 * @return {@link Footer Footer.class}.
	 */
	public Footer getProjectFooter() {
		return projectFooter;
	}

	/**
	 * Set a new project footer.
	 * @param projectFooter {@link Footer Footer.class}.
	 */
	public void setProjectFooter(Footer projectFooter) {
		this.projectFooter = projectFooter;
	}

	/**
	 * Get the project identifier.
	 * @return Long.
	 */
	public Long getProjectId() {
		return projectId;
	}

	/**
	 * Get the project comments.
	 * @return Collection<{@link Comment Comment.class}.
	 */
	public Collection<Comment> getComments() {
		return comments;
	}

	/**
	 * Set a new project comments.
	 * @param comments Collection<{@link Comment Comment.class}.
	 */
	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * Project constructor specifying attributes.
	 * @param projectName String.
	 * @param projectTerm Date.
	 * @param projectFundingGoal Double.
	 * @param projectProjectTypes Collection<{@link ProjectType ProjectType.class}>.
	 * @param projectUsers Collection<{@link User User.class}>.
	 * @param projectContributions Collection<{@link Contribution Contribution.class}>.
	 * @param projectCounterparts Collection<{@link Counterpart Counterpart.class}>.
	 * @param projectProjectSteps Collection<{@link ProjectStep ProjectStep.class}>.
	 * @param projectArticles Collection<{@link Article Article.class}>.
	 * @param projectHeader {@link Header Header.class}.
	 * @param projectFooter {@link Footer Footer.class}.
	 * @param comments Collection<{@link Comment Comment.class}.
	 */
	public Project(String projectName, Date projectTerm, Double projectFundingGoal,
			Collection<ProjectType> projectProjectTypes, Collection<User> projectUsers,
			Collection<Contribution> projectContributions, Collection<Counterpart> projectCounterparts,
			Collection<ProjectStep> projectProjectSteps, Collection<Article> projectArticles, Header projectHeader,
			Footer projectFooter, Collection<Comment> comments) {
		super();
		this.projectName = projectName;
		this.projectTerm = projectTerm;
		this.projectFundingGoal = projectFundingGoal;
		this.projectProjectTypes = projectProjectTypes;
		this.projectUsers = projectUsers;
		this.projectContributions = projectContributions;
		this.projectCounterparts = projectCounterparts;
		this.projectProjectSteps = projectProjectSteps;
		this.projectArticles = projectArticles;
		this.projectHeader = projectHeader;
		this.projectFooter = projectFooter;
		this.comments = comments;
	}

	/**
	 * Project constructor.
	 */
	public Project() {
		super();
	}

}