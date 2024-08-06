// Victor Montoya Ortiz

import java.util.ArrayList;

public class Paragraph {

    public ArrayList<String> sentencesArray = new ArrayList<>();//Array to hold sentences.

    void addASentence(String theText) {

        //Function to add a sentence to array.
        Sentence sentenceInParagraph = new Sentence();//Instantiate sentence class object.
        sentenceInParagraph.sentence(theText);//Calls function create sentence by passing user input as argument.
        sentencesArray.add(sentenceInParagraph.theSentence);//Adds sentence to array.

    }

    void print() {

        //Function that prints array(paragraph).
        System.out.println(sentencesArray);

    }
}
