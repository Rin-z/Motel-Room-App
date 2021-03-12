package fpt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "postId")
	private int postId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "postDate")
	@Type(type = "date")
	private Date postDate;
	
	@Column(name = "postStatus")
	private int postStatus;
	
	@Column(name = "postTitle")
	private String postTitle;
	
	@Column(name = "postView")
	private int postView;
	
	@Column(name = "roomId")
	private int roomId;
	
	@OneToOne
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = false, updatable = false)
	private MotelRoom motelRoom;

	public Post() {
		super();
	}

	public Post(int postId, String description, Date postDate, int postStatus, String postTitle, int postView,
			int roomId) {
		super();
		this.postId = postId;
		this.description = description;
		this.postDate = postDate;
		this.postStatus = postStatus;
		this.postTitle = postTitle;
		this.postView = postView;
		this.roomId = roomId;
	}

	public Post(int postId, String description, Date postDate, int postStatus, String postTitle, int postView,
			int roomId, MotelRoom motelRoom) {
		super();
		this.postId = postId;
		this.description = description;
		this.postDate = postDate;
		this.postStatus = postStatus;
		this.postTitle = postTitle;
		this.postView = postView;
		this.roomId = roomId;
		this.motelRoom = motelRoom;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public int getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(int postStatus) {
		this.postStatus = postStatus;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public int getPostView() {
		return postView;
	}

	public void setPostView(int postView) {
		this.postView = postView;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public MotelRoom getMotelRoom() {
		return motelRoom;
	}

	public void setMotelRoom(MotelRoom motelRoom) {
		this.motelRoom = motelRoom;
	}
	
}
