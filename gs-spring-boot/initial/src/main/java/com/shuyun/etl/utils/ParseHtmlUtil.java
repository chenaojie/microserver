package com.shuyun.etl.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseHtmlUtil {
    private static final String path = "D:/project/朗姿/crm数据存储格式.html";
    public List<List<String>> getContent(String filepath){
        File input = new File(filepath);
        List<List<String>> res = new ArrayList<List<String>>();
        try {
            Document doc = Jsoup.parse(input, "UTF-8");
            //获取body
            Element body = doc.body();
            //获取tr
            Elements trs= body.getElementsByTag("tr");
            //移除第一行字段名标签
//            trs.remove(0);
            for (Element tr : trs){
                //获取一个tr中的所有td
                Elements tds = tr.getElementsByTag("td");
                ArrayList<String> arrayList = new ArrayList<String>();
                for (int j=0; j<tds.size();j++){
                    Element td = tds.get(j);
                    //解析出来的内容空格转换
                    String id = td.html().replaceAll("&nbsp;"," ");
                    arrayList.add(id);
                }
                res.add(arrayList);
                break;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(res);
        File bak = new File(filepath.concat(".bak"));
        input.renameTo(bak);
        return res;
    }

    public static void main(String[] args) {
        ParseHtmlUtil p = new ParseHtmlUtil();
        p.getContent(path);
    }
}
