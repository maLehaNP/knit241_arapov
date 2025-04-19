package org.knit.sem1.lab1;

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
