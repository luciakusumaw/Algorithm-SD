public class Function13 {
    
    static int[] calcIncome(int[][] stock, int[] prices) {
        int[] revenues = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            int income = 0;
            for (int j = 0; j < stock[i].length; j++) {
                income += stock[i][j] * prices[j];
            }
            revenues[i] = income; 
        }
        
        return revenues; 
    }

    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] prices = {75000, 50000, 60000, 10000};

        // income
        int[] results = calcIncome(stock, prices);

        // display
        for (int i = 0; i < results.length; i++) {
            String status = (results[i] > 1500000) ? "Very Good" : "Need Evaluation";
            System.out.println("Branch " + (i + 1) + ": IDR " + results[i] + " (" + status + ")");
        }
    }
}