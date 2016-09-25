package com.qihang.jianli.model;

public class ScoreModel {
	private int id;
	private int reviewerId;
	private float currentScoreNum;
	private float avgScoreNum;
	private int currentSortNum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(int reviewerId) {
		this.reviewerId = reviewerId;
	}

	public float getCurrentScoreNum() {
		return currentScoreNum;
	}

	public void setCurrentScoreNum(float currentScoreNum) {
		this.currentScoreNum = currentScoreNum;
	}

	public float getAvgScoreNum() {
		return avgScoreNum;
	}

	public void setAvgScoreNum(float avgScoreNum) {
		this.avgScoreNum = avgScoreNum;
	}

	public int getCurrentSortNum() {
		return currentSortNum;
	}

	public void setCurrentSortNum(int currentSortNum) {
		this.currentSortNum = currentSortNum;
	}
}
