
public class CountElement {
    public static int countelement(int[] arr, int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                count++;

            }

        }
        return count;

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,5,5,5,5};
        int result = countelement(numbers,5);
        System.out.println(result);
    }
}

