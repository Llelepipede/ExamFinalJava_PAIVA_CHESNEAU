package m1.examen_final.tache3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

public class JavaIoManipulation {

    static public void printFiles(File file){
        if (file.exists()){
            if (file.isDirectory())
                for (String filename:
                     file.list()) {
                    System.out.println(filename);
                }
        }
    }

    // la surcharge de fonction c'est quand
    // pour un meme nom de fonction, plusieur
    // definition de fonction existe en changeant
    // les paramètres de chacune d'entre elle.
    // dans l'exemple de file, le contructeur de
    // file est lui aussi surchargé.

    static public long totalSizeOfFiles(File file) throws IOException {
        long ret = 0;

        if (file.exists()){
            if (file.isDirectory()){
                for (String filename:
                        file.list()) {
                    File currentFile = new File(file+filename);
                    if (currentFile.isFile()){
                        ret += Files.size(currentFile.toPath());
                    }

                }
            }
        }
        return ret;
    }

    static public String mostRecentFile(File file) throws IOException {
        String ret = null;

        if (file.exists()) {
            if (file.isDirectory()) {
                long max = 0;
                for (String filename :
                        file.list()) {
                    File currentFile = new File(file + filename);
                    if (currentFile.isFile() || currentFile.isDirectory()) {
                        FileTime currentTime = Files.getLastModifiedTime(currentFile.toPath(), LinkOption.NOFOLLOW_LINKS);
                        if (currentTime.toMillis() > max){
                            max = currentTime.toMillis();
                            ret = currentFile.getPath();
                        }
                    }

                }
            }
        }
        return ret;
    }


//    static public void printFiles(File file, String prefix){
//        if (file.exists()){
//            if (file.isDirectory())
//                for (File currentfile:
//                        file.listFiles((dir, name1) -> name1.startsWith(prefix))) {
//                    System.out.println(currentfile.getName());
//                }
//        }
//    }

    private static void applyActionOnFiles(File dir,String prefix,FileAction action) throws IOException {
        for (File currentFile:
                dir.listFiles((rep, name1) -> name1.startsWith(prefix))) {
                    action.perform(currentFile);
        }
    }

    static public void printFiles(File file, String prefix) throws IOException {
        if (file.exists()){
            if (file.isDirectory())
                applyActionOnFiles(file, prefix,(current) -> System.out.println(current.getName()) );
        }
    }

//    static public String mostRecentFile(File file,String prefix) throws IOException {
//        String ret = null;
//
//        if (file.exists()) {
//            if (file.isDirectory()) {
//                applyActionOnFiles(file,prefix, (current)-> ret != null ? Files.getLastModifiedTime(current.toPath()).toMillis() > Files.getLastModifiedTime(new File(ret).toPath()).toMillis()? ret =  current.getName() : ret = ret : ret = ret;
//                                ;
//
//                        ;
//
//                )
//            }
//        }
//        return ret;
//    }
}
