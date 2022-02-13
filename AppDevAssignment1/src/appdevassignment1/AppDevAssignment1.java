/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdevassignment1;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// --------------------------------------------------------------------
// Assignment 1
// Written by: Shahe Bannis 2051001
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
public class AppDevAssignment1 {

    // http://www.gutenberg.org/cache/epub/19033/pg19033.txt
    protected static final String[][][] book = {
        {
            {"ALICE was beginning to get very tired of sitting by her sister on the\n",
                "bank, and of having nothing to do. Once or twice she had peeped into the\n",
                "book her sister was reading, but it had no pictures or conversations in\n",
                "it, \"and what is the use of a book,\" thought Alice, \"without pictures or\n",
                "conversations?\"\n"},
            {"So she was considering in her OWN mind (as well as she could, for the\n",
                "day made her feel very sleepy and stupid), whether the pleasure of\n",
                "making a daisy-chain would be worth the trouble of getting up and\n",
                "picking the daisies, when suddenly a White Rabbit with pink eyes ran\n",
                "close by her.\n"},
            {"There was nothing so very remarkable in that, nor did Alice think it so\n",
                "very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\n",
                "dear! I shall be too late!\" But when the Rabbit actually took a watch\n",
                "out of its waistcoat-pocket and looked at it and then hurried on, Alice\n",
                "started to her feet, for it flashed across her mind that she had never\n",
                "before seen a rabbit with either a waistcoat-pocket, or a watch to take\n",
                "out of it, and, burning with curiosity, she ran across the field after\n",
                "it and was just in time to see it pop down a large rabbit-hole, under\n",
                "the hedge. In another moment, down went Alice after it!"}
        },
        {
            {"\"WHAT a curious feeling!\" said Alice. \"I must be shutting up like a\n",
                "telescope!\"\n"},
            {"And so it was indeed! She was now only ten inches high, and her face\n",
                "brightened up at the thought that she was now the right size for going\n",
                "through the little door into that lovely garden.\n"},
            {"After awhile, finding that nothing more happened, she decided on going\n",
                "into the garden at once; but, alas for poor Alice! When she got to the\n",
                "door, she found she had forgotten the little golden key, and when she\n",
                "went back to the table for it, she found she could not possibly reach\n",
                "it: she could see it quite plainly through the glass and she tried her\n",
                "best to climb up one of the legs of the table, but it was too slippery,\n",
                "and when she had tired herself out with trying, the poor little thing\n",
                "sat down and cried.\n"},
            {"\"Come, there's no use in crying like that!\" said Alice to herself rather\n",
                "sharply. \"I advise you to leave off this minute!\" She generally gave\n",
                "herself very good advice (though she very seldom followed it), and\n",
                "sometimes she scolded herself so severely as to bring tears into her\n",
                "eyes.\n"},
            {"Soon her eye fell on a little glass box that was lying under the table:\n",
                "she opened it and found in it a very small cake, on which the words \"EAT\n",
                "ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\n",
                "Alice, \"and if it makes me grow larger, I CAN reach the key; and if it\n",
                "makes me grow smaller, I can creep under the door: so either way I'll\n",
                "get into the garden, and I don't care which happens!\"\n"},
            {"She ate a little bit and said anxiously to herself, \"Which way? Which\n",
                "way?\" holding her hand on the top of her head to feel which way she was\n",
                "growing; and she was quite surprised to find that she remained the same\n",
                "size. So she set to work and very soon finished off the cake."}
        },
        {
            {"The King and Queen of Hearts were seated on their throne when they\n",
                "arrived, with a great crowd assembled about them--all sorts of little\n",
                "birds and beasts, as well as the whole pack of cards: the Knave was\n",
                "standing before them, in chains, with a soldier on each side to guard\n",
                "him; and near the King was the White Rabbit, with a trumpet in one hand\n",
                "and a scroll of parchment in the other. In the very middle of the court\n",
                "was a table, with a large DISH of tarts upon it. \"I wish they'd get the\n",
                "trial done,\" Alice thought, \"and hand 'round the refreshments!\"\n"},
            {"The judge, by the way, was the King and he wore his crown over his great\n",
                "wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\n",
                "(some were animals and some were birds) I suppose they are the jurors.\"\n"},
            {"Just then the White Rabbit cried out \"Silence in the court!\"\n"},
            {"\"HERALD! read the accusation!\" said the King."}
        }
    };
    protected static int sameCount = 0;
    protected static int newlineCount = 0;
    protected static int singleCharCount = 0;
    protected static int upperCount = 0;
    protected static int lowerCount = 0;
    protected static int specialCount = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String pass = "";
        int count = 0;

