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

@Entity
@Table(name = "Renter")
public class Renter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rentId")
	private int rentId;
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "note")
	private String note;
	
	@Column(name ="roomId")
	private int roomId;
	
	@OneToOne
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = false, updatable = false)
	private MotelRoom motelroom;
	
	@OneToMany
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = true, updatable = true)
	private List<Bill> bill;

	public Renter() {
		super();
	}

	public Renter(int rentId, int id, String name, Date date, int gender, String phone, String note, int roomId) {
		super();
		this.rentId = rentId;
		this.id = id;
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.phone = phone;
		this.note = note;
		this.roomId = roomId;
	}

	public Renter(int rentId, int id, String name, Date date, int gender, String phone, String note, int roomId,
			MotelRoom motelroom, List<Bill> bill) {
		super();
		this.rentId = rentId;
		this.id = id;
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.phone = phone;
		this.note = note;
		this.roomId = roomId;
		this.motelroom = motelroom;
		this.bill = bill;
	}

	public int getRentId() {
		return rentId;
	}

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public MotelRoom getMotelroom() {
		return motelroom;
	}

	public void setMotelroom(MotelRoom motelroom) {
		this.motelroom = motelroom;
	}

	public List<Bill> getBill() {
		return bill;
	}

	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}
	
}
