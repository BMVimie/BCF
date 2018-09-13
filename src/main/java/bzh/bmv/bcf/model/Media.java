package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.MediaContract;

/**
 * <h1>Media class</h1>
 * The class media implements one media.
 * @author REVEREAU, DUPITIER
 * @since 2018-09-10
 */
@Entity
@Table(name = MediaContract.TABLENAME)
public class Media {

	/**
	 * Media identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long mediaId;

	/**
	 * Get the media identifier.
	 * @return Long.
	 */
	public Long getMediaId() {
		return mediaId;
	}

}
