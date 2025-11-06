public class AgeValidation {
    public static boolean validateAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(validateAge("25"));
        System.out.println(validateAge("12"));
        System.out.println(validateAge("abc"));
    }
}
