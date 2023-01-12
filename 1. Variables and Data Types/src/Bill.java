import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser : ");
        float eraser = sc.nextFloat();
        float gst = (float) ((pen + pencil + eraser)*0.18);
        System.out.println();
        System.out.println("Bill");
        System.out.println("Pencil : " + pencil);
        System.out.println("Pen : " + pen);
        System.out.println("Eraser : " + eraser);
        System.out.println("GST: " + gst);
        float total = pencil+pen+eraser+gst;
        System.out.println("Total : " + total);
    }
}
