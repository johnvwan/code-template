package com.itheima.code.build;

import freemarker.template.Template;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/****
 * @Author:shenkunlin
 * @Description:Dao构建
 * @Date 2019/6/14 19:13
 *****/
public class DaoBuilder {


    /***
     * 构建Dao
     * @param table
     * @param Table
     */
    public static void builder(String table,String Table){
        //生成Dao层文件
        BuilderFactory.builder(table,
                Table,
                "/template/dao",
                "Mapper.java",
                TemplateBuilder.PACKAGE_MAPPER,
                "Mapper.java");
    }

}
