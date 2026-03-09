package quiz.application;

import java.util.Scanner;

public class QuestionService {
    Questions[] question = new Questions[5];
     String Selection[] = new String[5];

    QuestionService(){
        question[0] = new Questions(1,"What is the capital of India","Delhi","Mumbai","Chennai","Kolkata","Delhi");

        question[1] = new Questions(2,"Which planet is known as the Red Planet","Earth","Mars","Jupiter","Venus","Mars");

        question[2] = new Questions(3,"Which language is used for Android development","Python","Java","C++","Swift","Java");

        question[3] = new Questions(4,"Which data structure uses FIFO principle","Stack","Queue","Tree","Graph","Queue");

        question[4] = new Questions(5,"Which company developed Java","Microsoft","Google","Sun Microsystems","Apple","Sun Microsystems");
    }
    int i=0;
    void displayDetail(){
        for(Questions q : question){
            System.out.println(q.getId());
            System.out.println(q.getQuestions());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            Selection[i] = sc.nextLine();
            i++;
        }
        for(String s : Selection){
            System.out.println(s);
        }
    }
    public void calculateScore(){

        int score = 0;
        for(int i =0; i<question.length;i++) {

            Questions que = question[i];
            String actualAnswer = que.getCorrectAnswer();
            String userAswer = Selection[i];

            if (actualAnswer.equals(userAswer)) {
                score++;
            }
        }
        System.out.println("Your Score is : "+score);
    }
}
