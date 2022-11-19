package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Bill {

	@Id
	@GeneratedValue(generator = "transaction_Id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "transaction_Id", initialValue = 100001, allocationSize = 1)
	@Column(name = "transaction_id")
	private Long transactionId;
	@Column(name = "mobile_number")
	private long mobileNumber;
	@Column(name = "offer_id")
	private int offerId;

	public Bill() {
		super();
	}

	public Bill(Long transactionId, long mobileNumber, int offerId) {
		super();
		this.transactionId = transactionId;
		this.mobileNumber = mobileNumber;
		this.offerId = offerId;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	@Override
	public String toString() {
		return "Bill [transactionId=" + transactionId + ", mobileNumber=" + mobileNumber + ", offerId=" + offerId + "]";
	}
}
