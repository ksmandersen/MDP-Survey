package dk.itu.smdp.surveysample.survey;

import java.util.List;

/**
 * Created by ksma on 23/04/14.
 */
public class Survey {

    public Survey(List<Question> questions) {
        mQuestions = questions;
        mFirstQuestion = questions.get(0);

        Question prev = null;
        for (Question question : questions) {
            question.setPrevious(prev);
            if (prev != null) {
                prev.setNext(question);
            }

            prev = question;
        }
    }

    private List<Question> mQuestions;

    private Question mFirstQuestion;
    public Question getFirstQuestion() {
        return mFirstQuestion;
    }
}
