package org.seedstack.samples.store.interfaces.data;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import org.seedstack.samples.store.interfaces.data.CategoryDTO;

public class CategoryDTO_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      categoryDTO0.setUrlImg("");
      String string0 = categoryDTO0.getUrlImg();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      LinkedList<CategoryDTO.ProductDTO> linkedList0 = new LinkedList<CategoryDTO.ProductDTO>();
      linkedList0.push(categoryDTO_ProductDTO0);
      categoryDTO0.setProducts(linkedList0);
      List<CategoryDTO.ProductDTO> list0 = categoryDTO0.getProducts();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      categoryDTO0.setName("g>4XCQBEGR`fk");
      String string0 = categoryDTO0.getName();
      assertEquals("g>4XCQBEGR`fk", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      categoryDTO0.setName("");
      String string0 = categoryDTO0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      String string0 = categoryDTO_ProductDTO0.getPicture();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      String string0 = categoryDTO_ProductDTO0.getDesignation();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      Double double0 = categoryDTO_ProductDTO0.getPrice();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      String string0 = categoryDTO_ProductDTO0.getSummary();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      categoryDTO_ProductDTO0.setSummary("Ami");
      assertNull(categoryDTO_ProductDTO0.getPrice());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      categoryDTO_ProductDTO0.setPicture("");
      assertNull(categoryDTO_ProductDTO0.getSummary());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      categoryDTO_ProductDTO0.setDetails("");
      assertNull(categoryDTO_ProductDTO0.getPrice());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      String string0 = categoryDTO_ProductDTO0.getCategory();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      String string0 = categoryDTO_ProductDTO0.getDetails();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      categoryDTO_ProductDTO0.setDesignation((String) null);
      assertNull(categoryDTO_ProductDTO0.getPrice());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      categoryDTO_ProductDTO0.setCategory("");
      assertNull(categoryDTO_ProductDTO0.getSummary());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryDTO.ProductDTO categoryDTO_ProductDTO0 = new CategoryDTO.ProductDTO();
      categoryDTO_ProductDTO0.setPrice((Double) null);
      assertNull(categoryDTO_ProductDTO0.getSummary());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      String string0 = categoryDTO0.getUrlImg();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      String string0 = categoryDTO0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      categoryDTO0.setUrlImg(";v($8U`");
      String string0 = categoryDTO0.getUrlImg();
      assertEquals(";v($8U`", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      LinkedList<CategoryDTO.ProductDTO> linkedList0 = new LinkedList<CategoryDTO.ProductDTO>();
      categoryDTO0.setProducts(linkedList0);
      List<CategoryDTO.ProductDTO> list0 = categoryDTO0.getProducts();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryDTO categoryDTO0 = new CategoryDTO();
      List<CategoryDTO.ProductDTO> list0 = categoryDTO0.getProducts();
      assertNull(list0);
  }
}
