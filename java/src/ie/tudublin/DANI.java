package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {	
	
	private String word;
	private int count;

	String[] sonnet;

	public void Follow() {
		ArrayList<> sonnet = new ArrayList<>();
		
	}
	
	
	public void Follow(String word) {
	}

	
	public void Word() {	
	}
		
	public String toString() {
		return word + Integer.toString (count);
	}


	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    

    public String[] writeSonnet() {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {
		
		if (key >= '0' && key <= '8') {
			sonnet = key - '14';
		}
		println(sonnet);

	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile() {
		loadStrings("filename.txt"); // Load a text file into a String array
		split(line, ' '); // Split a string into an array of words
		w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		s.toLowerCase() // Convert a string to lower case 
	}

	public void findWord(String word) {

	}

}
