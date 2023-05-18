package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataHelper {
    private static Faker faker = new Faker(new Locale("ru"));

    private DataHelper() {
    }

    public static String getFirstCardNumber() {
        return "4444 4444 4444 4441";
    }

    public static String getSecondCardNumber() {
        return "4444 4444 4444 4442";
    }

    public static String getStatusFirstCard() {
        return "APPROVED";
    }

    public static String getStatusSecondCard() {
        return "DECLINED";
    }

    public static String getValidMonth() {
        return "06";
    }

    public static String getValidYear() {
        return "25";
    }

    public static String getValidOwner() {
        return faker.name().fullName();
    }

    public static String getValidCvc() {
        return "111";
    }

    public static String getLetter() {
        return "Иванова Алёна";
    }

    public static String getDoubleNameOfOwner() {
        return "Иванова Анна-Мария ";
    }

    public static String getLessThan16DigitsInCard() {
        return "1234 5678 9123 45";
    }

    public static String getMoreThan16DigitsInCard() {
        return "1234 5678 9123 4567 8";
    }

    public static String get16ZerosInCard() {
        return "0000 0000 0000 0000";
    }

    public static String getSymbolsText() {
        return "@&,";
    }

    public static String getEmptyFieldInCard() {
        return "";
    }

    public static String getSymbolsTextInMonth() {
        return "@&,";
    }

    public static String getMonthNumberMore12() {
        return "20";
    }

    public static String getMonthFieldEmpty() {
        return "";
    }

    public static String getYearFieldPrevious() {
        return "22";
    }

    public static String getMoreThan6YearsOfTheCurrentYear() {
        return "29";
    }

    public static String getYearZero() {
        return "00";
    }

    public static String getSymbolsTextInYear() {
        return "@&,";
    }

    public static String getYearFieldEmpty() {
        return "";
    }

    public static String getOnNameOwnerOnly() {
        return "Ivanov";
    }

    public static String getSymbolsTextInOwner() {
        return "@&,";
    }

    public static String getOwnerFieldEmpty() {
        return "";
    }

    public static String getCvcZero() {
        return "00";
    }

    public static String getSymbolsTextInCvc() {
        return "@&,";
    }

    public static String getCvcFieldEmpty() {
        return "";
    }
}

