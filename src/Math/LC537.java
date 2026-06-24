package Math;

public class LC537 {
    public String complexNumberMultiply(String num1, String num2) {
        int[] c1 = parse(num1);
        int[] c2 = parse(num2);

        int a = c1[0], b = c1[1];
        int c = c2[0], d = c2[1];

        int real = a * c - b * d;
        int img = a * d + b * c;

        return real + "+" + img + "i";
    }

    private int[] parse(String s){
        int plus = s.indexOf('+');

        int real = Integer.parseInt(s.substring(0, plus));
        int img = Integer.parseInt(s.substring(plus + 1, s.length()-1));

        return new int[]{real, img};
    }
}
