import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.askQuestions();
        quiz.showCorrections();
        System.out.println("\n\n--------------------\nScore : " + quiz.getScore() + " / 10");
    }
}

class Quiz {
    final private int maxIndex = 10;
    private String[] questions = new String[maxIndex];
    private String[] answers = new String[maxIndex];
    private boolean[] correctAnswers = new boolean[maxIndex];
    private static Scanner input = new Scanner(System.in);
    
    /**
     * takes index as number of question, starts with 1
     */
    public void setItem(int index, String question, String answer){
        questions[index-1] = question;
        answers[index-1] = answer;
    }


    public void askQuestions(){
        for (int i = 0; i < maxIndex; i ++){
            System.out.print((i + 1) + ". " + questions[i] + "\t");
            
            String inputAnswer = input.nextLine().trim();
            correctAnswers[i] = answers[i].equalsIgnoreCase(inputAnswer);
            System.out.println("\n--------------\n");
        }
    }

    public int getScore(){
        int score = 0;
        for (int i = 0; i < maxIndex; i ++){
            if (correctAnswers[i]) score ++;
        }

        return score;
    }
    public void showCorrections(){
        for (int i = 0; i < maxIndex; i ++){
            if (correctAnswers[i]){
                System.out.println((i + 1) + ". /");
            } else {
                System.out.println((i + 1) + ". X");
            }
        }
    }

    Quiz(){
        this.setItem(1, "What does HTML means?", "hypertext markup language");
        this.setItem(2, "What programming language is used by browsers in client side?", "javascript");
        this.setItem(3, "From what language was javascript's syntax inspired?", "java");
        this.setItem(4, "What software is widely used for version management?", "git");
        this.setItem(5, "What IDE is popular for java?", "eclipse");
        this.setItem(6, "What popular code editor is made by microsoft?", "vs code");
        this.setItem(7, "What programming pattern is mostly used in java", "OOP");
        this.setItem(8, "What operating system is known to be open-source?", "linux");
        this.setItem(9, "What is the name of package manager for ubuntu?", "apt");
        this.setItem(10, "What bash command is used to make a new file?", "touch");
    }
    
}
