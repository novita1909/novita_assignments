package com.springcore.collections;

import java.util.Map;
import java.util.Set;

public class QuestionMap {
	private int questionId;
	private String question;
	private Map<Integer,String> answers;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "QuestionMap [questionId=" + questionId + ", question=" + question +"\n"+ ", answers= " + answers + "]";
	}
	public QuestionMap(int questionId, String question, Map<Integer, String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public QuestionMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
