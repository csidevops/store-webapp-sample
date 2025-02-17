package org.seedstack.samples.store.interfaces.rest.product;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.seedstack.samples.store.interfaces.rest.product.ProductRepresentation;

public class ProductRepresentation_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      String string0 = productRepresentation0.getSummary();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double(0.0);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(1L, "", "", "\"NDqnUEpX%bt", "\"NDqnUEpX%bt", double0);
      String string0 = productRepresentation0.getSummary();
      assertEquals("", string0);
      assertEquals("\"NDqnUEpX%bt", productRepresentation0.getPicture());
      assertEquals("\"NDqnUEpX%bt", productRepresentation0.getDetails());
      assertEquals(1L, (long)productRepresentation0.getId());
      assertEquals("", productRepresentation0.getDesignation());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double double0 = new Double(0.0);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(1L, "", "", "\"NDqnUEpX%bt", "\"NDqnUEpX%bt", double0);
      productRepresentation0.getPrice();
      assertEquals("", productRepresentation0.getDesignation());
      assertEquals("", productRepresentation0.getSummary());
      assertEquals("\"NDqnUEpX%bt", productRepresentation0.getPicture());
      assertEquals("\"NDqnUEpX%bt", productRepresentation0.getDetails());
      assertEquals(1L, (long)productRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double((-1236.2159995));
      ProductRepresentation productRepresentation0 = new ProductRepresentation(0L, "", "", "", "", double0);
      Double double1 = productRepresentation0.getPrice();
      assertEquals((-1236.2159995), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double double0 = new Double(392L);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(392L, "", "", "", "", double0);
      productRepresentation0.getPrice();
      assertEquals(392L, (long)productRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double double0 = new Double(0L);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(0L, "-kmuHe-a,2H`+nr4mK", "-kmuHe-a,2H`+nr4mK", "-kmuHe-a,2H`+nr4mK", "-kmuHe-a,2H`+nr4mK", double0);
      String string0 = productRepresentation0.getPicture();
      assertEquals("-kmuHe-a,2H`+nr4mK", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      productRepresentation0.setId(0L);
      Long long0 = productRepresentation0.getId();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Double double0 = new Double(0.0);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(1L, "", "", "\"NDqnUEpX%bt", "\"NDqnUEpX%bt", double0);
      Long long0 = productRepresentation0.getId();
      assertEquals("\"NDqnUEpX%bt", productRepresentation0.getPicture());
      assertEquals("\"NDqnUEpX%bt", productRepresentation0.getDetails());
      assertEquals("", productRepresentation0.getSummary());
      assertEquals("", productRepresentation0.getDesignation());
      assertEquals(1L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double double0 = new Double(4393L);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(4393L, "", "", "M13", "", double0);
      String string0 = productRepresentation0.getDetails();
      assertEquals("", productRepresentation0.getPicture());
      assertEquals("M13", string0);
      assertEquals("", productRepresentation0.getSummary());
      assertEquals(4393L, (long)productRepresentation0.getId());
      assertEquals("", productRepresentation0.getDesignation());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double double0 = new Double(463.32941);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(1315L, "JR4jB%0@}RG", "JR4jB%0@}RG", "JR4jB%0@}RG", "", double0);
      String string0 = productRepresentation0.getDesignation();
      assertEquals("JR4jB%0@}RG", productRepresentation0.getDetails());
      assertEquals("JR4jB%0@}RG", string0);
      assertEquals("", productRepresentation0.getPicture());
      assertEquals("JR4jB%0@}RG", productRepresentation0.getSummary());
      assertEquals(1315L, (long)productRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double double0 = new Double(392L);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(392L, "", "", "", "", double0);
      productRepresentation0.getDesignation();
      assertEquals(392L, (long)productRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      Long long0 = new Long((-3300L));
      productRepresentation0.setCategoryId(long0);
      Long long1 = productRepresentation0.getCategoryId();
      assertEquals((-3300L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = new Double(0L);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(0L, "-kmuHe-a,2H`+nr4mK", "-kmuHe-a,2H`+nr4mK", "-kmuHe-a,2H`+nr4mK", "-kmuHe-a,2H`+nr4mK", double0);
      Long long0 = new Long(0L);
      productRepresentation0.setCategoryId(long0);
      Long long1 = productRepresentation0.getCategoryId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double double0 = new Double(0.0);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(1L, "", "", "\"NDqnUEpX%bt", "\"NDqnUEpX%bt", double0);
      Long long0 = Long.getLong("", 1L);
      productRepresentation0.setCategoryId(long0);
      productRepresentation0.getCategoryId();
      assertEquals("\"NDqnUEpX%bt", productRepresentation0.getDetails());
      assertEquals(1L, (long)productRepresentation0.getId());
      assertEquals("", productRepresentation0.getSummary());
      assertEquals("\"NDqnUEpX%bt", productRepresentation0.getPicture());
      assertEquals("", productRepresentation0.getDesignation());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      Long long0 = new Long(2021L);
      productRepresentation0.setCategoryId(long0);
      Long long1 = productRepresentation0.getCategoryId();
      assertEquals(2021L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      String string0 = productRepresentation0.getDetails();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      productRepresentation0.setPicture("");
      String string0 = productRepresentation0.getPicture();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      Long long0 = productRepresentation0.getCategoryId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      productRepresentation0.setId((-1L));
      Long long0 = productRepresentation0.getId();
      assertEquals((-1L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      String string0 = productRepresentation0.getDesignation();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      productRepresentation0.setSummary("");
      assertNull(productRepresentation0.getId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      Double double0 = new Double(1431.471);
      productRepresentation0.setPrice(double0);
      assertNull(productRepresentation0.getDetails());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      String string0 = productRepresentation0.getPicture();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      productRepresentation0.setDetails("");
      String string0 = productRepresentation0.getDetails();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      Double double0 = productRepresentation0.getPrice();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      productRepresentation0.setDesignation("");
      assertEquals("", productRepresentation0.getDesignation());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Double double0 = new Double(0L);
      ProductRepresentation productRepresentation0 = new ProductRepresentation(0L, "4", "4", "4", "4", double0);
      String string0 = productRepresentation0.getSummary();
      assertEquals("4", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ProductRepresentation productRepresentation0 = new ProductRepresentation();
      Long long0 = productRepresentation0.getId();
      productRepresentation0.setCategoryId(long0);
      assertNull(productRepresentation0.getPicture());
  }
}
