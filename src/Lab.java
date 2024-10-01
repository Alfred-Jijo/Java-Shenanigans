import java.time.temporal.IsoFields;
import java.util.Scanner;

public class Lab {
    public static void Task2(Scanner reader) {
        System.out.printf("Room: (1-999):");
        int roomNo = Integer.parseInt(reader.nextLine());
        System.out.printf("\nPrice: (0.99-999.99):");
        float roomPrice = Float.parseFloat(reader.nextLine());
        System.out.println();

        System.out.printf("Room: %03d\nPrice: £%.2f", roomNo, roomPrice);
    }
}
