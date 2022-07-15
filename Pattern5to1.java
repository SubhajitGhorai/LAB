package JavaBasic;
/*Print this pattern
 * 54321
 * 5432
 * 543
 * 54
 * 5
 */
public class Pattern5to1 {
		public static void main(String[] args) {
			int i,j,n;
			for (i=1;i<=5;i++)//external loop
			{
			for(j=5;j<=i;j--)//internal loop
			{
			System.out.print(j);//print the value of j
			}
			System.out.println();//print the next row
			}
		  }
        }
		

