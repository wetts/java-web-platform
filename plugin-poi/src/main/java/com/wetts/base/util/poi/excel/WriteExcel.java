package com.wetts.base.util.poi.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;
import java.util.Map;

/**
 * @author 崔贝
 * @attention 用于写excel的工具类
 * @date 2013/12/16
 */
public class WriteExcel {
    /**
     * @explain 把数据data中匹配keys数组中表头的信息从第start行开始，写入resource表第sheetnum个sheet里
     * @attention 下标从0开始，如果结果想要HSSFWorkbook类型，使用第一个参数做结果，如果想要的结果是Workbook使用返回值做结果
     * @author 崔贝
     * @date 2013/12/6
     */
    public Workbook writeExcel(HSSFWorkbook resource, String[] keys, List<Map<String, Object>> data, int sheetnum, int start) {
        if (resource == null || keys == null || keys.length == 0 || data == null)
            return new HSSFWorkbook();
        for (int i = 0; i < keys.length; i++)
            if (keys[i] == null || keys[i].replace(" ", "").equals(""))
                return new HSSFWorkbook();
        int count = start;
        HSSFSheet sheet = resource.getSheetAt(sheetnum);
        if (sheet == null) return new HSSFWorkbook();
        HSSFRow row;
        HSSFCell cell;
        for (Map<String, Object> map : data) {
            row = sheet.getRow(count);
            if (row == null) row = sheet.createRow(count);
            for (int i = 0; i < keys.length; i++) {
                Object value = map.get(keys[i]);
                if (value == null) continue;
                cell = row.getCell(i);
                if (cell == null) cell = row.createCell(i);
                if (isNum(value.toString()))
                    cell.setCellValue(Double.parseDouble(value.toString()));
                else
                    cell.setCellValue(value.toString());
            }
            count++;
        }
        return resource;
    }

    /**
     * @explain 判断字符串source是否可以转化为double类型。
     * @author 崔贝
     * @date 2013/12/6
     */
    private boolean isNum(String source) {
        return source.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }
}
