package org.seedstack.samples.store.interfaces.rest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.seedstack.samples.store.interfaces.rest.Paging;

public class Paging_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Paging paging0 = new Paging();
      Integer integer0 = new Integer(0);
      paging0.setPageSize(integer0);
      Integer integer1 = paging0.getPageSize();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Paging paging0 = new Paging();
      Integer integer0 = new Integer(1);
      paging0.setPageSize(integer0);
      Integer integer1 = paging0.getPageSize();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Paging paging0 = new Paging();
      Integer integer0 = new Integer((-106));
      paging0.setPageSize(integer0);
      Integer integer1 = paging0.getPageSize();
      assertEquals((-106), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Paging paging0 = new Paging();
      Long long0 = new Long(1L);
      paging0.setPageIndex(long0);
      Long long1 = paging0.getPageIndex();
      assertEquals(1L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Paging paging0 = new Paging();
      Long long0 = new Long(0L);
      paging0.setPageIndex(long0);
      Long long1 = paging0.getPageIndex();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Paging paging0 = new Paging();
      Long long0 = new Long((-747L));
      paging0.setPageIndex(long0);
      Long long1 = paging0.getPageIndex();
      assertEquals((-747L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Paging paging0 = new Paging();
      Long long0 = new Long((-287L));
      paging0.setPageIndex(long0);
      Long long1 = paging0.getPageIndex();
      assertEquals((-287L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Paging paging0 = new Paging();
      Long long0 = paging0.getPageIndex();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Paging paging0 = new Paging();
      Integer integer0 = paging0.getPageSize();
      assertNull(integer0);
  }
}
