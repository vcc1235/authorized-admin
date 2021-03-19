package com.xct.auth.generator;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;

public class Generator {

    public static void main(String[] args) {
        try {
            generator();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void generator() throws Exception {
        generator("/generatorConfig.xml", true);
    }

    public static void generator(boolean overwrite) throws Exception {
        generator("/generatorConfig.xml", overwrite);
    }
    /**
    * desc: 自动生成
    * date: 2021/3/19
    */
    public static void generator(String xml, boolean overwrite) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        InputStream resource = Generator.class.getResourceAsStream(xml);
        ConfigurationParser configurationParser = new ConfigurationParser(arrayList);
        Configuration configuration = configurationParser.parseConfiguration(resource);
        resource.close();
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, defaultShellCallback, arrayList);
        myBatisGenerator.generate(null);
        for (String warning : arrayList){
            System.out.println(warning);
        }
    }



}
