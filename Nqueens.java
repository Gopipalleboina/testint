import java.util.*;
public class Nqueens{
    public static boolean issafe(char[][] board,int row,int col,int n){
        for(int i=0;i<row;i++){
           if(board[i][col]=='Q'){
               return false;
           }
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
               return false;
           } 
        }
         for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
               return false;
           } 
        }
        return true;
    }
    public static boolean nqueens(char[][] board,int row,int n){
        if(row>=n){
            return true;
        }
        for(int col=0;col<n;col++){
            if(issafe(board,row,col,n)){
                board[row][col]='Q';
                if(nqueens(board,row+1,n)){
                    return true;
                }
                board[row][col]='.';
                
            }
        }
        return false;
    }
    public static void print(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        if(nqueens(board,0,n)){
            print(board);
        }
        else{
            System.out.println("no solution");
        }
    }
}