        boolean passGood = false;
        for (int i = 0; i < 10000; i++) {

            //loops to find the correct password
            while (!passGood) {
                pass = passGen();

                if (lengthGood(pass)) {
                    //at least one upper case
                    if (upperGood(pass)) {
                        //checks for at least one lower case
                        if (lowerGood(pass)) {
                            //checks for only one special character
                            if (specialGood(pass)) {
                                passGood = true;
                            } else {
                                specialCount++;
                            }
                        } else {
                            lowerCount++;
                        }
                    } else {
                        upperCount++;
                    }
                }
            }
            count++;
            //prints output
            System.out.println("Password = " + pass + " | Newline = " + newlineCount
                    + " | Single = " + singleCharCount + " | Equal = " + sameCount
                    + " | Upper = " + upperCount + " | Lower = " + lowerCount
                    + " | Special = " + specialCount);

            //resets everything
            if (lowerCount >= 1) {
                break;
            } else {
                pass = "";
                passGood = false;
                newlineCount = 0;
                singleCharCount = 0;
                sameCount = 0;
                upperCount = 0;
                lowerCount = 0;
                specialCount = 0;
            }
        }

        System.out.println("Total passwords generated: " + count);
    }

    public static boolean lengthGood(String pass) {
        if (pass.length() >= 8 && pass.length() <= 16) {
            return true;
        }
        return false;
    }

    public static boolean upperGood(String pass) {
        String regex = "^(?=.*[A-Z]).+$";
        return Pattern.matches(regex, pass);
    }

    public static boolean lowerGood(String pass) {
        String regex = "^(?=.*[a-z]).+$";
        return Pattern.matches(regex, pass);
    }

    public static boolean specialGood(String pass) {
        char[] passArr = pass.toCharArray();
        String regex = "[^a-zA-Z0-9]";
        int count = 0;
        for (int i = 0; i < passArr.length; i++) {
            String letter = passArr[i] + "";
            if (Pattern.matches(regex, letter)) {
                count++;
            }
        }

        return count == 1;

    }

    public static String wordGen() {
        String word = " ";
        Random rand = new Random();

        while (word.length() == 1 || word.contains("\n")) {
            //generates random numbers
            int a1 = rand.nextInt(book.length);
            int a2 = rand.nextInt(book[a1].length);
            int a3 = rand.nextInt(book[a1][a2].length);
            //takes a random line using the random numbers
            String line = book[a1][a2][a3];
            //makes an array that has all the words form the line
            String[] wordArr = line.split(" ");
            word = wordArr[rand.nextInt(wordArr.length)];
            newlineCount++;
            singleCharCount++;
        }
        newlineCount--;
        singleCharCount--;

        return word;
    }

    public static String passGen() {
        String pass = "";
        String word1 = wordGen();
        String word2 = wordGen();
        String word3 = wordGen();
        boolean isSame = true;

        while (isSame) {
            if (word1.compareTo(word2) == 0) {
                word1 = wordGen();
                word2 = wordGen();
                word3 = wordGen();
                sameCount++;
            } else if (word1.compareTo(word3) == 0) {
                word1 = wordGen();
                word2 = wordGen();
                word3 = wordGen();
                sameCount++;
            } else if (word2.compareTo(word3) == 0) {
                word1 = wordGen();
                word2 = wordGen();
                word3 = wordGen();
                sameCount++;
            } else {
                pass += word1 + word2 + word3;
                isSame = false;
            }
        }

        return pass;
    }

}
