// Passquestion q40

// Which statement is true?
// A. Board does not compile.
// B. Paper does not compile.
// C. Frame does not compile.
// D. Drawable does not compile.
// E. All classes compile successfully.

// Correct Answer: E

package q23_inheritance;

class Canvas implements Drawable {
	public void draw () { }
}
abstract class Board extends Canvas { }

class Paper extends Canvas {
	protected void draw (int color) { }
}

class Frame extends Canvas implements Drawable {
	public void resize () { }
}

interface Drawable {
	public abstract void draw ();
}
