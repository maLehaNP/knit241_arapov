package org.knit.lab4;

import java.util.Arrays;
import java.util.Random;

class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength; // маскимальная длина слова в словаре
    private int minWordLength; // минимальная длина слова в словаре
    private char[] alphabet; // буквы алфавита
    private int[] frequency; //частота букв в словаре (в кадой ячейке хранит частоту букв, а индрес - это позиция буквы в alpabet)

    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        setDictionarySize(this.words.length);
//        Arrays.stream(words).count()
//        System.out.println(Arrays.stream(this.words).min(Comparator.naturalOrder()));
        /*for (int i = 0; i < alphabet.length; i++) {
            this.frequency[i] = this.alphabet[i];
        }*/
    }

    public void setDictionarySize(int dictionarySize) {
        this.dictionarySize = dictionarySize;
    }

    public void setFrequency(int[] frequency) {
        this.frequency = frequency;
    }

    /**
     * Возвращает случайное слово из словаря.
     * @return случайное слово из словаря.
     */
    public String getRandomWord() {
        Random rand = new Random();
        return words[rand.nextInt(words.length)];
    }
    /**
     * Выводит количество встречающихся букв.
     */
    public void printSymbolsStat() {
        /*
                Выведите количество встречающихся букв:
                Пример
                а - 100
                б - 10
                в - 12
                ...
                я - 1
         */

    }
}
