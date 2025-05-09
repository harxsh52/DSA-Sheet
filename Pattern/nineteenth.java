package Pattern;

public class nineteenth {
    public static void main(String[] args) {
        int iniS = 0;
      for(int i=0;i<6;i++){
          
          //for printing the stars in the row.
          for(int j=1;j<=6-i;j++){
              System.out.print("*");
          }
          
          //for printing the spaces in the row.
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          
          //for printing the stars in the row.
          for(int j=1;j<=6-i;j++){
              System.out.print("*");
          }
          
          // The spaces increase by 2 every time we hit a new row.
          iniS+=2;
          
          // As soon as the letters for each iteration are printed, we move to the
          // next row and give a line break otherwise all letters
          // would get printed in 1 line.
          System.out.println();
      }
      iniS-=2;
      for(int i=0;i<6;i++){
          
        //for printing the stars in the row.
        for(int j=6-i;j<=6;j++){
            System.out.print("*");
        }
        
        //for printing the spaces in the row.
        for(int j=0;j<iniS;j++){
            System.out.print(" ");
        }
        
        //for printing the stars in the row.
        for(int j=6-i;j<=6;j++){
            System.out.print("*");
        }
        
        // The spaces increase by 2 every time we hit a new row.
        iniS-=2;
        
        // As soon as the letters for each iteration are printed, we move to the
        // next row and give a line break otherwise all letters
        // would get printed in 1 line.
        System.out.println();
    }
}}
