package Task;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.streamApi.CountingWords;

public class CharactreOccuranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="ramayan";
		
		Map<String, Long> output = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output : "+output);

		}

}
