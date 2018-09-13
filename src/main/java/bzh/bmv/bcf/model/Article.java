package bzh.bmv.bcf.model;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.ArticleContract;


/**
 * <h1>Article class</h1>
 * The class article implements one article.
 * An article may contain media(s).
 * @author REVEREAU, DUPITIER
 * @since 2018-09-07
 */
@Entity
@Table(name = ArticleContract.TABLENAME)
public class Article {

	/**
	 * Article identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long articleId;

	/**
	 * Article text.
	 * String[].
	 */
	protected String[] articleText;

	/**
	 * Article name.
	 * String.
	 * Not null, unique.
	 */
	@Column(nullable = false, unique = true)
	protected String articleName;

	/**
	 * Article medias.
	 * Collection<{@link Media Media.class}>.
	 */
	@OneToMany(targetEntity = Media.class)
	protected Collection<Media> articleMedias;

	/**
	 * Get the article text.
	 * @return String[].
	 */
	public String[] getArticleText() {
		return articleText;
	}

	/**
	 * Set a new article text.
	 * @param articleText String[].
	 */
	public void setArticleText(String[] articleText) {
		this.articleText = articleText;
	}

	/**
	 * Get the article name.
	 * @return String.
	 */
	public String getArticleName() {
		return articleName;
	}

	/**
	 * Set a new article name.
	 * @param articleName String.
	 */
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	/**
	 * Get the article media(s).
	 * @return Collection<{@link Media Media.class}>.
	 */
	public Collection<Media> getArticleMedias() {
		return articleMedias;
	}

	/**
	 * Set the article media(s).
	 * @param articleMedias Collection<{@link Media Media.class}>.
	 */
	public void setArticleMedias(Collection<Media> articleMedias) {
		this.articleMedias = articleMedias;
	}

	/**
	 * Get the article identifier.
	 * @return Long.
	 */
	public Long getArticleId() {
		return articleId;
	}

	/**
	 * Article constructor specifying attribute.
	 * @param articleText String.
	 * @param articleName String.
	 * @param articleMedias Collection<{@link Media Media.class}>.
	 */
	public Article(String[] articleText, String articleName, Collection<Media> articleMedias) {
		super();
		this.articleText = articleText;
		this.articleName = articleName;
		this.articleMedias = articleMedias;
	}

	/**
	 * Article constructor
	 */
	public Article() {
		super();
	}

}
