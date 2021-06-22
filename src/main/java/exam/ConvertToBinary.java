    import java.util.Scanner;

    public class Decimal_Binary 

    {

        public static void main(String[] args) 

        {

            int p, r;

            String x = "";

            Scanner s = new Scanner(System.in);

            System.out.print("Enter the Decimal Number:");

            p = s.nextInt();

            while(p > 0)

            {

                int a = p % 2;

                x = a + x;

                p = p / 2;

            }

            System.out.println(x);

        }

    }

