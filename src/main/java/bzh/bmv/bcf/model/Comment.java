package bzh.bmv.bcf.model;

import java.sql.Date;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import bzh.bmv.bcf.contract.CommentContract;

/**
 * <h1>Comment class</h1>
 * The class comment implements one comment.
 * A comment may contain other comment(s).
 * @author REVEREAU, LE DOUJET
 * @since 2018-09-07
 */
@Entity
@Table(name = CommentContract.TABLENAME)
public class Comment {

	/**
	 * Comment identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commentId;

	/**
	 * Comment text.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false, length=2000)
	private String commentText;

	/**
	 * Comment name.
	 * String.
	 */
	private String commentName;

	/**
	 * Comment date.
	 * Date.
	 * Not null.
	 */
	@Column(nullable = false)
	private Date commentDate;

	/**
	 * Comment reply.
	 * Collection<{@link Comment Comment.class}>.
	 */
	@OneToMany(targetEntity = Comment.class)
	private Collection<Comment> commentReply;

	/**
	 * Get the comment text.
	 * @return String.
	 */
	public String getCommentText() {
		return commentText;
	}

	/**
	 * Set a new comment text.
	 * @param commentText String.
	 */
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	/**
	 * Get the comment name.
	 * @return String.
	 */
	public String getCommentName() {
		return commentName;
	}

	/**
	 * Set a new comment name.
	 * @param commentName String.
	 */
	public void setCommentName(String commentName) {
		this.commentName = commentName;
	}

	/**
	 * Get the comment date.
	 * @return Date.
	 */
	public Date getCommentDate() {
		return commentDate;
	}

	/**
	 * Set a new comment date.
	 * @param commentDate Date.
	 */
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	/**
	 * Get the comment reply(replies).
	 * @return Collection<{@link Comment Comment.class}>.
	 */
	public Collection<Comment> getCommentReply() {
		return commentReply;
	}

	/**
	 * set a new comment reply(replies).
	 * @param commentReply Collection<{@link Comment Comment.class}>.
	 */
	public void setCommentReply(Collection<Comment> commentReply) {
		this.commentReply = commentReply;
	}

	/**
	 * Get the comment identifier.
	 * @return the commentId.
	 */
	public Long getCommentId() {
		return commentId;
	}

	/**
	 * Comment constructor specifying attribute.
	 * @param commentText String.
	 * @param commentName String.
	 * @param commentDate Date.
	 * @param commentReply Collection<{@link Comment Comment.class}>.
	 */
	public Comment(String commentText, String commentName, Date commentDate, Collection<Comment> commentReply) {
		super();
		this.commentText = commentText;
		this.commentName = commentName;
		this.commentDate = commentDate;
		this.commentReply = commentReply;
	}

	/**
	 * Comment constructor.
	 */
	public Comment() {
		super();
	}

}
