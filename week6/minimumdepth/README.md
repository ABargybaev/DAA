1. Here we need to find the minimum depth of a binary treex
2. First we check if the root is null, if it is we return 0. If it's not we create a queue and add the root to it. Then we start checking the tree level by level. For each node we check if it has no left and right children. If it doesn't it means we found a leaf so we return the current depth. If the node has children we add them to the queue and continue checking. After finishing each level we increase the depth by 1. Since we check the tree level by level the first leaf we find will always be the nearest one
3. The time complexity here is O(n) because in the worst case we might need to visit every node in the tree before finding a leaf
4. The space complexity here is O(n) because we use a queue to store the nodes that we still need to visit
5. I think my solution is pretty efficient because we don't need to check the whole tree if we find a leaf early
