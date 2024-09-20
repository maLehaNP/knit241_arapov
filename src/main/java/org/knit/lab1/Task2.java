package org.knit.lab1;

import java.lang.reflect.Array;
import java.util.Arrays;

/***
 * Задача 2
 * Создайте класс SimpleUrl
 * глядя на URL ниже создайте как можно больше полей в классе SimpleUrl:
 * https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText
 * добавьте геттеры и сеттеры для полей
 * Переопределите метод toString() для вывода информации о полях класса:
 * protocol = https
 * address = test.ru
 * domainZone = ru
 * siteName = test
 * webpageName = page.jsp
 * webPageExtention = jsp
 * ....
 * Распарсите данный URL на переменные, создайте экземпляр класса SimpleUrl и выведите на экран
 * Дополнительно
 * попробуйте с другими URL в сети, подумайте как можно сгруппировать значения.
 *
 */
public class Task2 {
    public class SimpleUrl {
        private String protocol;
        private String address;
        private String domainZone;
        private String siteName;
        private String webpageName;
        private String webPageExtention;

        public void setProtocol(String a) {
            protocol = a;
        }

        public void setAddress(String a) {
            address = a;
        }

        public void setDomainZone(String a) {
            domainZone = a;
        }

        public void setSiteName(String a) {
            siteName = a;
        }

        public void setWebpageName(String a) {
            webpageName = a;
        }

        public void setWebPageExtention(String a) {
            webPageExtention = a;
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

        public String toString() {
            String s = "protocol = " + protocol + "\n";
            return s;
        }
    }

    public void execute() {
        String urlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        String[] urlSplit = urlValue.split(":");
        urlSplit[1].split("/");
        System.out.println(Arrays.toString(urlSplit));

         String protocol = urlSplit[1];
         /*address = test.ru
         domainZone = ru
         siteName = test
         webpageName = page.jsp
         webPageExtention = jsp*/

        /*SimpleUrl url = new SimpleUrl();
        url.setAddress(address);
        url.setProtocol(protocol);
        System.out.println(url);*/
    }
}
