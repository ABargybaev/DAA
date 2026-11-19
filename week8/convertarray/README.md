1. In this task we get a sorted array and we need to convert it into a height-balanced BST
2. Since the array is sorted we can use it's middle as a root. Then we turn the left half into a left subtree and the right part into a right subtree. THen we use recursive function to do the same process to the subtrees until it's done completely
3. Time complexity is O(n) since we need to process every element of array to turn them into nodes
4. Space complexity is O(n) since we create a whole new BST that is the same size as the given array
5. I liked this task because in the beginning I thought that arrays and BSTs are the same and they are just portrayed differently. Now I know that they also have different properties so it was interesting to fit array into a BST
