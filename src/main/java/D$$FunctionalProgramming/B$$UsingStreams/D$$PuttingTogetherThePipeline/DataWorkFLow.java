package D$$FunctionalProgramming.B$$UsingStreams.D$$PuttingTogetherThePipeline;

public class DataWorkFLow {

    //data flow looks like this:
    //1. 	 stream() sends Toby to filter() . filter() sees that the length is good and sends Toby
    //to sorted() . sorted() can’t sort yet because it needs all of the data, so it holds Toby.

    //2. 	 stream() sends Anna to filter() . filter() sees that the length is good and sends Anna
    //to sorted() . sorted() can’t sort yet because it needs all of the data, so it holds Anna.

    //3. 	 stream() sends Leroy to filter() . filter() sees that the length is not a match, and it
    //takes Leroy out of the assembly line processing.

    //4. 	 stream() sends Alex to filter() . filter() sees that the length is good and sends Alex
    //to sorted() . sorted() can’t sort yet because it needs all of the data, so it holds Alex. It
    //turns out sorted() does have all of the required data, but it doesn’t know it yet.

    //5. 	 The foreman lets sorted() know that it is time to sort and the sort occurs.

    //6. 	 sorted() sends Alex to limit() . limit() remembers that it has seen one element and
    //sends Alex to forEach() , printing Alex .

    //7. 	 sorted() sends Anna to limit() . limit() remembers that it has seen two elements
    //and sends Anna to forEach() , printing Anna .

    //8. 	 limit() has now seen all of the elements that are needed and tells the foreman. The
    //foreman stops the line, and no more processing occurs in the pipeline.
}
