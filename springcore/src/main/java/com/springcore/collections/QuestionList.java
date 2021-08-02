package com.springcore.collections;

import java.util.List;

public class QuestionList {
	
	private int questionId;
	private String question;
	private List<String> answers;
	
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
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public QuestionList(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public QuestionList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Question [questionId=" + questionId + ", question=" + question + ", answers="
				+ (answers != null ? answers.subList(0, Math.min(answers.size(), maxLen)) : null) + "]";
	}
	
	

}
