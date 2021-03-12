package fpt.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "AccountInfo")
public class AccountInfo {
	
	@Id
	@Column(name = "accountInfoId")
	private int accountInfoId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "birthday")
	@Type(type = "date")
	private Date birthday;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "provinceId")
	private int provinceId;
	
	@Column(name = "districtId")
	private int districtId;

	@OneToOne
	@JoinColumn(name = "email", referencedColumnName = "email", insertable = false, updatable = false)
	private Email emailtb;
	
	@OneToMany
	@JoinColumn(name = "accountInfoId", referencedColumnName = "accountInfoId", insertable = true, updatable = true)
	private List<Account> account;
	
	public AccountInfo() {
		super();
	}

	public AccountInfo(int accountInfoId, String name, Date birthday, int gender, String phone, String email,
			int provinceId, int districtId) {
		super();
		this.accountInfoId = accountInfoId;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.provinceId = provinceId;
		this.districtId = districtId;
	}

	public AccountInfo(int accountInfoId, String name, Date birthday, int gender, String phone, String email,
			int provinceId, int districtId, Email emailtb, List<Account> account) {
		super();
		this.accountInfoId = accountInfoId;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.emailtb = emailtb;
		this.account = account;
	}

	public int getAccountInfoId() {
		return accountInfoId;
	}

	public void setAccountInfoId(int accountInfoId) {
		this.accountInfoId = accountInfoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
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

	public Email getEmailtb() {
		return emailtb;
	}

	public void setEmailtb(Email emailtb) {
		this.emailtb = emailtb;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
}
