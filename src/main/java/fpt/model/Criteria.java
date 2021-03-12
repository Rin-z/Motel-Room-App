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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "criteriaId")
	private int criteriaId;
	
	@Column(name = "criteriaName")
	private String criteriaName;
	
	@OneToMany
	@JoinColumn(name = "criteriaId", referencedColumnName = "criteriaId", insertable = true, updatable = true)
	private List<MotelRoom_Criteria> motelRoom_Criteria;
	
}
