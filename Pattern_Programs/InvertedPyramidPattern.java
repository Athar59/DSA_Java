
// *********
//  *******
//   *****
//    ***
//     *

public class InvertedPyramidPattern {
    
    public static void main(String[] args) {
        
        int n =5;
        for(int i = n ;i>=1;i--)
        {
            for (int j = 0 ;j < n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i-1 ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
