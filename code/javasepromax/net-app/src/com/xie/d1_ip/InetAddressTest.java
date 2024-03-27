package com.xie.d1_ip;

import java.net.InetAddress;

/**
 * 目標: 掌握InetAddress類的使用
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception{
        // 1. 獲取本機IP地址對象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        // 2. 獲取指定IP或者域名的IP地址對象
        InetAddress ip2 = InetAddress.getByName("www.youtube.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        // ping www.youtube.com
        System.out.println(ip2.isReachable(4000));

    }
}
