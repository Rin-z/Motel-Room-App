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
	

}
