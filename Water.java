package InitDnepr.pset1.water;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by d1mys1klapo4ka on 13.03.2017.
 */
public class Water{

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("minutes : ");

        int minutes = Integer.parseInt(reader.readLine());

        reader.close();

        System.out.println("boutles = " + minutes * 12);
    }
}
