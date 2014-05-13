package survey.validation;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import survey.Answer;
import survey.MultipleChoice;

@SuppressWarnings("all")
public class Constraints {
  protected static boolean _constraint(final MultipleChoice choice) {
    EList<Answer> _answers = choice.getAnswers();
    final Function1<Answer,Boolean> _function = new Function1<Answer,Boolean>() {
      public Boolean apply(final Answer it) {
        EList<Answer> _requiredPreviousAnswers = choice.getRequiredPreviousAnswers();
        boolean _contains = _requiredPreviousAnswers.contains(it);
        return Boolean.valueOf((!_contains));
      }
    };
    return IterableExtensions.<Answer>forall(_answers, _function);
  }
  
  protected static boolean _constraint(final EObject it) {
    return true;
  }
  
  public static boolean constraint(final EObject choice) {
    if (choice instanceof MultipleChoice) {
      return _constraint((MultipleChoice)choice);
    } else if (choice != null) {
      return _constraint(choice);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(choice).toString());
    }
  }
}
