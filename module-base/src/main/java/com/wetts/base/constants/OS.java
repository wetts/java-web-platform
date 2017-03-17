package com.wetts.base.constants;

/**
 * 常量
 *
 * @author wetts
 * @create 2016-1-29
 */
public enum OS {

    WINDOWS, MAC, LINUX, UNIX;

    public static OS getOS(String osName) {
        if(osName == null && "".equals(osName.trim()))
            throw new RuntimeException("系统名称不能为空");

        if (osName.toUpperCase().indexOf(OS.WINDOWS.toString()) != -1) {
            return WINDOWS;
        } else if (MAC.toString().equals(osName)) {
            return MAC;
        } else if (LINUX.toString().equals(osName)) {
            return LINUX;
        } else if (UNIX.toString().equals(osName)) {
            return UNIX;
        } else {
            return null;
        }
    }

}
