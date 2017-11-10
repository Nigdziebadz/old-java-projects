package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        TransactionRequestRetriever transactionRequestRetriever = new TransactionRequestRetriever();
        SoldRequest soldRequest = transactionRequestRetriever.retrieve();

        ProductOrderService sellProcessor = new ProductOrderService(new
                InfoService(), new ItemSellService(), new ItemSellRepository());
        sellProcessor.process(soldRequest);
    }
}
