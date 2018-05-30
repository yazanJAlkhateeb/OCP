package I$$NIO.A$$IntroducingPath.CreatingPaths;

public class AbsoluteVSRelativeFileSystemDependent {
    /*
    In the explanation of the previous examples, we described the paths as absolute or rela-
tive within a specific file system. This is because some paths that are considered absolute
in some file systems are considered relative in others. For example, the path c:\zooinfo\
November\employees.csv in the previous example set is considered relative in a Linux or
Mac-based system, since it does not start with a forward slash, / . Likewise, the path
/home/zoodirector is considered relative in a Windows-based system, since it does not
start with a drive letter.
For the exam and throughout this text, you can use the following rules to determine
whether a path is absolute or relative. Just be aware that this may differ depending on
your actual file system.
■ ■ If a path starts with a forward slash, it is an absolute path, such as /bird/parrot .
■ ■ If a path starts with a drive letter, it is an absolute path, such as C:\bird\emu .
■ ■ Otherwise, it is a relative path, such as ..\eagle .
     */
}
