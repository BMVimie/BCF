package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.ImageContract;

@Entity
@Table(name=ImageContract.TABLENAME)
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;
	private String imageName;
	private Integer imageWidth;
	private Integer imageHeight;
	private Integer imageResolution;
	private String imageSrc;
	private Double imageSize;
	private String imageExtension;
	
	//////////////////////////////////////////
	public Long getImageId() {
		return imageId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public Integer getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(Integer imageWidth) {
		this.imageWidth = imageWidth;
	}
	public Integer getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(Integer imageHeight) {
		this.imageHeight = imageHeight;
	}
	public Integer getImageResolution() {
		return imageResolution;
	}
	public void setImageResolution(Integer imageResolution) {
		this.imageResolution = imageResolution;
	}
	public String getImageSrc() {
		return imageSrc;
	}
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	public Double getImageSize() {
		return imageSize;
	}
	public void setImageSize(Double imageSize) {
		this.imageSize = imageSize;
	}
	public String getImageExtension() {
		return imageExtension;
	}
	public void setImageExtension(String imageExtension) {
		this.imageExtension = imageExtension;
	}
	
	///////////////////////////////////////////////////
	public Image(String imageName, Integer imageWidth, Integer imageHeight, Integer imageResolution, String imageSrc,
			Double imageSize, String imageExtension) {
		super();
		this.imageName = imageName;
		this.imageWidth = imageWidth;
		this.imageHeight = imageHeight;
		this.imageResolution = imageResolution;
		this.imageSrc = imageSrc;
		this.imageSize = imageSize;
		this.imageExtension = imageExtension;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
