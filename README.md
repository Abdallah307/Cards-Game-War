# Cards-Game-War
## The Cards War game is played with a list of N cards and two players: you and your opponent. The players take turns and in each turn a player takes either the card at the front of the list or the card at the back of the list. Each card has a certain numerical value. When a player takes a card, the card value is added to the player.

## Your task is to find the maximum value you can accumulate assuming you start the first move. Also find the sequence of moves you made to get that maximum value. Note that you must assume that your opponent is as smart as you are, i.e. your opponent will always take the card that is more profitable to him/her. You can assume that N is always even.


Input Format

Number_of_cards

Card_1 Value
Card_2 Value
Card_3 Value
...
Card_N Value

Constraints

N is always even
Values are always positive
Output Format

Total_Accumulated_Value

Sequence of moves with no spaces (your moves in Capital, your opponents' in Small)

Sample Input 0

6
6
4
2
8
10
3
Sample Output 0

18
Sample Input 1

20
3
9
2
3
10
3
5
2
6
8
3
6
8
7
2
5
8
6
1
7
5
9
4
2
4
7
5
7
2
3
4
5
8
7
9
5
4
3
4
5
6
4
3
4
Sample Output 1

59
