/*
Given arrays of the whole words in a magazine and a ransom note, this challenge
is to see if it is possible for the ransom note to be constructed using words
cut out of the magazine.
*/

static void checkMagazine(String[] magazine, String[] note) 
{
    // Map to track words and their frequencies
    Map<String, Integer> words = new HashMap<String, Integer>();

    // Add all words from magazine, incrementing frequencies if found more than once
    for (String mag : magazine)
    {
        if (words.containsKey(mag))
        {
            words.put(mag, words.get(mag)+1);
        }
        else
        {
            words.put(mag, 1);
        }
    }

    // Add all words from note with -1 as frequency, decrementing for all words already in map
    for (String rob : note) 
    {
        if (words.containsKey(rob)) 
        {
            words.put(rob, words.get(rob)-1);
        }
        else
        {
            words.put(rob, -1);
        }
    }

    // If the value of a word is less than 0, the magazine doesn't have enough of it
    for (int value : words.values())
    {
        if (value < 0)
        {
            System.out.println("No");
            return;
        }
    }
    // If all values are zero or greater, a ransom note can be formed
    System.out.println("Yes");
}
