package functionalInterface;

import java.util.function.BiPredicate;

public class Predicate {

    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("07070707"));
        System.out.println(isPhoneNumberValid("09909090909"));

        System.out.println("with predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
        isPhoneNumberValidPredicate.and(constainsNumber3).test("07039892837")
        );
        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.or(constainsNumber3).test("07049892847")
        );





    }


    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    static java.util.function.Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static java.util.function.Predicate<String> constainsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
