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
@Table(name = "Criteria")
public class Criteria {
	//a
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "criteriaId")
	private int criteriaId;
	
	@Column(name = "criteriaName")
	private String criteriaName;
	
	@OneToMany
	@JoinColumn(name = "criteriaId", referencedColumnName = "criteriaId", insertable = true, updatable = true)
	private List<MotelRoom_Criteria> motelRoom_Criteria;

	public Criteria() {
		super();
	}

	public Criteria(int criteriaId, String criteriaName) {
		super();
		this.criteriaId = criteriaId;
		this.criteriaName = criteriaName;
	}

	public Criteria(int criteriaId, String criteriaName, List<MotelRoom_Criteria> motelRoom_Criteria) {
		super();
		this.criteriaId = criteriaId;
		this.criteriaName = criteriaName;
		this.motelRoom_Criteria = motelRoom_Criteria;
	}

	public int getCriteriaId() {
		return criteriaId;
	}

	public void setCriteriaId(int criteriaId) {
		this.criteriaId = criteriaId;
	}

	public String getCriteriaName() {
		return criteriaName;
	}

	public void setCriteriaName(String criteriaName) {
		this.criteriaName = criteriaName;
	}

	public List<MotelRoom_Criteria> getMotelRoom_Criteria() {
		return motelRoom_Criteria;
	}

	public void setMotelRoom_Criteria(List<MotelRoom_Criteria> motelRoom_Criteria) {
		this.motelRoom_Criteria = motelRoom_Criteria;
	}
	
}
