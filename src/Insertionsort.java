
public class Insertionsort {
    public static void insertionSort(int[] array)
    {
        long startTime = System.nanoTime();
        int seconds=0;
        int miliseconds=0;
        int nanoseconds=0;
        int numb=0;
        String str = "";
        String sstr= "";

        for (int i = 0; i < array.length; i++)
        {
            int temp = array[i];
            int j =i-1;
            while(j >= 0 && array[j] > temp)

            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
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

        System.out.println(sstr+"\nResult saved to file: D:\\insertionsort.txt");
        FilesApp.main(sstr, "D:\\insertionsort.txt");
    }
}
