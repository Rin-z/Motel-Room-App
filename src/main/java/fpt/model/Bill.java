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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "billID")
	private int billID;

	@Column(name = "roomId")
	private int roomId;
	
	@Column(name = "rentday")
	@Type(type = "date")
	private Date rentday;
	
	@Column(name = "rentId")
	private int rentId;

	@OneToOne
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = false, updatable = false)
	private MotelRoom motelroom;

	@OneToOne
	@JoinColumn(name = "rentId", referencedColumnName = "rentId", insertable = false, updatable = false)
	private Renter renter ;
	
	@OneToMany
	@JoinColumn(name = "billID", referencedColumnName = "billID", insertable = true, updatable = true)
	private List<BillDetails> billdetails;

	public Bill() {
		super();
	}

	public Bill(int billID, int roomId, Date rentday, int rentId) {
		super();
		this.billID = billID;
		this.roomId = roomId;
		this.rentday = rentday;
		this.rentId = rentId;
	}

	public Bill(int billID, int roomId, Date rentday, int rentId, MotelRoom motelroom, Renter renter,
			List<BillDetails> billdetails) {
		super();
		this.billID = billID;
		this.roomId = roomId;
		this.rentday = rentday;
		this.rentId = rentId;
		this.motelroom = motelroom;
		this.renter = renter;
		this.billdetails = billdetails;
	}

	public int getBillID() {
		return billID;
	}

	public void setBillID(int billID) {
		this.billID = billID;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public Date getRentday() {
		return rentday;
	}

	public void setRentday(Date rentday) {
		this.rentday = rentday;
	}

	public int getRentId() {
		return rentId;
	}

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}

	public MotelRoom getMotelroom() {
		return motelroom;
	}

	public void setMotelroom(MotelRoom motelroom) {
		this.motelroom = motelroom;
	}

	public Renter getRenter() {
		return renter;
	}

	public void setRenter(Renter renter) {
		this.renter = renter;
	}

	public List<BillDetails> getBilldetails() {
		return billdetails;
	}

	public void setBilldetails(List<BillDetails> billdetails) {
		this.billdetails = billdetails;
	}
	
	
}
