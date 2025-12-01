package gr.aueb.cf.cf9.ch6;

public class ArraySearch {
    public static void main(String[] args) {

    }

    //epistrefei -1 os simvasi an den iparxei
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;

        //int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                //positionToReturn = i;
                //break;
                return i;
            }
        }

        //return positionToReturn;
        return -1;
    }
}
