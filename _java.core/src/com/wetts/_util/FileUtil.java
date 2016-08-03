package com.wetts._util;

import java.io.File;
import java.io.IOException;

/**
 * FileUtil
 *
 * @author wetts
 * @date 2016/07/28
 */
public class FileUtil {

    public static boolean makeDir(File file) {
        if (!file.exists()) {
            file.mkdirs();
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取相对路径
     *
     * @param base 基础路径
     * @param file 文件所在路径
     * @return
     */
    public static String getRelativePath(File base, File file) {
        return getRelativePath(base, file, "");
    }

    private static String getRelativePath(File base, File file, String path) {
        if (isSubfile(base, file)) {
            try {
                path = file.getCanonicalPath().substring(base.getCanonicalPath().length() + 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            path = "../" + getRelativePath(base.getParentFile(), file, path);
        }
        return path;
    }

    /**
     * 是不是子文件夹
     *
     * @param file1 基础文件路径
     * @param file2 文件路径
     * @return
     */
    private static boolean isSubfile(File file1, File file2) {
        try {
            String file1Path = file1.getCanonicalPath() + "/";
            String file2Path = file2.getCanonicalPath();
            return file2Path.indexOf(file1Path) >= 0 && file1Path.length() != file2Path.length();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        File f1 = new File("/Users/wetts/work/_workspace/Java/_learning/com/aaa/bbb/dda.txt");
        File f2 = new File("/Users/wetts/work/_workspace/Java/_learning/comAAA");
        System.out.println(getRelativePath(f1, f2, ""));
    }

}
