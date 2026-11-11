1. In this task we need to merge two binary trees into one tree
2. First we check if one of the roots is null. If it is we just return the other root because there's nothing to merge. If it's not we create a new node with the sum of both root values. Then we merge the left children of both trees and do the same for the right children. We repeat this process until all the nodes are merged. Then we return the root of our merged tree
3. The time complexity here is O(n+m), n and m - numbers of nodes in the two trees. Because we need to go through all nodes of both trees
4. The space complexity here is O(n+m) in the worst case because we create new nodes for the overlapping parts of the trees
5. I think my solution is really simple and efficient. We don't need any additional arrays or lists we just use recursion to merge the nodes
