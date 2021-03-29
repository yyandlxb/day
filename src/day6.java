import java.util.Arrays;

public class day6 {

    public static void main(String[] args) {

        Integer[] arr = {1,2,4,1,2,4,5,6,2,3,22};
        sort(arr,0,arr.length -1);
        Arrays.stream(arr).forEach(e-> System.out.println(e));
    }

    public static void sort(Integer[] arr,int left, int right) {

        if (arr==null || arr.length == 0){
            return ;
        }

        if (left > right){
            return;
        }
        int key = arr[left];
        int l = left;
        int r = right;
        while (l!=r){
            while (arr[r] >= key && l<r){
                r--;
            }
            while (arr[l] <= key && l < r){
                l++;
            }
            if (l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        arr[left] = arr[l];
        arr[l] = key;
        sort(arr,left, l-1);
        sort(arr,l+1,right);

    }
}
