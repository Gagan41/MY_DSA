package CodeChef;

public class CC_Coupon {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        int sum = 0;   // cost without coupon
        int cost = 0;  // cost with coupon (excluding coupon cost x)

        for (int price : prices) {
            sum += price;

            if (price <= y) {
                cost += 0;            // becomes free
            } else {
                cost += price - y;    // discount applied
            }
        }

        if (x + cost < sum) {
            return "COUPON";
        } else {
            return "NO COUPON";
        }

    }
}
