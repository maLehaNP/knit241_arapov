package org.knit.sem1.lab1;

import java.util.Arrays;

/***
 * Задача 2
 * protocol = https
 * address = test.ru
 * domainZone = ru
 * siteName = test
 * webpageName = page.jsp
 * webPageExtention = jsp
 */
public class Task2 {
    public static void execute() {
        String urlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        String[] urlSplit = urlValue.split(":");
        String[] domensSplit = urlSplit[1].split("/");
        String[] addressSplit = domensSplit[2].split("\\.");
        String[] lastSplit = domensSplit[domensSplit.length - 1].split("\\?");

        String protocol = urlSplit[0];
        String address = domensSplit[2];
        String domainZone = addressSplit[1];
        String siteName = addressSplit[0];
        String webpageName = lastSplit[0];
        String webPageExtention = lastSplit[0].split("\\.")[1];
        String dir = domensSplit[3] + "/" + domensSplit[4];
        String[] params = lastSplit[1].split("&");

        SimpleUrl url = new SimpleUrl();
        url.setProtocol(protocol);
        url.setAddress(address);
        url.setDomainZone(domainZone);
        url.setSiteName(siteName);
        url.setWebpageName(webpageName);
        url.setWebPageExtention(webPageExtention);
        url.setDir(dir);
        url.setParams(Arrays.toString(params));
        System.out.println(url);
    }
}
