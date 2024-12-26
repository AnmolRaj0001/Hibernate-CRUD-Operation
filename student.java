package org.hibernate;

import javax.persistence.Entity;

import java.util.Scanner;

import javax.persistence.*;
@Entity
@Table(name="student")
public class student 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Fees")
	private int fees;
	@Column(name="Name")
	private String nm;
	@Column(name="Course")
	private String crse;
	@Column(name="Address")
	private String adrs;
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFees() {
		
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getNm() {
		
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getCrse() {
		
		return crse;
	}
	public void setCrse(String crse) {
		this.crse = crse;
	}
	public String getAdrs() {
		return adrs;
	}
	public void setAdrs(String adrs) {
		this.adrs = adrs;
	} 
	
	

}
