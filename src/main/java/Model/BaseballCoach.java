package Model;

import coachInterface.Coach;

public class BaseballCoach implements Coach {
	public int getPracticeTime() {
		return practiceTime;
	}

	public void setPracticeTime(int practiceTime) {
		this.practiceTime = practiceTime;
	}

	public String getSuggestedBehaviour() {
		return suggestedBehaviour;
	}

	public void setSuggestedBehaviour(String suggestedBehaviour) {
		this.suggestedBehaviour = suggestedBehaviour;
	}

	public String getPracticeLocation() {
		return practiceLocation;
	}

	public void setPracticeLocation(String practiceLocation) {
		this.practiceLocation = practiceLocation;
	}

	private int practiceTime;
	private String suggestedBehaviour;
	private String practiceLocation;
	public String teamName() {
		// TODO Auto-generated method stub
		return "Machester";
	}
	
}
