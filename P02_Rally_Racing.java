package Energy;

import java.util.Scanner;

public  class P02_Rally_Racing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String racingNum = scanner.nextLine();

        String[][] matrix = new String[n][n];

        for (int r = 0; r < n; r++) {
            matrix[r] = scanner.nextLine().split("\\s+");
        }

        int carRow = 0;
        int carCol = 0;
        matrix[carRow][carCol] = "C";
        int kilometersPassed = 0;

        boolean hasFinished = false;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            matrix[carRow][carCol] = ".";
            if (command.equals("up")) {
                carRow--;
            } else if (command.equals("down")) {
                carRow++;
            } else if (command.equals("left")) {
                carCol--;
            } else if (command.equals("right")) {
                carCol++;
            }
            if (matrix[carRow][carCol].equals(".")) {
                kilometersPassed +=10;
            }
            if (matrix[carRow][carCol].equals("T")) {
                matrix[carRow][carCol] = ".";
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < n; c++) {
                        if (matrix[r][c].equals("T")) {
                            matrix[r][c] = ".";
                            carRow = r;
                            carCol = c;
                            kilometersPassed += 30;
                            break;
                        }
                    }
                }
            }
            if (matrix[carRow][carCol].equals("F")) {
                matrix[carRow][carCol] = "C";
                kilometersPassed += 10;
                hasFinished = true;
                break;
            }
            matrix[carRow][carCol] = "C";
            command = scanner.nextLine();
        }
        if (hasFinished) {
            System.out.printf("Racing car %s finished the stage!%n", racingNum);
        } else {
            System.out.printf("Racing car %s DNF.%n", racingNum);
        }
        System.out.printf("Distance covered %d km.%n", kilometersPassed);

        for (String[] row : matrix) {
            for (String field : row) {
                System.out.print(field);
            }
            System.out.println();
        }

    }
}