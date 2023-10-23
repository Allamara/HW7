public class Main {
    public static void main(String[] args) {

// TASK_1
        int sum = 15_000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total += sum;
            total += (int) (sum * 1.01);
            System.out.println("В месяце " + month + " сумма накоплений равна " + total + " рублей.");
            month++;
        }
        System.out.println();

// TASK_2
        int variable = 1;
        while (variable < 10) {
            variable++;
            System.out.print(variable + " ");
        }
        System.out.println();

        for (; variable > 0; variable--) {
            System.out.print(variable + " ");
        }
        System.out.println();

// TASK_3
        {
            int population = 12_000_000;
            for (int year = 1; year <= 0; year++) {
                int birthRate = population / 1000 * 17;
                int deathRate = population / 1000 * 8;
                population = population + birthRate - deathRate;
                System.out.println("В " + year + " году численность населения составляет " + population + " человек.");
            }
            System.out.println();
        }

// TASK_4
        {
            int deposit = 15_000;
            int summary = deposit;
            int oneMonth = 1;
            while (summary < 12_000_000) {
                summary = summary + (summary / 100 * 7);
                System.out.println("В месяце " + oneMonth + " сумма вклада равна " + summary);
                oneMonth++;
            }
            System.out.println();
        }

// TASK_5
        int deposit = 15_000;
        int summary = deposit;
        int oneMonth = 1;
        while (summary < 12_000_000) {
            summary = summary + (summary / 100 * 7);
            if (month % 6 == 0) {
                System.out.println("В месяце " + oneMonth + " сумма вклада равна " + summary);
            }
            oneMonth++;
        }
        System.out.println();

// TASK_6
        {
            int money = 15_000;
            for (int eachMonth = 1; eachMonth < 9 * 12; eachMonth++) {
                money = money + (money / 100 * 7);
                if (eachMonth % 6 == 0) {
                    System.out.println("В месяце " + eachMonth + " сумма вклада равна " + money);

                }
            }
        }

// TASK_7

            for (int friday = 2; friday <= 31; friday += 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Неоходимо подготовить отчёт");
            }

// TASK_8
            {
                int startYear = 2023 - 200;
                int endYear = 2023 + 100;
                for (int year = startYear; year < endYear; year++) {
                    if (year % 79 == 0) {
                        System.out.println(year);
                    }
                }
            }

    }
}