package basic;


public class Sort {
    public static void main(String[] args) {
        int[] arr = {22,11,55,33,44};

        // Original elements
        System.out.println("Original elements: ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("     *************    ");

        // Swap first and last element
        for(int i=0; i<arr.length; i++) {
            int temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
        System.out.println("First and last element swapped: ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("     *************    ");

        // Second smallest and second largest
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Smallest element: "+arr[1]);
        System.out.println("Second Largest element: "+arr[arr.length-2]);
        System.out.println("     *************    ");

        // Ascending order
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // for display
        System.out.println("Elements in Ascending order: ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("     *************    ");

        // Descending order
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        // for display
        System.out.println("Elements in Descending order: ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        
    }
}
