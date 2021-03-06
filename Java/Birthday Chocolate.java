/*
Given a List representing a chocolate bar, s, each square of which has an integer on it,
a number that consecutive squares need to sum to, d, and how many consecutive squares
need to be added to reach that sum, m, this challenge is to find how many subsets of size
m exist in the List that sum to d.
*/

static int birthday(List<Integer> s, int d, int m) 
{
    // Variables for the sum of consecutive chocolate squares
    // and how many piece combos exist that sum to d
    int matches = 0;
    int sum = 0;

    // Loop through the chocolate bar List
    for (int i = 0; i <= s.size()-1; i++)
    {
        // Save our spot in the list and sum this element with the next m-1 elements
        int j = i;
        if (i + (m-1) <= s.size()-1)
        {
            // Reset sum for each chunk of the bar tested 
            // Find the sum for this chunk
            sum = 0;
            while (i < j+m)
            {
                sum += s.get(i);
                i++;
            }

            // If the sum is equal to d, we have a match
            if (sum == d)
                matches++;
        }
        // Return to our spot in the List for the next loop
        i = j;
    }
    // Return how many matches exist
    return matches;
}
