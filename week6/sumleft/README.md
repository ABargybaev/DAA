1. In this task we need to find the sum of all left leaves in a binary tree
2. First we check if the root is null. If it is we return 0. Then we create a variable called sum. We check if the current node has a left child and if that child doesn't have any children. If that's true it means we found a left leaf so we add its value to our sum. Then we recursively check the left and right subtrees to find other left leaves. Then we return the total sum. For example, in the first example the left leaves are 9 and 15, so the result is 24.
3. The time complexity here is O(n) because we visit every node in the binary tree exactly once
4. The space complexity here is O(n). If the tree is completely skewed the recursion can go through all n nodes. But if the tree is balanced the space complexity is O(log n)
5. I think my solution is really simple and efficient. We don't need any additional data structures we just use recursion and check if the left child is a leaf
