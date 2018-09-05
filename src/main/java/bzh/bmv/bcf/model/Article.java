//package bzh.bmv.bcf.model;
//
//import java.util.Collection;
//
////import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
//import javax.persistence.OneToMany;
////import javax.persistence.Table;
////import bzh.bmv.bcf.contract.ArticleContract;
//
///**
// * article composing project page
// */
//
////@Inherited
////@Entity
////@Table(name = ArticleContract.TABLENAME)
//
//@MappedSuperclass
//public class Article {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	protected Long articleId;
//	
//	protected String[] articleText;
//	protected String articleName;
//	
//	@OneToMany(targetEntity = Media.class)
//	private Collection<Media> medias;
//
//	// getters and setters
//	//////////////////////
//
//	public String[] getArticleText() {
//		return articleText;
//	}
//
//	public void setArticleText(String[] articleText) {
//		this.articleText = articleText;
//	}
//
//	public String getArticleName() {
//		return articleName;
//	}
//
//	public void setArticleName(String articleName) {
//		this.articleName = articleName;
//	}
//
//	public Long getArticleId() {
//		return articleId;
//	}
//	
//	public Collection<Media> getMedias() {
//		return medias;
//	}
//
//	public void setMedias(Collection<Media> medias) {
//		this.medias = medias;
//	}
//
//	// constructors
//	///////////////
//
//	public Article() {
//	}
//
//	public Article(String[] articleText, String articleName, Collection<Media> medias) {
//		super();
//		this.articleText = articleText;
//		this.articleName = articleName;
//		this.medias = medias;
//	}
//}
