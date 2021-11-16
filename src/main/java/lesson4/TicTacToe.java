package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = getSize();

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';

    private static final String SPACE_MAP = " ";
    private static final String HEADER_FIRST_MAP = "♥";

    private static final char[][] MAP = new char[SIZE][SIZE];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount;
    private static int lastRow;
    private static int lastColumn;

    private static int getSize() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a size of a play map: ");
        int mySize = myObj.nextInt();
        return mySize;
    }

    public static void turnGame() {
        do {
            System.out.println("\n\nThe game is starting now!");
            initAll();
            printMAP();
            playGame();
        } while (continueGame());
        endGame();
    }

    private static void initAll() {
        initMAP();
        turnsCount = 0;
        lastRow = 0;
        lastColumn = 0;
    }

    private static void initMAP() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMAP() {
        printHeaderMAP();
        printBodyMAP();
    }

    private static void printHeaderMAP() {
        System.out.print(HEADER_FIRST_MAP + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMAPNumber(i);
        }
        System.out.println();
    }

    private static void printMAPNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printBodyMAP() {
        for (int i = 0; i < SIZE; i++) {
            printMAPNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            turnHuman();
            printMAP();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            turnAI();
            printMAP();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void turnHuman() {
        System.out.println("HUMAN");
        int rowNumber, columnNumber;

        while (true) {
            rowNumber = getValidNumberFromUser() - 1;
            columnNumber = getValidNumberFromUser() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            } else {
                System.out.println("\nError! The cell is full!");
            }
        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        lastRow = rowNumber;
        lastColumn = columnNumber;
        turnsCount++;
    }

    private static int getValidNumberFromUser() {
        while (true) {
            System.out.print("\nEnter a coordinate (1-" + SIZE + "): ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                } else {
                    System.out.println("\nNumber should be between 1 and " + SIZE);
                }
            } else {
                in.next();
                System.out.println("\nEnter a number!");
            }
        }
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void turnAI() {
        System.out.println("AI");
        int rowNumber, columnNumber;

        while (true) {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
        }

        MAP[rowNumber][columnNumber] = DOT_AI;
        lastRow = rowNumber;
        lastColumn = columnNumber;
        turnsCount++;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nCongrats!");
            } else {
                System.out.println("\nComp wins!");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("\nDRAW!");
            return true;
        }
        return false;
    }

    private static boolean checkWin(char symbol) {

        int rowCount = 0;
        int columnCount = 0;
        int checkNum;

        checkNum = getControlNumber();

        rowCount = getRowCount(symbol, rowCount);

        columnCount = getColumnCount(symbol, columnCount);

        if (rowCount == checkNum || columnCount == checkNum) {
            return true;
        } else {
            return false;
        }
    }

    private static int getControlNumber() {
        int checkNum;
        if (SIZE >= 3 && SIZE < 6) {
            checkNum = 3;
        } else if (SIZE >= 6 && SIZE < 10) {
            checkNum = 4;
        } else {
            checkNum = 5;
        }
        return checkNum;
    }

    private static int getRowCount(char symbol, int rowCount) {
        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][lastColumn] == symbol) {
                rowCount++;
            }
        }
        return rowCount;
    }

    private static int getColumnCount(char symbol, int columnCount) {
        for (int j = 0; j < SIZE; j++) {
            if (MAP[lastRow][j] == symbol) {
                columnCount++;
            }
        }
        return columnCount;
    }

    private static boolean checkDraw() {
        return turnsCount >= SIZE * SIZE;
    }

    private static boolean continueGame() {
        System.out.println("Continue? y\\n");
        return switch (in.next()) {
            case "y", "yes", "+" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        System.out.println("Come back any time!");
    }
}