// Victor Montoya Ortiz

import java.util.ArrayList;

public class Composition {

    private ArrayList<ArrayList<String>> paragraphsArray = new ArrayList<ArrayList<String>>();//Nested ArrayList within ArrayList declared.

    private Paragraph paragraph;//Declare Paragraph object.


    void addAParagraph() {

        //Function to add a new paragraph.
        paragraph = new Paragraph();//Instantiating new Paragraph object.

        paragraphsArray.add(paragraph.sentencesArray);//Calls function to add new array(paragraph) of Paragraph class.

    }

    void addASentence(String aSentence) {

        //Function to add a sentence to array.
        //If statement, if no array exist, it will create one and add to parent array.
        if (paragraphsArray.size() < 1) {
            paragraph = new Paragraph();
            paragraphsArray.add(paragraph.sentencesArray);
        }

        paragraph.addASentence(aSentence);//Calls add sentence function and passes aSentence as argument.

    }

    void print() {

        //Simple function to print nested array within array.
        for (int i = 0; i < paragraphsArray.size(); i++) {
            for (int j = 0; j < paragraphsArray.get(i).size(); j++) {
                System.out.println(paragraphsArray.get(i).get(j));
            }
            System.out.println("");
        }

    }
}
