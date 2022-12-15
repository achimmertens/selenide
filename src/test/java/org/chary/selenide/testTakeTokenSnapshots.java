package org.chary.selenide;

import net.bytebuddy.build.Plugin;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class testTakeTokenSnapshots {

    Download download = new Download();

    @Test
    @Order(1)
    void takeBeer() {
        assertThat(download.getImage("Token/04_HivePrice",4,"https://coinmarketcap.com/currencies/hive-blockchain/")).isFalse();

        assertThat(download.getImage("Beer/01_BoughtBeerByTime", 19, "http://raspi:5601/app/kibana#/visualize/edit/bought_beer_by_time?_a=(filters:!(),linked:!f,query:(language:kuery,query:''),uiState:(),vis:(aggs:!((enabled:!t,id:'1',params:(customLabel:'Traded%20$BEER',field:quantity),schema:metric,type:sum),(enabled:!t,id:'2',params:(drop_partials:!f,extended_bounds:(),field:timestamp,interval:auto,min_doc_count:1,scaleMetricValues:!f,timeRange:(from:now-7d,to:now),useNormalizedEsInterval:!t),schema:segment,type:date_histogram),(enabled:!t,id:'3',params:(customLabel:Buyer,field:buyer.keyword,missingBucket:!f,missingBucketLabel:Missing,order:desc,orderBy:'1',otherBucket:!f,otherBucketLabel:Other,size:5),schema:group,type:terms)),params:(addLegend:!t,addTimeMarker:!f,addTooltip:!t,categoryAxes:!((id:CategoryAxis-1,labels:(filter:!t,show:!t,truncate:100),position:bottom,scale:(type:linear),show:!t,style:(),title:(),type:category)),grid:(categoryLines:!f),labels:(show:!f),legendPosition:right,seriesParams:!((data:(id:'1',label:'Traded%20$BEER'),drawLinesBetweenPoints:!t,lineWidth:2,mode:stacked,show:!t,showCircles:!t,type:histogram,valueAxis:ValueAxis-1)),thresholdLine:(color:%23E7664C,show:!f,style:full,value:10,width:1),times:!(),type:histogram,valueAxes:!((id:ValueAxis-1,labels:(filter:!f,rotate:0,show:!t,truncate:100),name:LeftAxis-1,position:left,scale:(mode:normal,type:linear),show:!t,style:(),title:(text:'Traded%20$BEER'),type:value))),title:'Bought%20$BEER%20By%20Time',type:histogram))&_g=(filters:!(),refreshInterval:(pause:!t,value:0),time:(from:now-7d,to:now))&embed=true")).isFalse();
        assertThat(download.getImage("Beer/02_TopTenBeerBuyers", 4, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_beer_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Beer/03_CommulatedAmountOfBoughtBeer", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_beer?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Beer/04_CommulatedAmountOfSoldBeer", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_beer?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Beer/05_PriceOfBeer", 4, "http://raspi:5601/app/kibana#/visualize/edit/price_of_beer?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Beer/06_TableOfBeerBuyVsSellRequest", 4, "http://raspi:5601/app/kibana#/visualize/edit/e6b0e8b0-09a9-11ed-b472-c7a41b33ae44?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();

        assertThat(download.getImage("LEO/01_BoughtLeoByTime",4,"http://raspi:5601/app/kibana#/visualize/edit/bought_leo_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LEO/02_TopTenLeoBuyers", 4, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_leo_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LEO/03_CommulatedAmountOfBoughtLeo", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_leo?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LEO/04_CommulatedAmountOfSoldLeo", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_leo?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LEO/05_PriceOfLeo", 4, "http://raspi:5601/app/kibana#/visualize/edit/price_of_leo?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LEO/06_TableOfLeoBuyVsSellRequest", 4, "http://raspi:5601/app/kibana#/visualize/edit/6046b910-0aec-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();

        assertThat(download.getImage("POB/01_BoughtPobByTime",4,"http://raspi:5601/app/kibana#/visualize/edit/bought_pob_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("POB/02_TopTenPobBuyers", 4, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_pob_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("POB/03_CommulatedAmountOfBoughtPob", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_pob?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("POB/04_CommulatedAmountOfSoldPob", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_pob?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("POB/05_PriceOfPob", 4, "http://raspi:5601/app/kibana#/visualize/edit/price_of_pob?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("POB/06_TableOfPobBuyVsSellRequest", 4, "http://raspi:5601/app/kibana#/visualize/edit/808576c0-0aed-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();

        assertThat(download.getImage("SIM/01_BoughtSimByTime",4,"http://raspi:5601/app/kibana#/visualize/edit/bought_sim_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SIM/02_TopTenSimBuyers", 4, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_sim_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SIM/03_CommulatedAmountOfBoughtSim", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_sim?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SIM/04_CommulatedAmountOfSoldSim", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_sim?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SIM/05_PriceOfSim", 4, "http://raspi:5601/app/kibana#/visualize/edit/price_of_sim?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SIM/06_TableOfSimBuyVsSellRequest", 4, "http://raspi:5601/app/kibana#/visualize/edit/1104e370-0aee-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();

        assertThat(download.getImage("SPT/01_BoughtSptByTime",4,"http://raspi:5601/app/kibana#/visualize/edit/bought_spt_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SPT/02_TopTenSptBuyers", 4, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_spt_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SPT/03_CommulatedAmountOfBoughtSpt", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_spt?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SPT/04_CommulatedAmountOfSoldSpt", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_spt?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SPT/05_PriceOfSpt", 4, "http://raspi:5601/app/kibana#/visualize/edit/price_of_spt?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("SPT/06_TableOfSptBuyVsSellRequest", 4, "http://raspi:5601/app/kibana#/visualize/edit/a2444c20-0aeb-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();

        assertThat(download.getImage("LIST/01_BoughtListByTime",4,"http://raspi:5601/app/kibana#/visualize/edit/bought_list_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LIST/02_TopTenListBuyers", 4, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_list_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LIST/03_CommulatedAmountOfBoughtList", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_list?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LIST/04_CommulatedAmountOfSoldList", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_list?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LIST/05_PriceOfList", 4, "http://raspi:5601/app/kibana#/visualize/edit/price_of_list?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LIST/06_TableOfListBuyVsSellRequest", 4, "http://raspi:5601/app/kibana#/visualize/edit/6dd66e70-0ae9-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();

        assertThat(download.getImage("LUV/01_BoughtLuvByTime",4,"http://raspi:5601/app/kibana#/visualize/edit/bought_luv_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LUV/02_TopTenLuvBuyers", 4, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_luv_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LUV/03_CommulatedAmountOfBoughtLuv", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_luv?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LUV/04_CommulatedAmountOfSoldLuv", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_luv?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LUV/05_PriceOfLuv", 4, "http://raspi:5601/app/kibana#/visualize/edit/price_of_luv?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("LUV/06_TableOfLuvBuyVsSellRequest", 4, "http://raspi:5601/app/kibana#/visualize/edit/1c7b2e20-bcb5-11ec-97d3-0f99751dcba3?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();


        assertThat(download.getImage("Token/01_HivePerToken",4,"http://raspi:5601/app/kibana#/visualize/edit/618c5150-1b67-11ec-8610-27c40f2d50c0?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Token/02_USDPerToken",4,"http://raspi:5601/app/kibana#/visualize/edit/9c1c8920-1b67-11ec-8610-27c40f2d50c0?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Token/03_TableOfTonenPrices",4,"http://raspi:5601/app/kibana#/visualize/edit/8bf79f60-1b69-11ec-8610-27c40f2d50c0?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();

// https://www.tradingview.com/x/GcwcssyH/



    }


    @Test
    @Order(2)
    void takeAlive(){
        assertThat(download.getImage("Alive/01_BoughtALiveByTime",4,"http://raspi:5601/app/kibana#/visualize/edit/bought_alive_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Alive/02_TopTenAliveBuyers", 4, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_alive_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Alive/03_CommulatedAmountOfBoughtAlive", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_alive?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Alive/04_CommulatedAmountOfSoldAlive", 4, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_alive?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Alive/05_PriceOfAlive", 4, "http://raspi:5601/app/kibana#/visualize/edit/price_of_alive?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
        assertThat(download.getImage("Alive/06_TableOfAliveBuyVsSellRequest", 4, "http://raspi:5601/app/kibana#/visualize/edit/2ba835e0-0a23-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))")).isFalse();
    }

    @Test
    @Order(3)
    void takePob(){

    }

}
