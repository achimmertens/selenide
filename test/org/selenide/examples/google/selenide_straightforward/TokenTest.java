package org.selenide.examples.google.selenide_straightforward;

import com.codeborne.selenide.junit.TextReport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TokenTest {
  @Rule
  public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);

  @Test
  public void search_selenide_in_google() {
    open("https://coinmarketcap.com/currencies/hive-blockchain/");
   // $(By.name("q")).val("Hive").pressEnter();
    $$(".results .result").shouldHave(sizeGreaterThan(1));
 //   $(".results .result").shouldBe(visible).shouldHave(
  //      text("Selenide: concise UI tests in Java"),
  //      text("selenide.org"));
  }


  @Test
  public void search_Token() {



    take_snapshot("beer/01_bought_beer_by_time",40,"http://raspi:5601/app/kibana#/visualize/edit/bought_beer_by_time?_a=(filters:!(),linked:!f,query:(language:kuery,query:''),uiState:(),vis:(aggs:!((enabled:!t,id:'1',params:(customLabel:'Traded%20$BEER',field:quantity),schema:metric,type:sum),(enabled:!t,id:'2',params:(drop_partials:!f,extended_bounds:(),field:timestamp,interval:auto,min_doc_count:1,scaleMetricValues:!f,timeRange:(from:now-7d,to:now),useNormalizedEsInterval:!t),schema:segment,type:date_histogram),(enabled:!t,id:'3',params:(customLabel:Buyer,field:buyer.keyword,missingBucket:!f,missingBucketLabel:Missing,order:desc,orderBy:'1',otherBucket:!f,otherBucketLabel:Other,size:5),schema:group,type:terms)),params:(addLegend:!t,addTimeMarker:!f,addTooltip:!t,categoryAxes:!((id:CategoryAxis-1,labels:(filter:!t,show:!t,truncate:100),position:bottom,scale:(type:linear),show:!t,style:(),title:(),type:category)),grid:(categoryLines:!f),labels:(show:!f),legendPosition:right,seriesParams:!((data:(id:'1',label:'Traded%20$BEER'),drawLinesBetweenPoints:!t,lineWidth:2,mode:stacked,show:!t,showCircles:!t,type:histogram,valueAxis:ValueAxis-1)),thresholdLine:(color:%23E7664C,show:!f,style:full,value:10,width:1),times:!(),type:histogram,valueAxes:!((id:ValueAxis-1,labels:(filter:!f,rotate:0,show:!t,truncate:100),name:LeftAxis-1,position:left,scale:(mode:normal,type:linear),show:!t,style:(),title:(text:'Traded%20$BEER'),type:value))),title:'Bought%20$BEER%20By%20Time',type:histogram))&_g=(filters:!(),refreshInterval:(pause:!t,value:0),time:(from:now-7d,to:now))&embed=true");
    take_snapshot("Beer/02_TopTenBeerBuyers",10,"http://raspi:5601/app/kibana#/visualize/edit/top_ten_beer_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Beer/03_CommulatedAmountOfBoughtBeer",10,"http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_beer?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Beer/04_CommulatedAmountOfSoldBeer", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_beer?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Beer/05_PriceOfBeer", 10, "http://raspi:5601/app/kibana#/visualize/edit/price_of_beer?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Beer/06_TableOfBeerBuyVsSellRequest", 10, "http://raspi:5601/app/kibana#/visualize/edit/e6b0e8b0-09a9-11ed-b472-c7a41b33ae44?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");


    take_snapshot("LEO/01_BoughtLeoByTime",10,"http://raspi:5601/app/kibana#/visualize/edit/bought_leo_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("LEO/02_TopTenLeoBuyers", 10, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_leo_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("LEO/03_CommulatedAmountOfBoughtLeo", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_leo?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("LEO/04_CommulatedAmountOfSoldLeo", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_leo?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("LEO/05_PriceOfLeo", 10, "http://raspi:5601/app/kibana#/visualize/edit/price_of_leo?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("LEO/06_TableOfLeoBuyVsSellRequest", 10, "http://raspi:5601/app/kibana#/visualize/edit/6046b910-0aec-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");

    take_snapshot("POB/01_BoughtPobByTime",10,"http://raspi:5601/app/kibana#/visualize/edit/bought_pob_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("POB/02_TopTenPobBuyers", 10, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_pob_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("POB/03_CommulatedAmountOfBoughtPob", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_pob?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("POB/04_CommulatedAmountOfSoldPob", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_pob?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("POB/05_PriceOfPob", 10, "http://raspi:5601/app/kibana#/visualize/edit/price_of_pob?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("POB/06_TableOfPobBuyVsSellRequest", 10, "http://raspi:5601/app/kibana#/visualize/edit/808576c0-0aed-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");

    take_snapshot("SPT/01_BoughtSptByTime",10,"http://raspi:5601/app/kibana#/visualize/edit/bought_spt_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("SPT/02_TopTenSptBuyers", 10, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_spt_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("SPT/03_CommulatedAmountOfBoughtSpt", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_spt?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("SPT/04_CommulatedAmountOfSoldSpt", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_spt?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("SPT/05_PriceOfSpt", 10, "http://raspi:5601/app/kibana#/visualize/edit/price_of_spt?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("SPT/06_TableOfSptBuyVsSellRequest", 10, "http://raspi:5601/app/kibana#/visualize/edit/a2444c20-0aeb-11ec-9586-edd1781b885c?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");

    take_snapshot("Alive/01_BoughtALiveByTime",10,"http://raspi:5601/app/kibana#/visualize/edit/bought_alive_by_time?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Alive/02_TopTenAliveBuyers", 10, "http://raspi:5601/app/kibana#/visualize/edit/top_ten_alive_buyers?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Alive/03_CommulatedAmountOfBoughtAlive", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_bought_alive?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Alive/04_CommulatedAmountOfSoldAlive", 10, "http://raspi:5601/app/kibana#/visualize/edit/commulated_amount_of_sold_alive?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Alive/05_PriceOfAlive", 10, "http://raspi:5601/app/kibana#/visualize/edit/price_of_alive?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");

    take_snapshot("Token/01_HivePerToken",10,"http://raspi:5601/app/kibana#/visualize/edit/618c5150-1b67-11ec-8610-27c40f2d50c0?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Token/02_USDPerToken",10,"http://raspi:5601/app/kibana#/visualize/edit/9c1c8920-1b67-11ec-8610-27c40f2d50c0?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");
    take_snapshot("Token/03_TableOfTokenPrices",10,"http://raspi:5601/app/kibana#/visualize/edit/8bf79f60-1b69-11ec-8610-27c40f2d50c0?_g=(filters%3A!()%2CrefreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-7d%2Cto%3Anow))");

  }



  void take_snapshot(String filename, Integer duration, String url){
    open(url);
    sleep(duration*1000);
    screenshot(filename);
  }
}