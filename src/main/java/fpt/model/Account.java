package fpt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	
	@Id
	@Column(name = "accountId")
	private String accountId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private int role;
	
	@Column(name = "accountStatusId")
	private int accountStatusId;
	
	@Column(name = "accountInfoId")
	private int accountInfoId;
	
	@OneToOne
	@JoinColumn(name = "accountInfoId", referencedColumnName = "accountInfoId", insertable = false, updatable = false)
	private AccountInfo accountInfo;
	
	@OneToOne
	@JoinColumn(name = "accountStatusId", referencedColumnName = "accountStatusId", insertable = false, updatable = false)
	private AccountStatus accountStatus;
	
	
	@OneToMany
	@JoinColumn(name = "accountId", referencedColumnName = "accountId", insertable = true, updatable = true)
	private List<MotelRoom> motelRoom;
	
	public Account() {
		super();
	}
	
	public Account(String accountId, String password, int role, int accountStatusId, int accountInfoId) {
		super();
		this.accountId = accountId;
		this.password = password;
		this.role = role;
		this.accountStatusId = accountStatusId;
		this.accountInfoId = accountInfoId;
	}

	public Account(String accountId, String password, int role, int accountStatusId, int accountInfoId,
			AccountInfo accountInfo, AccountStatus accountStatus, List<MotelRoom> motelRoom) {
		super();
		this.accountId = accountId;
		this.password = password;
		this.role = role;
		this.accountStatusId = accountStatusId;
		this.accountInfoId = accountInfoId;
		this.accountInfo = accountInfo;
		this.accountStatus = accountStatus;
		this.motelRoom = motelRoom;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
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

	public int getAccountInfoId() {
		return accountInfoId;
	}

	public void setAccountInfoId(int accountInfoId) {
		this.accountInfoId = accountInfoId;
	}

	public AccountInfo getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	public int getAccountStatusId() {
		return accountStatusId;
	}

	public void setAccountStatusId(int accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public List<MotelRoom> getMotelRoom() {
		return motelRoom;
	}

	public void setMotelRoom(List<MotelRoom> motelRoom) {
		this.motelRoom = motelRoom;
	}

	// vu mll
}
