public class Main {
    public static void main(String[] args) {

        String str = "This is a test string";
        StrWorks strWorks = new StrWorks();

        //1. Самое длинное слово в строке
        strWorks.checkLongestWord(str);
        //2. Палиндром ли слово?
        strWorks.checkPalindrom("BOOAOOB");
        strWorks.checkPalindrom("BOOA1OB");
        //3. Замена не подходящего слова
        strWorks.checkMeanWord("У меня есть бяка", "бяка");
        //4. Проверка кол-ва вхождений подстроки
        strWorks.checkContainsValue("У меня есть книга книга книга.", "книга");
        //5. Инверсия слов в строке
        strWorks.invertWords("This is a test string");

    }
}
