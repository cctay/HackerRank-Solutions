/*
Given a string s, this challenge is to determine if the string is 'valid'. 
A string is only valid if all of its characters appear the same number of times,
or if 1 character can be removed to satisfy that condition.
*/

static String isValid(String s) 
{
    // Make an array of size 26 to represent each letter.
    int freq[] = new int[26];

    // Then increment the element corresponding to the character we're looking at in the string
    // 'a' is 97, so a-a is 0, while z-a is 25
    for(int i = 0; i < s.length(); i++)
    {
        freq[s.charAt(i) - 'a']++;
    }

    // Then we sort in increasing order 0-25
    Arrays.sort(freq);

    // We then loop to find the lowest non-zero character frequency
    int i = 0;
    while (freq[i] == 0)
    {
        i++;
    }

    // Variables for the smallest and largest character frequencies 
    int small = freq[i];
    int big = freq[25];

    // If the smallest frequency is the same as the biggest, condition 1 is met
    // 1: All characters appear the same number of times
    if (small == big)
        return "YES";

    // If not, check for condition 2
    // 2: Remove 1 character to satisfy condition 1
    // This could be the smallest (ex 1 while the rest are 2)
    // or the largest (ex 2 while the rest are 1)
    else
    {
        // If the lowest frequency is 1 and the second-lowest is the same as the highest
        // then only one character is too low.
        // If the highest is only 1 more than the lowest, and the frequency under it is
        // not also higher than the lowest, then only one character is too high
        if (((small == 1) && (freq[i+1] == big)) ||
        ((big - small == 1) && (freq[24] == small)))
        {
            return "YES";
        }
    }
    // If nothing checks out, the string is invalid
    return "NO";
}
