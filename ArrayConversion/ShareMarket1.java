package ArrayConversion;

public class ShareMarket1 {
	static int maxProfit(int a[], int start, int end) {
		if (end <= start)
			return 0;
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (a[j] > a[i]) {
					int curr_profit = a[j] - a[i] + maxProfit(a, start, i - 1)+ maxProfit(a, j + 1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 4, 5, 7, 9 };
		int n = arr.length;
		System.out.print("We got profit"+" : "+maxProfit(arr, 0, n - 1));
	}
}
