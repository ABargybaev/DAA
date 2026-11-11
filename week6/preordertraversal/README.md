1. In this task we need to traverse a binary tree using preorder traversal and return all the node values
2. First we create an arraylist to store all the values. Then we call a separate method called preorder. If the current node is null we just return because there's nothing to visit. If it's not we first add the current node's value to the list then visit its left child and then its right child. We repeat this until all nodes have been visited
3. The time complexity here is O(n) because we visit every node in the binary tree exactly once 
4. The space complexity here is O(n) because we create an arraylist to store all the node values
5. I think my solution is really simple and efficient. It's almost the same as inorder traversal but we just change the order of the operations 
