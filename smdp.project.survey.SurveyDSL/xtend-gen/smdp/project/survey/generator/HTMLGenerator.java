/**
 * generated by Xtext
 */
package smdp.project.survey.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import smdp.project.survey.validation.SurveyDSLValidator;
import survey.Survey;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class HTMLGenerator implements IGenerator {
  public static CharSequence generateHTMLActivity(final Survey it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<title> Survey </title> ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<style>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("p { color:#ffd835 ; font:14pt Helvetica }");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("p:first-line { color: green; font-size: 200% }");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("body { background:white }");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("Div\t{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("background\t:   #EBEFF3;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("padding\t\t:\t0.5%;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("font-family\t:   Times, Verdana;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("border\t\t:\t1px solid #EBEFF3;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Div.titleDiv\t{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("background\t:   #7EA8CA;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("padding\t\t:\t2%;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("font-family\t:   Times, Verdana;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("text-shadow :   3px 3px 4px rgba(0, 0, 0, 0.2); ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("table, th\t\t{\t\tborder:1px solid black;\t\twidth:\t100%;\t}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("th\t\t\t{\t\tbackground:\t#7EA8CA;\t\ttext-align:\tLeft;\ttext-shadow: 0px 0px 1px rgba(0, 0, 0, 0.15); }");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("td\t\t\t{\t\tbackground: \tWhite;\t\t}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("td:hover\t\t{\t\tbackground: \tWhiteSmoke;\t}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("input[type=radio]:checked {\tborder: 1px solid black;\t}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("div:hover{\tborder:1px solid LightGray; }");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("textarea\t{ resize: none; width:\t100%;  }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("text\t\t{ resize: none; width:\t70%;  }");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".red_caps {color:red; font-style:small-caps; font:14pt Courier;}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("function checkValue(form)");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ready = true;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�/* Controlling code / Questions   */�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// �var questionsNo = 1�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// �var answersNo = 1�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�FOR mq : getQuestions�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�/* Multiple Choice */�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�IF(mq instanceof MultipleChoice)�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�IF(mq.isIsOptional)�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("/* �answersNo = answersNo + (mq as MultipleChoice).answers.length� */");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ELSE�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if(ready && !(");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�FOR ans : (mq as MultipleChoice).answers�\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�IF(ans instanceof OpenAnswer)�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("/* �answersNo = answersNo + 1� */");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ELSE�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("form[");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("�answersNo�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("/* �answersNo = answersNo + 1� */");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("].checked ||");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// �answersNo = answersNo + 1�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("true)  { alert(\'Please provide an answer for question");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�questionsNo�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'); ready=false; }");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ENDIF�\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�/* Radio Choice */�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�ELSEIF(mq instanceof RadioChoice)�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�IF(mq.isIsOptional)�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("/* �answersNo = answersNo + (mq as MultipleChoice).answers.length� */");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ELSE�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if(ready && !(");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�FOR ans : (mq as RadioChoice).answers�\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�IF(ans instanceof OpenAnswer)�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("/* �answersNo = answersNo + 1� */");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ELSE�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("form[");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("�answersNo�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("/* �answersNo = answersNo + 1� */");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("].checked ||");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// �answersNo = answersNo + 1�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("true)  { alert(\'Please provide an answer for question");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�questionsNo�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'); ready=false; }");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�/* assume Open Question - answernumber=1 since there can only ever be one answer. */�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�ELSE�\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tr> <td>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<textarea name=\"q�questionsNo�\" id=\"q�questionsNo�_1\" rows=4>Please enter your answer here... </textarea> </td> </tr>\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// �answersNo = answersNo + 1�\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�ENDIF�\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!-- �questionsNo = questionsNo + 1 � -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(!ready)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("accept = confirm(\'Are you sure you want to proceed?\');");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return accept;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<form name=\"input_form\" action=\"MAILTO:group8survey@example.dk?Subject=SMDP%20Group%208%20survey%20answer\"  onsubmit=\"return checkValue(this) method=\"post\" enctype=\"text/plain\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<div class=\"titleDiv\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1> Survey </h1> ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<br>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�/* Main Body / Questions   */�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- �var questionNo = 1� -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�FOR mq : getQuestions�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�/* Question Prologue */�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div> <table> <tr><th>Question #�questionNo�: <br>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�IF(mq.isIsOptional)�(optional)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�ELSE�(mandatory)�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�mq.description�</th></tr>\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�/* Main Body */�\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�/* Multiple Choice */�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�IF(mq instanceof MultipleChoice)�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�FOR ans : (mq as MultipleChoice).answers�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�var answerNo = 1�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�IF(ans instanceof OpenAnswer)�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<tr> <td>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<textarea name=\"q�questionNo�\" id=\"q�questionNo�_1\" rows=4>�ans.description�</textarea> </td> </tr>\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ELSE�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<tr> <td><input name=\"q�questionNo�\" id=\"q�questionNo�_�answerNo�\" type=\"checkbox\" value=\"op�questionNo�\"> <label for=\"q�questionNo�_�answerNo�\"> ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ans.description� ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</label> </td> </tr>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�answerNo = answerNo + 1�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�ENDFOR�\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�/* Radio Choice */�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ELSEIF(mq instanceof RadioChoice)�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�FOR ans : (mq as RadioChoice).answers�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�var answerNo = 1�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�IF(ans instanceof OpenAnswer)�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<tr> <td>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<textarea name=\"q�questionNo�\" id=\"q�questionNo�_1\" rows=4>�ans.description�</textarea> </td> </tr>\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ELSE�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<tr> <td><input name=\"q�questionNo�\" id=\"q�questionNo�_�answerNo�\" type=\"radio\" value=\"op�questionNo�\"> <label for=\"q�questionNo�_�answerNo�\"> ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("�ans.description� ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</label> </td> </tr>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<!-- �answerNo = answerNo + 1� -->");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�/* assume Open Question - answernumber=1 since there can only ever be one answer. */�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ELSE�\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<tr> <td>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<textarea name=\"q�questionNo�\" id=\"q�questionNo�_1\" rows=4>Please enter your answer here... </textarea> </td> </tr>\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ENDIF�\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!-- �questionNo = questionNo + 1 � -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�/* Question Epilogue */�");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("</table></div><br>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("<div class=\"titleDiv\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h3> Thank you! </h3> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<input type=\"submit\" value=\"Submit\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<input type=\"reset\" value=\"Reset\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allProperContents = EcoreUtil.<EObject>getAllProperContents(resource, false);
    final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
      public Boolean apply(final EObject it) {
        return Boolean.valueOf(SurveyDSLValidator.constraint(it));
      }
    };
    boolean _forall = IteratorExtensions.<EObject>forall(_allProperContents, _function);
    if (_forall) {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<Survey> _filter = Iterables.<Survey>filter(_iterable, Survey.class);
      final Procedure1<Survey> _function_1 = new Procedure1<Survey>() {
        public void apply(final Survey it) {
          final String fname = "MainActivity";
          CharSequence _generateHTMLActivity = HTMLGenerator.generateHTMLActivity(it);
          fsa.generateFile((("app-gen/src/" + fname) + ".html"), _generateHTMLActivity);
        }
      };
      IterableExtensions.<Survey>forEach(_filter, _function_1);
    } else {
      InputOutput.<String>println("Constraints violated. Either a question contains a reference to its own answer or a description string is empty.");
    }
  }
}
