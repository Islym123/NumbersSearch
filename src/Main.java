import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int max = 0;

        // Создание массива из случайных 1000 чисел
        int[] array = new int [1000];
        for (int i = 0;i < 1000;i++){
            array[i] = rand.nextInt(10000);
        }

        //
        for (int i = 0;i < 1000;i++){
            if (array[i]%14==0){
                for (int j = 0;j<1000;j++){
                    for (int n = 999;n>-1;n--){
                        if(array[i]==array[j]*array[n]){
                            if (max<array[i])max = array[i];
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}