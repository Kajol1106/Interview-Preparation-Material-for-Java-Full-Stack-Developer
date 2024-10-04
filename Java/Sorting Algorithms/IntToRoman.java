public class IntToRoman {
    public static void main(String[] args) {
        int n = 50;

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder res = new StringBuilder();

        for(int i=0; i<nums.length; i++) {
            while(n>=nums[i]) {
                n = n-nums[i];
                res.append(roman[i]);
            }
        }
        System.out.println(res);
    }
}
