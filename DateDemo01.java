package com.du.a02dateandcollection;
/*
* 企业开发中（java ,bigData） 日期
* 日期类的层是  有一个log值   学名UTC时间
* 1970年 1月1日  00：00：00开始  计算时间
* 日期类   有2个包， sql/ util, 我们用util包下日期
* */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        //定义日期
        Date date = new Date();
        System.out.println("date = " + date);// data 为什么会输出 Wed Jul 14 09:48:16 CST 2021？？？
        //to string 被改写了 ...  可重新改为我么们自己的时间
        long time = date.getTime(); //获得  真实的时间  ，long值
        System.out.println("time = " + time); // 1626227740887 (等于  2021-07-14) +10天
        //date.setTime(3626227355767L);
       // System.out.println("date = " + date);
        //查看10天后是那一天
       time = time+1000*60*60*60*24*10L;
       date.setTime(time);
        System.out.println("date = " + date);
        //修改 日期显示格式
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String pattern1 = "yyyy/MM-dd/ HH:mm:ss";
        String pattern2 = "yyyy/MM-dd/";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String  chinaDateStr = sdf.format(date);
        System.out.println("chinaDateStr = " + chinaDateStr);
        //字符串  -->  转日期
        String  dateStr = "2018-09-97 :23:13:45";
        try{
            Date parse = sdf.parse(dateStr);
            System.out.println("parse = " + parse);

            }catch (ParseException e){
            System.out.println("");
            e.printStackTrace();
        }
          }
        }

