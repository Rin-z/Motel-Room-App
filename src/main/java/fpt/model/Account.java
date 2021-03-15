package fpt.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account extends ModelCommon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accountId")
	private int accountId;
	
	@Column(name = "username", columnDefinition = "varchar(50) not null")
	private String username;
	
	@Column(name = "password", columnDefinition = "varchar(50) not null")
	private String password;
	
	@Column(name = "role")
	private int role;
	
	@Column(name = "accountStatus", columnDefinition = "bit not null")
	private boolean accountStatus;
	
	@Column(name = "name", columnDefinition = "nvarchar(50)")
	private String name;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "birthday", columnDefinition = "date")
	private Date birthday;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "provinceId")
	private int provinceId;
	
	@Column(name = "districtId")
	private int districtId;
	
	@OneToMany
	@JoinColumn(name = "accountId", referencedColumnName = "accountId", insertable = true, updatable = true)
	private List<MotelRoom> motelRoom;
	
	@OneToMany
	@JoinColumn(name = "accountId", referencedColumnName = "accountId", insertable = true, updatable = true)
	private List<Post> post;
	
	public Account() {
		super();
	}

	public Account(int accountId, String username, String password, int role, boolean accountStatus, String name,
			int gender, Date birthday, String phone, String email, int provinceId, int districtId) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.accountStatus = accountStatus;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.provinceId = provinceId;
		this.districtId = districtId;
	}

	public Account(int accountId, String username, String password, int role, boolean accountStatus, String name,
			int gender, Date birthday, String phone, String email, int provinceId, int districtId,
			List<MotelRoom> motelRoom, List<Post> post) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.accountStatus = accountStatus;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.motelRoom = motelRoom;
		this.post = post;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public boolean isAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<MotelRoom> getMotelRoom() {
		return motelRoom;
	}

	public void setMotelRoom(List<MotelRoom> motelRoom) {
		this.motelRoom = motelRoom;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}
}
