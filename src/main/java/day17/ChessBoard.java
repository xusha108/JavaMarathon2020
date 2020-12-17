package day17;

public class ChessBoard {
    private String [][] array;


    public ChessBoard( String [][] array) {
    this.array = array;
    }


   public void print(){
       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               System.out.print(array[i][j]);
           }
           System.out.println();
       }
   }
}

