import java.util.Scanner;

public class PieceOfCake {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int cakeSize = s.nextInt();
		int horizontalCut = s.nextInt();
		int verticalCut = s.nextInt();
		int biggestHorizontalSize = 0;
		int biggestVerticalSize = 0;
		int volumeBiggestPiece = 0;
		
		while(cakeSize < 2 || cakeSize > 10000) {
			cakeSize = s.nextInt();
		}
		
		while(horizontalCut < 0 || horizontalCut > cakeSize) {
			horizontalCut = s.nextInt();
		}
		
		while(verticalCut < 0 || verticalCut > cakeSize) {
			verticalCut = s.nextInt();
		}
		
		if((cakeSize - horizontalCut) > horizontalCut) {
			biggestHorizontalSize = cakeSize - horizontalCut;
		} else {
			biggestHorizontalSize = horizontalCut;
		}
		
		if((cakeSize - verticalCut) > verticalCut) {
			biggestVerticalSize = cakeSize - verticalCut;
		} else {
			biggestVerticalSize = verticalCut;
		}
			
		volumeBiggestPiece = biggestVerticalSize*biggestHorizontalSize*4;
		System.out.println(volumeBiggestPiece);
		
	}

}
