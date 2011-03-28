package stringpack;

import java.io.FileReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class Main {
    public static StringTemplateGroup templates;

    public static void main(String[] args) throws Exception {
	String templateFileName = "D:\\JavaProj\\stringpro\\src\\examples\\LLVM.stg";
	String exampleFileName = "D:\\JavaProj\\stringpro\\src\\examples\\parserTest1.txt";
//	int a = 0;
//	if ( args.length<=1 ) {
//		templateFileName = "D:\\JavaProj\\stringpro\\src\\examples\\Java.stg";
//	} else {
//		templateFileName = args[a];
//		a++;
//	}
	templates = new StringTemplateGroup(new FileReader(templateFileName), AngleBracketTemplateLexer.class);
	CharStream input = new ANTLRFileStream(exampleFileName);
	System.out.println("Start parsing " + input.getSourceName());
	System.out.println(input);
	strgramLexer lexer = new strgramLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	strgramParser parser = new strgramParser(tokens);
	parser.setTemplateLib(templates);
	RuleReturnScope r = parser.program();

    parser.names.print(System.out);
    parser.methods.print(System.out);
    if (! parser.errors.isEmpty()) {
      System.out.println("\n\rFound: ");
      System.err.println(parser.errors.size() + " errors");
      for (String m : parser.errors) {
        System.err.println(m);
      } 
    }
    System.out.println();
	System.out.println(r.getTemplate().toString());
    }
}
