package F$$ExceptionsAndAssertions.C$$UsingMultiCatch;

public class inValidMultiCatch {

   /* The exam might try to trick you with invalid syntax. Remember that the exceptions can
    be listed in any order within the catch clause. However, the variable name must appear
    only once and at the end. Do you see why these are valid or invalid?
            catch(Exception1 e | Exception2 e | Exception3 e)
// DOES NOT COMPILE
            catch(Exception1 e1 | Exception2 e2 | Exception3 e3) // DOES NOT COMPILE
            catch(Exception1 | Exception2 | Exception3 e)*/

   /*Java intends multi-catch to be used for exceptions that aren’t related, and it prevents you
from specifying redundant types in a multi-catch. Do you see what is wrong here?
try {
throw new IOException();
} catch (FileNotFoundException | IOException e) { } // DOES NOT COMPILE
FileNotFoundException is a subclass of IOException .*/
}
