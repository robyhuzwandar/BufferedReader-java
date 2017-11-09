
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {

    public static void main(String[] args) {

        BufferedReader InputData = new BufferedReader(new InputStreamReader(System.in));

        String nama = "";

        System.out.print("Masukkan nama : ");

        try {
            nama = InputData.readLine();
        } catch (IOException e) {
            System.out.println("Error !");

        }
        System.out.println("hello .. " + nama);
    }

}
