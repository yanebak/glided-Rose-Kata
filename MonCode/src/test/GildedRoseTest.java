package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.name, is("foo"));
  }

  @Test
  @DisplayName("Test failed  !!! quality must to be positive")    
  void testQualityPositive() {
    Item element = new Item("Example",10, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, greaterThanOrEqualTo(0));

  } 
  /** 
  @Test
  @DisplayName("FAILED!!! quality ")
  void test15() {
    Item element = new Item("Aged Brie",10, 47);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, greaterThanOrEqualTo(50));  
  }*/

  @Test
  @DisplayName("Test failed  !!! sellIn can be negative")    
  void testSellIn() {
    Item element = new Item("Example",0, 2);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.sellIn, lessThanOrEqualTo(0));

  }

  @Test
  @DisplayName("FAILED!!! 80 only for Sulfuras ")
  void test1() {
    Item element = new Item("Sulfuras, Hand of Ragnaros",10, 80);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(80));
  }

  @Test
  @DisplayName("FAILED!!! quality is under 50")
  void test14() {
    Item element = new Item("Aged Brie",10, 48);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, lessThan(50));  
  }
  @Test
  @DisplayName("FAILED!!! quality!!!")
  void test16() {
    Item element = new Item("Aged Brie",9, 48);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(49));  
  }
 
  @Test
  @DisplayName("FAILED!!! display")
  void test13() {
    Item element = new Item("Aged Brie",10, 42);
    GildedRose app = new GildedRose(new Item[] {element});
    assertThat(element.toString(), equalTo ("Aged Brie, 10, 42") );
  }

  @Test
  @DisplayName("FAILED!!! quality degrades twice as fast")
  void test2() {
    Item element = new Item("Adf",0, 38);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(36));  
  }

  @Test
  @DisplayName("FAILED!!! quality don't change for sulfuras")
  void test3() {
    Item element = new Item("Sulfuras, Hand of Ragnaros",0, 80);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(80));  
  }

  @Test
  @DisplayName("FAILED!!! sulfuras don't have peremption date")
  void test4() {
    Item element = new Item("Sulfuras, Hand of Ragnaros",0, 80);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.sellIn, equalTo(0));  
  }

  @Test
  @DisplayName("FAILED!! quality degrades ")
  void test5() {
    Item element = new Item("Example",12, 45);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(44));  
  }
/***
  @Test
  @DisplayName("FAILED!!! sellIn degrades ")
  void test6() {
    Item element = new Item("Example",12, 45);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.sellIn, equalTo(11));  
  }
*/
  @Test
  @DisplayName("FAILED!!! quality increase")
  void test11() {
    Item element = new Item("Aged Brie",12, 45);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    if (( element.name.equals("Aged Brie")) && (element.sellIn == 11) ) {
        assertThat(element.quality, equalTo(46));
    } 
  }

  @Test
  @DisplayName("FAILED!!! quality increase")
  void test7() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",15, 44);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    if ((element.name.equals("Backstage passes to a TAFKAL80ETC concert"))  && (element.sellIn == 14) ) {
        assertThat(element.quality, equalTo(45));
    } 
  }

  @Test
  @DisplayName("FAILED!!! quality increase twice when sellIn <= 10")
  void test8() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",9, 45);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    if ( (element.sellIn < 11) && (element.name.equals("Backstage passes to a TAFKAL80ETC concert")) )  {
        assertThat(element.quality, equalTo(47));
    } 
  }

  @Test
  @DisplayName("FAILED!!!  quality increase three times when sellIn <= 5")
  void test9() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",4, 45);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    if ((element.sellIn < 11) && (element.name.equals("Backstage passes to a TAFKAL80ETC concert") )) {
        assertThat(element.quality, equalTo(48));
    } 
  }

  @Test
  @DisplayName("FAILED!!!  quality is 0")
  void test12() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",-3, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(0));
  }

  @Test
  @DisplayName("FAILED!!! quality sddd")
  void test10() {
    Item element = new Item("Aged Brie",-2, 37);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(39));

  }

  @Test
  @DisplayName("FAILED!!!  conjured quality degrades twice..")
  void test17() {
    Item element = new Item("Conjured Mana Cake",14, 34);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(32));

  }
  @Test
  @DisplayName("FAILED!!!  conjured quality degrades four times..")
  void test18() {
    Item element = new Item("Conjured Mana Cake",-1, 34);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.quality, equalTo(30));

  }
}
