public class day1 {

    private static Integer[] arr = {100, 20, 5, 1};

    public static void main(String[] args) {
        tx(628);
    }

    public static void tx(Integer tar) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int use = tar / arr[i];
            count = count + use;
            tar = tar - arr[i] * use;

            System.out.println("需要面额为" + arr[i] + "的" + use);
            System.out.println("剩余支付金额" + tar);
        }
        System.out.println("总张数" + count);
    }


}
