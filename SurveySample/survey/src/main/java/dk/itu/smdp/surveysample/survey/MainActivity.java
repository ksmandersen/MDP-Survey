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
    public static class PlaceholderFragment extends Fragment implements View.OnClickListener {
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

            Option catOption = new Option(getString(R.string.answer_pet_cat));
            List<Option> options = new ArrayList<Option>();
            options.add(catOption);
            Question first = new Question(getString(R.string.hello_world), Question.QuestionType.QUESTION_TYPE_MULTIPLE_CHOICE, "testQuestion", options);

            Option coffeOption = new Option("such wow");
            List<Option> beverageOptions= new ArrayList<Option>();
            beverageOptions.add(coffeOption);
            Question second = new Question(getString(R.string.question_cold_beverage), Question.QuestionType.QUESTION_TYPE_SINGLE_CHOICE, "beverageQuestion", beverageOptions);

            List<Question> questions = new ArrayList<Question>();
            questions.add(first);
            questions.add(second);

            mSurvey = new Survey(questions);

            setActiveQuestion(mSurvey.getFirstQuestion());

            return rootView;
        }

        @Override
        public void onClick(View view) {
            Question newQuestion;
            if (view == mNextButton) {
                newQuestion = currentQuestion.getNext();
            } else {
                newQuestion = currentQuestion.getPrevious();
            }

            // We have no questions in that direction
            if (newQuestion == null) {
                return;
            }

            setActiveQuestion(newQuestion);
        }

        private void setActiveQuestion(Question question) {
            mPreviousButton.setEnabled(!question.isFirst());
            mNextButton.setEnabled(!question.isLast());

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
            mOptionsLayout.removeAllViews();
        }

        private void insertMultipleChoice(Question question) {
            for (Option option : question.getOptions()) {
                CheckBox checkBox = new CheckBox(getActivity());
                checkBox.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
                checkBox.setText(option.getTitle());
                mOptionsLayout.addView(checkBox);
            }
        }

        private void insertSingleChoice(Question question) {
            RadioGroup group = new RadioGroup(getActivity());
            group.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));

            for (Option option : question.getOptions()) {
                RadioButton radio = new RadioButton(getActivity());
                radio.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
                radio.setText(option.getTitle());
                group.addView(radio);
            }

            mOptionsLayout.addView(group);
        }
    }
}
