In this task we need to sort an array to be in an ascending order
I used merge sort because we already worked with it in class and I wanted to try it here. First of all we divide the array into halves until. Then we sort the elements in the halves by ascending order. After that we need to merge them. Here a second array is created for a sorted array. First of all we take 2 halves and compare each element from them. We write those elements into array from the smallest to the biggest
The time complexity here is O(nlog(n)) because we get (log(n)) by dividing the array in halves and (n) when we compare elements
THe space complexity here is O(n) because here we used an additional array to merge the sorted halves that takes the same amount of elements (n) as the original array
This one wasn't so hard, but I used merge sort and I know there are more efficient sorting methods so mine is not the best one
