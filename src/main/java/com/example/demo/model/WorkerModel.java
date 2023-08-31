package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="worker_table")
public class WorkerModel {
	
	
	private int wid;
	private String wname;
	private String waddress;
	private long wnumber;
	private String wexp;
	private String wgender;
	@Id
	private String wskills;
	private String client;
	private String status;
	private int rating;
	
	public WorkerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WorkerModel(int wid, String wname, String waddress, long wnumber, String wexp, String wgender,
			String wskills, String client, String status, int rating) {
		super();
		this.wid = wid;
		this.wname = wname;
		this.waddress = waddress;
		this.wnumber = wnumber;
		this.wexp = wexp;
		this.wgender = wgender;
		this.wskills = wskills;
		this.client = client;
		this.status = status;
		this.rating = rating;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public String getWaddress() {
		return waddress;
	}

	public void setWaddress(String waddress) {
		this.waddress = waddress;
	}

	public long getWnumber() {
		return wnumber;
	}

	public void setWnumber(long wnumber) {
		this.wnumber = wnumber;
	}

	public String getWexp() {
		return wexp;
	}

	public void setWexp(String wexp) {
		this.wexp = wexp;
	}

	public String getWgender() {
		return wgender;
	}

	public void setWgender(String wgender) {
		this.wgender = wgender;
	}

	public String getWskills() {
		return wskills;
	}

	public void setWskills(String wskills) {
		this.wskills = wskills;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
