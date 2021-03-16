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
	
	@Column(name = "districtName", columnDefinition = "varchar(50) not null")
	private String districtName;
	
	@Column(name = "kind")
	private String kind;
	
	@Column(name = "latitude")
	private float latitude;
	
	@Column(name = "longtitude")
	private float longtitude;
	
	@Column(name = "provinceId")
	private int provinceId;

	@OneToOne
	@JoinColumn(name = "provinceId", referencedColumnName = "provinceId", insertable = false, updatable = false)
	private Province province;
	
	@OneToMany
	@JoinColumn(name = "districtId", referencedColumnName = "districtId", insertable = true, updatable = true)
	private List<Ward> ward;

	public District() {
		super();
	}

	public District(int districtId, String districtName, String kind, float latitude, float longtitude,
			int provinceId) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.kind = kind;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.provinceId = provinceId;
	}

	public District(int districtId, String districtName, String kind, float latitude, float longtitude, int provinceId,
			Province province, List<Ward> ward) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.kind = kind;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.provinceId = provinceId;
		this.province = province;
		this.ward = ward;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(float longtitude) {
		this.longtitude = longtitude;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public List<Ward> getWard() {
		return ward;
	}

	public void setWard(List<Ward> ward) {
		this.ward = ward;
	}
	
}
