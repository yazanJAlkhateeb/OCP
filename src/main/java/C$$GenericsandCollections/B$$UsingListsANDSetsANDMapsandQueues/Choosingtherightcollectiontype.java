package C$$GenericsandCollections.B$$UsingListsANDSetsANDMapsandQueues;

public class Choosingtherightcollectiontype {
    /*Ta b l e   3 . 9     Choosing the right collection type
Which class do you choose when
you want ____________               Answer (single best type)           Reason
to pick the top zoo map off a
stack of maps ArrayDeque The description is of a last-in, first-out
data structure, so you need a stack,
which is a type of Queue . ( Stack would
also match this description, but it
shouldn’t be used for new code.)
to sell tickets to people in the
order in which they appear in
line and tell them their position
in line LinkedList The description is of a first-in, first-
out data structure, so you need a
queue. You also needed indexes, and
LinkedList is the only class to match
both requirements.
to write down the first names of
all of the elephants so that you
can tell them to your friend’s
three-year-old every time she
asks. (The elephants do not
have unique first names.) ArrayList Since there are duplicates, you need
a list rather than a set. You will be
accessing the list more often than
updating it, since three-year-olds ask
the same question over and over,
making an ArrayList better than a
LinkedList . Vector and Stack aren’t
used in new code.
to list the unique animals that
you want to see at the zoo today HashSet The keyword in the description is
unique. When you see “unique,” think
“set.” Since there were no require-
ments to have a sorted order or to
remember the insertion order, you use
the most efficient set.
to list the unique animals that
you want to see at the zoo today
in alphabetical order TreeSet Since it says “unique,” you need a set.
This time, you need to sort, so you
cannot use a HashSet .
to look up animals based on a
unique identifier HashMap Looking up by key should make you
think of a map. Since you have no
ordering or sorting requirements, you
should use the most basic map.*/
}
