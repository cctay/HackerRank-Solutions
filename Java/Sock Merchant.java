/*
Given an array of colored socks, ar, and the length of the array, n, this
challenge is to find how many pairs of colored socks exist.
*/

static int sockMerchant(int n, int[] ar) 
{
    // Variable to store number of pairs
    // ArrayList to count colors
    int pairs = 0;
    ArrayList<Integer> listy = new ArrayList<Integer>();

    // Loop through color array
    for (int i = 0; i < n; i++)
    {
        // If the current color is already in the ArrayList, this is the second and so we have a pair.
        // Remove the color so if it's found again, it will be the "first" found as part of a new pair.
        if (listy.contains(ar[i]))
        {
            pairs++;
            listy.remove(new Integer(ar[i]));
        }
        // If the current color is not in the ArrayList, add it as the first in a new pair.
        else
        {
            listy.add(ar[i]);
        }
    }
    // Return how many pairs were found
    return pairs;
}
