package bzh.bmv.bcf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="audio")
public class Audio {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long audioId;
	private String audioName;
	private String audioSrc;
	private String audioExtension;
	private Integer audioDuration;
	
	// getter and setter
	public Long getAudioId() {
		return audioId;
	}
	public void setAudioId(Long audioId) {
		this.audioId = audioId;
	}
	public String getAudioName() {
		return audioName;
	}
	public void setAudioName(String audioName) {
		this.audioName = audioName;
	}
	public String getAudioSrc() {
		return audioSrc;
	}
	public void setAudioSrc(String audioSrc) {
		this.audioSrc = audioSrc;
	}
	public String getAudioExtension() {
		return audioExtension;
	}
	public void setAudioExtension(String audioExtension) {
		this.audioExtension = audioExtension;
	}
	public Integer getAudioDuration() {
		return audioDuration;
	}
	public void setAudioDuration(Integer audioDuration) {
		this.audioDuration = audioDuration;
	}
	
	// constructor
	public Audio() {
		super();
	}
	public Audio(String audioName, String audioSrc, String audioExtension, Integer audioDuration) {
		super();
		this.audioName = audioName;
		this.audioSrc = audioSrc;
		this.audioExtension = audioExtension;
		this.audioDuration = audioDuration;
	}
	
	
}
