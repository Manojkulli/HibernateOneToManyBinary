package com.ty.BinaryOne2many.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sim {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private long simno;
	
	@ManyToOne
	private Phone phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSimno() {
		return simno;
	}

	public void setSimno(long simno) {
		this.simno = simno;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Sim [id=" + id + ", name=" + name + ", simno=" + simno + ", phone=" + phone + "]";
	}
	
	
}
