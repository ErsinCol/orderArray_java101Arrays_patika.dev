import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int lengthArray=input.nextInt();
        int[] array=new int[lengthArray];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i=0;i<lengthArray;i++){
            System.out.print(i+1+". elemanı: ");
            int number=input.nextInt();
            array[i]=number;
        }
        int key;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    key=array[i];
                    array[i]=array[j];
                    array[j]=key;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
