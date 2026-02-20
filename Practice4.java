public class Practice4 {
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : nums) {
                if ((num >> i & 1) == 1) {
                    sum++;
                }
            }

            if (sum % 3 != 0) {
                result = result | (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,4,4,4,9};
        System.out.println(singleNumber(nums));  // 9
    }
}
