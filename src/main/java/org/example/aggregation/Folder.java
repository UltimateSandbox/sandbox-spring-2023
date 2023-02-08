package org.example.aggregation;

import java.util.*;

public class Folder {

    List<File> files = new ArrayList<>();

    public Folder() {

        for(int x = 1; x <= 10; x++) {

            // composition
            files.add(new File());
        }
        System.out.println("Number of files: " + files.size());
    }

    public Folder(File[] f) {

        Collections.addAll(files, f);
        System.out.println("Number of files: " + files.size());

    }

}
