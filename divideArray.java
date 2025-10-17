import java.util.HashSet;

class Solution {
	public boolean divideArray(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int x : nums) {
			if (set.contains(x)) {
				set.remove(x);
			} else {
				set.add(x);
			}
		}

		if (set.size() != 0) {
			return false;
		}
		return true;
	}
}
