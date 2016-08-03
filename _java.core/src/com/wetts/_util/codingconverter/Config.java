package com.wetts._util.codingconverter;

/**
 * Config
 *
 * @author wetts
 * @date 2016/07/24
 */
public class Config {

    private String source = ".";

    private String target = "./target";

    private String sourceCoding = "GBK";

    private String targetCoding = "UTF-8";

    public static Config getDefaultConfig() {
        return new Config();
    }

    public Config setSource(String source) {
        this.source = source;
        return this;
    }

    public Config setTarget(String target) {
        this.target = target;
        return this;
    }

    public Config setSourceCoding(String sourceCoding) {
        this.sourceCoding = sourceCoding;
        return this;
    }

    public Config setTargetCoding(String targetCoding) {
        this.targetCoding = targetCoding;
        return this;
    }

    String getSource() {
        return source;
    }

    String getTarget() {
        return target;
    }

    String getSourceCoding() {
        return sourceCoding;
    }

    String getTargetCoding() {
        return targetCoding;
    }

}