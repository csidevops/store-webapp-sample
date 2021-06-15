package org.seedstack.samples.store.interfaces.rest.customer;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.seedstack.samples.store.interfaces.rest.customer.CustomerRepresentation;

public class CustomerRepresentation_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation("]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6");
      String string0 = customerRepresentation0.getLastName();
      assertEquals("]YY|(B:mOcbFg;{*6", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation("]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6");
      customerRepresentation0.setLastName("");
      String string0 = customerRepresentation0.getLastName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation("]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6");
      String string0 = customerRepresentation0.getId();
      assertEquals("]YY|(B:mOcbFg;{*6", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation();
      customerRepresentation0.setId("");
      String string0 = customerRepresentation0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation("]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6");
      String string0 = customerRepresentation0.getFirstName();
      assertEquals("]YY|(B:mOcbFg;{*6", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation("]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6");
      customerRepresentation0.setFirstName("");
      String string0 = customerRepresentation0.getFirstName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation("]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6");
      String string0 = customerRepresentation0.getDeliveryAddress();
      assertEquals("]YY|(B:mOcbFg;{*6", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation("]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6", "]YY|(B:mOcbFg;{*6");
      customerRepresentation0.setAddress("");
      String string0 = customerRepresentation0.getAddress();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation();
      String string0 = customerRepresentation0.getDeliveryAddress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation();
      String string0 = customerRepresentation0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation();
      customerRepresentation0.setDeliveryAddress("");
      String string0 = customerRepresentation0.getDeliveryAddress();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation();
      String string0 = customerRepresentation0.getAddress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation();
      customerRepresentation0.setAddress("ij*V7U;S##");
      String string0 = customerRepresentation0.getAddress();
      assertEquals("ij*V7U;S##", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation();
      String string0 = customerRepresentation0.getLastName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CustomerRepresentation customerRepresentation0 = new CustomerRepresentation();
      String string0 = customerRepresentation0.getFirstName();
      assertNull(string0);
  }
}
