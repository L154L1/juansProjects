// polymorphic parameters

package q19;

class Snake {}
class Cobra extends Snake {}
class GardenSnake {}

public class SnakeHandler {
	private Snake snake;
	public void setSnake(Snake snake) { this.snake = snake; }
	public static void main(String[] args) {
		new SnakeHandler().setSnake(new Snake());
		
		new SnakeHandler().setSnake(new Cobra());
		
		new SnakeHandler().setSnake(null);

	}

}
