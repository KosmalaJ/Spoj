import java.lang.*;
import java.util.Scanner;

class Skarbfi {
    public static void find() {
        int D;
        Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        for (int i = 0; i <D; i++) {
            int horizontal = 0;
            int vertical = 0;
            int N = sc.nextInt();
            for (int j = 0; j <N; j++) {
                int a, b;
                a = sc.nextInt();
                b = sc.nextInt();
                switch (a) {
                    case 0: {
                        vertical = vertical + b;
                        break;
                    }
                    case 1: {
                        vertical = vertical - b;
                        break;
                    }
                    case 2: {
                        horizontal = horizontal - b;
                        break;
                    }
                    case 3: {
                        horizontal = horizontal + b;
                        break;
                    }
                    default:
                        break;
                }
            }
            if (horizontal == 0 && vertical == 0)
                System.out.println("studnia");
            else {
                if (vertical != 0) {
                    if (vertical > 0)
                        System.out.println(0 + " " + vertical);
                    else System.out.println(1 + " "+ (- 1)* vertical);
                }
                if(horizontal!=0)
                {
                    if(horizontal>0)
                        System.out.println(3+" "+horizontal);
                    else
                        System.out.println(2+" "+(-1)*horizontal);
                }


            }
        }


    }
}


public class Main {

    public static void main(String[] args) {
  Skarbfi.find();
    }
}
