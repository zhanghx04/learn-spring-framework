package com.learnspring.haoxiang.learnspringframework;

import com.learnspring.haoxiang.learnspringframework.enterprise.example.web.MyWebController;
import com.learnspring.haoxiang.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		PacmanGame game = new PacmanGame();
//		GameRunner runner = new GameRunner(game);
//		runner.run();

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
