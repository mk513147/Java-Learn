// You are given a 2D integer array logs where each logs[i] = [birthi, deathi]
// indicates the birth and death years of the ith person.

// The population of some year x is the number of people alive during that year.
// The ith person is counted in year x's population if x is in the inclusive
// range [birthi, deathi - 1]. Note that the person is not counted in the year
// that they die.

// Return the earliest year with the maximum population.
public class MaxPopulationYear {

    public static void main(String[] args) {
        int[][] logs = { { 1993, 1999 }, { 2000, 2010 } };
        System.out.println("Maximum Population in Year: " + maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] logs) {
        int[] population = new int[101];

        for (int[] log : logs) {
            int birthIndex = log[0] - 1950;
            int deathIndex = log[1] - 1950;
            population[birthIndex] += 1;
            population[deathIndex] -= 1;
        }

        int maxPop = population[0];
        int maxYear = 1950;
        for (int i = 1; i < 101; i++) {
            population[i] += population[i - 1];
            if (population[i] > maxPop) {
                maxPop = population[i];
                maxYear = 1950 + i;
            }
        }
        return maxYear;
    }
}