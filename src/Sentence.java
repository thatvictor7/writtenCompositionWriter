// Victor Montoya Ortiz

public class Sentence {

    String theSentence = "";//Variable that hold the sentence.

    void sentence(String inputSentence) {

        //Function assigns passed argument to variable that accessible to other classes.
        theSentence = inputSentence;

    }

    void print() {

        //Functin to prints the sentence.
        System.out.println(theSentence);
    }

}
