package com.geh.server.gae.model;

public class Quiz {
	
	private String quiz;
	private String optionalAnswer1;
	private String optionalAnswer2;
	private String optionalAnswer3;
	private String goodAnswer;
	private LEVEL level;
		
	public String getQuiz() {
		return quiz;
	}

	public void setQuiz(String quiz) {
		this.quiz = quiz;
	}

	public String getOptionalAnswer1() {
		return optionalAnswer1;
	}

	public void setOptionalAnswer1(String optionalAnswer1) {
		this.optionalAnswer1 = optionalAnswer1;
	}


	public String getOptionalAnswer2() {
		return optionalAnswer2;
	}


	public void setOptionalAnswer2(String optionalAnswer2) {
		this.optionalAnswer2 = optionalAnswer2;
	}


	public String getOptionalAnswer3() {
		return optionalAnswer3;
	}

	public void setOptionalAnswer3(String optionalAnswer3) {
		this.optionalAnswer3 = optionalAnswer3;
	}

	public String getGoodAnswer() {
		return goodAnswer;
	}

	public void setGoodAnswer(String goodAnswer) {
		this.goodAnswer = goodAnswer;
	}

	public LEVEL getLevel() {
		return level;
	}

	public void setLevel(LEVEL level) {
		this.level = level;
	}

	public static enum LEVEL {	
		
		DEBUTANT(1),
		MOYEN(2),
		SENIOR(3),
		EXPERT(4);
		
		private LEVEL(int level){
			
		}
	}
}
