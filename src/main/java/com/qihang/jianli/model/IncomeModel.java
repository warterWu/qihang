package com.qihang.jianli.model;

public class IncomeModel {
	private int id;
	private int msgFlowId;// 用来追溯消息
	private int reviewerId;
	private int serviceId;
	private int money;
	private long time;
	private int payType;// 支付方式

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMsgFlowId() {
		return msgFlowId;
	}

	public void setMsgFlowId(int msgFlowId) {
		this.msgFlowId = msgFlowId;
	}

	public int getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(int reviewerId) {
		this.reviewerId = reviewerId;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}
}
