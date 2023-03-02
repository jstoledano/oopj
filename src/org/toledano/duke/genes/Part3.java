package org.toledano.duke.genes;

public class Part3 {
    private boolean twoOccurrences(String stringa, String stringb) {
        boolean result = false;

        int firstMatch = stringb.indexOf(stringa);
        int secondMatch = stringb.indexOf(stringa, firstMatch + stringa.length());
        if (firstMatch > 0 && secondMatch > 0) result = true;

        return result;
    }

    private String lastPart(String stringa, String stringb) {
        int firstIndex = stringb.indexOf(stringa);
        if (firstIndex == -1) return stringb;
        return stringb.substring(firstIndex+stringa.length());
    }

    public void testing() {
        String a2 = " story by Abby Long";
        String a1 = "by";

        String b1 = "a";
        String b2 = "banana";

        String c1 = "atg";
        String c2 = "ctgtatgta";

        System.out.println("The result is " + twoOccurrences(a1, a2));
        System.out.println("The result is " + twoOccurrences(b1, b2));
        System.out.println("The result is " + twoOccurrences(c1, c2));

        System.out.println("an, banana := " + lastPart("an", "banana"));
        System.out.println("zoo, forest := " + lastPart("zoo", "forest"));
    }
}
