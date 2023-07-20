import java.util.Scanner;

public class Stock_Manage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println(max_profit(array,size));
    }

    static int max_profit(int[] array, int size) {
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;

        for (int price : array) {
            min_price = Math.min(min_price, price);
            int temp = price - min_price;
            max_profit = Math.max(max_profit, temp);
        }
        return  max_profit;
    }
}
