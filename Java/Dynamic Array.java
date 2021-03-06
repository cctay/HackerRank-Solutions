/*
Given a number of queries, n, and a list of lists containing them, queries,
this challenge is to manipulate a list of lists given a formula.
Queries look like this:
1 0 5
2 1 0
*/

static List<Integer> dynamicArray(int n, List<List<Integer>> queries) 
{
    // Variable to track lastAnswer
    // List of Integer List like queries
    // Integer List for return
    int lastAnswer = 0;
    ArrayList<ArrayList<Integer>> listy = new ArrayList<>();
    List<Integer> result = new ArrayList<Integer>();

    // Initialize the list of lists with n lists
    for (int i = 0; i < n; i++) 
    {
        listy.add(new ArrayList<Integer>());
    }

    // Evaluate each query
    for (List<Integer> b : queries) 
    {
        // Variables for the first, second, and third number of each query
        // New ArrayList to access the one at the list-of-list's index 
        // as computed by the sequence formula
        int w = b.get(0);
        int x = b.get(1);
        int y = b.get(2);
        ArrayList<Integer> sequence = listy.get((x ^ lastAnswer) % n);

        // If the first number in the query is 1, append the last number of it to this sequence
        if (w == 1) 
        {
            sequence.add(y);
        }

        // If the first number is 2, set lastAnswer equal to its formula
        // Then add it to the result list to be returned
        else 
        {
            lastAnswer = sequence.get(y % sequence.size());
            result.add(lastAnswer);
        }
    }
    return result;
}
