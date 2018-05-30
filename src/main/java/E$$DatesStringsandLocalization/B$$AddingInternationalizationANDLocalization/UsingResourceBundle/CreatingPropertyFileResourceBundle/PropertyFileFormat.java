package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.UsingResourceBundle.CreatingPropertyFileResourceBundle;

public class PropertyFileFormat {
    /*The most common syntax is where a property file contains key/value pairs in the format:
animal=dolphin
There’s more to it than that. There are actually two other formats that you can use to express
these pairs. Even if you never use them in your job, you need to know them for the exam:
animal:dolphin
animal dolphin
You might wonder how to express some other ideas in a property file. The common ones
are these:
■ ■ If a line begins with # or ! , it is a comment.
■ ■ Spaces before or after the separator character are ignored.
■ ■ Spaces at the beginning of a line are ignored.
■ ■ Spaces at the end of a line are not ignored.
■ ■ End a line with a backslash if you want to break the line for readability.
■ ■ You can use normal Java escape characters like \t and \n .

Putting these together, we can write the following:
# one comment
! another comment
key =
value\tafter tab
long = abcdefghijklm\
nopqrstuvwxyz
Printing out these two properties in a program gives us this:
value → after tab
abcdefghijklmnopqrstuvwxyz*/
}
