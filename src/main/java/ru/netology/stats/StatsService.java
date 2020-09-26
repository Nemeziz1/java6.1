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
        long average = 0;
        long sum = 0;
        long quantity = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        for (long purchase : purchases) {
            quantity = quantity + 1;
        }
        average = sum / quantity;
        return average;
    }

    public long calculateLastMaximum(long[] purchases) {
        long max = purchases[0];
        for (long purchase : purchases) {
            if (max <= purchase) {
                max = purchase;
            }
        }
        return max;
    }

    public long calculateLastMinimal(long[] purchases) {
        long min = purchases[0];
        for (long purchase : purchases) {
            if (min >= purchase) {
                min = purchase;
            }
        }
        return min;
    }

    public long calculateMonthsBelowTheAverage(long[] purchases) {
        long quantityMonths = 0;
        long average = 15;
        for (long purchase : purchases) {
            if (purchase < average) {
                quantityMonths = quantityMonths + 1;
            }
        }
        return quantityMonths;
    }

    public long calculateMonthsAboveTheAverage(long[] purchases) {
        long qualnityMonths = 0;
        long average = 15;
        for (long purchase : purchases) {
            if (purchase > average) {
                qualnityMonths = qualnityMonths + 1;
            }
        }
        return qualnityMonths;
    }
}

