package com.net.parking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traceinfo")
public class TraceInfo implements Serializable {

private static final long serialVersionUID = 1L;
	
//	@Id
//	@GenericGenerator(name = "TI", strategy = "com.net.parking.entity.TraceInfoIDGenerator")
//	@GeneratedValue(generator = "TI")  
//	@Column(name = "id", length = 255, nullable = false)
//	private String id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "DB")
	private String dB;
	
	@Column(name = "TIME")
	private String time;
	
	@Column(name = "TAGID")
	private String tagid;
	
	@Column(name = "STATUS")
	private String status;
	
	public TraceInfo() {}
	
	public TraceInfo(String dB, String time, String tagid) {
		this.dB = dB;
		this.time = time;
		this.tagid = tagid;
	}

	public String getdB() {
		return dB;
	}

	public void setdB(String dB) {
		this.dB = dB;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTagid() {
		return tagid;
	}

	public void setTagid(String tagid) {
		this.tagid = tagid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
		public String toString() {
			
			return " id: "+this.id+" dB: "+this.dB+" time: "+this.time+" tagid: "+this.tagid+" status: "+this.status;
		}
}