// Write a Java program that performs the following tasks:

// Declare and initialize an array of numeric values.
// Display all elements of the array.
// Calculate the sum of all elements in the array.
// Calculate the average value of the array elements.
// Display the total sum, and the average value.
// public class ArrayExample2 {
//     public static void main(String[] args) {
//         int [] array ={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//         int sum=0;
//         double average=0;
//         for(int i=0;i<array.length;i++){
//             System.out.println(array[i]);
//             sum+=array[i]; 
//             average = sum/array[i];   
//         }
        
//         System.out.println("sum : "+sum);
//         System.out.println("average : "+average);    
//     }
// }
//create three methods:
//1. DISPLAY ARRAY
//2. DISPLAY SUM
//3. DISPLAY AVERAGE

public class ArrayExample3 {
    public void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public void displaySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
            System.out.println("Sum : " + sum);
    }
    public void displayAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];}
            double average =  sum / array.length;
            System.out.println("Average: " + average);
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12,13,14};
        ArrayExample3 Array = new ArrayExample3();
        
        Array.displayArray(array);
        Array.displaySum(array);
        Array.displayAverage(array);
    }
}