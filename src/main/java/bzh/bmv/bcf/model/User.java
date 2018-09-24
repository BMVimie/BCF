package bzh.bmv.bcf.model;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import bzh.bmv.bcf.contract.ProjectContract;
import bzh.bmv.bcf.contract.UserContract;
import bzh.bmv.bcf.model.security.SecurityUser;

/**
 * <h1>User class</h1>
 * The class user implements one user.
 * A user may contain one image.
 * A user may contain address(es).
 * A user may contain credit card(s).
 * A user may contain contribution(s).
 * A user may contain project(s).
 * A user may contain comment(s)
 * A user may contain improve advice(s).
 * @author REVEREAU
 * @since 2018-09-10
 */
@Entity
@Table(name = UserContract.TABLENAME)
public class User extends SecurityUser {

	/**
	 * User family name.
	 * String.
	 */
	private String userFamilyName;

		/**
		 * User first name.
		 * String.
		 */
    private String userFirstName;

	    /**
	     * User birth date.
	     * Date.
	     * Not null.
	     */
	//    @Column(nullable=false)
    private Date userBirthDate;

    /**
     * User phone number.
     * String.
     */
    private String userPhoneNumber;

    /**
     * User email.
     * String.
     * Not null, unique.
     */
    @Column(nullable = false, unique = true)
    private String userEmail;

    /**
     * User avatar.
     * {@link Image Image.class}.
     */
    @OneToOne(targetEntity = Image.class)
    private Image userAvatar;

    /**
     * User address.
     * Collection<{@link Address Address.class}>.
     */
    @OneToMany(targetEntity = Address.class)
    private Collection<Address> userAddresses;

		/**
		 * User credit card.
		 * Collection<{@link CreditCard CreditCard.class}>.
		 */
    @OneToMany(targetEntity = CreditCard.class)
    private Collection<CreditCard> userCreditCards;

    /**
     * User contributions.
     * Collection<{@link Contribution Contribution.class}>.
     */
    @OneToMany(targetEntity = Contribution.class)
    private Collection<Contribution> userContributions;

    /**
     * User projects.
     * Collection<{@link Project Project.class}>.
     */
    @JsonIgnore
    @OneToMany(targetEntity = Project.class)
    @JsonIgnoreProperties(allowSetters=true, value= {ProjectContract.PROJECTUSERS})
    private Collection<Project> userProjects;

    /**
     * User comments.
     * Collection<{@link Comment Comment.class}>.
     */
    @OneToMany(targetEntity = Comment.class)
    private Collection<Comment> userComments;

    /**
     * User improve advice.
     * Collection<{@link ImprovAdvice ImprovAdvice.class}>.
     */
    @OneToMany(targetEntity = ImprovAdvice.class)
    private Collection<ImprovAdvice> userImprovAdvices;

	    /**
	     * Get the user family name.
		 * @return String.
		 */
	public String getUserFamilyName() {
		return userFamilyName;
	}
	
	/**
	 * Set a new user family name.
	 * @param userFamilyName String.
	 */
	public void setUserFamilyName(String userFamilyName) {
		this.userFamilyName = userFamilyName;
	}
	
	/**
	 * Get the user first name.
	 * @return String.
	 */
	public String getUserFirstName() {
		return userFirstName;
	}

	/**
	 * Set a new user first name.
	 * @param userFirstName String.
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	/**
	 * Get the user birth date.
	 * @return Date.
	 */
	public Date getUserBirthDate() {
		return userBirthDate;
	}

	/**
	 * Set a new user birth date.
	 * @param userBirthDate Date.
	 */
	public void setUserBirthDate(Date userBirthDate) {
		this.userBirthDate = userBirthDate;
	}

	/**
	 * Get the user phone number.
	 * @return String.
	 */
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	/**
	 * Set a new user phone number.
	 * @param userPhoneNumber String.
	 */
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	/**
	 * Get the user email.
	 * @return the userEmail.
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * Set a new user email.
	 * @param userEmail String.
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * Get the user avatar.
	 * @return {@link Image Image.class}.
	 */
	public Image getUserAvatar() {
		return userAvatar;
	}

	/**
	 * Set a new user avatar.
	 * @param userAvatar {@link Image Image.class}.
	 */
	public void setUserAvatar(Image userAvatar) {
		this.userAvatar = userAvatar;
	}

