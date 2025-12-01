package gr.aueb.cf.cf9.ch6;

public class BooleanAggregatesApp {
    public static void main(String[] args) {

    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count > 2;
    }

    public static boolean moreThanTwoOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;

        for (int item : arr) {
            if (item % 2 != 0) odds++;
        }
        return odds > 2;

    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        //we put arr.length - 2 since inside the loop we have arr[i + 2]
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                count++;
                break;
            }
        }

        return count >= 1;
    }

    public static boolean moreThanTwoSameEndings(int[] arr) {
        if (arr == null) return false;

        int[] endings = new int[10];
        for (int num  : arr) {
            if (++endings[num%10] >= 3) {
                return true;
            }
        }

        return false;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }

        return sum;
    }

    public static double avg(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
        for (int el : arr) {
            if (el %2 == 0) return true;
        }
        return true;
    }

    public static boolean allEven(int[] arr) {
        for (int el : arr) {
            if (el % 2 != 0) return false;
        }

        return true;
    }

    public static boolean moreThanTwoEvens2(int[] arr) {
       int count = 0;
        //for (int el : arr) {
        //    if (el % 2 == 0) count++;
        //}

       // return count > 2;
        for (int el : arr) {
            if (el % 2 == 0) count++;
            if (count > 2) return true;
        }

        return false;
    }
}
