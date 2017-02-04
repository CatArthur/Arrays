
import java.util.Arrays;
import java.util.Random;

public class Main1 {

    public static void main(String[] args) {
        Random r=new Random();
        int n=5;
        String[]s=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]="";
            for (int j = 0; j < 9; j++) {
                s[i]+=(char)r.nextInt(100);
            }
        }
        Arrays.sort(s);
        for (String i:s) {
            System.out.println(i);
        }
    }
}
/*Сгенерировать случайным образом массив строк, каждая длины 9.
Отсортировать массив по среднему символу.
Требуется вывести исходный массив и отсортированный..*/