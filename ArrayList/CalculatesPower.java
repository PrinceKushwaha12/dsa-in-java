public class CalculatesPower {
    static int pow(int num, int pow) {
        int ans = 1; 
        for(int i = 0; i < pow; i++) {
            ans = ans * num;
        };
        return ans;
    };
    public static void main(String[] args) {
        int num = 2; 
        int power = 10;
        System.out.println("Power is " + pow(num, power));
    }
}
