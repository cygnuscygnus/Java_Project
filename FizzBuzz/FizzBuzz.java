import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {	
	public void fizzBuzz(int max_count) {
		List<String> fbList = new ArrayList<>();
		for(int i = 1; i <= max_count; i++) {
		if(i % 15 == 0)
			fbList.add(i-1,"FizzBuzz");
		else if(i % 3 == 0)
			fbList.add(i-1,"Fizz");
		else if(i % 5 == 0)
			fbList.add(i-1,"Buzz");
		else 
			fbList.add(i-1,Integer.toString(i));
		}
		
		for(String str : fbList)
	        System.out.println(str);
	}
}
