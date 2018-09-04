package bzh.bmv.bcf.model;

/**
 * header of an article
 */

public class Header extends Article {
	
	private Media media;
	
	// getters and setters
	//////////////////////

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}
	
	// constructors
	///////////////
	
	public Header(Media media) {
		super();
		this.media = media;
	}
	
	
}
