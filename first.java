/**
 * first addeed new comment
 */

// minimum element in array
public class first {

    public void test() {

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 6 };
        int total = 0;
        int last = 10000;
        int mainTotal = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            last = arr[i];
        }
        for (int i = 1; i < last - 1; i++) {
            mainTotal = mainTotal + i;
        }

        System.out.println(total);
        System.out.println(last);
        System.out.println(mainTotal);

    }

}
