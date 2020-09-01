import javax.sound.midi.MidiFileFormat;
import java.lang.reflect.Array;
import java.util.Scanner;

public class thirdBiggest {
    public static void main(String[] args) {
        int arr[]={3,22,1,4,5};
        int size=arr.length;
        int first=Integer.MIN_VALUE;
        for (int i=0;i<size;i++){
            if (arr[i]>first){
                first=arr[i];
            }
        }
        int second=Integer.MIN_VALUE;
        for (int i=0;i<size; i++){
            if (arr[i]>second && arr[i]<first){
                second=arr[i];
            }
        }
        int third=Integer.MIN_VALUE;
        for (int i=0;i<size; i++){
            if (arr[i]>third && arr[i]<second){
                third=arr[i];
            }
        }
        System.out.println(third);

    }
}
