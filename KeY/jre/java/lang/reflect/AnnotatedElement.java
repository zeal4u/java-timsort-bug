/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.lang.reflect;

public interface AnnotatedElement
{


   /*@ requires true; ensures true; assignable \everything; */
   public boolean isAnnotationPresent(java.lang.Class arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.annotation.Annotation getAnnotation(java.lang.Class arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.annotation.Annotation[] getAnnotations();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.annotation.Annotation[] getDeclaredAnnotations();
}