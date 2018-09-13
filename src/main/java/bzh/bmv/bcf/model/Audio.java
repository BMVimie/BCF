package bzh.bmv.bcf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bzh.bmv.bcf.contract.AudioContract;

/**
 * <h1>Audio class</h1>
 * The class audio implement one audio elements.
 * @author REVEREAU
 * @since 2018-09-07
 */
@Entity
@Table(name = AudioContract.TABLENAME)
public class Audio {

	/**
	 * Audio identifier.
	 * Long.
	 * Auto-increment.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long audioId;
	
	/**
	 * Audio name
	 * String
	 * Not null
	 */
	@Column(nullable = false)
	private String audioName;

	/**
	 * Audio source path
	 * String
	 * Not null, unique
	 */
	@Column(nullable = false, unique = true)
	private String audioSrc;

	/**
	 * Audio extension
	 * String
	 * Not null
	 */
	@Column(nullable = false)
	private String audioExtension;

	/**
	 * Audio duration in seconds
	 * Integer
	 * Not null
	 */
	@Column(nullable = false)
	private Integer audioDuration;

	/**
	 * Get the audio name
	 * @return String
	 */
	public String getAudioName() {
		return audioName;
	}

	/**
	 * Set a new audio name
	 * @param audioName String
	 */
	public void setAudioName(String audioName) {
		this.audioName = audioName;
	}

	/**
	 * Get the audio source path
	 * @return String
	 */
	public String getAudioSrc() {
		return audioSrc;
	}

	/**
	 * Set a new audio source path
	 * @param audioSrc String
	 */
	public void setAudioSrc(String audioSrc) {
		this.audioSrc = audioSrc;
	}

	/**
	 * Get the audio extension
	 * @return String
	 */
	public String getAudioExtension() {
		return audioExtension;
	}

	/**
	 * Set a new audio extension
	 * @param audioExtension String
	 */
	public void setAudioExtension(String audioExtension) {
		this.audioExtension = audioExtension;
	}

	/**
	 * Get the audio duration
	 * @return Integer
	 */
	public Integer getAudioDuration() {
		return audioDuration;
	}

	/**
	 * Set a new audio duration
	 * @param audioDuration Integer
	 */
	public void setAudioDuration(Integer audioDuration) {
		this.audioDuration = audioDuration;
	}

	/**
	 * Get the audio identifier
	 * @return Long
	 */
	public Long getAudioId() {
		return audioId;
	}

	/**
	 * Audio constructor specifying attribute
	 * @param audioName String
	 * @param audioSrc String
	 * @param audioExtension String
	 * @param audioDuration Integer
	 */
	public Audio(String audioName, String audioSrc, String audioExtension, Integer audioDuration) {
		super();
		this.audioName = audioName;
		this.audioSrc = audioSrc;
		this.audioExtension = audioExtension;
		this.audioDuration = audioDuration;
	}

	/**
	 * Audio constructor
	 */
	public Audio() {
		super();
	}

}
