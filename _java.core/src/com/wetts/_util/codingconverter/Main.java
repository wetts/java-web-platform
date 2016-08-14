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
                        .setSource("/Users/wetts/work/_workspace/Java/_learning/designMode").setSourceCoding("GBK")
                        .setTarget("/Users/wetts/work/_workspace/Java/_learning/test").setTargetCoding("UTF-8")).convert();
    }

}
