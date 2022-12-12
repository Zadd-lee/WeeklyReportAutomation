package comm;

import comm.mention.Mention;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate testDate = LocalDate.of(2022, 12, 12);
        Mention mention = new Mention(testDate);

        System.out.println(mention.toString());

        try {
            InputStream in = System.in;
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader);

            String srt = br.readLine();
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}