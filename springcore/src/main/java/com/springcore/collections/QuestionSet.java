package com.springcore.collections;

import java.util.List;
import java.util.Set;

public class QuestionSet {
	
	private int questionId;
	private String question;
	private Set<String> answers;
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
	public Set<String> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return " [questionId=" + questionId +"\n"+ " question=" + question +"\n"+ ", answers=" + answers + "]";
	}
	public QuestionSet(int questionId, String question, Set<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public QuestionSet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
