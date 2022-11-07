public class WordScramble {
    public static void main(String[] args) {
        System.out.println(hasPattern("TAN"));
        System.out.println(hasPattern("AARDVARK"));
        System.out.println(hasPattern("ABABAB"));
        System.out.println(hasPattern("BOZO"));
        System.out.println(hasPattern("JKJKLJKLFGGGGGGGA"));
        System.out.println(hasPattern("AAAB"));
        System.out.println();

        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("AARDVARK"));
        System.out.println(scrambleWord("ABABAB"));
        System.out.println(scrambleWord("BOZO"));
        System.out.println(scrambleWord("JKFLDSJKLDJSKLAHAHAHJJAB"));
        System.out.println(scrambleWord("AA"));
    }

    public static boolean hasPattern(String word) {
        boolean pattern = false;
        for (int i = 0; i <= word.length()-1; i++) {
            String letter = word.charAt(i) + "";
            String letterAfter = "";
            if (i != word.length()-1) {
                letterAfter = word.substring(i+1, i+2);
            }
            if (letter.equals("A") && (!(letterAfter.equals("A"))) && (i != word.length() - 1)) {
                return true;
            }
        }
        return pattern;
    }

    public static String scrambleWord(String word) {
        String scrambled = "";
        for (int i = 0; i <= word.length()-1; i++) {
            String letter = word.charAt(i) + "";
            String letterAfter = "";
            if (i != word.length()-1) {
                letterAfter = word.substring(i+1, i+2);
            }
            if ( letter.equals("A") && (!(letterAfter.equals("A"))) ) {
                scrambled += (letterAfter + letter);
                i++;
            } else {
                scrambled += letter;
            }
        }
        return scrambled;
    }
}