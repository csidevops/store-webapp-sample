package org.seedstack.samples.store.interfaces.rest.category;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.seedstack.samples.store.interfaces.rest.category.CategoryRepresentation;

public class CategoryRepresentation_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation();
      String string0 = categoryRepresentation0.getUrlImg();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation(1L, "", "");
      categoryRepresentation0.setUrlImg("org.seedstack.samples.store.interfaces.rest.category.CategoryRepresentation");
      categoryRepresentation0.getUrlImg();
      assertEquals(1L, (long)categoryRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation();
      String string0 = categoryRepresentation0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation(1L, "", "");
      categoryRepresentation0.setName("Ib\"s3");
      categoryRepresentation0.getName();
      assertEquals(1L, (long)categoryRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation();
      Long long0 = categoryRepresentation0.getId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation();
      categoryRepresentation0.setId(0L);
      Long long0 = categoryRepresentation0.getId();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation();
      categoryRepresentation0.setId((-1L));
      Long long0 = categoryRepresentation0.getId();
      assertEquals((-1L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation(1L, "", "");
      categoryRepresentation0.getUrlImg();
      assertEquals(1L, (long)categoryRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation(1L, "", "");
      categoryRepresentation0.getName();
      assertEquals(1L, (long)categoryRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CategoryRepresentation categoryRepresentation0 = new CategoryRepresentation(1L, "", "");
      Long long0 = categoryRepresentation0.getId();
      assertEquals(1L, (long)long0);
  }
}
