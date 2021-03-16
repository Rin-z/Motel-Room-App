package fpt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MotelRoom")
public class MotelRoom extends ModelCommon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roomId")
	private int roomId;
	
	@Column(name = "roomStatus", columnDefinition = "bit not null")
	private boolean roomStatus;
	
	@Column(name = "roomName", columnDefinition = "nvarchar(50)")
	private String roomName;
	
	@Column(name = "acreage")
	private int acreage;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "address", columnDefinition = "nvarchar(150)")
	private String address;
	
	@Column(name = "provinceId")
	private int provinceId;
	
	@Column(name = "districtId")
	private int districtId;
	
	@Column(name = "wardId")
	private int wardId;
	
	@Column(name = "maxPeople")
	private int maxPeople;
	
	@Column(name = "accountId")
	private int accountId;
	
	@OneToOne
	@JoinColumn(name = "accountId", referencedColumnName = "accountId", insertable = false, updatable = false)
	private Account account;
	
	@OneToMany
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = true, updatable = true)
	private List<Image> image;
	
	@OneToMany
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = true, updatable = true)
	private List<MotelRoom_Criteria> motelRoom_Criteria;

	@OneToOne
	@JoinColumn(name = "wardId", referencedColumnName = "wardId", insertable = false, updatable = false)
	private Ward ward;
	
	@OneToMany
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = true, updatable = true)
	private List<Post> post;

	public MotelRoom() {
		super();
	}

	public MotelRoom(int roomId, boolean roomStatus, String roomName, int acreage, int price, String address,
			int provinceId, int districtId, int wardId, int maxPeople, int accountId) {
		super();
		this.roomId = roomId;
		this.roomStatus = roomStatus;
		this.roomName = roomName;
		this.acreage = acreage;
		this.price = price;
		this.address = address;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.wardId = wardId;
		this.maxPeople = maxPeople;
		this.accountId = accountId;
	}

	public MotelRoom(int roomId, boolean roomStatus, String roomName, int acreage, int price, String address,
			int provinceId, int districtId, int wardId, int maxPeople, int accountId, Account account,
			List<Image> image, List<MotelRoom_Criteria> motelRoom_Criteria, Ward ward, List<Post> post) {
		super();
		this.roomId = roomId;
		this.roomStatus = roomStatus;
		this.roomName = roomName;
		this.acreage = acreage;
		this.price = price;
		this.address = address;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.wardId = wardId;
		this.maxPeople = maxPeople;
		this.accountId = accountId;
		this.account = account;
		this.image = image;
		this.motelRoom_Criteria = motelRoom_Criteria;
		this.ward = ward;
		this.post = post;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public boolean isRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(boolean roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getAcreage() {
		return acreage;
	}

	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getWardId() {
		return wardId;
	}

	public void setWardId(int wardId) {
		this.wardId = wardId;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public List<MotelRoom_Criteria> getMotelRoom_Criteria() {
		return motelRoom_Criteria;
	}

	public void setMotelRoom_Criteria(List<MotelRoom_Criteria> motelRoom_Criteria) {
		this.motelRoom_Criteria = motelRoom_Criteria;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}
	
}
