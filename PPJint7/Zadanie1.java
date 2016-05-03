//READY
import java.util.Random;

public class Zadanie1{
	
	public static void main(String[] args){
		char[][] t = getRandomCharMatrix(3,3);
		debug(t);
		System.out.println(countAla(t));
	}
	
	private static char[][] getRandomCharMatrix(int height, int width){
		
		if(height<1 || width<1)
			return null;
		char[][] matrix = new char[height][width];
		
		for(int i=0; i<height; i++)
			for(int j=0; j<width; j++)
				matrix[i][j]=randomLetter();
			
		return matrix;
	}
	
	public static int countAla(char[][] tab){
       
        int counter=0;
       
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++){
                if(tab[i][j]=='a'){
                    //w poziomie
                    if(j<tab.length-2 && tab[i][j+1]=='l' && tab[i][j+2]=='a')
                        counter++;
                    //w pionie
                    else if(i<tab.length-2 && tab[i+1][j]=='l' && tab[i+2][j]=='a')
                        counter++;
                    //ukos z lewej do prawej
                    else if(i<tab.length-2 && j<tab.length-2 && tab[i+1][j+1]=='l' && tab[i+2][j+2]=='a')
                        counter++;
                    //ukos z prawej do lewej
                    else if(i<tab.length-2 && j>1 && tab[i+1][j-1]=='l' && tab[i+2][j-2]=='a')
                        counter++;             
                }
                   
            }
        }
       
        return counter;
    }
	
	private static void debug(char[][] matrix){
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	
	private static char randomLetter(){
		
		Random generator = new Random();
		
		return (char)(generator.nextInt(26) + 'a');
	}
}