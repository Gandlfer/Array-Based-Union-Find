Union-Find

Tomorrow is Jack & Lucy’s wedding day. They have a lot of friends who will attend their
wedding and have dinner together afterwards. Jack and Lucy want to know minimum
number of tables they need to setup. And you must consider that not all the friends know
each other, and friends do not want to sit with strangers.

One rule for this is that if I tell you A knows B, and B knows C, that means A, B, C know each
other (i.e., “X knows Y” is a transitive relationship), so they can sit on the same table.
For example, if I tell you A knows B, B knows C, and D knows E, so A, B, C can sit on one
table, and D, E must sit on another table. Therefore, this instance needs at least 2 tables.

Input:
Your program reads inputs from a file. The file starts with a line of two integers N and M
(1<=N, M<=1000). N indicates the number of friends; the friends are marked from 1 to N.
Then M lines follow. Each line consists of two integers A and B (A != B), that means friend A
and friend B know each other.

Output:
Output how many tables they need at least.

Sample Input:
5 3
1 2
2 3
4 5

Sample Output:
2
