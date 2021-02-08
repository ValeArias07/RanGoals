package model;

import java.io.IOException;

public class Controller {
	
	private Goal[] goals;
	private int index;
	public Controller() throws NumberFormatException, IOException {
		loadGoals();
		index=0;
	}
	
	private void loadGoals() throws NumberFormatException, IOException {
		Loader load = new Loader();
		goals=new Goal[load.amountNames];
		for (int i = 0; i < load.amountNames; i++) {
			goals[i]=new Goal(load.getNames(i), load.getClassifications(i).split(" "));
		}
	}
	
	public String[] generateGoal() {
		
		if(index>=2) 
			index=0;
		else 
			index++;
		
		Goal goalSelected=goals[index];
		String clasification= goalSelected.getClassifications((int)(Math.random()*goalSelected.getClassificationLenght()));
		String topic= goalSelected.getTopics((int)(Math.random()*goalSelected.getTopicsLength()));
		String number = String.valueOf((int)(Math.random()*goalSelected.getCombinations()));
		String[] values={goalSelected.getName(),clasification,topic,number};
			
		return values;		
	}
	
	public void addTopic(int index, String topic) {
		goals[index].setTopics(topic);
	}
	
	public void addNumber(int index, int comb) {
		goals[index].setCombinations(30);
	}
}
