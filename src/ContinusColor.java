import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ContinusColor {


    static int[][] input = {
            {1, 4, 4, 4, 4},
            {2, 1, 1, 4, 3},
            {3, 1, 1, 1, 2},
            {3, 3, 2, 1, 1},
            {1, 1, 3, 1, 1}};


    static List<ValueXY> result = new ArrayList<ValueXY>();
    static List<ValueXY> temp = new ArrayList<ValueXY>();

    public static void main(String args[]) {

        for (int y = 0; y < 5; y++) {

            for (int x = 0; x < 5; x++) {
                temp = new ArrayList<ValueXY>();
                ValueXY coordinate = new ValueXY(x,y);
                temp.add(coordinate);
                checkAdjacent(x, y);
                if (temp.size() > result.size()) {
                    result = temp;
                }
            }
        }
        printGrid(result);

    }

    static  boolean f= false;
    static void checkAdjacent(int x, int y) {


        ValueXY coordinate = new ValueXY();

        if (x != 4 && input[x][y] == input[x + 1][y]) {
            coordinate = new ValueXY(x+1,y);
            temp.add(coordinate);
            f=true;
            checkAdjacent(x+1 , y);
        }
        if (y != 4 && input[x][y] == input[x][y + 1]) {
            coordinate = new ValueXY(x,y+1);
            temp.add(coordinate);
            f=true;
            checkAdjacent(x , y+1);
        }

//        if(!f){
//            return;
//        }

        return;

    }

    private static void printGrid(List<ValueXY> coordinateList) {
        ValueXY coordinate = new ValueXY();
        Integer count=0;
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {

                coordinate = new ValueXY(y,x);

                if (coordinateList.contains(coordinate)) {
                    count++;
                    System.out.print(" "+input[y][x]+" ");
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Continuous Color Grid Count: "+count);
    }

}
