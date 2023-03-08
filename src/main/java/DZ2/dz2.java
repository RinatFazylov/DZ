package DZ2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
public class dz2 {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<100; i++){
            String str= ("TEST_");
            sb.append(str);
        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("src/main/resources/dz2/dz2.txt");
            pw.print(sb);
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
                    }
        finally {
            pw.close();
        }


    }
}
