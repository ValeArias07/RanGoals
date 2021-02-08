package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Loader {
	private final String NAMES="data/GoalsName.txt";
	private final String CLASSIFICATIONS="data/Classifications.txt";
	public int amountNames;
	private String[] namesArray;
	private String[] classificationsArray;
	
	public Loader() throws NumberFormatException, IOException {
		loadNames();
		loadClassifications();
		amountNames=namesArray.length;
	}
	
	public void loadNames() throws NumberFormatException, IOException {
		
		BufferedReader brN= new BufferedReader(new FileReader(NAMES));
		int amount=Integer.parseInt(brN.readLine());
		namesArray= new String[amount];
		String line="";
		while(line!=null) {
			for (int j = 0; j < amount; j++) {
				line=brN.readLine();
				if(line!=null) 
					namesArray[j]=line;
			}	
		}
		brN.close();
	}
	
	public void loadClassifications() throws NumberFormatException, IOException {
		
		BufferedReader brN= new BufferedReader(new FileReader(CLASSIFICATIONS));
		int amount=Integer.valueOf(brN.readLine());
		classificationsArray= new String[amount];
		String line="";
		String text="";
		int index=0;
		while(line!=null) {
			line=brN.readLine();
				if(line!=null) {
					if(!line.equals("#")) {
						text+= line+" ";
						classificationsArray[index]=text;
					}else {
						text="";
						index++;
					}
				}
			}
		brN.close();
	}

	public String getNames(int i) {
		return namesArray[i];
	}

	public String getClassifications(int i) {
		return classificationsArray[i];
	}
	
	public int getNamesLenght() {
		return namesArray.length;
	}

	public int getClassificationsLenght() {
		return classificationsArray.length;
	}
	
	
}
