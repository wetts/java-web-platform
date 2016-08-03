package com.wetts._util.codingconverter;


import com.wetts._util.FileUtil;

import java.io.*;

/**
 * Converter
 * <p>
 * 文件编码转换并输出
 * 运用IO
 *
 * @author wetts
 * @date 2016/07/23
 */
public class Converter implements IConverter {

    private Config config;

    private File source;

    private BufferedReader reader;

    private PrintWriter writer;

    public Converter() {
        this.config = Config.getDefaultConfig();
    }

    public Converter(Config config) {
        this.config = config;
    }

    public boolean convert() {
        source = new File(config.getSource());
        if(!source.exists()) {
            return false;
        } else {
            return recursive(source);
        }
    }

    private boolean recursive(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for(File f : files) {
                recursive(f);
            }
        } else if (file.isFile()) {
            String relativePath = FileUtil.getRelativePath(source, file);
            File target = new File(config.getTarget() + "/" + relativePath);
            FileUtil.makeDir(target.getParentFile());

            if(target.exists()) {
                target.delete();
            }

            try {
                int byteread = 0;
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), config.getSourceCoding()));
                writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(target), config.getTargetCoding()));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    writer.println(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return true;
    }

}
