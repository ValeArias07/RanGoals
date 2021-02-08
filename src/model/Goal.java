package model;

import java.util.ArrayList;

public class Goal {

	private String name;
	private String[] classifications;
	private ArrayList<String> topics;
	private int combinations;
	
	public Goal(String name, String[] classifications) {
		this.name = name;
		this.classifications = classifications;
		this.topics = new ArrayList<String>();
		this.combinations=0;
	}
	
	public void setCombinations(int i) {
		combinations=i;
	}

	public String getTopics(int i) {
		return topics.get(i);
	}
	
	public void setTopics(String topic) {
		topics.add(topic);
	}
	
	public String getName() {
		return name;
	}
	
	public String getClassifications(int i) {
		return classifications[i];
	}
	
	public int getClassificationLenght() {
		return classifications.length;
	}
	
	public int getTopicsLength() {
		return topics.size();
	}
	
	public int getCombinations() {
		return combinations;
	}
}
