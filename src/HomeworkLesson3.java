public class HomeworkLesson3 {
    public static void main(String[] args) {

        int month = 8;

        if (month == 12 | month == 1 | month == 2) {
            System.out.println("Это зима!");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Это весна!");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Это лето!");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Это осень!");
        }

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это оcень!");
                break;
            default:
                System.out.println("Введено неверное число!");
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int[][] squareArray = new int[2][5];

        squareArray[0][0] = 1;
        squareArray[0][1] = 2;
        squareArray[0][2] = 3;
        squareArray[0][3] = 4;
        squareArray[0][4] = 5;
        squareArray[1][0] = 6;
        squareArray[1][1] = 7;
        squareArray[1][2] = 8;
        squareArray[1][3] = 9;
        squareArray[1][4] = 10;

        int index = squareArray[0][0];

        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                if (squareArray[i][j] >= index) {
                    index = squareArray[i][j];
                    int indexI = i;
                    int indexJ = j;
                    System.out.print(squareArray[i][j] + "[" + indexI + "]" + "[" + indexJ + "]" + " ");
                }
            }
            System.out.println();
        }
    }
}
