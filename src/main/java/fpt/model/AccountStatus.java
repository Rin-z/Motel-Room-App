package fpt.model;

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
@Table(name = "AccountStatus")
public class AccountStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accountStatusId")
	private int accountStatusId;
	
	@Column(name = "accountStatusName")
	private String accountStatusName;
	
	@OneToMany
	@JoinColumn(name = "accountStatusId", referencedColumnName = "accountStatusId", insertable = true, updatable = true)
	private List<Account> account;

	public AccountStatus() {
		super();
	}

	public AccountStatus(int accountStatusId, String accountStatusName) {
		super();
		this.accountStatusId = accountStatusId;
		this.accountStatusName = accountStatusName;
	}

	public AccountStatus(int accountStatusId, String accountStatusName, List<Account> account) {
		super();
		this.accountStatusId = accountStatusId;
		this.accountStatusName = accountStatusName;
		this.account = account;
	}

	public int getAccountStatusId() {
		return accountStatusId;
	}

	public void setAccountStatusId(int accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	public String getAccountStatusName() {
		return accountStatusName;
	}

	public void setAccountStatusName(String accountStatusName) {
		this.accountStatusName = accountStatusName;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
}
