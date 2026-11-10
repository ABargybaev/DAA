1. In this task we need to traverse a binary tree using inorder traversal and return all the node values in a list. If the tree is empty we just return an empty l2ist
2. I used recursion because I think it's the easiest way to traverse a binary tree. We create an arraylist to store the values. Then I call a separate method called inorder. If the current node is null we just return because there's nothing to visit. If it's not null we first visit the left child, then add the current node's value to our list and visit the right child. We repeat this process until all nodes have been visited
3. The time complexity here is O(n) because we visit every node in the binary tree exactly once
4. The space complexity here is O(n) because we create an ArrayList to store all the node values
5. I think my solution is pretty simple and efficient. Recursion makes it easier to understand because we just follow left root right order
