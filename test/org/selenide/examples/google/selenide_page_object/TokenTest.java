package org.selenide.examples.google.selenide_page_object;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class TokenTest {
  @Test
  public void userCanSearch() throws InterruptedException {
    open("https://coinmarketcap.com/currencies/hive-blockchain/");
    new GooglePage().searchFor("Hive");

    SearchResultsPage results = new SearchResultsPage();
    //results.getResults().shouldHave(sizeGreaterThan(1));
     }


}
