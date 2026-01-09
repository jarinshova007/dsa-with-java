// Find the number of ways in which you can invite n people to your party, single or in pairs.
public class CallGuests {
    public int callGuests(int n) {
        if (n <= 1) {
            return 1; // way1 only
        }

        // single
        int way1 = callGuests(n - 1);

        // pair
        int way2 = callGuests(n - 2) * (n - 1); // we have n - 1 choices for the 2nd person

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 4;

        // call method
        CallGuests c = new CallGuests();
        System.out.println("total number of ways = " + c.callGuests(n)); // 10
    }
}