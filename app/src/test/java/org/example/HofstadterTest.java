package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class HofstadterTest {
  Hofstadter h;

  @BeforeEach
  void setUp() {
    h = new Hofstadter();
  }

  @Test
  void testZeroethElement() {
    assertEquals(0, h.gSequence(0));
  }

  @Test 
  void testFirstElement() {
    assertEquals(1, h.gSequence(1));
  }

  @Test 
  void testSecondElement() {
    assertEquals(1, h.gSequence(2));
  }

  @Test 
  void testThirdElement() {
    assertEquals(2, h.gSequence(3));
  }

  @Test 
  void testFourthElement() {
    assertEquals(3, h.gSequence(4));
  }

  @Test 
  void testFifthElement() {
    assertEquals(3, h.gSequence(5));
  }

  @Test 
  void testSixthElement() {
    assertEquals(4, h.gSequence(6));
  }

  @Test 
  void testSeventhElement() {
    assertEquals(4, h.gSequence(7));
  }

  @Test 
  void testEighthElement() {
    assertEquals(5, h.gSequence(8));
  }

  @Test 
  void testNinthElement() {
    assertEquals(6, h.gSequence(9));
  }

  @Test 
  void testTenthElement() {
    assertEquals(6, h.gSequence(10));
  }

  @Test 
  void testEleventhElement() {
    assertEquals(7, h.gSequence(11));
  }

}
