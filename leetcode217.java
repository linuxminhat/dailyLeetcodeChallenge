import java.util.HashSet;
import java.util.Set;

public class leetcode217 {
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> mySet = new HashSet<>();
		for(Integer integerValue : nums) {
			if(mySet.contains(integerValue)==true) {
				return true;
			}else {
				mySet.add(integerValue);
			}
		}
		return false;
        
    }

}
