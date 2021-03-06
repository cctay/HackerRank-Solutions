/*
Given an array of toy prices and a budget k, this challenge is to find out how many
items can be bought without going over the budget.
*/

static int maximumToys(int[] prices, int k)
{
    // Track total price and number of items that can be bought with the given budget
    int total = 0, num = 0;

    // Sort array in ascending order
    Arrays.sort(prices);

    // Loop through prices array
    for (int i = 0; i < prices.length; i++)
    {
        // If the current price can be added to the running total without going over the budget
        // Do so and increment how many items can be bought
        if (total + prices[i] <= k)
        {
            total += prices[i];
            num++;
        }
        // Otherwise, we don't need to check any further and can stop looping
        else
            break;
    }

    // Return how many items can be bought with the given budget
    return num;
}
