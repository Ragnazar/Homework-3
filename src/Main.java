
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        var keyWord = 1;
        System.out.println(keyWord);
        byte byteVariable = 2;
        System.out.println(byteVariable);
        short shortVariable = 3;
        System.out.println(shortVariable);
        int integerVariable = 4;
        System.out.println(integerVariable);
        long thatIsABigOne = 999L;
        System.out.println(thatIsABigOne);
        float withFloatingPoint = 1.1f;
        System.out.println(withFloatingPoint);
        double withDoubleAccuracy = 1.21;
        System.out.println(withDoubleAccuracy);
        char symbol = '%';
        System.out.println(symbol);
        boolean bool = false;
        System.out.println(bool);
    }

    public static void task2() {
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float sumOfWeights = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Суммарный вес обоих боксеров составляет " + sumOfWeights + " кг.");

        float difOfWeights = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе боксеров составляет " + difOfWeights + " кг.");
    }

    public static void task3() {
        byte numberOfBananas = 5;
        short bananaWeight = 80;

        short milkPortion = 200 / 100;
        short milkPortionWeight = 105;

        byte countOfIceCreamPackages = 2;
        short iceCreamPackageWeight = 100;

        byte countOfEggs = 4;
        byte eggWeight = 70;

        int gramsInKg = 1000;
        int milkWeight = milkPortion * milkPortionWeight;

        int totalBreakfastWeight = numberOfBananas * bananaWeight + milkWeight + countOfIceCreamPackages * iceCreamPackageWeight + countOfEggs * eggWeight;
        double reducedWeight = (double) totalBreakfastWeight / gramsInKg;
        System.out.println("Вес спорт-завтрака составил " + reducedWeight + " кг.");
    }

    public static void task4() {
        short bottomLath = 250;
        short topLath = 500;
        byte toShredWeight = 7;
        int gramsInKg = 1000;

        double daysWithBottomLath = toShredWeight * Math.ceil((double) gramsInKg / bottomLath);
        System.out.println((int) daysWithBottomLath + " дней потребуется, если сбрасывать по " + bottomLath + " граммов в день");

        double daysWithTopLath = toShredWeight * Math.ceil((double) gramsInKg / topLath);
        System.out.println((int) daysWithTopLath + " дней потребуется, если сбрасывать по " + topLath + " граммов в день");

        double averageDaysTake = Math.ceil((daysWithTopLath + daysWithBottomLath) / 2);
        System.out.println("В среднем, чтобы скинуть " + toShredWeight + " кг, потребуется " + (int) averageDaysTake + " день");
    }

    public static void task5() {
        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfChristina = 76230;

        int incSalaryOfMasha = salaryOfMasha + salaryOfMasha / 10;
        int incSalaryOfDenis = salaryOfDenis + salaryOfDenis / 10;
        int incSalaryOfChristina = salaryOfChristina + salaryOfChristina / 10;

        int annualIncomeOfMasha = salaryOfMasha * 12;
        int annualIncomeOfDenis = salaryOfDenis * 12;
        int annualIncomeOfChristina = salaryOfChristina * 12;

        int newAnnualIncomeOfMasha = incSalaryOfMasha * 12;
        int newAnnualIncomeOfDenis = incSalaryOfDenis * 12;
        int newAnnualIncomeOfChristina = incSalaryOfChristina * 12;

        int difOfAnnualIncomeOfMasha = newAnnualIncomeOfMasha % annualIncomeOfMasha;
        int difOfAnnualIncomeOfDenis = newAnnualIncomeOfDenis % annualIncomeOfDenis;
        int difOfAnnualIncomeOfChristina = newAnnualIncomeOfChristina % annualIncomeOfChristina;

        System.out.println("Маша теперь получает " + incSalaryOfMasha + " рублей. Годовой доход вырос на " + difOfAnnualIncomeOfMasha + " рубля");
        System.out.println("Денис теперь получает " + incSalaryOfDenis + " рублей. Годовой доход вырос на " + difOfAnnualIncomeOfDenis + " рублей");
        System.out.println("Кристина теперь получает " + incSalaryOfChristina + " рубля. Годовой доход вырос на " + difOfAnnualIncomeOfChristina + " рублей");
    }

    private static void task6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result;
        result = a * (b + (c - d * e));
        System.out.println(result);
        int resultInverted = -result;
        System.out.println(resultInverted);
    }

    private static void task7() {
        int a = 5;
        int b = 7;
         a = a + b % a;
         b = 5;
        System.out.println(a+ " " + b);
    }

    private static void task8() {
        int a = 190;
        int b;
        b = a / 10;
        b = b % 10;
        System.out.println(b);
    }
}