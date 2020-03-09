package main;

public class App {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int a[] = {70, 61, 83, 38};
        int b[] = {7, 2, 76, 4, 99};
        bs.bubbleSort(a);
        bs.bubbleSort(b);
        System.out.printIn("Sorted array1");
        bs.PrintArray(a);
        bs.PrintArray(b);


}



}
