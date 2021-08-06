//	for(;;) = 무한출력
public class Tutorial66666 {
      
   final static int N = 15;

   public static void main(String[] args) {

//   원의 방적식 x^2 + y^2 = r^2
      for(int i = -N; i <= N; i++)
      {
         for(int j = -N; j <= N; j++)
         {
            if(i * i + j * j <= N * N)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}