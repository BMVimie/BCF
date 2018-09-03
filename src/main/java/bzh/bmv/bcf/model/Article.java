package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * article composing project page
 */

@Entity
@Table(name ="article")

public class Article {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    protected Long articleId;
	protected String[] articleText;
    protected String articleName;
	
    // getters and setters
    //////////////////////
    
    public String[] getArticleText() {
		return articleText;
	}

	public void setArticleText(String[] articleText) {
		this.articleText = articleText;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Long getArticleId() {
		return articleId;
	}

	// constructors
	///////////////

    public Article() {
    }

	public Article(String[] articleText, String articleName) {
		super();
		this.articleText = articleText;
		this.articleName = articleName;
	}
}
