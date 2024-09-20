package org.knit.lab1;

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
    public class SimpleUrl {
        private String protocol;
        private String address;
        private String domainZone;
        private String siteName;
        private String webpageName;
        private String webPageExtention;
        private String dir;
        private String params;

        public void setProtocol(String s) {
            protocol = s;
        }

        public void setAddress(String s) {
            address = s;
        }

        public void setDomainZone(String s) {
            domainZone = s;
        }

        public void setSiteName(String s) {
            siteName = s;
        }

        public void setWebpageName(String s) {
            webpageName = s;
        }

        public void setWebPageExtention(String s) {
            webPageExtention = s;
        }

        public void setDir(String s) {
            dir = s;
        }

        public void setParams(String s) {
            params = s;
        }

        public String getProtocol() {
            return protocol;
        }

        public String getAddress() {
            return address;
        }

        public String getDomainZone() {
            return domainZone;
        }

        public String getSiteName() {
            return siteName;
        }

        public String getWebpageName() {
            return webpageName;
        }

        public String getWebPageExtention() {
            return webPageExtention;
        }

        public String getDir() {
            return dir;
        }

        public String getParams() {
            return params;
        }

        public String toString() {
            return "protocol = " + protocol + "\n" +
                    "address = " + address + "\n" +
                    "domainZone = " + domainZone + "\n" +
                    "siteName = " + siteName + "\n" +
                    "webpageName = " + webpageName + "\n" +
                    "webPageExtention = " + webPageExtention + "\n" +
                    "dir = " + dir + "\n" +
                    "params = " + params;
        }
    }

    public void execute() {
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
