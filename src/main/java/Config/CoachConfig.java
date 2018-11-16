package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Model.BaseballCoach;
import Model.CricketCoach;

@Configuration
public class CoachConfig {

	@Bean
	public BaseballCoach baseballCoach() {
		return new BaseballCoach();
	}

	@Bean
	public CricketCoach cricketCoach() {
		return new CricketCoach();
	}
}
