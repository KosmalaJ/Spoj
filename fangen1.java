import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

class Fangen{
    static void generatefan() {

        List<char[][]> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = 0;
            int t = sc.nextInt();
            if (t == 0)
                break;
             if (t < 0)
                n = (-1) * t;
            if(t>0)n=t;
            char[][] map;
            map = new char[2*n][2*n];
            for (int i = 0; i < map.length / 2; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (j <= i || (j >= map.length / 2 && j < map.length - i)) {
                        map[i][j] = '*';
                        map[map.length - i - 1][map.length - j - 1] = '*';
                    } else {
                        map[i][j] = '.';
                        map[map.length - i - 1][map.length - j - 1] = '.';
                    }
                }
            }
            lista1.add(map);
            lista2.add(t);


        }
        for(int i=0;i<lista1.size();i++)
        {if(lista2.get(i)<0)
            printCounterClockwise(lista1.get(i).length,lista1.get(i));
        else printClockwise(lista1.get(i).length,lista1.get(i));
        if(i!=lista1.size()-1)
        System.out.println();
        }
    }



    static void printClockwise(int size, char[][] map) {
        for(int i = 0 ; i < size ; i++)
        {
            for(int k = 0 ; k < size ; k++)
            {
                System.out.print(map[i][k]);
            }
            System.out.println();
        }
    }
    static void printCounterClockwise(int size, char[][] map) {
        for(int i = size-1 ; i >=0 ; i--)
        {
            for(int k =0 ; k<size ; k++)
            {
                System.out.print(map[i][k]);
            }
            System.out.println();
        }
    }



}

public class Main {

    public static void main(String[] args) {

        Fangen.generatefan();


    }
}
