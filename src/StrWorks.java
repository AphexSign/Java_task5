import java.lang.reflect.Array;
import java.util.Arrays;

public class StrWorks {

    //    Написать метод для поиска самого длинного слова в тексте.
    public void checkLongestWord(String str) {
        System.out.println("Изначальная строка: " + str);
        //Обрабатываем строку str: помещаем в массив строк наши слова.
        String[] arrStr = str.split(" ");
        int[] lengthArr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            lengthArr[i] = arrStr[i].length();
        }
        //Будем искать максимальное значение. И запоминать позицию "tmpPos"
        int tmpvalue = lengthArr[0];
        //Позиция вспомогательной переменной
        int tmpPos = 0;
        //Проход по массиву длин строк, цель - найти макс. значение
        for (int j = 0; j < lengthArr.length; j++) {
            if (tmpvalue < lengthArr[j]) {
                tmpvalue = lengthArr[j];
                tmpPos = j;
            }
        }
        //Вывод результата
        System.out.println("Самое длинное слово - " + arrStr[tmpPos] + " его позиция в массиве: " + tmpPos);
        System.out.println("\n");
    }

    //    Написать метод, который проверяет является ли слово палиндромом. Например BOB, ROOR, ZXC1CXZ
    public void checkPalindrom(String str) {
        //Решение можно сделать при помощи StringBuilder, но мы пойдем другим путем.
        //Переменная для будущей зеркальной строки
        String strTmp = "";
        //Создаем массив символов из исходной строки
        char[] chrArr = str.toCharArray();
        //Создаем зеркальную копию строки
        for (int i = chrArr.length - 1; i >= 0; i--) {
            strTmp += chrArr[i];
        }
        //Сравнение строк через Equals
        if (str.equals(strTmp)) {
            System.out.println("Исходное слово: " + str + " зеркально слову: " + strTmp + " - ПАЛИНДРОМ");
        } else {
            System.out.println("Исходное слово: " + str + " не зеркально слову: " + strTmp + " - НЕ ПАЛИНДРОМ");
        }
        System.out.println("\n");
    }

//    Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

    public void checkMeanWord(String str, String meanword) {

        String tmpstr = str.replace(meanword, "[вырезано цензурой]");
        System.out.println(tmpstr);
    }

    //    Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
    public void checkContainsValue(String str, String substr) {

        int count = 0;
        //Пока субстрока есть в строке
        while (str.contains(substr)) {
            //Будем заменять по-шагово каждый подобный элемент
            str = str.replaceFirst(substr, "");
            count++;
        }
        System.out.println("Число вхождений подстроки в строку: " + count);
        System.out.println("\n");
    }

//    Напишите метод, который инвертирует слова в строке.
//    Предполагается, что в строке нет знаков препинания,
//    и слова разделены пробелами.
//    Sample Output:
//    The given string is: This is a test string
//    The string reversed word by word is:
//    sihT si a tset gnirts

    public void invertWords(String str) {

        //Проходим по массиву. Берем каждый элемент и инвертируем его
        //Восстанавливаем назад строку из массива строк, добавляя пробел
        System.out.println("The given string is: " + str);
        //Обрабатываем строку str: помещаем в массив строк наши слова.
        String[] arrStr = str.split(" ");
        String strTmp = "";

        //Проходим по массиву. Берем каждый элемент и инвертируем его
        for (int i = 0; i < arrStr.length; i++) {

            char[] chrArr = arrStr[i].toCharArray();
            //Создаем зеркальную копию слова
            for (int j = chrArr.length - 1; j >= 0; j--) {
                strTmp += chrArr[j];
            }
            arrStr[i] = strTmp;
            strTmp = "";
        }
        //Склеиваем строку
        strTmp = "";
        for (int k = 0; k < arrStr.length; k++) {
            strTmp += arrStr[k] + " ";
        }
        System.out.println("The string reversed word by word is: " + strTmp);

    }

}
