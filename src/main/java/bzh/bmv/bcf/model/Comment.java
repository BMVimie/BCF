package bzh.bmv.bcf.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.CommentContract;

@Entity
@Table(name=CommentContract.TABLENAME)
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commentId;
	private String commentText;
	private String commentName;
	private Date commentDate;


	///////////////////////////////////////////
	
	
	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	public String getCommentText() {
		return commentText;
	}
	

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public String getCommentName() {
		return commentName;
	}
	public void setCommentName(String commentName) {
		this.commentName = commentName;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	////////////////////////////////////////
	public Comment(String commentText, String commentName, Date commentDate) {
		super();
		this.commentText = commentText;
		this.commentName = commentName;
		this.commentDate = commentDate;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
