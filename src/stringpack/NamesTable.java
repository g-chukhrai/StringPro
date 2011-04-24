package stringpack;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class NamesTable {
	public class Name {
		private String 	idtf;
		private String	type;
		private int		lineDeclaration;
		private ArrayList<Integer> linesUses = new ArrayList<Integer>();
		
		public Name(String idtf, String type, int line) {
			this.idtf = idtf;
			this.type = type;
			lineDeclaration = line;
		}
		public void addLineUses(int line) {
			linesUses.add(new Integer(line));
		}
		public String toString() {
			return idtf + ", " + type + ", " + lineDeclaration + ", " 
				+ ((linesUses.isEmpty())? "not uses" : linesUses);
		}
		public String getType() {
			return type;
		}
		
	}
	
	private HashMap<String, Name> names = new HashMap<String, Name>();
	
	public boolean isExist(String name) {
		boolean rv = names.containsKey(name);
		if (! rv) {
			rv = names.containsKey("[global]" + name.substring(name.indexOf('.')));
		}
		return rv;
	}
	
	public void add(Name n) {
		names.put(n.idtf, n);
	}
	public Name get(String n) {
		Name _n = names.get(n); 
		if (_n == null) {
			_n = names.get("[global]" + n.substring(n.indexOf('.')));
		}
		return _n;
	}
	public String getScope(String n) {
		Name _n = names.get(n); 
		String scope = "local";
		if (_n == null) {
			_n = names.get("[global]" + n.substring(n.indexOf('.')));
			if (_n != null) scope = "global";
		}
		return scope;
	}
	public void print(PrintStream out) {
	    System.out.println("\n\rVariables: ");
		for (String idtf : names.keySet()) {
			Name n = names.get(idtf);
			out.println(n);
		}
	}
		
}




