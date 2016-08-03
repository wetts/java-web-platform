package com.wetts._api.io.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * FileDemo
 *
 * @author wetts
 * @date 2016/07/31
 */
public class FileDemo {

    @Test
    public void testPath() {
        File file = new File("/Users/wetts/work/_workspace/Java/_learning/com/../..");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------");

        File file2 = file.getParentFile().getParentFile().getParentFile();
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        try {
            System.out.println(file2.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCreateFile() {
        File file = new File("/Users/wetts/work/_workspace/Java/_learning/comAAA");
        file.mkdir();
    }

}
