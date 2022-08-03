public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5}, {7,3}, {3,5}};
        int money = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if(sum>money)
            {
                money=sum;
            }
        }
        System.out.println(money);
    }
}
