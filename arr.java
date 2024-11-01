import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int arr[][] = new int[10][10];
   System.out.print("How many integers inputs: ");
   int size = obj.nextInt();
     for(int i = 0; i < size; i++){
        for(int j = 0; j < 1; j++ ){
            System.out.print("Enter integer value " + (i + 1) + ": ");
            arr[i][j] = obj.nextInt();
        }
     }
     int odd = 0;
     int even = 0;
       for(int i = 0; i < size; i++){
        for(int j = 0; j < 1; j++){
          if (arr[i][j] % 2==0){
            even++;
          }else{
            odd++;
          }
        }
       }
       System.out.println("Even number: " + even);
       System.out.println("Odd number: " + odd);
       int largest = 0;
       int larger = 0;
       for(int i = 0; i < size; i++){
        for(int j = 0; j < 1; j++){
            if(arr[i][j] % 2 == 0){
                if(arr[i][j] > larger )
                larger = arr[i][j];

            }else{
                if(arr[i][j] % 2 != 0){
                    if(arr[i][j] > largest){
                        largest = arr[i][j];
                    }
                }
                
            }
        }
       }
   System.out.println("Largest even number: " + larger);
   System.out.println("Largest odd number: " + largest);

    }

}
