package hw1;

public class Generics
{
   //  printArray                         
   public static < E > void printArray( E[] inputArray )
   {
      // output        
         for ( E element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
    }

}
