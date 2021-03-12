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
	@JoinColumn(name = "districtId", referencedColumnName = "districtId", insertable = false, updatable = false)
	private District district;

	public Ward() {
		super();
	}

	public Ward(int wardId, String wardName, String kind, float latitude, float longtitude, int districtId) {
		super();
		this.wardId = wardId;
		this.wardName = wardName;
		this.kind = kind;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.districtId = districtId;
	}

	public Ward(int wardId, String wardName, String kind, float latitude, float longtitude, int districtId,
			List<MotelRoom> motelRoom, District district) {
		super();
		this.wardId = wardId;
		this.wardName = wardName;
		this.kind = kind;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.districtId = districtId;
		this.motelRoom = motelRoom;
		this.district = district;
	}

	public int getWardId() {
		return wardId;
	}

	public void setWardId(int wardId) {
		this.wardId = wardId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
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

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public List<MotelRoom> getMotelRoom() {
		return motelRoom;
	}

	public void setMotelRoom(List<MotelRoom> motelRoom) {
		this.motelRoom = motelRoom;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}
	
}
