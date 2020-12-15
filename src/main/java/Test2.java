import java.io.*;
import java.util.*;


public class Test2 {

   public static void write() throws FileNotFoundException {
        while (true){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        PrintWriter writer = new PrintWriter("res/out.txt");
        writer.write("0");
        writer.flush();
        int mid = num/2;
        String marker1 = "1 поток";
        String marker2 = "2 поток";
        WriterOut writerOut = new WriterOut(new File("res/out.txt"), writer, 0 ,mid,marker1);
        writerOut.start();
        WriterOut writerOut1 = new WriterOut(new File("res/out.txt"), writer, mid + 1, num + 1,marker2);
        writerOut1.start();}
    }
}