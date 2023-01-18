public class EasyReshapeTheMatrix 
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        //compute total size of original matrix (# of columns can be different for each row)
        int sumMatSize = 0;

        for(int i=0;i<mat.length;i++)
        {
            sumMatSize += mat[i].length;
        }

        //if(mat.length*mat[0].length == r*c) //if # of columns in original matrix are static, no need to compute total size of original matrix
        
        if(sumMatSize == r*c) //if size of original matrix and new matrix is equivalent
        {
            int[][] newMat = new int[r][c]; //create new array with new number of rows & columns
            int rowCounter = 0; //keeps track of row count in new matrix
            int colCounter = 0; //keeps track of column count in new matrix

            for(int i=0;i<mat.length;i++) //iterate through each row in original matrix 
            {
                for(int j=0;j<mat[i].length;j++) //iterate through each column in origianl matrix
                {
                    newMat[rowCounter][colCounter] = mat[i][j]; //store value in new matrix
                    colCounter++; //increment colCounter

                    if(colCounter == c) //if column limit reached
                    {
                        rowCounter ++; //increment row counter
                        colCounter = 0; //reset column counter
                    }
                }
            }
            return newMat; 
        }
        else //if size of original matrix and new matrix is not equivalent
        {
            return mat; //retrun original matrix 
        }
    }
}
