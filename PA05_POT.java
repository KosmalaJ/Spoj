import java.util.Scanner;
class Main
{
    public static void findDigit(int a, int b) {

        int result;
        if (a % 10 == 0 | a % 10 == 1 | a % 10 == 5 | a % 10 == 6)
            result = a%10;
        else if (a % 10 == 4) {
            if (b % 2 == 0)
                result = 6;
            else result = 4;
        } else if (a % 10 == 9) {
            if (b % 2 == 0)
                result = 1;
            else result = 9;
        } else {
            int c = a % 10;
            int r = b % 4;
            switch (r) {
                case 1: {
                    if (c == 2)
                        result = 2;
                    else if (c == 3)
                        result = 3;
                    else if (c == 7)
                        result = 7;
                    else result = 8;
                    break;

                }
                case 2: {
                    if (c == 2)
                        result = 4;
                    else if (c == 3)
                        result = 9;
                    else if (c == 7)
                        result = 9;
                    else result = 4;
                    break;
                }
                case 3: {
                    if (c == 2)
                        result = 8;
                    else if (c == 3)
                        result = 7;
                    else if (c == 7)
                        result = 3;
                    else result = 2;
                    break;
                }
                case 4: {
                    if (c == 2)
                        result = 6;
                    else if (c == 3)
                        result = 1;
                    else if (c == 7)
                        result = 1;
                    else result = 6;
                    break;
                }
                default: {
                    result = -1;
                    break;
                }


            }

        }
        System.out.println(result);


    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int d =sc.nextInt();
        for (int i = 1; i <= d; i++) {

            findDigit(sc.nextInt(),sc.nextInt());
        }
    }
}
