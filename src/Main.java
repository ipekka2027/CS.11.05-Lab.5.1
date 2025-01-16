import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        int sum = 0;
        for (int i : totalWasteKgPerCapitaPerYear) sum += i;
        return (int) Math.round((double) sum / totalWasteKgPerCapitaPerYear.length);
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        int sum = 0;
        for (int i : householdEstimatesKgPerCapitaPerYear) sum += i;
        return (int) Math.round((double) sum / householdEstimatesKgPerCapitaPerYear.length);
    }

    //ipek
    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        int sum = 0;
        for (int i : householdEstimatesTonnesPerYear) {
            sum += i;
        }
        return (int) (10 * Math.round((double) sum / householdEstimatesTonnesPerYear.length)) / 10;
    }


    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        int sum = 0;
        for (int i : retailEstimatesKgPerCapitaPerYear) {
            sum += i;
        }
        return (int) Math.round(sum * 1.0 / retailEstimatesKgPerCapitaPerYear.length);
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        int sum = 0;
        for (int i : retailEstimatesTonnesPerYear) {
            sum += i;
        }
        return (int) Math.round(sum * 1.0 / retailEstimatesTonnesPerYear.length);
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        int sum = 0;
        for (int i : foodServiceEstimatesKgPerCapitaPerYear) sum += i;
        return (int) Math.round((double) sum / foodServiceEstimatesKgPerCapitaPerYear.length);
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        int sum = 0;
        for (int i : foodServiceEstimatesTonnesPerYear) sum += i;
        return (int) Math.round((double) sum / foodServiceEstimatesTonnesPerYear.length);
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        int length = totalWasteKgPerCapitaPerYear.length;
        if (length % 2 == 1) {
            return totalWasteKgPerCapitaPerYear[length / 2];
        } else {
            return (totalWasteKgPerCapitaPerYear[length / 2 - 1] + totalWasteKgPerCapitaPerYear[length / 2]) / 2;
        }
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        int sum = 0;
        for (int i : householdEstimatesKgPerCapitaPerYear)
            sum += i;
        return (int)
                Math.round(((double) sum / householdEstimatesKgPerCapitaPerYear.length) + 0.5);
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        Arrays.sort(householdEstimatesTonnesPerYear);
        int length =
                householdEstimatesTonnesPerYear.length;
        int median;
        if (length % 2 == 0) {
            median = (householdEstimatesTonnesPerYear[length / 2 - 1]) + (householdEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            median = householdEstimatesTonnesPerYear[length / 2];
        }
        return median;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        Arrays.sort(retailEstimatesKgPerCapitaPerYear);
        int length = retailEstimatesKgPerCapitaPerYear.length;
        if (length % 2 == 1) {
            return retailEstimatesKgPerCapitaPerYear[length / 2];
        } else {
            return (retailEstimatesKgPerCapitaPerYear[length / 2 - 1] + retailEstimatesKgPerCapitaPerYear[length / 2]) / 2;
        }
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        Arrays.sort(retailEstimatesTonnesPerYear);
        int length = retailEstimatesTonnesPerYear.length;
        int med;
        if (length % 2 == 0) {
            med = (retailEstimatesTonnesPerYear[length / 2 - 1] + retailEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            med = retailEstimatesTonnesPerYear[length / 2];
        }
        return med;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        Arrays.sort(foodServiceEstimatesTonnesPerYear);
        int length = foodServiceEstimatesTonnesPerYear.length;
        if (length % 2 == 0) {
            return (foodServiceEstimatesTonnesPerYear[length / 2 - 1] + foodServiceEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            return foodServiceEstimatesTonnesPerYear[length / 2];
        }
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        int min = Integer.MAX_VALUE;
        for (int i : totalWasteKgPerCapitaPerYear) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        int min = Integer.MAX_VALUE;
        for (int value : householdEstimatesKgPerCapitaPerYear) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        int min = Integer.MAX_VALUE;
        for (int value : householdEstimatesTonnesPerYear) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        int min = Integer.MAX_VALUE;
        for (int value : retailEstimatesKgPerCapitaPerYear) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        int min = Integer.MAX_VALUE;
        for (int value : retailEstimatesTonnesPerYear) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        int min = Integer.MAX_VALUE;
        for (int value : foodServiceEstimatesKgPerCapitaPerYear) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        if (foodServiceEstimatesTonnesPerYear == null || foodServiceEstimatesTonnesPerYear.length == 0) {
            return -1;
        }
        int minEstimate = foodServiceEstimatesTonnesPerYear[0];
        for (int estimate : foodServiceEstimatesTonnesPerYear) {
            if (estimate < minEstimate) {
                minEstimate = estimate;
            }
        }
        return minEstimate;
    }

    /**
     * Max Methods
     */

    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        int result = 0;
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        if (totalWasteKgPerCapitaPerYear.length % 2 == 1) {
            result = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length / 2];
        } else if (totalWasteKgPerCapitaPerYear.length % 2 == 0) {
            int num1 = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length / 2];
            int num2 = totalWasteKgPerCapitaPerYear[(totalWasteKgPerCapitaPerYear.length / 2) + 1];
            result = (num1 + num2) / 2;
        }
        return result;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
       return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;

    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(country)) {
                index = i;
            }
        }
        return totalWasteKgPerCapitaPerYear[index];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int[] sortedWaste = totalWasteKgPerCapitaPerYear.clone();
        Arrays.sort(sortedWaste);

        for (int i = 0; i < totalWasteKgPerCapitaPerYear.length; i++){
            System.out.print(totalWasteKgPerCapitaPerYear[i] + " ");
        }
        System.out.println();
        int largest = sortedWaste[sortedWaste.length - 1];
        System.out.println(largest);
        int index = 0;

        for (int i = 0; i < totalWasteKgPerCapitaPerYear.length; i++) {
            if (totalWasteKgPerCapitaPerYear[i] == largest) {
                System.out.println("found");
                index = i;
                break;
            }
        }
        return countries[index];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty) {
        double highestPoverty = 0;
        int count = 0;
        int index = 0;

        for (double percentage : percentagesShareInPoverty) {
            if (percentage > highestPoverty) highestPoverty = percentage;
        }

        for (double percentage : percentagesShareInPoverty) {
            if (percentage == highestPoverty) count++;
        }

        String[] result = new String[count];
        for (int i = 0; i < countries.length; i++) {
            if (percentagesShareInPoverty[i] == highestPoverty) {
                result[index++] = countries[i];
            }
        }

        return result;
    }


    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences) {
        int count = 0;
        int index = 0;

        for (String confidence : confidences) {
            if ("High Confidence".equals(confidence)) count++;
        }

        String[] result = new String[count];
        for (int i = 0; i < countries.length; i++) {
            if ("High Confidence".equals(confidences[i])) {
                result[index++] = countries[i];
            }
        }

        return result;
    }

}
