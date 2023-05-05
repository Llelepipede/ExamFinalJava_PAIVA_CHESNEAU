package m1.examen_final.tache3;

import java.io.File;
import java.io.IOException;

interface FileAction {
    void perform(File file) throws IOException;
}