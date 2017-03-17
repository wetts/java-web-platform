package com.wetts.base.utils.poi.excel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;

/**
 * @author 崔贝
 * @attention 用于读excel的工具类
 * @date 2014/02/07
 */
public class ReadExcel {
    /**
     * @explain 从wb表第sheetnum个页，第start行开始读出数据，写入键为key的List<Map>集合类
     * @param wb
     * @param sheetnum
     * @param start
     * @param key
     * @return
     * @author 崔贝
     * @date 2014/02/07
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static List<Map> getList(HSSFWorkbook wb, int sheetnum, int start, String key[]) {
        try {
            HSSFSheet sheet = wb.getSheetAt(sheetnum);
            if (sheet == null) return new ArrayList();
            List<Map> result = new ArrayList();
            for (int i = start; sheet.getRow(i) != null &&
                    sheet.getRow(i).getCell(0) != null &&
                    sheet.getRow(i).getCell(0).toString() != null &&
                    !sheet.getRow(i).getCell(0).toString().replace(" ", "").equals(""); i++) {
                HSSFRow row = sheet.getRow(i);
                Map map = new HashMap();
                for (int j = 0; j < key.length; j++) {
                    if (row.getCell(j) == null) map.put(key[j], "");
                    else map.put(key[j], row.getCell(j).toString());
                }
                result.add(map);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }
}
