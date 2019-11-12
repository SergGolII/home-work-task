package com.hillel.basic.exam;

/**
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
 * Jaden is also known for some of his philosophy that he delivers via Twitter.
 * When writing on Twitter, he is known for almost always capitalizing every word.
 * <p>
 * Your task is to convert strings to how they would be written by Jaden Smith.
 * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 * <p>
 * Example:
 * <p>
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * <p>
 * Note that the Java version expects a return value of null for an empty string or null.
 */
public class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.equals("")) {
            phrase = null;
        } else {
            phrase = phrase.toUpperCase().charAt(0) + phrase.substring(1);
            for (int i = 0; i < phrase.length() - 1; i++) {
                if (phrase.charAt(i) == ' ') {
                    phrase = phrase.substring(0, i + 1) + phrase.substring(i + 1, i + 2).toUpperCase() + phrase.substring(i + 2);
                }
            }
        }
        return phrase;
    }
}
