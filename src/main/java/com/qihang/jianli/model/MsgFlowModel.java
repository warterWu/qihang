package com.qihang.jianli.model;
/**
 * 
 * 作为每一次开始产生交易关系的一个纽带记录着几者之间的状态的消息纽带
 *
 */
public class MsgFlowModel {
	private int id;
	private int studentId;
	private int cvId;
	private int reviewerId;
	private int serviceId;
	private int state;// 当前关系的状态

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCvId() {
		return cvId;
	}

	public void setCvId(int cvId) {
		this.cvId = cvId;
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

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
