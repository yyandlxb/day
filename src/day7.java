import java.util.Arrays;

public class day7 {

    public static void main(String[] args) {
        Integer[] arr = {2, 33, 1, 2, 44, 3, 6, 0, 0};
        simpleSelect(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }


    public static void simpleSelect(Integer[] arr) {

        int min = 0;
        int tem = 0;
        int iValue;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    tem = j;
                }
            }
            if (min != arr[i]) {
                iValue = arr[i];
                arr[i] = min;
                arr[tem] = iValue;

            }
        }
    }
}
