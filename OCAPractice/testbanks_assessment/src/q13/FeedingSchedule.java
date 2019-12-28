package q13;

public class FeedingSchedule {
public static void main(String[] args) {
int x = 5, j = 0;
OUTER: for(int i=0; i<3; ){System.out.println(i);
INNER: do {
i++; x++;
if(x > 10) break INNER;
x += 4;
j++;
} while(j <= 2);}
System.out.println(x);
} }

// x is 12

// compared to Chapter 2 q9 which is a infinite loop without i update statement.