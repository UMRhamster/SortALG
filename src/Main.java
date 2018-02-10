import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = {3,4,1,5,7,2,9,6,8};
        int number = new Scanner(System.in).nextInt();
        switch (number){
            case 0:
                Sort.BubbleSort(a);
                break;
            case 1:
                Sort.CocktailSort(a);
                break;
            case 2:
                Sort.SelectionSort(a);
                break;
        }
        for (int i : a){
            System.out.println(i);
        }
    }
}
