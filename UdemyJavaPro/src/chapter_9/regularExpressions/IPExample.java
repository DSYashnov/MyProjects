package chapter_9.regularExpressions;

import java.util.regex.Pattern;

public class IPExample {
void checkIP(String ip) {
    String regx = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" + "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

    //"(25[0-5]  |   2[0-4]\\d   |   [01]?\\d?\\d)   (\.)"
    //250-255    |   200-249     |   0-199

    System.out.println(ip + " is OK? " + Pattern.matches(regx, ip));
}

    public static void main(String[] args) {
//        0-255.0-255.0-255.0-255

        String ip = "255.255.255.255";
        String ip1 = "192.168.01.01";

        IPExample ipExample = new IPExample();
        ipExample.checkIP(ip);
        ipExample.checkIP(ip1);
    }
}
