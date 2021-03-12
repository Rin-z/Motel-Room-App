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
}
