import java.io.*;
import java.util.*;

public class Main{
    
    static int [][] sudoku = new int[9][9];
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i =0 ; i < 9 ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j < 9 ; j++){
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        check(0,0);
    }
    public static void check(int row,int col){
        if(col==9){
            check(row+1,0);
            return;
        }
        if(row==9){
            StringBuilder sb = new StringBuilder();
            for(int i =0 ; i< 9 ; i++){
                for(int j =0 ; j<9 ; j++){
                    sb.append(sudoku[i][j]+" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }
        if(sudoku[row][col]==0){
            for(int i =1;i<=9;i++){
                if(possible(row,col,i)){
                    sudoku[row][col] = i;
                    check(row,col+1);
                }
            }
            sudoku[row][col]=0;
            return;
        }
        check(row,col+1);
    }
    public static boolean possible(int row, int col, int value){
        for(int i =0 ; i < 9 ; i++){
            if(sudoku[row][i]==value){
                return false;
            }
        }
        
        for(int i =0 ; i< 9 ; i++){
            if(sudoku[i][col]==value){
                return false;
            }
        }
        
        int new_row = (row/3)*3;
        int new_col = (col/3)*3;
        for(int i =new_row;i<new_row+3;i++){
            for(int j=new_col;j<new_col+3;j++){
                if(sudoku[i][j]==value){
                    return false;
                }
            }
        }
        return true;
    }
}