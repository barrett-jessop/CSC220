import java.util.Arrays;

public class arrayTest {

    public static void main(String[] args){

        //declaring and initializing 2D array
        int[][] number = {{3, 4, 5}, {1, 2, 3}, {2, 4, 2}};

        //printing array
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        //multiplication of 2 matrices
        int x[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int y[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int z[][] = new int[3][3];

        //multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                z[i][j] = 0;
                for(int k = 0; k < 3; k++){
                    z[i][j] += x[i][j] * y[i][j];
                }
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }

        //addition of 2 matrices
        int a[][] = {{1, 3, 4}, {3, 4, 5}};
        int b[][] = {{2, 4, 6}, {1, 3, 2}};

        int c[][] = new int[2][3];

        //adding and printing addition of 2 matrices
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        //cloning an array
        int intArray[] = {12, 15, 17};

        //print original array
        System.out.println("Contents of intArray[] before assignment:");
        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + " ");

        //create an array of the same size
        int copyArray[] = new int[intArray.length];

        //intArray is assigned to copyArray
        copyArray = intArray;

        //change element of copy array
        copyArray[1]++;

        //print both arrays
        System.out.println("\nContents of intArray[]:");
        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + " ");

        System.out.println("\nContents of copyArray[]:");
        for (int i = 0; i < copyArray.length; i++)
            System.out.print(copyArray[i] + " ");

        //sorting arrays
        int [] arr = {13, 5, 6, 45, 21, 100, 56, 1};

        Arrays.sort(arr);

        System.out.printf("\nOriginal arr[] : %s", Arrays.toString(arr));
        System.out.printf("\nModified arr[] : %s", Arrays.toString(arr));

    }

}
