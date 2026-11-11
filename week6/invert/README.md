1. In this task we need to invert a binary tree like a mirror
2. First we check if the root is null. If it is we return null. If it's not we create a temporary variable called temp to store the left child. Then we replace the left child with the right child and the right child with our temporary variable. This way we swap the two children. After that, we call the same method for the left and right subtrees. We repeat this process until all nodes are swapped. Then we return the root of the inverted tree.
3. The time complexity here is O(n) because we need to visit every node in the binary tree and swap its children
4. The space complexity here is O(n). If the tree is completely skewed the recursion can go through all n nodes. But if the tree is balanced the space complexity is O(log n)
5. I think my solution is really simple and efficient. We don't need to create another tree or any additional arrays we just swap the children of each node using a temporary variable
