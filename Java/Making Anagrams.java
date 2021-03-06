/*
Given two strings, a and b, this challenge is to find how many characters in both 
strings need to be deleted so that they match each other.
*/

static int makeAnagram(String a, String b) 
{
    // Variable to track number of deletions needed
    // Make an array of size 26 to represent each letter
    int count = 0;
    int freq[] = new int[26];

    // Then increment the element corresponding to the character we're looking at in the string
    // 'a' is 97, so a-a is 0, while z-a is 25
    for (int i = 0; i < a.length(); i++)
    {
        freq[a.charAt(i) - 'a']++;
    }

    // String b must have the same letters as a to be an anagram
    // Decrement the element corresponding to its characters
    // An element of 0 means neither string had it or both had it in equal frequencies
    // An element of 1 means String a had the letter but not b
    // An element of -1 means String b had the letter but not a
    for (int i = 0; i < b.length(); i++) 
    {
        freq[b.charAt(i) - 'a']--;
    }

    // Loop through the array and count the absolute value of all elements
    for (int value : freq)
    {
        count += Math.abs(value);
    }
    // Return how many deletions were needed
    return count;
}
