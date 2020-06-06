public class IntToRim {
    public static String convert(int in) {
        StringBuffer a = new StringBuffer("");
       // Выделяем сотню
        int c1 = in / 100;
        a.append(C(c1));

        // преобразовываем десятки
        int c2 = in % 100;
        int l1 = c2 / 50;
        int l2 = c2 % 50;
        a.append(L(l1,l2));
        // остаток
        int x2 = c2 % 10;

        // Выделяем то что осталось
        a.append(basic(x2));
        return a.toString();
    }

    // преобразовываем сотню
    private static String C(int in) {
         if (in != 0) return "C"; // если 100 то 100
         else return "";
    }
    // преобразоывываем десятки
    private static String L(int in1, int in2) {
        if (in2 == 40) {
          if (in1 == 1) return "XC"; // если 90 то 100 - 10
          else return "XL";}  // если 40 то 50-10
        else {
            StringBuffer a = new StringBuffer("");
            if (in1 == 1) a.append("L");
            for (int i = 0; i < in2 / 10; i++)
               a.append("X");
            return a.toString();
        }

    }
    // От 1 до 9, то что осталось
    private static String basic(int in) {
        String[] a = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
        };
        return a[in];
    }
}