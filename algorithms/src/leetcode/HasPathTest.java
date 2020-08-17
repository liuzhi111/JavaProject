package leetcode;

/**
 * @description:
 * @author: liuzhi
 * @Date: 2020-08-16 20:34
 **/
public class HasPathTest {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] tobeFind)
    {
        //将字符串改成martirx
        if (matrix.length != (rows *cols) ||rows <1|| cols < 1||tobeFind==null)
        {
            return false;
        }
        //作为访问的标志
        int [] flag = new int[matrix.length];
        for (int i=0;i<rows;++i) {
            for (int j=0;j<cols;++j) {
                 if (helper(matrix,rows,cols,i,j,tobeFind,0,flag)) {
                     return true;
                 }
            }
        }
        return false;
    }

    private static boolean helper(char[] matrix, int rows, int cols,
                                  int i, int j,
                                  char[] tobeFind,
                                  int k, int[] flag) {
        int index = i*cols +j;
        if (i<0 || i>=rows||j<0||j>=cols
                ||matrix[index] !=tobeFind[k]
                ||flag[index]==1)
        {
            return false;
        }
        if (k==tobeFind.length-1) {
            return  true;
        }
        flag[index] =1;
        if (helper(matrix,rows,cols,i-1,j,tobeFind,k+1,flag)
            ||helper(matrix,rows,cols,i+1,j,tobeFind,k+1,flag)
                ||helper(matrix,rows,cols,i,j-1,tobeFind,k+1,flag)
                ||helper(matrix,rows,cols,i,j+1,tobeFind,k+1,flag)) {
            return true;

        }
        flag[index]=0;
        return false;
    }

    public static void main(String[] args) {
        char[] matrix= {'A','B','T','G','C','F','C','S','J','D','E','H'};
        char[] str= {'B','F','C','E'};
        String name="test1";
        boolean flag =true;
        FinalTest(name,matrix,3,4,str,flag);


    }

    public static void FinalTest(String testname, char[]matrix,
                                 int rows, int cols,
                                 char[] tobeFind,
                                 boolean excepted){
        if (testname==null) {
            System.out.printf("%s begins: ",testname);
        }
        if (hasPath(matrix,rows,cols,tobeFind)==excepted)
        {
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

    }

//    private static void FinalTest(String name, char[] matrix, int i, int i1, char[] str) {
//    }
}
