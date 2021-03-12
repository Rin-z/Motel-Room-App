package fpt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Province")
public class Province {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "provinceId")
	private int provinceId;
	
	@Column(name = "provinceName")
	private String provinceName;
	
	@Column(name = "kind")
	private String kind;
	
	@OneToMany
	@JoinColumn(name = "provinceId", referencedColumnName = "provinceId", insertable = true, updatable = true)
	private List<MotelRoom> motelRoom;
	
	@OneToMany
	@JoinColumn(name = "provinceId", referencedColumnName = "provinceId", insertable = true, updatable = true)
	private List<District> district;
	
}
