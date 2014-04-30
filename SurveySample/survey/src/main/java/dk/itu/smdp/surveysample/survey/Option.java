package dk.itu.smdp.surveysample.survey;

import android.widget.Checkable;

/**
 * Created by ksma on 23/04/14.
 */
public class Option {

    public Option(String title) {
        mTitle = title;
    }

    private String mTitle;
    public String getTitle() {
        return mTitle;
    }

    private Checkable mView;
    public Checkable getView() { return mView; }
    public void setView(Checkable view) { mView = view; }
}
