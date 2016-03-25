
public class CocktailSort {
    public static void cocktailSort(int[] array)
    {
        long startTime = System.nanoTime();
        int seconds=0;
        int miliseconds=0;
        int nanoseconds=0;
        int numb=0;
        int left = 0;
        int right = array.length - 1;
        String str = "";
        String sstr= "";
        do
        {
            for (int i = left; i < right; i++)
            {
                if(array[i] > array[i+1])
                {
                    array[i] ^= array[i+1];
                    array[i+1] ^= array[i];
                    array[i] ^= array[i+1];
                }
            }
            right--;
            for (int i = right; i > left ; i--)
            {
                if(array[i] < array[i-1])
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                }
            }
            left++;
        } while (left <= right);
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

        System.out.println(sstr+"\nResult saved to file: D:\\Cocktailsort.txt");

        FilesApp.main(sstr, "D:\\Cocktailsort.txt");

    }
}


