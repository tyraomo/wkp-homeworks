package hw06_task1;

/**
 * start()-->starts a new thread(parallel)
 * while run() executes thread in main thread(after another)
 * hence, start() is usefull when working w/ bigger matrices-all calculated at one
 * for smaller run() is totally okay!
 * 
 * t1.run(); - läuft vollständig im Hauptthread
 * t2.run(); - danach läuft t2
 * join() nicht nötig, alles ist schon fertig

* t1.run(); - läuft vollständig im Hauptthread
* t2.run(); - danach läuft t2
* join() nicht nötig, alles ist schon fertig
 * 
 * 
 */

public class MatrixMultMain {

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] result = multiplyMatrices(A, B);

        // Ausgabe des Ergebnisses
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        DotProductThread[][] threads = new DotProductThread[rowsA][colsB];

        // Threads erstellen und starten
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int[] row = A[i];
                int[] col = new int[colsA];
                for (int k = 0; k < colsA; k++) {
                    col[k] = B[k][j];
                }

                threads[i][j] = new DotProductThread(row, col);
                threads[i][j].start(); // oder threads[i][j].run() - braucht KEIN .join()
            }
        }

        // Warten bis alle Threads fertig sind
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                try {
                    threads[i][j].join();
                    result[i][j] = threads[i][j].getDot();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }
}
