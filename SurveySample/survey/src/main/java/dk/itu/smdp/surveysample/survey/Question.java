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
        mOptional = false;
        mAnsweredOption = null;
        mAnsweredText = null;
    }

    private String mRequiredPreviousOption;
    public String getRequiredPreviousOption() { return mRequiredPreviousOption; }
    public void setRequiredPreviousOption(String requiredPreviousOption) { mRequiredPreviousOption = requiredPreviousOption; }

    private Option mAnsweredOption;
    public Option getAnsweredOption() {
        return mAnsweredOption;
    }

    private String mAnsweredText;
    public String answeredText() {
        return mAnsweredText;
    }

    public void setAnswer(Option option, String answer) {
        if (option == null || !mOptions.contains(option)) {
            return;
        }

        if (mType == QuestionType.QUESTION_TYPE_OPEN &&
            (answer == null || answer.equals(""))) {
            return;
        }

        mAnsweredOption = option;
        mAnsweredText = answer;
    }

    private boolean mOptional;
    public boolean isOptional() {
        return mOptional;
    }

    public void setOptional(boolean optional) {
        mOptional = optional;
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
