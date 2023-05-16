public class StringProject {
    private String myString;

    public StringProject(String str) {
        myString = str;
    }

    // Method 1: returns the String in which lowercase becomes uppercase, & uppercase becomes lowercase
    public String reverseCase() {
        char[] chars = myString.toCharArray();  // Convert the string to a character array
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);  // Convert the character array back to a string and return it
    }


    // Method 2: method that will return the number of times a character is in the String
    public int characterCount(char c) {
        int response = 0;
        char[] chars = myString.toCharArray();

        for (int i=0; i<myString.length(); i++)
            {
                // checking character in string
                if (myString.charAt(i) == c)
                    response++;
            }
        return response;

    }

    // Method 3: return a String in which each word in the String is on a separate line
    public String reverseString() {
        return new StringBuilder(myString).reverse().toString();
    }

    // Method 4: will return a String in which each word in the String is on a separate line
    public String eachWordOnALine() {
        return myString.replace(" ", "\n");
    }

    // Method 5: will return the number of words in the String
    public int wordCount() {
        return myString.split("\\s+").length;
    }

    // Method 6: will return the number of characters (not including white spaces) in the String
    public int characterCount() {
        return myString.replaceAll("\\s+", "").length();
    }

    // Method 7:  will return the average word length in the String
    public double avgWordLength() {
        String[] words = myString.split("\\s+");
        int sum = 0;
        for (String word : words) {
            sum += word.length();
        }
        return (double) sum / words.length;
    }

    // Method 8: will return the vowel count in the String
    public long vowelCount() {
        return myString.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    // Method 9:  will return the number of times a sub-string (a method parameter) occurs in the String
    public int substrCount(String str) {
        return myString.split(str, -1).length - 1;
    }

    // Method 10  will return true if a String is a Palindrome, or false otherwise
    public boolean isPalindrome() {
        String cleaned = myString.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }


    @Override
    public String toString() {
        return myString;
    }
}
