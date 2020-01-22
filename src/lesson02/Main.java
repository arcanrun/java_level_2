package lesson02;

public class Main {
    public static void main(String[] args) {
        String initMatrix = "10 3 1 2\\n2 3 2 2\\n5 6 7 1\\n300 3 1 0";

        try {
            System.out.println(matrixSum(strToTwoDemMatrix(initMatrix)));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong array format");
        } catch (NumberFormatException e) {
            System.out.println("One of the cells is not Integer");
        }

    }

    public static String[][] strToTwoDemMatrix(String str) throws ArrayIndexOutOfBoundsException {
        String[][] res = new String[4][4];

        String replacedStr = str.replace("\\n", "@");


        String[] arr = replacedStr.split("@");

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i].split(" ");
        }
        return res;
    }


    public static int matrixSum(String[][] matrix) throws NumberFormatException {
        int sum = 0;

        for (String[] strings : matrix) {
            for (int j = 0; j < matrix[j].length - 1; j++) {
                sum += Integer.parseInt(strings[j]);
            }
        }
        return sum / 2;
    }
}
