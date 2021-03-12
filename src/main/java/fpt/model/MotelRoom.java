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
public class MotelRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roomId")
	private int roomId;
	
	@Column(name = "roomName")
	private String roomName;
	
	@Column(name = "acreage")
	private int acreage;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "provinceId")
	private int provinceId;
	
	@Column(name = "districtId")
	private int districtId;
	
	@Column(name = "wardId")
	private int wardId;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "statusId")
	private int statusId;
	
	@Column(name = "maxPeople")
	private int maxPeople;
	
	@Column(name = "accountId")
	private String accountId;
	
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
	@JoinColumn(name = "provinceId", referencedColumnName = "provinceId", insertable = false, updatable = false)
	private Province province;
	
	@OneToOne
	@JoinColumn(name = "districtId", referencedColumnName = "districtId", insertable = false, updatable = false)
	private District district;
	
	@OneToOne
	@JoinColumn(name = "wardId", referencedColumnName = "wardId", insertable = false, updatable = false)
	private Ward ward;
	
	@OneToMany
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = true, updatable = true)
	private List<Bill> bill;
	
	@OneToMany
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = true, updatable = true)
	private List<Renter> renter;
	
	@OneToMany
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = true, updatable = true)
	private List<Post> post;

	public MotelRoom() {
		super();
	}

	public MotelRoom(int roomId, String roomName, int acreage, int price, int provinceId, int districtId, int wardId,
			String address, int statusId, int maxPeople, String accountId, District district) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.acreage = acreage;
		this.price = price;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.wardId = wardId;
		this.address = address;
		this.statusId = statusId;
		this.maxPeople = maxPeople;
		this.accountId = accountId;
		this.district = district;
	}

	public MotelRoom(int roomId, String roomName, int acreage, int price, int provinceId, int districtId, int wardId,
			String address, int statusId, int maxPeople, String accountId, Account account, List<Image> image,
			List<MotelRoom_Criteria> motelRoom_Criteria, Province province, District district, Ward ward,
			List<Bill> bill, List<Renter> renter, List<Post> post) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.acreage = acreage;
		this.price = price;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.wardId = wardId;
		this.address = address;
		this.statusId = statusId;
		this.maxPeople = maxPeople;
		this.accountId = accountId;
		this.account = account;
		this.image = image;
		this.motelRoom_Criteria = motelRoom_Criteria;
		this.province = province;
		this.district = district;
		this.ward = ward;
		this.bill = bill;
		this.renter = renter;
		this.post = post;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
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

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public List<Bill> getBill() {
		return bill;
	}

	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}

	public List<Renter> getRenter() {
		return renter;
	}

	public void setRenter(List<Renter> renter) {
		this.renter = renter;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}
	
}
