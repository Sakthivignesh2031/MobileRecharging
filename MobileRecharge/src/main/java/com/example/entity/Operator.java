package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Operator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "operator_id")
	private int operatorId;
	@Column(name = "operator_name")
	private String operatorName;

	@OneToMany(mappedBy = "operator")
	private List<Offers> offers;

	public Operator() {
		super();
	}

	public Operator(int operatorId, String operatorName) {
		super();
		this.operatorId = operatorId;
		this.operatorName = operatorName;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public List<Offers> getOffers() {
		return offers;
	}

	public void setOffers(List<Offers> offers) {
		this.offers = offers;
	}

	@Override
	public String toString() {
		return "Operator [operatorId=" + operatorId + ", operatorName=" + operatorName + "]";
	}

}
