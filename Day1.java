import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        BufferedReader reader;
        List<Integer> values=new ArrayList<Integer>();
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\sample.txt"));
            String line = reader.readLine();

            while (line != null) {
                int x = 0;
                while(true)
                {
                    if(line !=null)
                    {


                    if(line.length()!=0)
                    {
                        x+= Integer.parseInt(line);
                        line = reader.readLine();
                    }
                    else
                    {
                        line = reader.readLine();
                        break;
                    }
                    }
                }

                values.add(x);
               // System.out.println(line);
                if(line.length()==0)
                {
                    System.out.println("hi");
                }
                // read next line

            }
            System.out.println(values);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
