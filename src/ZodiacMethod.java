class ZodiacMethod {
    static void printSign(int day, String month) {
        String sign;
        if (day >=21 && month.equals("january") || day <=19 && month.equals("february")){
            sign = "Aquarius";
        } else if (day >=20 && month.equals("february") || day <=20 && month.equals("march")) {
            sign = "Pisces";
        } else if (day >=21 && month.equals("march") || day <=20 && month.equals("april")) {
            sign = "Aries";
        } else if (day >= 21 && month.equals("april") || day <=21 && month.equals("may")) {
            sign = "Bull";
        } else if (day >= 22 && month.equals("may") || day <=21 && month.equals("june")) {
            sign = "Gemini";
        } else if (day >= 22 && month.equals("june") || day <=22 && month.equals("july")) {
            sign = "Cancer";
        } else if (day >=23 && month.equals("july") || day <= 22 && month.equals("august")) {
            sign = "Leo";
        } else if (day >= 23 && month.equals("august") || day <= 22 && month.equals("september")) {
            sign = "Virgo";
        } else if (day >= 23 && month.equals("september") || day <= 22 && month.equals("october")) {
            sign = "Libra";
        } else if (day >= 23 && month.equals("october") || day <= 21 && month.equals("november")) {
            sign = "Scorpius";
        } else if (day >= 22 && month.equals("november") || day <= 21 && month.equals("december")) {
            sign = "Sagittarius";
        } else if (day >= 22 && month.equals("december") || day <=20 && month.equals("january")) {
            sign = "Capricornus";
        } else {
            throw new IllegalArgumentException("Wrong input! Try again");
        }
        System.out.println("Result: " + sign);
    }
}
