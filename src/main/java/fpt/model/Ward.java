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
@Table(name = "Ward")
public class Ward {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wardId")
	private int wardId;
	
	@Column(name = "wardName")
	private String wardName;
	
	@Column(name = "kind")
	private String kind;
	
	@Column(name = "latitude")
	private float latitude;
	
	@Column(name = "longtitude")
	private float longtitude;
	
	@Column(name = "districtId")
	private int districtId;
	
	@OneToMany
	@JoinColumn(name = "wardId", referencedColumnName = "wardId", insertable = true, updatable = true)
	private List<MotelRoom> motelRoom;
	
	@OneToOne
	@JoinColumn(name = "districtId1", referencedColumnName = "districtId", insertable = false, updatable = false)
	private District district;
	
	
}
