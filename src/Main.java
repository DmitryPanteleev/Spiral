public class Main {

    static int[][] mass;
    static int number = 0;
    static int rowMassiv;
    static int columnMassiv;

    public static void main(String[] args) {

        //Размерность массива указывается натуральными числами
        createArray(4, 7);
        printArray();
    }

    public static void createArray(int y, int x) {
        mass = new int[y][x];
        for (int[] massiv : mass) {

            for (int i = 0; i < massiv.length; i++) {
                massiv[i] = -1;
            }
        }
        rowMassiv = y;
        columnMassiv = x;
        addSpiral(0, 0);
    }


    public static void printArray() {
        for (int[] massiv :
                mass) {
            for (int i :
                    massiv) {
                if (i < 10) {
                    System.out.print("  " + i);
                } else {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }
    }

    private static void addSpiral(int row, int column) {
        mass[row][column] = number;
        number++;
        int cicl = 0;
        int finish;
        int b;
        b = (rowMassiv > columnMassiv) ? (finish = rowMassiv / 2) : (finish = 1 + columnMassiv / 2);

        while (cicl < finish) {
            while (true) {
                if ((column + 1) < columnMassiv && mass[row][column + 1] == -1) {
                    mass[row][++column] = number;
                    number++;
                } else {
                    break;
                }
            }
            while (true) {
                if ((row + 1) < rowMassiv && mass[row + 1][column] == -1) {
                    mass[++row][column] = number;
                    number++;
                } else {
                    break;
                }
            }
            while (true) {
                if ((column - 1) >= 0 && mass[row][column - 1] == -1) {
                    mass[row][--column] = number;
                    number++;
                } else {
                    break;
                }
            }
            while (true) {
                if ((row - 1) >= 0 && mass[row - 1][column] == -1) {
                    mass[--row][column] = number;
                    number++;
                } else {
                    break;
                }
            }
            cicl++;
        }
    }

}
