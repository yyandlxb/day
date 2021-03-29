public class day4 {

    public static void main(String[] args) {

        Integer[] s  = {3,1,4,3,6,1,0};
        boolean aa = tx(s);
        System.out.println(aa);

        int i = jumpMinCount(s);
        System.out.println(i);

    }

    /**
     * 最少跳跃次数
     * @param arr 数组
     * @return int
     */
    public static int jumpMinCount(Integer[] arr){

        int currentMaxIndex = arr[0];
        int preMaxIndex = arr[0];
        int jump_min = 1;

        for (int i = 1; i < arr.length;i++){
            if (i > currentMaxIndex){
                jump_min++;
                currentMaxIndex = preMaxIndex;
            }
            if (preMaxIndex < arr[i]+i){
                preMaxIndex = arr[i]+i;
            }
        }
        return jump_min;
    }


    public static boolean tx(Integer[] a){

        int length = a.length;
        Integer[] arrIndex = new Integer[length];
        for (int i = 0;i<length;i++){
            arrIndex[i] = i+a[i];
        }
        int jump=0;
        int max_index = arrIndex[0];

        while (jump <arrIndex.length && jump <= max_index){
            if (max_index < arrIndex[jump]){
                max_index = arrIndex[jump];

            }
            jump ++;


        }
        if (jump == arrIndex.length){
            return true;
        }
        return false;


    }



}
