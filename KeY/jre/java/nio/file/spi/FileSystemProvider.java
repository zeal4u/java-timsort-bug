/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.nio.file.spi;

public abstract class FileSystemProvider extends java.lang.Object
{


   /*@ requires true; ensures true; assignable \everything; */
   protected FileSystemProvider();

   /*@ requires true; ensures true; assignable \everything; */
   public static java.util.List installedProviders();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.lang.String getScheme();

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract java.nio.file.FileSystem newFileSystem(java.net.URI arg0, java.util.Map arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.file.FileSystem getFileSystem(java.net.URI arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.file.Path getPath(java.net.URI arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.nio.file.FileSystem newFileSystem(java.nio.file.Path arg0, java.util.Map arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.io.InputStream newInputStream(java.nio.file.Path arg0, java.nio.file.OpenOption[] arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.io.OutputStream newOutputStream(java.nio.file.Path arg0, java.nio.file.OpenOption[] arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.nio.channels.FileChannel newFileChannel(java.nio.file.Path arg0, java.util.Set arg1, java.nio.file.attribute.FileAttribute[] arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.nio.channels.AsynchronousFileChannel newAsynchronousFileChannel(java.nio.file.Path arg0, java.util.Set arg1, java.util.concurrent.ExecutorService arg2, java.nio.file.attribute.FileAttribute[] arg3) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract java.nio.channels.SeekableByteChannel newByteChannel(java.nio.file.Path arg0, java.util.Set arg1, java.nio.file.attribute.FileAttribute[] arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract java.nio.file.DirectoryStream newDirectoryStream(java.nio.file.Path arg0, java.nio.file.DirectoryStream$Filter arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void createDirectory(java.nio.file.Path arg0, java.nio.file.attribute.FileAttribute[] arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public void createSymbolicLink(java.nio.file.Path arg0, java.nio.file.Path arg1, java.nio.file.attribute.FileAttribute[] arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public void createLink(java.nio.file.Path arg0, java.nio.file.Path arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void delete(java.nio.file.Path arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public boolean deleteIfExists(java.nio.file.Path arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.nio.file.Path readSymbolicLink(java.nio.file.Path arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void copy(java.nio.file.Path arg0, java.nio.file.Path arg1, java.nio.file.CopyOption[] arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void move(java.nio.file.Path arg0, java.nio.file.Path arg1, java.nio.file.CopyOption[] arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract boolean isSameFile(java.nio.file.Path arg0, java.nio.file.Path arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract boolean isHidden(java.nio.file.Path arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract java.nio.file.FileStore getFileStore(java.nio.file.Path arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void checkAccess(java.nio.file.Path arg0, java.nio.file.AccessMode[] arg1) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; */
   public abstract java.nio.file.attribute.FileAttributeView getFileAttributeView(java.nio.file.Path arg0, java.lang.Class arg1, java.nio.file.LinkOption[] arg2);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract java.nio.file.attribute.BasicFileAttributes readAttributes(java.nio.file.Path arg0, java.lang.Class arg1, java.nio.file.LinkOption[] arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract java.util.Map readAttributes(java.nio.file.Path arg0, java.lang.String arg1, java.nio.file.LinkOption[] arg2) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void setAttribute(java.nio.file.Path arg0, java.lang.String arg1, java.lang.Object arg2, java.nio.file.LinkOption[] arg3) throws java.io.IOException;
}