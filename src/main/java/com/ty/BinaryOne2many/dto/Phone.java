package com.ty.BinaryOne2many.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	@OneToMany
	private List<Sim> sim;
	
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<Sim> getSim() {
		return sim;
	}
	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", name=" + name + ", phone=" + phone + ", sim=" + sim + "]";
	}
	
	
	
	
}
