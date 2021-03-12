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
}
