// What is the result?
// A. Video played.Game played.
// B. A compilation error occurs.
// C. class java.lang.Exception 
// D. class java.io.IOException

// Answer: B

package q155_override_method;

import java.io.*;

class Video {
	public void play() throws IOException{
		System.out.print("Video played.");
	}
}

public class Game extends Video {
	public void play() throws Exception{
		super.play();
		System.out.print("Game played.");
	}

	public static void main(String[] args) {
		try {
			new Game().play();
		}catch(Exception e) {
			System.out.print(e.getClass());
		}

	}

}
