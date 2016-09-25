package com.qihang.jianli.model;

public class ResouceModel {
	private int id;
	private String path;
	private long createTime;
	private int resouceType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public int getResouceType() {
		return resouceType;
	}

	public void setResouceType(int resouceType) {
		this.resouceType = resouceType;
	}

}
