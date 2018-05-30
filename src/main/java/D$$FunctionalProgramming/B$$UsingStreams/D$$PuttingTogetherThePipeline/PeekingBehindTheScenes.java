package D$$FunctionalProgramming.B$$UsingStreams.D$$PuttingTogetherThePipeline;

public class PeekingBehindTheScenes {
    /*The peek() method is useful for seeing how a stream pipeline works behind the scenes.
Remember that the methods run against each element one at a time until processing is
done. Suppose that we have this code:
Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
infinite.limit(5)
.filter(x -> x % 2 == 1)
.forEach(System.out::print);
// 135
The source is an infinite stream of odd numbers. Only the first five elements are allowed
through before the foreman instructs work to stop. The filter operation is limited to see-
ing if these five numbers from 1 to 5 are odd. Only three are, and those are the ones that
get printed, giving 135 .
Now what do you think this prints?
Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
infinite.limit(5)
.peek(System.out::print)
.filter(x -> x % 2 == 1)
.forEach(System.out::print);
The correct answer is 11233455 . As the first element passes through, 1 shows up in the
peek() and print() . The second element makes it past the limit() and peek() , but it
gets caught in the filter() . The third and fifth elements behave like the first element.
The fourth behaves like the second.
Reversing the order of the intermediate operations changes the result:
Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
infinite.filter(x -> x % 2 == 1)
.limit(5)
.forEach(System.out::print); // 13579
The source is still an infinite stream of odd numbers. The first element still flows
through the entire pipeline and limit() remembers that it allows one element
through. The second element doesn’t make it past filter() . The third element
flows through the entire pipeline and limit() prevents its second element. This
proceeds until the ninth element flows through and limit() has allowed its fifth
element through.
203204
Chapter 4  ■   Functional Programming
Finally, what do you think this prints?
Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
infinite.filter(x -> x % 2 == 1)
.peek(System.out::print)
.limit(5)
.forEach(System.out::print);
The answer is 1133557799 . Since filter() is before peek() , we see only the odd
numbers.*/
}
