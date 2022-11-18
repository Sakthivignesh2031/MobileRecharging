package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Offers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "plan_id")
	private int planId;
	private String days;
	@Column(name = "talk_time")
	private String talkTime;
	private String data;
	private String price;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "operatorid")
	private Operator operator;

	public Offers() {
		super();
	}

	public Offers(int planId, String days, String talkTime, String data, String price, Operator operator) {
		super();
		this.planId = planId;
		this.days = days;
		this.talkTime = talkTime;
		this.data = data;
		this.price = price;
		this.operator = operator;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(String talkTime) {
		this.talkTime = talkTime;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "Plans [planId=" + planId + ", days=" + days + ", talkTime=" + talkTime + ", data=" + data + ", price="
				+ price + ", operator=" + operator + "]";
	}

}
