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
@Table(name = "BillDetails")
public class BillDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "billdetailsId")
	private int billdetailsId;
	
	@Column(name = "billId")
	private int billId;
	
	@Column(name = "fromday")
	private Date fromday;
	
	@Column(name = "today")
	private Date today;
	
	@Column(name = "billstatus")
	private int billstatus;
	
	@Column(name = "roomrates")
	private long roomrates;
	
	@Column(name = "electricityprice")
	private int electtricityprirce;
	
	
	@Column(name = "waterprice")
	private int waterprice;
	
	@Column(name = "internetprice")
	private int internetprice;
	
	@Column(name = "provinceId")
	private int provinceId;

	@OneToOne
	@JoinColumn(name = "billId", referencedColumnName = "billId", insertable = false, updatable = false)
	private Bill bill;
	
	
	//test
	

}
