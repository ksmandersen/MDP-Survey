/*
 * generated by Xtext
 */
package smdp.project.survey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import survey.Survey
import survey.MultipleChoice

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SurveyDSLGenerator implements IGenerator {
	
	def static compileActivity(Survey it){
		'''
		package com.example.surveytestapp;

		import android.support.v7.app.ActionBarActivity;
		import android.support.v7.app.ActionBar;
		import android.support.v4.app.Fragment;
		import android.os.Bundle;
		import android.view.LayoutInflater;
		import android.view.Menu;
		import android.view.MenuItem;
		import android.view.View;
		import android.view.ViewGroup;
		import android.os.Build;
		
		
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
		        �FOR mq : questions.filter[it instanceof MultipleChoice]�					
					�FOR a : (mq as MultipleChoice).answers�
		        System.out.println(�a.name�);
					�ENDFOR�
				�ENDFOR�
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
		    public static class PlaceholderFragment extends Fragment {
		
		        public PlaceholderFragment() {
		        }
		
		        @Override
		        public View onCreateView(LayoutInflater inflater, ViewGroup container,
		                Bundle savedInstanceState) {
		            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
		            return rootView;
		        }
		    }
		}
		
				
		'''
	}
	
	def static compileManifest(Survey it){
		'''
		<?xml version="1.0" encoding="utf-8"?>
		<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    	package="dk.itu.smdp.surveygen.survey" >

		    <application
		        android:allowBackup="true"
		        android:icon="@drawable/ic_launcher"
		        android:label="@string/app_name"
		        android:theme="@style/AppTheme" >
		        <activity
		            android:name="dk.itu.smdp.surveygen.survey.MainActivity"
		            android:label="@string/app_name" >
		            <intent-filter>
		                <action android:name="android.intent.action.MAIN" />
		
		                <category android:name="android.intent.category.LAUNCHER" />
		            </intent-filter>
		        </activity>
		    </application>

		</manifest>
		'''
		
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Survey)).
			forEach [ Survey it |
				val fname = "MainActivity"
				// generate Java implementation
				fsa.generateFile("app-gen/src/dk/itu/smdp/surveygen/survey/" + fname + ".java", it.compileActivity)
				fsa.generateFile("app-gen/" + "AndroidManifest" + ".xml", it.compileManifest)
			]
	}
}
