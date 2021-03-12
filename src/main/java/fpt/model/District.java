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
@Table(name = "District")
public class District {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "districtId")
	private int districtId;
	
	@Column(name = "districtName")
	private String districtName;
	
	@Column(name = "kind")
	private String kind;
	
	@Column(name = "latitude")
	private float latitude;
	
	@Column(name = "longtitude")
	private float longtitude;
	
	@Column(name = "provinceId")
	private int provinceId;
	
	@OneToMany
	@JoinColumn(name = "districtId", referencedColumnName = "districtId", insertable = true, updatable = true)
	private List<MotelRoom> motelRoom;
	
	@OneToOne
	@JoinColumn(name = "provinceId", referencedColumnName = "provinceId", insertable = false, updatable = false)
	private Province province;
	
	@OneToMany
	@JoinColumn(name = "districtId", referencedColumnName = "districtId", insertable = true, updatable = true)
	private List<Ward> ward;
	
}
