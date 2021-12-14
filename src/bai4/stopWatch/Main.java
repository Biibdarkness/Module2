package bai4.stopWatch;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch1 = new StopWatch();
        long total = 0;
        stopWatch1.start();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        scanner.next();
        stopWatch1.stop();
        System.out.println(stopWatch1.getElapsedTime()+"ms");
    }
}
