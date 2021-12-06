package com.gildedrose;

class ItemUpdate{
    private Item item;

    public ItemUpdate(Item item){
        this.item = item;
    } 

    public void increaseQuality(Item item){
        item.quality = item.quality + 1;
    }  
    
    public void decreaseQuality(Item item){
        item.quality = item.quality - 1;
    } 

    public void updgrageQualitySulfuras(){} 

    public void updgrageQualityAgedBrie(){
            item.sellIn--;
            if ( item.quality > 50 ){}
                increaseQuality(item);
            
            if (item.sellIn < 0) {
                increaseQuality(item);
                } 
        
    }
    
    
    public void updgrageQualityBackstage(){
            item.sellIn--;
            
            if (item.quality >= 50 ){ }  

            increaseQuality(item);

            if (item.sellIn < 10) {
                increaseQuality(item);
            }

            if (item.sellIn < 5) {
               increaseQuality(item);
            }

            if (item.sellIn < 0){
                item.quality = 0;
            }
                
    } 
    
    public void updgrageQualityNormal(){
            item.sellIn--;
            if (item.quality > 0 && item.quality < 50 ){
                decreaseQuality(item);
                if (item.sellIn <= 0) {
                    decreaseQuality(item);
                }
            }   
      
    } 

    public void updgrageQualityConjured(){
          item.sellIn--;
            if (item.quality > 0 && item.quality < 50 ){
                decreaseQuality(item);
                decreaseQuality(item);

                if (item.sellIn < 0){
                    decreaseQuality(item);
                    decreaseQuality(item); 
                 } 
            }   
    } 
    public void updateQuality(){
        
        switch (item.name){

                case "Aged Brie" :
                    updgrageQualityAgedBrie();
                    break ;

                case "Backstage passes to a TAFKAL80ETC concert" :
                    updgrageQualityBackstage();
                    break ;
                
                case "Sulfuras, Hand of Ragnaros" :
                    updgrageQualitySulfuras();
                    break ;
                
                case "Conjured Mana Cake" :
                    updgrageQualityConjured();
                    break ;

                default :
                    updgrageQualityNormal();
                    break;
            } 


    }   
} 