package stringpack;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodTable {
	
	public class Method {
		private String 	name;
		private List<String> params = new ArrayList<String>();
		private String returnType;
		private ArrayList<Integer> linesUses = new ArrayList<Integer>();
		
		public Method(String name, String returnType) {
			this.name = name;
			this.returnType = returnType;
		}
		
		public void addLineUses(int line) {
			linesUses.add(new Integer(line));
		}
		
		public String toString() {
			return name + ", " + (params.isEmpty() ? "no params" : params)  + ", " 
						+ (returnType == null ? "void" : returnType) + ", " 
						+ ((linesUses.isEmpty())? "not uses" : linesUses);
		}
		
		public String getReturnType() {
			return returnType;
		}
		
	}
	
	private Map<String, Method> methods = new HashMap<String, Method>();
	
	public boolean isExist(String name) {
		return methods.containsKey(name);
	}
	
	public void add(Method n) {
		methods.put(n.name, n);
	}
	
	public Method get(String n) {
		return methods.get(n);
	}
	public void print(PrintStream out) {
	    System.out.println("\n\rMethods: ");
		for (String name : methods.keySet()) {
			Method method = methods.get(name);
			out.println(method);
		}
	}
	
}
