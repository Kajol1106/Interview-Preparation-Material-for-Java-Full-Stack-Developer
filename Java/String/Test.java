package String;

class Test {

    public static String mask(String creditCard) {
        String x = "xxxx-xxxx-xxxx-".toUpperCase();
        StringBuilder sb = new StringBuilder(creditCard);
        //return x+sb.substring(15, 19);
        //return x+creditCard.substring(15, 19);

        StringBuilder sb2 = new StringBuilder(x);
        sb2.append(creditCard, 15, 19);
        return sb2.toString();
    }

    public static void main(String[] args) {
        System.out.println(mask("1234-3456-1234-6543"));
    }
}
