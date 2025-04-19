package org.knit.solutions.lab4.task11;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;

/**
 * Задача 11: Реализация системы уведомлений в биржевом приложении
 * Вы разрабатываете приложение для биржевой торговли, где пользователи могут подписываться на обновления акций определённых компаний.
 *
 * Требуется:
 *     Создать класс Stock (акция), который хранит информацию о текущей цене и может уведомлять подписчиков об изменении цены.
 *     Создать интерфейс StockObserver и реализовать его в классах MobileApp и EmailNotifier, которые получают уведомления при изменении цены.
 *     Реализовать механизм подписки и отписки для StockObserver.
 *
 * Пример работы:
 *     Пользователь подписывается на акции компании "Tesla".
 *     Когда цена акции изменяется, приложение отправляет уведомления подписчикам.
 *     Если пользователь отписался, он больше не получает уведомления.
 *
 * Дополнительно: Добавьте возможность подписки на акции нескольких компаний.
 */
@TaskDescription(taskNumber = 11, taskDescription = "Паттерн Observer (Наблюдатель)")
public class Task11 implements Solution {
    public void execute() {
//        User user1 = new User("Алексей");
//        User user2 = new User("Иван");
//        User user3 = new User("Александр");
        Stock tesla = new Stock("Tesla", 32.);
        Stock google = new Stock("Google", 64.);
        Stock microsoft = new Stock("Microsoft", 46.);

        MobileApp mobileApp1 = new MobileApp("Акционер");
        MobileApp mobileApp2 = new MobileApp("Акционщик");
        EmailNotifier emailNotifier1 = new EmailNotifier("Mail.ru");

        mobileApp1.Subscribe(tesla);
        mobileApp1.Subscribe(google);
        mobileApp2.Subscribe(google);
        mobileApp2.Subscribe(microsoft);
        emailNotifier1.Subscribe(microsoft);

        tesla.setPrice(33.);
        google.setPrice(64.);
        microsoft.setPrice(40.);

        mobileApp1.Unsubscribe(google);

        google.setPrice(40.);
    }
}
