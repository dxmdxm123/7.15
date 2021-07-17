package com.du.a02dateandcollection;

import java.util.Calendar;

/*
*日历类
* 使用场景   项目中 ： 疫苗预约
* 常用的APP  美柚7  疫苗预约    入职日期计算  旅游模块
*创建对象  ---->  new 出来的
* 对象如果不能被（无参）new  1)无参构造私有化 可能是单例模式
*   2）该类可能是个  接口/抽象类  date的大部分功能   是date的升级版
*
* */
public class CalendaeDemo01 {
    public static void main(String[] args) {
        //创建对象  不仅仅只有  new  还有类的实例方法
      // calendar 比date 牛x ,,,calendar功能上包含了  date 的大部分功能  是date的升级版
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        //日历可以  进行计算 比如  add
        //增加年份  增加10年  比如  ：买保险 加多少年 ，结婚纪念日..
        calendar.add(Calendar.YEAR,10);
        System.out.println("calendar.getTime = " + calendar.getTime());
        //加月份
        calendar.add(Calendar.MONTH,1);
        //加天
        calendar.add(Calendar.DAY_OF_YEAR,1);
        //减去一天
        calendar.add(Calendar.DAY_OF_YEAR,-1);
        //比如  设置当周的周五日期
        //calendar.add(Calendar.DAY_OF_WEEK,Calendar.FEBRUARY);
        System.out.println("calendar.getTime = " + calendar.getTime());
        //还能计算每个月份的最大值  5月份的最大值是31
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("days = " + days);//31

        // - ---   日历  get 方法     日历的   其他获取方法
        // 如： 查询今年多少天
         int i = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("i = " + i);
        //查询今天周几  因为阳历是  国外的， 从  周日开始
        int i1 = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("i1 = " + i1);
        //今天是周3
        //今天是周三
        String[] weeks={"周日","周一","周二","周三","周四","周五","周六",};
        int i2 = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("今天是： " + weeks[i2]);
        // 获取 月份 注意  月份从0开始
        int i3 = calendar.get(Calendar.MONTH)+1;
        System.out.println("i3 = " + i3);
        //日历的 set
        //设置 2008年
        calendar.set(Calendar.YEAR,2008);
        System.out.println("calendar = " + calendar);
        //设置月份
        calendar.set(Calendar.MONTH,Calendar.APRIL);//月份从0开始
        System.out.println("calendar = " + calendar.getTime());
        //设置 week....

    }
}
