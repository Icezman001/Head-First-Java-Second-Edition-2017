package chapter1;

public class BeerSong { /* This will try to play the beer song with correct formatting, unlike in the book. */
						/* Check the song here: http://www.99-bottles-of-beer.net/lyrics.html */
	
	public static void main(String[] args){
		int beerNum = 99;
		String word = "bottles";
		int loopCounter = 3; /* Made this so the song isn't on endless loop but stops after 3 loops */
		
		while (loopCounter > 0){ /* keeps running as long as the loopcounter is higher than 0 */

			System.out.print(beerNum + " " + word + " of beer on the wall, ");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.print("Take one down ");
			System.out.print("and pass it around, ");
			beerNum = beerNum - 1;
			
			if (beerNum <= 1){
				word = "bottle";
			} else {
				word = "bottles";
			}
			
			if (beerNum > 0){
				System.out.println(beerNum + " " + word + " of beer on the wall.\n");
			} else {
				System.out.println("no more bottles of beer on the wall.\n");
				System.out.println("no more bottles of beer on the wall, no more bottles of beer.");
				System.out.print("Go to the store and buy some more, ");
				beerNum = 99;
				word = "bottles";
				System.out.println(beerNum + " " + word + " of beer on the wall.\n");
				loopCounter = loopCounter - 1;
				
				if (loopCounter  == 0){ 
					System.out.println("Well that's all folks! The song has been played 3 times!");
				}
			}
			try { /*If something were to go wrong, it would give an exception */
				Thread.sleep(250); /* This makes sure there's a little time between the loops */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
