package gr.aueb.cf.cf9.ch6;

public class ArrayShallowCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arrShallowCopy;

        arrShallowCopy = arr;
        arrShallowCopy[0] = 100;

        //side-effect ότι ό,τι
        //αλλαγές κάνουμε στον
        //arrShallowCopy γίνονται και
        //στον arr και το αντίθετο μιας
        //και οι δύο αναφορές (arr και
        //arrShallowCopy) δείχνουν στα
        //ίδια περιεχόμενα πίνακα
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

}
