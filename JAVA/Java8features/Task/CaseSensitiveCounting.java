package Task;

import java.util.HashMap;
import java.util.Map;

public class CaseSensitiveCounting extends CharacterFrequencyCounterBase implements CharacterFrequencyCountable{
	
	@Override
	public void countCharacterFrequencies(String s) {
Map <Character,Integer>map=new HashMap<>();
		
		s=s.replace(" ", "");
		char arr[]=s.toCharArray();
	
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for (int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
			}
			map.put(arr[i], count);
			
		}
		
		System.out.println(map);
	}
	

		
	}



