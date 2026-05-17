public class Main39 {
    public static void main(String[] args) {

        char board[][] = {
                { 'X', 'O', 'X' },
                { 'O', 'X', 'O' },
                { 'X', ' ', 'O' }
        };

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    } 
}
