package I$$NIO.F$$ComparingLegacyFileandNIO2Methods;

public class TheTheoryOfEveryThing {
    /*We conclude this chapter with Table 9.5, which shows a comparison between some of
the legacy java.io.File methods described in Chapter 8 and the new NIO.2 methods
described in this chapter. In this table, file refers to an instance of the java.io.File class,
while path refers to an instance of a NIO.2 Path interface.
Ta b l e   9 . 5     Comparison of legacy File and NIO.2 methods
Legacy Method           NIO.2 Method
file.exists()           Files.exists(path)
file.getName()          path.getFileName()
file.getAbsolutePath()  path.toAbsolutePath()
file.isDirectory()      Files.isDirectory(path)
file.isFile()           Files.isRegularFile(path)
file.isHidden()         Files.isHidden(path)
file.length()           Files.size(path)
file.lastModified()     Files.getLastModifiedTime(path)
file.setLastModified(time) Files.setLastModifiedTime(path,fileTime)
file.delete()            Files.delete(path)
file.renameTo(otherFile) Files.move(path,otherPath)
file.mkdir()             Files.createDirectory(path)
file.mkdirs()           Files.createDirectories(path)
file.listFiles()        Files.list(path)*/

}
