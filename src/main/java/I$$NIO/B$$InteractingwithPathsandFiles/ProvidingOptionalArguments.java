package I$$NIO.B$$InteractingwithPathsandFiles;

public class ProvidingOptionalArguments {
    /*
    Table 9.1 lists the values that you should know for the exam. Note
that these descriptions apply to both files and directories. If you are not familiar with the
operations to which these attributes apply, don’t worry; we’ll explain them later in this chapter.
Ta b l e   9 .1     Common optional arguments in NIO.2
Enum Value          Usage                   Description
NOFOLLOW_LINKS      Test file existing      If provided, symbolic links when encountered
                     Read file data         will not be traversed. Useful for performing
                     Copy file               operations on symbolic links themselves rather
                     Move file                       than their target.

FOLLOW_LINKS        Traverse a directory    tree If provided, symbolic links when encountered
                                                will be traversed.
COPY_ATTRIBUTES          Copy file              If provided, all metadata about a file will be
                                                    copied with it.
REPLACE_EXISTING        Copy file
                        Move file               If provided and the target file exists, it will
                                                be replaced; otherwise, if it is not provided,
                                                an exception will be thrown if the file already
                                                  exists
ATOMIC_MOVE           Move file                 The operation is performed in an atomic
                                                manner within the file system, ensuring that
                                                any process using the file sees only a complete
                                                record. Method using it may throw an exception
                                                 if the feature is unsupported by the file system.
                                                 If the fi le
                                                system does not support this feature,
                                                an AtomicMoveNotSupportedException will be thrown.

     */
}
