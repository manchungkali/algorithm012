class Solution {
	//接雨水
	public int trap(int[] height) {
		int sum = 0;
		Stack<Integer> stack = new Stack<>();
		int current = 0;
		while (current < height.length) {
		//如果栈不空并且当前指向的高度大于栈顶高度就一直循环
		while (!stack.empty() && height[current] > height[stack.peek()]) {	
			int h = height[stack.peek()];
			stack.pop();
			if (stack.empty()) {
				break;
			}
			int distance = current - stack.peek() - 1;
			int min = Math.min(height[stack.peek()],height[current]);
			sum = sum + distance * (min - h);
		}
		stack.push(current);
		current++;
		}
		return sum;
	}

}	
	