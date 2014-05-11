/*
 * generated by Xtext
 */
package smdp.project.survey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import survey.Survey
import survey.MultipleChoice
import smdp.project.survey.validation.SurveyDSLValidator
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class HTMLGenerator implements IGenerator {
	
	def static generateHTMLActivity(Survey it){
		// HTML Prelude/Header 
'''
<html>
<head>
 <title> Survey Templates </title> 
 <style>
 	p { color:#ffd835 ; font:14pt Helvetica }
 	p:first-line { color: green; font-size: 200% }
 	body { background:white }
 	Div	{
		background	:   #EBEFF3;
		padding		:	0.5%;
		font-family	:   Times, Verdana;
		border		:	1px solid #EBEFF3;
	}
	
	Div.titleDiv	{
		background	:   #7EA8CA;
		padding		:	2%;
		font-family	:   Times, Verdana;
		text-shadow :   3px 3px 4px rgba(0, 0, 0, 0.2); 
	}
	
	table, th		{		border:1px solid black;		width:	100%;	}
	
	th			{		background:	#7EA8CA;		text-align:	Left;	text-shadow: 0px 0px 1px rgba(0, 0, 0, 0.15); }
	
	td			{		background: 	White;		}
	td:hover		{		background: 	WhiteSmoke;	}
	
	input[type=radio]:checked {	border: 1px solid black;	}
	
	div:hover{	border:1px solid LightGray; }

	textarea	{ resize: none; width:	100%;  }
	text		{ resize: none; width:	70%;  }
	
	.red_caps {color:red; font-style:small-caps; font:14pt Courier;}
	
 </style>
 <script>

 </script>
</head>
<body>
  <form name="input_form" action="MAILTO:group8survey@example.dk?Subject=SMDP%20Group%208%20survey%20answer" method="post" enctype="text/plain">
  <div class="titleDiv">
	<h1> My Survey </h1> 
  </div>
  <br>
	�/* Main Body / Questions   */�
	�var questionNo = 1�
	�FOR mq : getQuestions�
		�/* Question Prologue */�
		<div> <table> <tr><th>Question #�questionNo�: <br>
		�IF(mq.isIsOptional)�(optional)
		�ELSE�(mandatory)�ENDIF�
		�mq.name�</th></tr>
		
		�/* Main Body / Answers   */�
		�FOR ans : answers�
			�var answerNo = 1�
			
			�/* Multiple Choice */�
			�IF(mq instanceof MultipleChoice)�
			<tr> <td><input name="q�questionNo�" id="q�questionNo�_�answerNo�" type="checkbox" value="op�questionNo�"> <label for="q�questionNo�_�answerNo�"> 
			(�ans.name�); 
			</label> </td> </tr>
			
			�/* Radio Choice */�
			�ELSEIF(mq instanceof RadioChoice)�
			<tr> <td><input name="q�questionNo�" id="q�questionNo�_�answerNo�" type="radio" value="op�questionNo�"> <label for="q�questionNo�_�answerNo�"> 
			(�ans.name�); 
			</label> </td> </tr>
			
			�/* assume Open Question */�
			�ELSE�
			<tr> <td>
			<textarea name="q�questionNo�" id="q�questionNo�_�answerNo�" rows=4> 
			Please enter your answer here... </textarea> </td> </tr>
			
			�ENDIF�
			�var answerNo = answerNo + 1�
		�ENDFOR�
		�questionNo = questionNo + 1 �
		
		�/* Question Epilogue */�
		 </table></div><br>
		
	�ENDFOR�
		
		
		 
 <div class="titleDiv">
	<h3> Thank you! </h3> 
	<input type="submit" value="Submit">
	<input type="reset" value="Reset">
  </div>
 </form>
</body>
</html>
'''
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		if(EcoreUtil.getAllProperContents(resource, false).forall[SurveyDSLValidator.constraint(it)])
			resource.allContents.toIterable.filter(typeof(Survey)).
				forEach [ Survey it |
					val fname = "MainActivity"
					// generate HTML implementation
					fsa.generateFile("app-gen/src/dk/itu/smdp/surveygen/survey/" + fname + ".html", it.generateHTMLActivity)
				]
		else println("Constraints violated. Either a question contains a reference to its own answer or a description string is empty.")
	}
}
