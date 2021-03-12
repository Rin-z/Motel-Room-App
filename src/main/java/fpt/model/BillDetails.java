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

	public BillDetails() {
		super();
	}

	public BillDetails(int billdetailsId, int billId, Date fromday, Date today, int billstatus, long roomrates,
			int electtricityprirce, int waterprice, int internetprice, int provinceId) {
		super();
		this.billdetailsId = billdetailsId;
		this.billId = billId;
		this.fromday = fromday;
		this.today = today;
		this.billstatus = billstatus;
		this.roomrates = roomrates;
		this.electtricityprirce = electtricityprirce;
		this.waterprice = waterprice;
		this.internetprice = internetprice;
		this.provinceId = provinceId;
	}

	public BillDetails(int billdetailsId, int billId, Date fromday, Date today, int billstatus, long roomrates,
			int electtricityprirce, int waterprice, int internetprice, int provinceId, Bill bill) {
		super();
		this.billdetailsId = billdetailsId;
		this.billId = billId;
		this.fromday = fromday;
		this.today = today;
		this.billstatus = billstatus;
		this.roomrates = roomrates;
		this.electtricityprirce = electtricityprirce;
		this.waterprice = waterprice;
		this.internetprice = internetprice;
		this.provinceId = provinceId;
		this.bill = bill;
	}

	public int getBilldetailsId() {
		return billdetailsId;
	}

	public void setBilldetailsId(int billdetailsId) {
		this.billdetailsId = billdetailsId;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public Date getFromday() {
		return fromday;
	}

	public void setFromday(Date fromday) {
		this.fromday = fromday;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public int getBillstatus() {
		return billstatus;
	}

	public void setBillstatus(int billstatus) {
		this.billstatus = billstatus;
	}

	public long getRoomrates() {
		return roomrates;
	}

	public void setRoomrates(long roomrates) {
		this.roomrates = roomrates;
	}

	public int getElecttricityprirce() {
		return electtricityprirce;
	}

	public void setElecttricityprirce(int electtricityprirce) {
		this.electtricityprirce = electtricityprirce;
	}

	public int getWaterprice() {
		return waterprice;
	}

	public void setWaterprice(int waterprice) {
		this.waterprice = waterprice;
	}

	public int getInternetprice() {
		return internetprice;
	}

	public void setInternetprice(int internetprice) {
		this.internetprice = internetprice;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
}
