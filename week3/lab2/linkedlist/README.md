1. In this task we need to check if a linked list has a cycle. If there is a cycle we return true. If not we return false
2. My solution uses two pointers - slow and fast. Both of them start at the head of the linked list. Then we use a while loop to move them through the list. The slow pointer moves one node at a time while the fast pointer moves two nodes at a time. After each movement we check if they are pointing to the same node. If they meet it means there is a cycle so we return true. If the fast pointer reaches null it means the list has an end and there is no cycle so we return false
3. The time complexity here is O(n) because we go through the linked list using two pointers
4. The space complexity here is O(1) because we only use two additional pointers 
5. I think my solution is really simple and efficient. Instead of storing all the visited nodes in a separate list or set we just use two pointers moving at different speeds
