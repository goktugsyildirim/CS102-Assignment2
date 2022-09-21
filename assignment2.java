public class assignment2 {
    
    public static double findAverage(int [] arr){
        double average = 0;
        double sum = 0; 
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum / arr.length;
        return average;
    }

    public static int sumOdd(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0 ){
                sum += arr[i];
            }
        }
        return sum;
    }
    
    public static int sumEven(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0 ){
                sum += arr[i];
            }
        }
        return sum;
    }
}

