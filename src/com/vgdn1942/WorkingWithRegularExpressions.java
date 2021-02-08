package com.vgdn1942;

public class WorkingWithRegularExpressions {
    static String sentence = "\tНа другой день простившись только с одним графом,\n" +
            "не дождавшись выхода дам, князь Андрей поехал домой.\n" +
            "\tУже было начало июня, когда князь Андрей, возвращаясь домой,\n" +
            "въехал опять в ту берёзовую рощу, в которой этот старый,\n" +
            "корявый дуб так странно и памятно поразил его.\n" +
            "Бубенчики ещё глуше звенели в лесу, чем полтора месяца тому назад;\n" +
            "все было полно, тенисто и густо; и молодые ели, рассыпанные по лесу,\n" +
            "не нарушали общей красоты и, подделываясь под общий характер,\n" +
            "нежно зеленели пушистыми молодыми побегами.\n" +
            "\tЦелый день был жаркий, где-то собиралась гроза,\n" +
            "но только небольшая тучка брызнула на пыль дороги и на сочные листья.\n" +
            "Левая сторона леса была темна, в тени; правая мокрая,\n" +
            "глянцовитая блестела на солнце, чуть колыхаясь от ветра.\n" +
            "Все было в цвету; соловьи трещали и перекатывались то близко, то далеко.\n" +
            "\t«Нет, жизнь не кончена в 31 год, вдруг окончательно,\n" +
            "беспеременно решил князь Андрей. Мало того, что я знаю всё то,\n" +
            "что есть во мне, надо, чтобы и все знали это: и Пьер, и эта девочка,\n" +
            "которая хотела улететь в небо, надо, чтобы все знали меня,\n" +
            "чтобы не для одного меня шла моя жизнь, чтоб не жили они так\n" +
            "независимо от моей жизни, чтоб на всех она отражалась и\n" +
            "чтобы все они жили со мною вместе!»";

    public static void main(String[] args) {
        // Абзацы
        for (String s : sortParagraph(sentence)) {
            System.out.println(s);
        }
        // Предложения
        for (String s : sortParagraph(sentence)) {
            for (String t : sortSentence(s)) {
                System.out.println(t);
            }
        }
        // Слова
        for (String s : sortParagraph(sentence)) {
            for (String t : sortSentence(s)) {
                for (String u : sortWord(t)) {
                    System.out.println(u);
                }
            }
        }
    }
    static String[] sortParagraph(String str) {
        String[] strArray = str.split("[\\t]+");
        Sort sort = new Sort();
        return sort.sortStr(strArray);
    }
    static String[] sortSentence(String str) {
        String[] strArray = str.split("[.!?]+");
        Sort sort = new Sort();
        return sort.sortStr(strArray);
    }
    static String[] sortWord(String str) {
        String[] strArray = str.split("[\\s,.!?;:«»]+");
        Sort sort = new Sort();
        return sort.sortStr(strArray);
    }
}

class Sort {
    public String[] sortStr(String[] str) {
        return sortString(str);
    }
    private String[] sortString(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1 - i; j++) {
                if (strArray[j].length() > strArray[j + 1].length()) {
                    String str = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = str;
                }
            }
        }
//        for (String s : strArray) {
//            System.out.println(s);
//        }
        return strArray;
    }
}