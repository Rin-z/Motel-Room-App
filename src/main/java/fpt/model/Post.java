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

@Entity
@Table(name = "Post")
public class Post extends ModelCommon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "postId")
	private int postId;

	@Column(name = "postDate", columnDefinition = "date not null")
	private Date postDate;
	
	@Column(name = "postStatus", columnDefinition = "bit not null")
	private boolean postStatus;
	
	@Column(name = "postTitle", columnDefinition = "nvarchar(150)")
	private String postTitle;
	
	@Column(name = "description", columnDefinition = "nvarchar(255)")
	private String description;
	
	@Column(name = "postView")
	private int postView;
	
	@Column(name = "accountId")
	private int accountId;
	
	@Column(name = "roomId")
	private int roomId;
	
	@OneToOne
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = false, updatable = false)
	private MotelRoom motelRoom;
	
	@OneToOne
	@JoinColumn(name = "accountId", referencedColumnName = "accountId", insertable = false, updatable = false)
	private Account account;

	public Post() {
		super();
	}

	public Post(int postId, Date postDate, boolean postStatus, String postTitle, String description, int postView,
			int accountId, int roomId) {
		super();
		this.postId = postId;
		this.postDate = postDate;
		this.postStatus = postStatus;
		this.postTitle = postTitle;
		this.description = description;
		this.postView = postView;
		this.accountId = accountId;
		this.roomId = roomId;
	}

	public Post(int postId, Date postDate, boolean postStatus, String postTitle, String description, int postView,
			int accountId, int roomId, MotelRoom motelRoom, Account account) {
		super();
		this.postId = postId;
		this.postDate = postDate;
		this.postStatus = postStatus;
		this.postTitle = postTitle;
		this.description = description;
		this.postView = postView;
		this.accountId = accountId;
		this.roomId = roomId;
		this.motelRoom = motelRoom;
		this.account = account;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public boolean isPostStatus() {
		return postStatus;
	}

	public void setPostStatus(boolean postStatus) {
		this.postStatus = postStatus;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPostView() {
		return postView;
	}

	public void setPostView(int postView) {
		this.postView = postView;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
