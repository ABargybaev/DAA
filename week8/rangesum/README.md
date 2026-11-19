1. In this task we need to find the sum of nodes that are between 2 given values including those 2 values
2. Here we check if value fits within the range. If it fits, we add it to the sum. Also I used stack here to make it easier for checking nodes, so we explore the left subtree only if it might contain values greater or equal to low and explore the right subtree only if it might contain values less or equal to high
3. Worst case time complexity is O(n) because we might need to check every node
4. Space complexity is O(h), h - height. Because we use stack and it's space depends on BST
5. This one was unusual and I had to ask AI for a hint how to solve this. I would like to see how others solved this task, maybe they didn't use stack
