package smdp.project.survey.SurveyDSL.tests;

import com.google.common.io.CharStreams;
import com.google.inject.Inject;
import java.io.FileReader;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import smdp.project.survey.SurveyDSLInjectorProvider;
import survey.Answer;
import survey.MultipleChoice;
import survey.Question;
import survey.Survey;
import survey.impl.SurveyPackageImpl;

@InjectWith(SurveyDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class UnitTests {
  @Inject
  private ParseHelper<Survey> parser;
  
  @Test
  public void pTest1() {
    try {
      SurveyPackageImpl.init();
      String _stringFromFile = this.getStringFromFile("ptest1.survey");
      final Survey model = this.parser.parse(_stringFromFile);
      EList<Question> _questions = model.getQuestions();
      Question _head = IterableExtensions.<Question>head(_questions);
      final boolean entity = (_head instanceof MultipleChoice);
      Assert.assertTrue(entity);
      EList<Question> _questions_1 = model.getQuestions();
      Question _get = _questions_1.get(2);
      EList<Answer> _requiredPreviousAnswers = _get.getRequiredPreviousAnswers();
      Answer _head_1 = IterableExtensions.<Answer>head(_requiredPreviousAnswers);
      final Answer req = ((Answer) _head_1);
      String _name = req.getName();
      Assert.assertEquals("teaAnswer", _name);
      EList<Question> _questions_2 = model.getQuestions();
      Question _get_1 = _questions_2.get(1);
      final boolean opt = _get_1.isIsOptional();
      Assert.assertTrue(opt);
      EList<Question> _questions_3 = model.getQuestions();
      Question _get_2 = _questions_3.get(0);
      final MultipleChoice question = ((MultipleChoice) _get_2);
      EList<Answer> _answers = question.getAnswers();
      int _size = _answers.size();
      boolean _equals = (_size == 3);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void nTest1() {
    try {
      SurveyPackageImpl.init();
      String _stringFromFile = this.getStringFromFile("ntest1.survey");
      final Survey model = this.parser.parse(_stringFromFile);
      EList<Question> _questions = model.getQuestions();
      Question _head = IterableExtensions.<Question>head(_questions);
      final MultipleChoice entity = ((MultipleChoice) _head);
      String _description = entity.getDescription();
      Assert.assertNull(_description);
      EList<Answer> _answers = entity.getAnswers();
      boolean _isEmpty = _answers.isEmpty();
      Assert.assertTrue(_isEmpty);
      boolean _isIsOptional = entity.isIsOptional();
      Assert.assertFalse(_isIsOptional);
      EList<Question> _questions_1 = model.getQuestions();
      int _size = _questions_1.size();
      final boolean req = (_size == 3);
      Assert.assertTrue(req);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String getStringFromFile(final String path) {
    try {
      FileReader _fileReader = new FileReader(path);
      final List<String> lines = CharStreams.readLines(_fileReader);
      String conc = "";
      for (final String s : lines) {
        String _plus = (conc + s);
        conc = _plus;
      }
      return conc;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
