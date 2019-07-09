package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class Array2Test {

  Array2 array = new Array2();

  int[] row1 = {1, 2, 2};
  int[] row2 = {4, 4, 1};
  int[] row3 = {4, 4, 1, 2, 2};
  int[] row4 = {1, 2, 3, 4};
  int[] row5 = {3, 5, 9};
  int[] row6 = {1, 2, 3, 4, 4};
  int[] row7 = {2, 2, 3, 4};
  int[] row8 = {1, 2, 3, 2, 2, 4};
  int[] row9 = {1, 2, 3, 2, 2, 4, 4};
  int[] row10 = {1, 2};
  int[] row11 = {2, 2};
  int[] row12 = {4, 4};
  int[] row13 = {2};
  int[] row14 = {};


  int[] pre4one = {1, 2, 4, 1};
  int[] pre4two = {3, 1, 4};
  int[] pre4three = {1, 4, 4};
  int[] pre4four = {1, 4, 4, 2};
  int[] pre4five = {1, 3, 4, 2, 4};
  int[] pre4six = {4, 4};
  int[] pre4seven = {3, 3, 4};
  int[] pre4eight = {1, 2, 1, 4};
  int[] pre4nine = {2, 1, 4, 2};
  int[] pre4ten = {2, 1, 2, 1, 4, 2};


  int[] run1 = {1, 2};
  int[] run2 = {3, 1};
  int[] run3 = {1};
  int[] run4 = {1};
  int[] run5 = {1, 3};
  int[] run6 = {};
  int[] run7 = {3, 3};
  int[] run8 = {1, 2, 1};
  int[] run9 = {2, 1};
  int[] run10 = {2, 1, 2, 1};


  //@ParameterizedTest
  //void either24(int [] nums, boolean expected) {
  //  boolean actual = array.either24(nums);
  //  if (expected) {
  //    assertTrue(actual);
  //
  //  }else {
  //    assertFalse(actual);
  //
  //  }

  @Test
  void either24() {



    assertAll("Test either24",
        () -> assertTrue(array.either24(row1)),
        () -> assertTrue(array.either24(row2)),
        () -> assertFalse(array.either24(row3)),
        () -> assertFalse(array.either24(row4)),
        () -> assertFalse(array.either24(row5)),
        () -> assertTrue(array.either24(row6)),
        () -> assertTrue(array.either24(row7)),
        () -> assertTrue(array.either24(row8)),
        () -> assertFalse(array.either24(row9)),
        () -> assertFalse(array.either24(row10)),
        () -> assertTrue(array.either24(row11)),
        () -> assertTrue(array.either24(row12)),
        () -> assertFalse(array.either24(row13)),
        () -> assertFalse(array.either24(row14))
    );

    //assertTrue(array.either24(row1));
    //assertTrue(array.either24(row2));
    //assertFalse(array.either24(row3));
    //assertFalse(array.either24(row4));
    //assertFalse(array.either24(row5));
    //assertTrue(array.either24(row6));
    //assertTrue(array.either24(row7));
    //assertTrue(array.either24(row8));
    //assertFalse(array.either24(row9));
    //assertFalse(array.either24(row10));
    //assertTrue(array.either24(row11));
    //assertTrue(array.either24(row12));
    //assertFalse(array.either24(row13));
    //assertFalse(array.either24(row14));

  }

  @Test
  void pre4() {

    assertAll("Test pre4",
        () -> assertArrayEquals(array.pre4(pre4one), run1),
        () -> assertArrayEquals(array.pre4(pre4two), run2),
        () -> assertArrayEquals(array.pre4(pre4three), run3),
        () -> assertArrayEquals(array.pre4(pre4four), run4),
        () -> assertArrayEquals(array.pre4(pre4five), run5),
        () -> assertArrayEquals(array.pre4(pre4six), run6),
        () -> assertArrayEquals(array.pre4(pre4seven), run7),
        () -> assertArrayEquals(array.pre4(pre4eight), run8),
        () -> assertArrayEquals(array.pre4(pre4nine), run9),
        () -> assertArrayEquals(array.pre4(pre4ten), run10)

    );


  }


}