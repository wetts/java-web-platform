/**
 * Copyright (c) 2014-2015 爱维宝贝web端团队   All rights reserved
 * <p>
 * Base on awframework,powered by aiwei web team
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.wetts.base.utils.poi.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFName;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDao {
    /**
     * @explain 根据路径获取Excel文件的工作薄对象
     * @attention 对IO异常和文件不存在异常进行了处理，返回空工作薄而不是抛出异常
     * @author 崔贝
     * @date 2013/12/6
     */
    public static HSSFWorkbook getHSSFWorkbook(String path) {
        HSSFWorkbook wb = null;
        try {
            wb = new HSSFWorkbook(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (wb == null) ? new HSSFWorkbook() : wb;
    }

    public static HSSFWorkbook getHSSFWorkbook(InputStream excelFile) {
        if (excelFile == null) return null;
        try {
            return new HSSFWorkbook(excelFile);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 创建名称
     *
     * @param wb
     * @param name
     * @param expression
     * @return
     */
    public static HSSFName createName(HSSFWorkbook wb, String name, String expression) {
        HSSFName refer = wb.getName(name);
        //如果不存在名称，创建名称
        if (refer == null) {
            refer = wb.createName();
            refer.setNameName(name);
        }
        //为名称写入新的表达式
        refer.setRefersToFormula(expression);
        return refer;
    }

    /**
     * 从spring文件中获得工作簿
     *
     * @return
     */
    public Workbook getWorkbook(File file) {
        String fileName = file.getName();
        //获取文件扩展名
        String extName = fileName.substring(fileName.lastIndexOf("."));
        try {
            if ("xlsx".equals(extName)) {
                return new XSSFWorkbook(file);
            }
            if ("xls".equals(extName)) {
                return new HSSFWorkbook(new FileInputStream(file));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        return null;
    }
}
