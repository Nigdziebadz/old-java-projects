package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private SellInfoService sellInformationService;
    private SellService sellService;
    private SellRepository sellRepository;

    public ProductOrderService(final SellInfoService sellInformationService,
                         final SellService sellService,
                         final SellRepository sellRepository) {
        this.sellInformationService = sellInformationService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }

    public SellDto process(final SoldRequest soldRequest) {
        boolean isSold = sellService.createTransaction(soldRequest.getUser(), soldRequest.getWhen(),
                soldRequest.getItemName(), soldRequest.getItemQnt());

        if(isSold) {
            sellInformationService.sendInfo(soldRequest.getUser());
            sellRepository.createTransaction(soldRequest.getUser(), soldRequest.getWhen(),
                    soldRequest.getItemName(), soldRequest.getItemQnt());
            return new SellDto(soldRequest.getUser(), true);
        } else {
            return new SellDto(soldRequest.getUser(), false);
        }
    }
}