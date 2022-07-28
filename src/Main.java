
public class Main {
    public static void main(String[] args) {
        //Задание 1
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

        //Задание 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float sumOfWeights = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Суммарный вес обоих боксеров составляет " + sumOfWeights + " кг.");
        float difOfWeights = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе боксеров составляет " + difOfWeights + " кг.");

        //Задание 3
        byte numberOfBananas = 5;
        short bananaWeight = 80;
        short milkVolume = 200;
        short milkPortionWeight = 105;
        byte countOfIceCreamPackages = 2;
        short iceCreamPackageWeight = 100;
        byte countOfEggs = 4;
        byte eggWeight = 70;
        int milkWeight = milkVolume/100 * milkPortionWeight;
        int totalBreakfastWeight = numberOfBananas * bananaWeight + milkWeight + countOfIceCreamPackages * iceCreamPackageWeight + countOfEggs * eggWeight;
        int reducedWeight = totalBreakfastWeight / 1000;
        System.out.println("Вес спорт-завтрака составил " + reducedWeight + " кг.");

        //Задание 4
        short bottomLath = 250;
        short topLath = 500;
        byte toShredWeight = 7;
        int daysWithBottomLath = toShredWeight * 1000 / bottomLath;
        System.out.println(daysWithBottomLath + " дней потребуется, если сбрасывать по " + bottomLath + " граммов в день");
        int daysWithTopLath = toShredWeight * 1000 / topLath;
        System.out.println(daysWithTopLath + " дней потребуется, если сбрасывать по " + topLath + " граммов в день");
        int averageDaysTake = (daysWithTopLath + daysWithBottomLath) / 2;
        System.out.println("В среднем, чтобы скинуть " + toShredWeight + " кг, потребуется " + averageDaysTake + " день");

        //Задание 5
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
}