	/**
	 * Get the user addresses.
	 * @return Collection<{@link Address Address.class}>.
	 */
	public Collection<Address> getUserAddresses() {
		return userAddresses;
	}

	/**
	 * Set a new user addresses.
	 * @param userAddresses Collection<{@link Address Address.class}>.
	 */
	public void setUserAddresses(Collection<Address> userAddresses) {
		this.userAddresses = userAddresses;
	}

	/**
	 * Get the user credit cards.
	 * @return Collection<{@link CreditCard CreditCard.class}>.
	 */
	public Collection<CreditCard> getUserCreditCards() {
		return userCreditCards;
	}

	/**
	 * Set a new user credit cards.
	 * @param userCreditCards Collection<{@link CreditCard CreditCard.class}>.
	 */
	public void setUserCreditCards(Collection<CreditCard> userCreditCards) {
		this.userCreditCards = userCreditCards;
	}

	/**
	 * Get the user contributions.
	 * @return Collection<{@link Contribution Contribution.class}>.
	 */
	public Collection<Contribution> getUserContributions() {
		return userContributions;
	}

	/**
	 * Set a new user contributions.
	 * @param userContributions Collection<{@link Contribution Contribution.class}>.
	 */
	public void setUserContributions(Collection<Contribution> userContributions) {
		this.userContributions = userContributions;
	}

	/**
	 * Get the user projects.
	 * @return Collection<{@link Project Project.class}>.
	 */
	public Collection<Project> getUserProjects() {
		return userProjects;
	}

	/**
	 * Set a new user projects.
	 * @param userProjects Collection<{@link Project Project.class}>.
	 */
	public void setUserProjects(Collection<Project> userProjects) {
		this.userProjects = userProjects;
	}

	/**
	 * Get the user comments.
	 * @return Collection<{@link Comment Comment.class}>.
	 */
	public Collection<Comment> getUserComments() {
		return userComments;
	}

	/**
	 * Set a new user comments.
	 * @param userComments Collection<{@link Comment Comment.class}>.
	 */
	public void setUserComments(Collection<Comment> userComments) {
		this.userComments = userComments;
	}

	/**
	 * Get the user improve advice.
	 * @return Collection<{@link ImprovAdvice ImprovAdvice.class}>.
	 */
	public Collection<ImprovAdvice> getUserImprovAdvices() {
		return userImprovAdvices;
	}

	/**
	 * Set a new improve advice.
	 * @param userImprovAdvices Collection<{@link ImprovAdvice ImprovAdvice.class}>.
	 */
	public void setUserImprovAdvices(Collection<ImprovAdvice> userImprovAdvices) {
		this.userImprovAdvices = userImprovAdvices;
	}

	/**
	 * User constructor specifying attribute.
	 * @param userFamilyName.
	 * @param userFirstName.
	 * @param userBirthDate.
	 * @param userPhoneNumber.
	 * @param userEmail.
	 * @param userAvatar {@link Image Image.class}.
	 * @param userAddresses Collection<{@link Address Address.class}>.
	 * @param userCreditCards Collection<{@link CreditCard CreditCard.class}>.
	 * @param userContributions Collection<{@link Contribution Contribution.class}>.
	 * @param userProjects Collection<{@link Project Project.class}>.
	 * @param userComments Collection<{@link Comment Comment.class}>.
	 * @param userImprovAdvices Collection<{@link ImprovAdvice ImprovAdvice.class}>.
	 */
	public User(String userFamilyName, String userFirstName, Date userBirthDate, String userPhoneNumber,
			String userEmail, Image userAvatar, Collection<Address> userAddresses,
			Collection<CreditCard> userCreditCards, Collection<Contribution> userContributions,
			Collection<Project> userProjects, Collection<Comment> userComments,
			Collection<ImprovAdvice> userImprovAdvices) {
		super();
		this.userFamilyName = userFamilyName;
		this.userFirstName = userFirstName;
		this.userBirthDate = userBirthDate;
		this.userPhoneNumber = userPhoneNumber;
		this.userEmail = userEmail;
		this.userAvatar = userAvatar;
		this.userAddresses = userAddresses;
		this.userCreditCards = userCreditCards;
		this.userContributions = userContributions;
		this.userProjects = userProjects;
		this.userComments = userComments;
		this.userImprovAdvices = userImprovAdvices;
	}

	/**
	 * User constructor.
	 */
	public User() {
		super();
	}

}
