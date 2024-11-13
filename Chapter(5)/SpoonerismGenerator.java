import java.util.*;

public class SpoonerismGenerator {
    public static void main(String[] args){
        run();
    }

public static void run(){
    Scanner scn = new Scanner(System.in);
    System.out.print("Please Enter First Word");
    String firstWord = getWord(scn);
    System.out.print("Please Enter Second Word");
    String secondWord = getWord(scn);

    int vowelIndex1 = vowelIndex(firstWord);
    int vowelIndex2 = vowelIndex(secondWord);

    String spoonerizedFirstWord = secondWord.substring(0, vowelIndex2) + firstWord.substring(vowelIndex1);
    String spoonerizedSecondWord = firstWord.substring(0, vowelIndex1) + secondWord.substring(vowelIndex2);

    if(vowelIndex1 == 1 && vowelIndex2 == 1){
        System.out.println(firstWord + " and " + secondWord + " spoonerized are " + spoonerizedFirstWord + " " + spoonerizedSecondWord );
    } else {
        System.out.println(firstWord + " and " + secondWord + " are not good words to spoonerize");
    }
}

public static String getWord(Scanner scn){
    return scn.next();
}

public static int vowelIndex(String word){
    for (int i = 0; i < word.length(); i++){
        char chr = word.charAt(i);
        if( "AEIOUaeiou".indexOf(chr) != -1){
        return i;
        }
    }
    return -1;
}
}
