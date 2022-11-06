
public class Two_Dimensional {
    public static void main(String[] args) {
        int[][] test = {{1, 2, 3}, {1, 2, 3, 4}};
        for (int x = 0; x < test.length; x++) {
            for (int j = 0; j < test[x].length; j++) {
                System.out.println(test[x][j]);
            }
        }
    }
}
