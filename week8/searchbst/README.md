1. Here we need to find a node that has the same value as the given number in a BST. If we find it, we need to return the whole subtree. If there isn't one we return null
2. I used a solution that compares node to the given value. If the node equals to it, we return it. If not then we check if it's less than the node. If it's less, we move to left. If it's not, we move right. Until we find the needed node. After returning we print the node and it's children because node also give information about them
3. In a worst case the time complexity is O(n) because we might have to check every node of the BST if it's skewed. But generally it should be O(log n)
4. The space complexity is O(1) because we don't need anything extra
5. This task is easy because we did tasks like this in classroom. I think I did the best I could
