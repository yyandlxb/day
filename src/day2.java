public class day2 {

    public static void main(String[] args) {

        int f = dp(10);
        System.out.println(f);
    }

    public static int f(int n) {

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return f(n - 2) + f(n - 1);
    }

    public static int dp(int n){

        if (n == 1){
            return 1;
        }
        if (n ==2){
            return 2;
        }
        int a = 1;
        int b = 2;
        int tem = 0;

        for (int i = 3; i < n + 1;i++){

            tem = a + b;
            a = b;
            b = tem;
        }
        return tem;

    }


}
