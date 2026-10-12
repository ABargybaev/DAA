1) In this task we need to remove the targetted node value, pretty simple
2) For this solution we check the nodes just like in the remove duplicates task. But there is also a problem, if the targetted node is a head of the list, the solution will be messed up. That's why I created a placeholder variable that is kinda like a savior of our list. It's lie a new head of our list, but at the end we will anyways output only everything after the placeholder, so it doesn't matter if the original head will get deleted or not.
3) 3) Here it's the same as in other ones, time complexity is O(n) because we check the list only once
   4) Space complexity is O(1) because we just use variables current and placeholder that don't really take many space
   5) This one was not that hard, I just had problems with the placeholder. Other than that IDK how I would make my solution better
