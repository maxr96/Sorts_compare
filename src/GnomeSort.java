/**
 * Created by Oleksandr on 15.08.2015.
 */
import java.io.*;
public class GnomeSort {
    public static void gnomeSort(int[] array) {
        long startTime = System.nanoTime();
        int seconds=0;
        int miliseconds=0;
        int nanoseconds=0;
        int numb=0;
        int i = 1;
        String str = "";
        String sstr= "";

        while(i < array.length) {
            if(i==0 || array[i - 1] <= array[i])
                i++;
            else {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        seconds=(int)(estimatedTime/1000000);
        miliseconds=(int)(estimatedTime/1000-seconds*1000);
        nanoseconds=(int)(estimatedTime-miliseconds*1000-seconds*1000000);
        for (int j = 0; j < array.length; j++){
            str=str+String.valueOf(array[j]) + " ";
            numb++;
            if(numb>50){
                str=str+"\r\n";
                numb=0;
            }
        }
        sstr="Sorted Array: " + str +"\r\n"+ "Time of executing:" +" "+String.valueOf(seconds)+" seconds "+
                String.valueOf(miliseconds)+" miliseconds "+String.valueOf(nanoseconds)+" nanoseconds ";

        System.out.println(sstr+"\nResult saved to file: D:\\GnomeSort.txt");
        FilesApp.main(sstr, "D:\\GnomeSort.txt");

    }
}
