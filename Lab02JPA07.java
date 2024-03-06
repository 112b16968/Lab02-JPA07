import java.util.Arrays;
import java.util.Scanner;


public class Lab02JPA07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.printf("請輸入三個整數:");
            String triangle = input.nextLine();
            System.out.println(triangle);
            String [] numbers = triangle.split("\\s+");
            int[] numbers1 = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
            if (numbers1[0]+numbers1[1]>numbers1[2]&&
                numbers1[1]+numbers1[2]>numbers1[0]&&
                numbers1[2]+numbers1[0]>numbers1[1]&&
                numbers1[0]+numbers1[1]+numbers1[2] != 0){
                    if (numbers1[0]*numbers1[0]+numbers1[1]*numbers1[1] == numbers1[2]*numbers1[2]) {
                        System.out.println("直角三角形");
                    }else if (numbers1[0]*numbers1[0]+numbers1[1]*numbers1[1] > numbers1[2]*numbers1[2]) {
                        System.out.println("銳角三角形");
                    }else if (numbers1[0]*numbers1[0]+numbers1[1]*numbers1[1] < numbers1[2]*numbers1[2]) {
                        System.out.println("鈍角三角形");                        
                    }
            }else{
                System.out.println("不可以構成三角形");
            }

        input.close(); 

    }
}
}