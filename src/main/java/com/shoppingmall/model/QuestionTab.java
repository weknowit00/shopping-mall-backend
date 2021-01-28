package com.shoppingmall.model;

import java.util.List;

public class QuestionTab {
	
	 private int question_id;
	 private int product_id;
	 private int user_sequence_id;
	 private String question; 
	 private String question_date_created;
	 private String product_picture;
	 private List<AnswerTab> answerTabList;
	 
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getUser_sequence_id() {
		return user_sequence_id;
	}
	public void setUser_sequence_id(int user_sequence_id) {
		this.user_sequence_id = user_sequence_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestion_date_created() {
		return question_date_created;
	}
	public void setQuestion_date_created(String question_date_created) {
		this.question_date_created = question_date_created;
	}
	public List<AnswerTab> getAnswerTabList() {
		return answerTabList;
	}
	public void setAnswerTabList(List<AnswerTab> answerTabList) {
		this.answerTabList = answerTabList;
	}
	public String getProduct_picture() {
		return product_picture;
	}
	public void setProduct_picture(String product_picture) {
		this.product_picture = product_picture;
	}
}
