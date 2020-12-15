import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            while (true){
            System.out.println("Введите название приложения, которое хотите использовать: \n"
                    + "FooBar \n"
                    + "Writer");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.equals("FooBar")){
                System.out.println("Вы выбрали приложение FooBar, введите целое число: ");
                FooBar.FooBarTest();
            }
            else if (name.equals("Writer")){
                System.out.println("Вы выбрали приложение Writer, введите целое число: ");
                Test2.write();
            }
            else {System.out.println("Пожалуйста, выберите приложение из списка");}
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
