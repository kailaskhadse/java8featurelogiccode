package Task;

import java.util.*;

public class Test {

		
		public static void main(String[] args) {
			//counting character caseinsensitive
			
			CaseInsensitiveCounting c=new CaseInsensitiveCounting();
			System.out.println("CaseInsensitiveCounting");
			c.countCharacterFrequencies("Hello LogicRays Here");
			//counting character casesensitive
			
			CaseSensitiveCounting c1=new CaseSensitiveCounting();
			System.out.println("CaseSensitiveCounting");
			c1.countCharacterFrequencies("Hello LogicRays Here");
		
		}

	}


