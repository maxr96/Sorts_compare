/**
 * Created by Максим on 21.09.2015.
 */
public class SelectionSort {
    public static int[] doSelectionSort(int[] arr){

    for (int i = 0; i < arr.length - 1; i++)
    {
        int index = i;
        for (int j = i + 1; j < arr.length; j++)
            if (arr[j] < arr[index])
                index = j;

        int smallerNumber = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNumber;
    }
    return arr;
}

    public static void main(int[] arr1){
        long startTime = System.nanoTime();
        int seconds=0;
        int miliseconds=0;
        int nanoseconds=0;
        int numb=0;
        String str = "";
        String sstr= "";
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            str=str+String.valueOf(i) + " ";
            numb++;
            if(numb>50){
                str=str+"\r\n";
                numb=0;
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        seconds=(int)(estimatedTime/1000000);
        miliseconds=(int)(estimatedTime/1000-seconds*1000);
        nanoseconds=(int)(estimatedTime-miliseconds*1000-seconds*1000000);
        sstr="Sorted Array: " + str +"\r\n"+ "Time of executing:" +" "+String.valueOf(seconds)+" seconds "+
                String.valueOf(miliseconds)+" miliseconds "+String.valueOf(nanoseconds)+" nanoseconds ";

        System.out.println(sstr+"\nResult saved to file: D:\\SelectionSort.txt");
        FilesApp.main(sstr, "D:\\SelectionSort.txt");
    }
}
