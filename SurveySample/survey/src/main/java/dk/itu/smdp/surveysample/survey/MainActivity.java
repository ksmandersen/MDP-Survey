package dk.itu.smdp.surveysample.survey;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment implements View.OnClickListener, CheckBox.OnCheckedChangeListener {
        private Button mPreviousButton;
        private Button mNextButton;

        private Survey mSurvey;
        private Question currentQuestion;
        private TextView mQuestionTitleView;
        private LinearLayout mOptionsLayout;

        public PlaceholderFragment() {}

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            mPreviousButton = (Button)rootView.findViewById(R.id.question_button_previous);
            mPreviousButton.setOnClickListener(this);

            mNextButton = (Button)rootView.findViewById(R.id.question_button_next);
            mNextButton.setOnClickListener(this);

            mQuestionTitleView = (TextView)rootView.findViewById(R.id.question_text_view);
            mOptionsLayout = (LinearLayout)rootView.findViewById(R.id.question_options);

            createSurvey();

            return rootView;
        }

        private void createSurvey() {
            List<Question> questions = new ArrayList<Question>();

            List<Option> qOptions1 = new ArrayList<Option>();
            qOptions1.add(new Option("I like dogs"));
            // 2
            qOptions1.add(new Option("I hat dogs, but like cats"));
            // 3
            qOptions1.add(new Option("What else?"));
            // 4

            Question.QuestionType qType1 = Question.QuestionType.QUESTION_TYPE_MULTIPLE_CHOICE;
            Question question1 = new Question("What is your favorite pet?", qType1, "", qOptions1);
            question1.setOptional(false);
            questions.add(question1);
            // 2

            List<Option> qOptions2 = new ArrayList<Option>();
            qOptions2.add(new Option("Tea"));
            // 5
            qOptions2.add(new Option("Coffee"));
            // 6

            Question.QuestionType qType2 = Question.QuestionType.QUESTION_TYPE_SINGLE_CHOICE;
            Question question2 = new Question("What is better? Coffee or tea?", qType2, "", qOptions2);
            question2.setOptional(true);
            questions.add(question2);
            // 3

            List<Option> qOptions3 = new ArrayList<Option>();
            qOptions3.add(new Option("Cocoa Cola"));
            // 7
            qOptions3.add(new Option("Water"));
            // 8

            Question.QuestionType qType3 = Question.QuestionType.QUESTION_TYPE_MULTIPLE_CHOICE;
            Question question3 = new Question("Your favorite cold beverages", qType3, "", qOptions3);
            question3.setOptional(true);
            question3.setRequiredPreviousOption("teaAnswer");
            questions.add(question3);
            // 4

            List<Option> qOptions4 = new ArrayList<Option>();


            Question.QuestionType qType4 = Question.QuestionType.QUESTION_TYPE_OPEN;
            Question question4 = new Question("Describe how you feel about Windows XP", qType4, "", qOptions4);
            question4.setOptional(true);
            questions.add(question4);
            // 5
            mSurvey = new Survey(questions);

            setActiveQuestion(mSurvey.getFirstQuestion());
        }

        @Override
        public void onClick(View view) {
            Question newQuestion;
            if (view == mNextButton) {
                newQuestion = currentQuestion.getNext();
                // We have no questions in that direction
                if (newQuestion == null) {
                    return;
                }

                String requiredPrevious = newQuestion.getRequiredPreviousOption();
                if (requiredPrevious != null) {
                    Option answered = currentQuestion.getAnsweredOption();
                    if (answered != null && !answered.getTitle().equals(requiredPrevious)) {
                        newQuestion = newQuestion.getNext();
                    }
                }
            } else {
                newQuestion = currentQuestion.getPrevious();
            }

            // We have no questions in that direction
            if (newQuestion == null) {
                return;
            }

            setActiveQuestion(newQuestion);
        }

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (currentQuestion.getNext() == null) {
                return;
            }

            boolean hasOneChecked = false;
            for (Option option : currentQuestion.getOptions()) {
                Checkable view = option.getView();
                if (view != null) {
                    hasOneChecked = view.isChecked();
                    if (hasOneChecked) {
                        break;
                    }
                }
            }

            mNextButton.setEnabled(hasOneChecked);
        }

        private void setActiveQuestion(Question question) {
            mPreviousButton.setEnabled(!question.isFirst());
            mNextButton.setEnabled(!question.isLast());

            boolean hasOneChecked = question.getAnsweredOption() != null;
            if (!question.isOptional()) {
                mNextButton.setEnabled(hasOneChecked);
            }

            if (question.isLast()) {
                // Hide next button
                // Show submit button
            }

            clearQuestion();

            mQuestionTitleView.setText(question.getTitle());

            switch (question.getType()) {
                case QUESTION_TYPE_MULTIPLE_CHOICE:
                    insertMultipleChoice(question);
                    break;
                case QUESTION_TYPE_SINGLE_CHOICE:
                    insertSingleChoice(question);
                    break;
                case QUESTION_TYPE_OPEN:
                    break;
                default:
                    break;
            }

            currentQuestion = question;
        }

        private void clearQuestion() {
            if (currentQuestion != null) {
                List<Option> options = currentQuestion.getOptions();
                if (options != null) {
                    for (Option option : options) {
                        Checkable view = option.getView();
                        if (view != null && view.isChecked()) {
                            currentQuestion.setAnswer(option, null);
                        }

                        option.setView(null);
                    }
                }
            }

            mOptionsLayout.removeAllViews();
        }

        private void insertMultipleChoice(Question question) {
            Option answer = question.getAnsweredOption();
            for (Option option : question.getOptions()) {
                CheckBox checkBox = new CheckBox(getActivity());
                checkBox.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
                checkBox.setText(option.getTitle());
                checkBox.setOnCheckedChangeListener(this);
                if (!question.isOptional()) {
                    checkBox.setOnCheckedChangeListener(this);
                }
                if (answer != null && answer == option) {
                    checkBox.setChecked(true);
                }
                mOptionsLayout.addView(checkBox);
                option.setView(checkBox);
            }
        }

        private void insertSingleChoice(Question question) {
            RadioGroup group = new RadioGroup(getActivity());
            group.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));

            Option answer = question.getAnsweredOption();
            for (Option option : question.getOptions()) {
                RadioButton radio = new RadioButton(getActivity());
                radio.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
                radio.setText(option.getTitle());
                if (!question.isOptional()) {
                    radio.setOnCheckedChangeListener(this);
                }
                if (answer != null && answer == option) {
                    radio.setChecked(true);
                }
                group.addView(radio);
                option.setView(radio);
            }

            mOptionsLayout.addView(group);
        }
    }
}
