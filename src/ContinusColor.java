import java.util.ArrayList;
import java.util.List;

public class ContinusColor {

    public static void main(String args[]) {

        int input[][] = {{1, 4, 4, 4, 4},
                {2, 1, 1, 4, 3},
                {3, 2, 1, 1, 2},
                {3, 3, 2, 1, 2},
                {1, 1, 3, 1, 1}};

        int row=4;
        int column=4;

        colorGrid(input, row, column);


    }

    private static void colorGrid(int[][] input, int row, int column) {


        List<ValueXY> result = new ArrayList<ValueXY>();
        List<ValueXY> temp = new ArrayList<ValueXY>();


        for(int x=0; x<row; x++){

            for(int y=0; y<column; y++){

                temp = new ArrayList<ValueXY>();
                ValueXY xy;

                for(int j=x; j<row; j++){

                    if(input[x][j] == input[x+1][j]){
                         xy=new ValueXY(x+1,j);
                        temp.add(xy);
                       // input[x+1][j]=0;

                    }
                    if(input[x][j] == input[x][j+1]){

                        xy=new ValueXY(x,j+1);
                        temp.add(xy);
                        //input[x][j+1]=0;
                    }

                    if(input[x][j] == input[x+1][j] || input[x][j] == input[x][j+1]){

                        xy=new ValueXY(x,j);
                        temp.add(xy);
                        //input[x][j]=0;

                    }
                    else {
                        break;
                    }
                }
            }
            if(temp.size()>result.size()){
                result = new ArrayList<>();
                result = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if(input[i][j]==0){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }

            }
            System.out.println();
        }


        System.out.println(result.size());
    }
}
