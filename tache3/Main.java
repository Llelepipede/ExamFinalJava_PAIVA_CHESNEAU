package m1.examen_final.tache3;

import m1.examen_final.tache2.Orange;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var testFile = new File("/");



        JavaIoManipulation.printFiles(testFile);

        System.out.println(JavaIoManipulation.totalSizeOfFiles(testFile));

        System.out.println(JavaIoManipulation.mostRecentFile(testFile));

        JavaIoManipulation.printFiles(testFile,"Program");



    }
}
