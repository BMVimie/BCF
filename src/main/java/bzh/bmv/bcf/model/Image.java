package bzh.bmv.bcf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import bzh.bmv.bcf.contract.ImageContract;

/**
 * <h1>Image class</h1>
 * The class Image implements one image.
 * @author REVEREAU, LE DOUJET
 * @since 2018-09-10
 */
@Entity
@Table(name = ImageContract.TABLENAME)
public class Image {

	/**
	 * Image identifier.
	 * Long.
	 * Auto-Increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;

	/**
	 * Image name.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false)
	private String imageName;

	/**
	 * Image width in pixels.
	 * Integer.
	 * Not null.
	 */
	@Column(nullable = false)
	private Integer imageWidth;

	/**
	 * Image height in pixels.
	 * Integer.
	 * Not null.
	 */
	@Column(nullable = false)
	private Integer imageHeight;

	/**
	 * Image resolution in DPI.
	 * Integer.
	 * Not null.
	 */
	@Column(nullable = false)
	private Integer imageResolution;

	/**
	 * Image source path.
	 * String.
	 * Not null, unique.
	 */
	@Column(nullable = false, unique = true)
	private String imageSrc;

	/**
	 * Image size in byte.
	 * Double.
	 * Not null.
	 */
	@Column(nullable = false)
	private Double imageSize;

	/**
	 * Image extension.
	 * String.
	 * Not null.
	 */
	@Column(nullable = false)
	private String imageExtension;

	/**
	 * Get the image name.
	 * @return String.
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * Set a new image name.
	 * @param imageName String.
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * Get the image width.
	 * @return Integer.
	 */
	public Integer getImageWidth() {
		return imageWidth;
	}

	/**
	 * Set a new image width.
	 * @param imageWidth Integer.
	 */
	public void setImageWidth(Integer imageWidth) {
		this.imageWidth = imageWidth;
	}

	/**
	 * Get the image height.
	 * @return Integer.
	 */
	public Integer getImageHeight() {
		return imageHeight;
	}

	/**
	 * Set a new image height.
	 * @param imageHeight Integer.
	 */
	public void setImageHeight(Integer imageHeight) {
		this.imageHeight = imageHeight;
	}

	/**
	 * Get the image resolution.
	 * @return Integer.
	 */
	public Integer getImageResolution() {
		return imageResolution;
	}

	/**
	 * Set a new image resolution.
	 * @param imageResolution Integer.
	 */
	public void setImageResolution(Integer imageResolution) {
		this.imageResolution = imageResolution;
	}

	/**
	 * Get the image source path.
	 * @return String.
	 */
	public String getImageSrc() {
		return imageSrc;
	}

	/**
	 * Set a new image source path.
	 * @param imageSrc String.
	 */
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	/**
	 * Get the image size.
	 * @return Double.
	 */
	public Double getImageSize() {
		return imageSize;
	}

	/**
	 * Set a new image size.
	 * @param imageSize Double.
	 */
	public void setImageSize(Double imageSize) {
		this.imageSize = imageSize;
	}

	/**
	 * Get the image extension.
	 * @return String.
	 */
	public String getImageExtension() {
		return imageExtension;
	}

	/**
	 * Set a new image extension.
	 * @param imageExtension String.
	 */
	public void setImageExtension(String imageExtension) {
		this.imageExtension = imageExtension;
	}

	/**
	 * Get the image identifier.
	 * @return Long.
	 */
	public Long getImageId() {
		return imageId;
	}

	/**
	 * Image constructor specifying attribute.
	 * @param imageName String.
	 * @param imageWidth Integer.
	 * @param imageHeight Integer.
	 * @param imageResolution Integer.
	 * @param imageSrc String.
	 * @param imageSize Double.
	 * @param imageExtension String.
	 */
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

	/**
	 * Image constructor.
	 */
	public Image() {
		super();
	}

}
