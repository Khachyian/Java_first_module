package javaCollections.optionalTask4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Занести стихотворение в список. Провести сортировку по возрастанию длин строк.

public class OptionalTask4 {
    private static final String POEM =
                    "В этот лес завороженный,\n"+
                    "По пушинкам серебра,\n"+
                    "Я с винтовкой заряженной\n"+
                    " На охоту шел вчера.\n"+
                    "По дорожке чистой, гладкой\n"+
                    "Я прошел, не наследил…\n"+
                    "Кто ж катался здесь украдкой?\n"+
                    "Кто здесь падал и ходил?\n";

    private static final Comparator<String> LINE_LENGTH = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(POEM.split("\n"));
        System.out.println(lines);

        Collections.sort(lines, LINE_LENGTH);
        System.out.println(lines);
    }

}
