# p2-1 Arrays Practice

(1) Write a program that accepts 10 integers from the keyboard and displays the list in reverse order.

(2) Write a program that asks the user how many numbers they want to input. Declare an array to accept that many numbers. Output the largest, smallest, and average of the numbers entered.

(3) Write a program which asks a user for a number in the range 0 to 51. The number represents a card in a standard deck of cards. Use a 2 dimensional array as follows:
 * use dimension 1 for the suit => 0 for clubs, 1 for diamonds, 2 for hearts and 3 for spades
 * use dimension 2 for the rank => 0 for aces, 1 for 2, 2 for 3, ... 9 for 10, 10 for jack, 11 for queen, and 12 for king

When the input is received, decode it as follows:

Input|Card|Input|Card|Input|Card|Input|Card
---|---|---|---|---|---|---|---
0|ace of clubs|13|ace of diamonds|26|ace of hearts|39|ace of spades
1|2 of clubs|14|2 of diamonds|27|2 of hearts|40|2 of spades
2|3 of clubs|15|3 of diamonds|28|3 of hearts|41|3 of spades
3|4 of clubs|16|4 of diamonds|29|4 of hearts|42|4 of spades
4|5 of clubs|17|5 of diamonds|30|5 of hearts|43|5 of spades
5|6 of clubs|18|6 of diamonds|31|6 of hearts|44|6 of spades
6|7 of clubs|19|7 of diamonds|32|7 of hearts|45|7 of spades
7|8 of clubs|20|8 of diamonds|33|8 of hearts|46|8 of spades
8|9 of clubs|21|9 of diamonds|34|9 of hearts|47|9 of spades
9|10 of clubs|22|10 of diamonds|35|10 of hearts|48|10 of spades
10|jack of clubs|23|jack of diamonds|36|jack of hearts|49|jack of spades
11|queen of clubs|24|queen of diamonds|37|queen of hearts|50|queen of spades
12|king of clubs|25|king of diamonds|38|king of hearts|51|king of spades

(4) Write a program that creates an integer  deck[52]  and initializes it as follows:
 * deck[0] = 0
 * deck[1] = 1
 * deck[2] = 2
 
 ...
 
 * deck[51] = 51
 
Generate a random number in the range 0 to 51. (e.g. 42). Use this random number as the pointer to the first of two array elements to be swapped. (e.g. deck[42]). Interchange (swap) the array element and the next one in the array (e.g. deck[42] and deck[43]).  Take special care if the random number happens to be equal to 51 (i.e. probably want to swap deck[51] and deck[0]).
 * Print out the entire deck after one swap has occurred.
 * Print out the array after 10 swaps have occurred.
 * Print out the array after 100 swaps have occurred.
 
As an enhancement, print out the names of the cards instead of printing out numbers.
Thought exercise: how many swaps is a "reasonable number" to ensure that the deck is sufficiently randomized to begin playing a game?

(5) Write a program that "deals" five cards into each of two "hands" (set up two more arrays called hand1[5] and hand2[5]). As a "card" is moved from the "deck" to the "hand", replace the number in the "deck" with a -999 to indicate that this card has been dealt out.

As an enhancement, check if there are any pairs in either hand.

