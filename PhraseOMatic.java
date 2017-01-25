package chapter1;
import java.util.Random;
import javax.swing.JOptionPane;

public class PhraseOMatic {

	public static void main(String[] args){
		String[] wordListOne = {"24/7", "multi-Tier", "30.000 foot", "B-to-B", "win-win", "front-end",
				"web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
				"clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged",
				"aligned", "targeted", "shared", "cooperative", "accelerated"};
		
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int x = 0;
			
		while(x < 1){
			int rand1 = (int) (Math.random() * oneLength);
			int rand2 = (int) (Math.random() * twoLength);
			int rand3 = (int) (Math.random() * threeLength);
			String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
			
		int reply = JOptionPane.showConfirmDialog(null, "Would you like a random phrase?", "Phrase-O-Matic by Icezman", JOptionPane.YES_NO_OPTION);
		
		switch (reply){
		case 0:
			JOptionPane.showMessageDialog(null,"Your randomly generated phrase is:\n" + phrase, "Phrase-O-Matic by Icezman", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Alright, I understand. You don't want this awesome program...", "Phrase-O-Matic by Icezman", JOptionPane.INFORMATION_MESSAGE);
			x = 1;
			break;
			}
		}
	}
}
