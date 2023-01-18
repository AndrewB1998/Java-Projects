package fi.utu.tech.exercise1.task1;

public class Utilities {


    public static Integer average(int[] values) {
        /** Laskee kokonaislukujen keskiarvon ja palauttaa kokonaisluvun
         * @.pre values != null
         * @.post FORALL(value:values; sum += value)
         *        RESULT.equals(sum/values.length || null)
         **/
        if (values == null || values.length == 0) return null;
        int sum = 0;
        for (var value : values) sum += value;
        return sum / values.length;
    }

    public static String toOct(int number) {
        /** Laskee kokonaisluvun jakojäännöksen, lisää sen String-olioon ja jakaa sen kahdeksalla. Toistuu niin kauan kauan kun luku > 0
         * @.pre number > 0
         * @.post ture
         **/
        String tmp = "";
        do {
            tmp = (number % 8) + tmp;
            number /= 8;
        } while (number > 0);
        return tmp;
    }

    public static String rot13(String input) {
        /** Vaihtaa syötteen kirjainkerrallaan 13 kirjainta eteenpäin
         * @.pre true
         * @.post FORALL(i: 0 <= i <= input.length();
         *          input.CharAt(i) == RESULT.CharAt(i+13)
         *
         **/
        String tmp = "";
        for (var c : input.toCharArray())
            tmp += (char) (c + 13 * (
                    c >= 'a' && c <= 'm' ? 1 :
                    c >= 'A' && c <= 'M' ? 1 :
                    c >= 'n' && c <= 'z' ? -1 :
                    c >= 'N' && c <= 'Z' ? -1 : 0));
        return tmp;
    }
}
