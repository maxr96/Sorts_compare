public class BubleSort {
    public static void BubbleSort(int[] array){
        long startTime = System.nanoTime();
        int seconds=0;
        int miliseconds=0;
        int nanoseconds=0;
        int numb=0;
        int swap, lenOfArray = array.length;
        String str = "";
        String sstr= "";

        for (int i = 0; i < ( lenOfArray - 1 ); i++) {
            for (int j = 0; j < lenOfArray - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    swap       = array[j];
                    array[j]   = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        seconds=(int)(estimatedTime/1000000);
        miliseconds=(int)(estimatedTime/1000-seconds*1000);
        nanoseconds=(int)(estimatedTime-miliseconds*1000-seconds*1000000);

        for (int j = 0; j < lenOfArray; j++){
            str=str+String.valueOf(array[j]) + " ";
            numb++;
            if(numb>50){
                str=str+"\r\n";
                numb=0;
            }
        }
        sstr="Sorted Array: " + str +"\r\n"+ "Time of executing:" +" "+String.valueOf(seconds)+" seconds "+
                String.valueOf(miliseconds)+" miliseconds "+String.valueOf(nanoseconds)+" nanoseconds ";

        System.out.println(sstr+"\nResult saved to file: D:\\BubbleSort.txt");
        FilesApp.main(sstr, "D:\\BubbleSort.txt");
    }
    //Long.toString(estimatedTime)
}
