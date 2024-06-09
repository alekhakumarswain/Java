package Project.Java;

public class Pattern {
    public static void main(String[] args) {
        drawAlphabets();
    }

    public static void drawAlphabets() {
        for (char c = 'A'; c <= 'F'; c++) {
            switch (c) {
                case 'A':
                    drawAPattern();
                    break;
                case 'B':
                    drawBPattern();
                    break;
                    case 'C':
                    drawCPattern();
                    break;
                case 'D':
                    drawDPattern();
                    break;
                case 'E':
                    drawEPattern();
                    break;
                case 'F':
                    drawFPattern();
                    break;
                default:
                    System.out.println("Pattern for " + c + " not implemented.");
            }
            System.out.println();
        }
    }

    public static void drawAPattern() {
        int rows = 5; // number of rows in the pattern
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= (2 * rows - 1); j++)
                if ((i == 0 || i == rows) && j == 1 || j == (2 * rows)) {
                    System.out.print(" ");
                } else if (i == Math.abs(rows - j)) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
    }

    public static void drawBPattern() {
        int height = 7;
        int width = 5;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (col == 0 || (row == 0 || row == height / 2 || row == height - 1) && col < width - 1 || col == width - 1 && !(row == 0 || row == height / 2 || row == height - 1)) {
                    System.out.print("B");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawCPattern() {
        int height = 5;
        int width = 4;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if ((row == 0 || row == height - 1) && col > 0) {
                    System.out.print("C");
                } else if (col == 0 && (row > 0 && row < height - 1)) {
                    System.out.print("C");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawDPattern() { 
        int height = 5;
        int width = 4;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (col == 0 || (col == width - 1 && (row != 0 && row != height - 1)) || (row == 0 || row == height - 1) && (col > 0 && col < width - 1)) {
                    System.out.print("D");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawEPattern() {
        int height = 5;
        int width = 4;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if ((row == 0 || row == height - 1) || (row == height / 2 && col < width - 1)) {
                    System.out.print("E");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawFPattern() {
        int height = 5;
        int width = 4;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if ((row == 0) || (row == height / 2 && col < width - 1)) {
                    System.out.print("F");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}