package quiz.application;

public class Main {
    public static void main(String args[]){
        QuestionService service = new QuestionService();
        service.displayDetail();
        service.calculateScore();
    }
}

