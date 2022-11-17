package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int operatorId;
	private String operatorName;

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

	@Override
	public String toString() {
		return "Operator [operatorId=" + operatorId + ", operatorName=" + operatorName + "]";
	}

}
