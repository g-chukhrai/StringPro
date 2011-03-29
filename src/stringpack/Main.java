package stringpack;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;
import java.util.Scanner;

public class Main {
	public static StringTemplateGroup templates;

	public static void main(String[] args) throws Exception {
		// String templateFileName = "LLVM.stg";
		// System.out.println("Type filename:");
		// Scanner in = new Scanner(System.in);
		// String exampleFileName = in.nextLine();
		// while (!new File(exampleFileName).exists()) {
		// System.out.println("File not exist!");
		// exampleFileName = in.nextLine();
		// }
		// ;
		String templateFileName = "D:\\JavaProj\\stringpro\\src\\examples\\LLVM.stg";
		String exampleFileName = "D:\\JavaProj\\stringpro\\src\\examples\\parserTest1.txt";

		templates = new StringTemplateGroup(new FileReader(templateFileName),
				AngleBracketTemplateLexer.class);
		CharStream input = new ANTLRFileStream(exampleFileName);
		System.out.println("Start parsing " + input.getSourceName());
		System.out.println("\n\rINPUT:");			
		System.out.println(input);
		strgramLexer lexer = new strgramLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		strgramParser parser = new strgramParser(tokens);
		parser.setTemplateLib(templates);
		RuleReturnScope r = parser.program();

		parser.names.print(System.out);
		parser.methods.print(System.out);
		if (!parser.errors.isEmpty()) {
			System.out.println("\n\rFound: ");
			System.err.println(parser.errors.size() + " errors");
			for (String m : parser.errors) {
				System.err.println(m);
			}
		} else {
			System.out.println("\n\rBUILD complete: no errors found");			
		}
		System.out.println("\n\rOUTPUT:");	
		System.out.println(r.getTemplate().toString());
	}
}
