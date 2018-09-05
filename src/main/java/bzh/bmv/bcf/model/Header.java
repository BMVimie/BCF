//package bzh.bmv.bcf.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import bzh.bmv.bcf.contract.HeaderContract;
//
///**
// * header of an article
// */
//
//@Entity
//@Table(name = HeaderContract.TABLENAME)
//public class Header extends Article {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	protected Long headerId;
//	
//	@OneToOne(targetEntity = Media.class)
//	private Media media;
//
//	// getters and setters
//	//////////////////////
//
//	public Media getMedia() {
//		return media;
//	}
//
//	public void setMedia(Media media) {
//		this.media = media;
//	}
//
//	// constructors
//	///////////////
//
//	public Header(Media media) {
//		super();
//		this.media = media;
//	}
//
//}
