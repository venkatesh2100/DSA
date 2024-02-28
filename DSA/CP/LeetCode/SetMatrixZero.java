import java.util.ArrayList;
import java.util.Arrays;

//SETMATRIXZERO
//we need to set the given 0 index row and column to set Zero in the final output
public class SetMatrixZero {
    static void markrowBF1(ArrayList<ArrayList<Integer>> matrix,int m,int n,int i){
         //set all zero index element rows and column -1
            for (int j = 0; j < n; j++) {
                if(matrix.get(i).get(j)!=0){
                    matrix.get(i).set(j,-1);
                }

            }
    }
    static void markcolBF1(ArrayList<ArrayList<Integer>> matrix,int m,int n,int j){
        for (int i = 0; i < m; i++) {//set all non zero elements to -1
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    static ArrayList<ArrayList<Integer>> ZeroMatrix(ArrayList<ArrayList<Integer>> matrix,int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix.get(i).get(j)==0){
                    markrowBF1(matrix,m,n,i);
                    markcolBF1(matrix,m,n,j);
                }

            }

        }
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j,0);
                }
            }

        }
        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));

        int m=matrix.size();
        int n=matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans=ZeroMatrix(matrix,m,n);

        System.out.println("Final Matrix");
        for(ArrayList<Integer> row:ans){
            for(Integer ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
//Final Done.

    }





}
//


