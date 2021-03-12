package fpt.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Email")
public class Email {
	@Id
	@Column(name = "email")
	private String email;
	
	@Column(name = "emailAdress")
	private String emailAdress;
	
	@Column(name = "verificationCode")
	private String verificationCode;
	
	@Column(name = "time")
	@Type(type = "time")
	private Date time;
	
	@OneToMany
	@JoinColumn(name = "email", referencedColumnName = "email", insertable = true, updatable = true)
	private List<AccountInfo> accountInfo;

	public Email() {
		super();
	}

	
}
