package dk.itu.smdp.surveysample.survey;

import java.util.List;

/**
 * Created by ksma on 23/04/14.
 */
public class Question {

    public enum QuestionType {
        QUESTION_TYPE_MULTIPLE_CHOICE,
        QUESTION_TYPE_SINGLE_CHOICE,
        QUESTION_TYPE_OPEN
    }

    public Question(String title, QuestionType type, String identifier, List<Option> options) {
        mTitle = title;
        mType = type;
        mIdentifier = identifier;
        mOptions = options;
    }

    private List<Option> mOptions;
    public List<Option> getOptions() {
        return mOptions;
    }

    private String mIdentifier;
    public String getIdentifier() {
        return mIdentifier;
    }

    private QuestionType mType;
    public QuestionType getType() {
        return mType;
    }

    private String mTitle;
    public String getTitle() {
        return mTitle;
    }

    private Question mPrevious;
    public Question getPrevious() {
        return mPrevious;
    }
    public void setPrevious(Question previous) {
        mPrevious = previous;
    }

    private Question mNext;
    public Question getNext() {
        return mNext;
    }
    public void setNext(Question next) {
        mNext = next;
    }

    public boolean isFirst() {
        return mPrevious == null;
    }

    public boolean isLast() {
        return mNext == null;
    }

}
