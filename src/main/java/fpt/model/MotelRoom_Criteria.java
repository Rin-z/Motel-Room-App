package fpt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MotelRoom_Criteria")
public class MotelRoom_Criteria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "roomId")
	private int roomId;
	
	@Id
	@Column(name = "criteriaId")
	private int criteriaId;
	
	@OneToOne
	@JoinColumn(name = "roomId", referencedColumnName = "roomId", insertable = false, updatable = false)
	private MotelRoom motelRoom;
	
	@OneToOne
	@JoinColumn(name = "criteriaId", referencedColumnName = "criteriaId", insertable = false, updatable = false)
	private Criteria criteria;
	
}
