import java.io.*;

public class WriterOut extends Thread{
    File file;
    final PrintWriter writer;
    int min;
    int max;
    String marker;
    public WriterOut(File file, PrintWriter writer, int min, int max, String marker){
        this.file = file;
        this.writer = writer;
        this.min = min;
        this.max = max;
        this.marker = marker;
    }


    @Override
    public void run() {
        try {
            for (;min < max; min++) {
                synchronized (writer) {
                    BufferedReader input = new BufferedReader(new FileReader(file));
                    String last = null, line;
                    while (null != (line = input.readLine())) {
                        last = line;
                    }
                    assert last != null;
                    int maxNumber = Integer.parseInt(last);
                    int newNumber = maxNumber + 1;
                    writer.write("\n");
                    writer.write(Integer.toString(newNumber));

                    writer.flush();
                    System.out.println(maxNumber + "->" + newNumber + " " + marker);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}