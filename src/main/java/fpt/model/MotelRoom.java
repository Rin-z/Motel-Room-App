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
	
}
