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

	public MotelRoom_Criteria() {
		super();
	}

	public MotelRoom_Criteria(int roomId, int criteriaId) {
		super();
		this.roomId = roomId;
		this.criteriaId = criteriaId;
	}

	public MotelRoom_Criteria(int roomId, int criteriaId, MotelRoom motelRoom, Criteria criteria) {
		super();
		this.roomId = roomId;
		this.criteriaId = criteriaId;
		this.motelRoom = motelRoom;
		this.criteria = criteria;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getCriteriaId() {
		return criteriaId;
	}

	public void setCriteriaId(int criteriaId) {
		this.criteriaId = criteriaId;
	}

	public MotelRoom getMotelRoom() {
		return motelRoom;
	}

	public void setMotelRoom(MotelRoom motelRoom) {
		this.motelRoom = motelRoom;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
