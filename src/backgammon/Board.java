package backgammon;
import java.util.Arrays;

public class Board {
	private int[] points = new int[24];	// Negative Werte für Schwarz, positive für Weiß
	private int whiteBar = 0, blackBar = 0;
	
	public Board() {
		Arrays.fill(points, 0);
        points[0] = 2;
        points[5] = -5;  
        points[7] = -3;  
        points[11] = 5;
        points[12] = -5;
        points[16] = 3;
        points[18] = 5;
        points[23] = -2;
	}
}
