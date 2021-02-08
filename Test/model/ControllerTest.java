package model;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ControllerTest {
	
	private Controller c1;
	
	
	public void setUp1() throws NumberFormatException, IOException {
		c1= new Controller();
	}
	
	@Test
	public void generateGoalTest() throws NumberFormatException, IOException {
		setUp1();
		for (int i = 0; i < 3; i++) {
			c1.addNumber(i,30);
			for (int j = 0; j < 2; j++) {
				c1.addTopic(i, "HOLI");
				
			}
		}
		for (int i = 0; i < 10; i++) {
			String[] result=c1.generateGoal();
			for (int j = 0; j < result.length; j++) {
				System.out.println(result[j]);
			}
		}
		
	}

}
