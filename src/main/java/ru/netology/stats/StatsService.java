package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }


    public long calculateLastMaximum(long[] purchases) {
        int monthMax = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= purchases[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public long calculateLastMinimal(long[] purchases) {
        int monthMax = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] <= purchases[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public long calculateMonthsBelowTheAverage(long[] purchases) {
        long quantityMonths = 0;
        long average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase < average) {
                quantityMonths++;
            }
        }
        return quantityMonths;
    }

    public long calculateMonthsAboveTheAverage(long[] purchases) {
        long qualnityMonths = 0;
        long average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase > average) {
                qualnityMonths++;
            }
        }
        return qualnityMonths;
    }
}


