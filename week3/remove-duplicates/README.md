1) In this problem we are given a list where the goal is to leave only unique numbers, no duplicates. So if there a duplicate of a number, we only leave one of it
2) The solution is simple. With while loop (whch itself checks if the algorithm came to the enf of the list) we compare the value of the selected current number to the next one. If it is the same which we don't need, we skip it and compare the next one. If it's not, we leave the current one and start the same process with the next.
3) Here time complexity is O(n) because here we just check the whole list once
4) Space complexity is O(1) because we don't create anything else other than a small variable current, we just check the same one list
5) I think this solution is one of the easiest and most efficient ones, it requieres like 5 rows and there's nothing speacial
