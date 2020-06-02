import java.util.Scanner;

public class Console {
    public static void play() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Входной текст: ");
        String text = sc.nextLine();
        String outTextConsole = text;
        System.out.println();

        MyCounter.countMeeting(outTextConsole);
        StandartCounter.countMeeting(outTextConsole);

        System.out.print("Стандартная реализация: ");
        System.out.println(StandartCounter.countMeeting(outTextConsole));
        System.out.print("Своя реализация: ");
        System.out.println(MapCustom.outStr);

    }
}
