package fpt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Image")
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "imageId")
	private int imageId;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "roomId")
	private int roomId;
	
	@OneToOne
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = false, updatable = false)
	private MotelRoom motelRoom;
	
}
