package com.xie.d13_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class Test7_Period {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2029,9,10);
        LocalDate end = LocalDate.of(2029,12,25);


        // 1. 建造Period對象，封裝兩個日期對象
        // public static Period between(LocalDate start, LocalDate end)
        Period period = Period.between(start, end);

        // 2. 通過period對象獲取兩個日期相差的訊息
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
