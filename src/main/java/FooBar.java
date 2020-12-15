
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FooBar {
    public static void FooBarTest(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < number; i++){
                numberList.add(i);
            }
            numberList.forEach(num -> {
                if (num % 3 == 0 && num % 5 !=0){
                    System.out.print("Foo ");
                }
                else if (num % 3 != 0 && num % 5 != 0 || num == 0){
                    System.out.print(num + " ");
                }
                else if (num % 5 == 0 && num % 3 != 0){
                    System.out.print("Bar ");
                }
                else if (num % 5 == 0 && num % 3 == 0){
                    System.out.print("FooBar ");
                }
            });
            // первый способ при помощи записи в list, forEach и условий if
            System.out.println();
            for (int num = 0; num < number; num ++){
                if (num % 3 == 0 && num % 5 !=0){
                    System.out.print("Foo ");
                }
                else if (num % 3 != 0 && num % 5 != 0 || num == 0){
                    System.out.print(num + " ");
                }
                else if (num % 3 != 0){
                    System.out.print("Bar ");
                }
                else {
                    System.out.print("FooBar ");
                }
            }
            // Второй способ без записи в list при помощи цикла for
            System.out.println();
            StringBuilder result = new StringBuilder();
            numberList.forEach(num -> {
                result.append(num % 3 == 0 && num % 5 == 0 && num != 0 ? "FooBar "
                        : num % 3 == 0 && num != 0 ? "Foo "
                        : num % 5 == 0 && num != 0 ? "Bar "
                        : num + " ");

            });
            System.out.print(result.toString());
            // третий способ при помощи тернарных операторов
        }
    }
}