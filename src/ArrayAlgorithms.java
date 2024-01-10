public class ArrayAlgorithms
{
    /**
     * Prints each String in wordList, on its own line, followed by “!”.
     * Does NOT mutate (modify) wordList.
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList)
    {
        /*
        for(int i = 0; i < wordList.length; i++)
        {
            System.out.println(wordList[i] + "!");
        }
        */
        for(String word : wordList)
        {
            System.out.println(word + "!");
        }
    }

    /** Adds a “!” to the end of each String in wordList (does not print).
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList)
    {
        for(int i = 0; i < wordList.length; i++)
        {
            wordList[i] = wordList[i] + "!";
        }
    }

    /** Returns the sum of all values in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find sum
     *  @return  the sum of all numbers in the list
     */
    public static int sum(int[] numList)
    {
        int sum = 0;
        /*
        for(int i = 0; i < numList.length; i++)
        {
            sum = sum + numList[i];
        }
        */
        for(int num : numList)
        {
            sum = sum + num;
        }
        return sum;
    }

    /** Returns the average of all values in numList, as a double.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find average
     *  @return  the average of all numbers in the list
     *
     *  Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList)
    {
        double average = (double) sum(numList) / numList.length;
        return average;
    }

    /** Returns the value in numList that represents the minimum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find minimum
     *  @return  the minimum value in the array
     */
    public static int minimum(int[] numList)
    {
        int minimum = numList[0];
        /*
        for(int i = 0; i < numList.length; i++)
        {
            if(numList[i] < minimum)
            {
                minimum = numList[i];
            }
        }
        */
        for(int num : numList)
        {
            if(num < minimum)
            {
                minimum = num;
            }
        }
        return minimum;
    }

    /** Returns the value in numList that represents the maximum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find maximum
     *  @return  the maximum value in the array
     */
    public static int maximum(int[] numList)
    {
        int maximum = numList[0];
        /*
        for(int i = 0; i < numList.length; i++)
        {
            if(numList[i] > maximum)
            {
                maximum = numList[i];
            }
        }
        */
        for(int num : numList)
        {
            if(num > maximum)
            {
                maximum = num;
            }
        }
        return maximum;
    }

    /** Multiplies each number in numList by multiplier.
     *  DOES mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers, modified by method
     *  @param multiplier  number to multiply each element in numList
     */
    public static void multiplyBy(int[] numList, int multiplier)
    {
        for(int i = 0; i < numList.length; i++)
        {
            numList[i] = numList[i] * multiplier;
        }
    }

    /** Returns a NEW array containing the squares of the elements in the original
     *  numList array, in the same position.
     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers to be squared
     *  @return  new array containing squares of the values in numList
     */
    public static int[] squares(int[] numList)
    {
        int[] squares = new int[numList.length];
        for(int i = 0; i < numList.length; i++)
        {
            squares[i] = numList[i] * numList[i];
        }
        return squares;
    }

    /** Switches each boolean value in boolList to its opposite value; true values
     *  becomes false, and false values become true.
     *  DOES mutate (modify) original boolList.
     *  PRECONDITION: boolList.length > 0
     *
     *  @param boolList  original array of booleans, modified by method
     */
    public static void flipBool(boolean[] boolList)
    {
        for(int i = 0; i < boolList.length; i++)
        {
            if(boolList[i])
            {
                boolList[i] = false;
            }
            else
            {
                boolList[i] = true;
            }
        }
    }

    /** Returns a String representing the array of ints as a printable String,
     *  including open and closing brackets, with values separated by commas.
     *  This method should function identically to Arrays.toString()!

     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints to be represented in String form
     */
    public static String customToString(int[] numList)
    {
        String array = "[";
        for(int i = 0; i < numList.length; i++)
        {
            if(i == (numList.length - 1))
            {
                array = array + numList[i] + "]";
            }
            else
            {
                array = array + numList[i] + ", ";
            }
        }
        return array;
    }

    /** Returns the length of the longest String(s) in an array of Strings.
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  length of the longest String in the array
     */
    public static int longestString(String[] stringList)
    {
        int longestLength = stringList[0].length();
        for(String string : stringList)
        {
            if(string.length() > longestLength)
            {
                longestLength = string.length();
            }
        }
        return longestLength;
    }

    /** Changes all words in an array of words to uppercase.
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void makeUppercase(String[] wordList)
    {
        for(int i = 0; i < wordList.length; i++)
        {
            wordList[i] = wordList[i].toUpperCase();
        }
    }
}