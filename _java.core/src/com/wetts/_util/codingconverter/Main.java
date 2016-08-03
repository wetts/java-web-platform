package com.wetts._util.codingconverter;

/**
 * Main
 *
 * @author wetts
 * @date 2016/07/31
 */
public class Main {

    public static void main(String[] args) {
        new Converter(
                new Config()
                        .setSource("/Users/wetts/work/_workspace/Java/_learning/java.core").setSourceCoding("UTF-8")
                        .setTarget("/Users/wetts/work/_workspace/Java/_learning/comAAA").setTargetCoding("GBK")).convert();
    }

}
