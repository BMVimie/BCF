package bzh.bmv.bcf.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.HeaderContract;


/**
 * <h1>Header class</h1>
 * The class Header represents one header.
 * A header is a child of the class Article.
 * @author REVEREAU, DUPITIER
 * @since 2018-09-10
 */
@Entity
@Table(name = HeaderContract.TABLENAME)
public class Header extends Article {

	/**
	 * Header media.
	 * {@link Media Media.class}.
	 */
	@OneToOne(targetEntity = Media.class)
	private Media media;

	/**
	 * Get the header media.
	 * @return {@link Media Media.class}.
	 */
	public Media getMedia() {
		return media;
	}

	/**
	 * Set a new header media.
	 * @param media {@link Media Media.class}.
	 */
	public void setMedia(Media media) {
		this.media = media;
	}

	/**
	 * Header constructor specifying attribute.
	 * @param media {@link Media Media.class}.
	 */
	public Header(Media media) {
		super();
		this.media = media;
	}

	/**
	 * Header constructor.
	 */
	public Header() {
		super();
	}

	public Header(String articleName) {
		super(articleName);
		// TODO Auto-generated constructor stub
	}

	public Header(String[] articleText, String articleName, Collection<Media> articleMedias) {
		super(articleText, articleName, articleMedias);
		// TODO Auto-generated constructor stub
	}

	
}
