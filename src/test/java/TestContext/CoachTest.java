package TestContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Config.CoachConfig;
import Model.BaseballCoach;

public class CoachTest{

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		BaseballCoach baseballCoach = (BaseballCoach) context.getBean(BaseballCoach.class);
		baseballCoach.setPracticeLocation("HYD");
		baseballCoach.setPracticeTime(14);
		baseballCoach.setSuggestedBehaviour("Run daily");
		
		System.out.println(baseballCoach.teamName());
		System.out.println(baseballCoach.getPracticeLocation());
		System.out.println(baseballCoach.getPracticeTime());
		System.out.println(baseballCoach.getSuggestedBehaviour());

	}

}
