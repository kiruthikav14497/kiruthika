public static void main(String args[]){
    int [][] matrix = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,0,1,2},
            {3,4,5,6}
    }
    System.out.println("length is " + matrix.length);
    int [][] rotatedMatrix = ninetyDegRotator.rotate(matrix);
} 
