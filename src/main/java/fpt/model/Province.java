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

	public Province() {
		super();
	}

	public Province(int provinceId, String provinceName, String kind) {
		super();
		this.provinceId = provinceId;
		this.provinceName = provinceName;
		this.kind = kind;
	}

	public Province(int provinceId, String provinceName, String kind, List<MotelRoom> motelRoom,
			List<District> district) {
		super();
		this.provinceId = provinceId;
		this.provinceName = provinceName;
		this.kind = kind;
		this.motelRoom = motelRoom;
		this.district = district;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public List<MotelRoom> getMotelRoom() {
		return motelRoom;
	}

	public void setMotelRoom(List<MotelRoom> motelRoom) {
		this.motelRoom = motelRoom;
	}

	public List<District> getDistrict() {
		return district;
	}

	public void setDistrict(List<District> district) {
		this.district = district;
	}
	
}
