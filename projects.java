import java.util.Scanner;
class proj{
      int cube(int box){
        return  box * box * box;
      }
      int sqrt(int boxer){
        return boxer * boxer;
      }
public class project{
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        proj obj = new proj();
        System.out.print("Enter any number: ");
        num = in.nextInt();
        System.out.print("\nThe Cube of number [" + num + "] is:" + obj.cube(num));
        System.out.print("The Squared of [" + obj.cube(num) +"] is: " + obj.sqrt(obj.cube(num)));
        in.close();
    }
}

}