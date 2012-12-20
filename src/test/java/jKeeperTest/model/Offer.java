package jKeeperTest.model;
/**
 * Offer.java
 *
 *
 * Version 1.0
 *
 * Copyright (c) 2001 Grey-Hen Oy
 *
 * The class for offers and appraisals stored in the database table Offer.
 */


import jKeeper.annotation.ColumnType;
import jKeeper.annotation.Setter;
import jKeeper.annotation.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Offer implements Cloneable {

    private static final Logger logger = LoggerFactory.getLogger(Offer.class);

    // basic
    private int number; // automatically assigned number
    private String companyId; // dealership presenting the offer
    private String userId; // employee working on the appraisal/offer
    private String originalUserId; // employee who initially started working on the appraisal/offer
    private String salesmanId; // salesman working on the offer
    private int statCode; // statistical reliability code
    private int areaTradeTime; // average time to sell the car
    private String currency = ""; // local or euro
    private String customerNumber = "0"; // identification of consumer
    private String tradeInVehicleId = ""; // customer's car
    private String tradeOutVehicleId = ""; // a car in dealer's stock, or a new car
    private String offerDate; // when was this offer done
    private String status = "asd"; // general status field
    private String offerStatus = "1"; // indicator of appraisal-order processing
    private String customerVehicleSource = "";
    // appraisal-related: general
    private int kilometrage = 0; // estimation or certified mileage of customer vehicle
    private int tradeInVehicleApprovalMonth = 1; // vehicle usage start month
    private int tradeInVehicleApprovalYear = 0;  // and year
    // appraisal-related: features and options
    int featuresTotal = 0; // total cost of value-adding special features of the vehicle
    private String featureRemark = "";
    // appraisal-related: reconditioning and repairs
    private int fixesTotal = 0; // total cost of fixes needed for the trade-in vehicle
    private String fixRemark = "";
    // appraisal-related: top-down calc, see documentation on appraisal methods for more info
    // first section: overview
    private int stockDays = 0;
    private int waitingTime = 0;
    private int salesPrice = 0;
    private int expertStatement = 0;
    private int estSalesPrice = 0;
    private int salesCost = 0;
    private int maxPurchasePrice = 0;
    private int tradeInPrice = 0; // purchase price (what is the dealership willing to pay)
    private int partExchangePrice = 0;
    private int counterOffer = 0;  // the price for which customer is willing to sell the car
    // 2nd section: reference data
    private int aveStockDays = 0;
    private int newPrice = 0;
    private int aveAskPrice = 0;
    private int aveSalesPrice = 0;
    private int aveExchangePrice = 0;
    // 3rd section: cost and margin calculations
    private int purchasePriceDiff = 0;
    private int overCompensation = 0;
    private int reconditioningCost = 0;
    private int calcMargin = 0;
    private int interestCost = 0;
    private int trendCost = 0;
    private int generalCondition = 0;
    //4th section: asking and sales price
    private int priceDifference = 0;
    private int estAskPrice = 0;
    private int recommendedAskPrice = 0;
    private int askPrice = 0;
    private int lowestSalesPrice = 0;
    private int salesCostSum = 0;
    private String differencePercent = "0";
    private String salesCostPercent = "0";
    // sales offer related
    private String sellNew = "0"; // 1 when selling a new car, 0 when selling a used car (default)
    private int tradeOutPrice = 0; // at what price will it sell
    private int tradeOutPriceWithTax = 0;
    private int tradeOutTax = 0;
    private int priceListCO2 = 0;
    private int optionsTotal = 0; // total cost of factory options coming with the vehicle
    private int discount = 0; // from sales price
    private String comingIn = ""; // expected arrival of the trade in vehicle
    // CUSTOM: NBC special
    private String correspondingVehicleId = ""; // vehicle type used in taxation
    private int tradeInPriceAdjusted = 0; // used as basis for taxation
    private String useMarketPricing = "1"; // taxation method
    private int optionsChecked = 0; // flag used to control print-outs
    // ATS special
    private int correction = 0;
    private int standardReconditioningCost = 0;
    private int standardRepairCost = 0;
    private int standardGuaranteeCost = 0;
    private int correctionPercent = 0;
    private int ATSAnswerNumber = 0;
    private String VGSVersionId = "";
    // sales offer
    private String description = "";
    private String optionsText = "";
    private int additionalCost1 = 0;
    private int additionalCost2 = 0;
    // Autotaxatie net
    private String ATNTransactionId = "";
    private int ATNGuaranteedPrice = 0;
    private String ATNExpires = "";
    // special fields for holland:
    private String color = "";
    private String alarmCode = "";
    private String tyresLV = "";
    private String tyresLA = "";
    private String tyresRV = "";
    private String tyresRA = "";
    private String extraRemarks = "";
    private String kmWhenReceived = "";
    private String extraRepairCosts = "";
    // vehicle usage type (initially for VISH)
    private int usageType = 0;
    @Setter("setNewOffer")
    private int isNewOffer = 0;
    //Dealoptimizer calc
    private int marginExtra = 0;
    private int financeProfit = 0;
    private int margin = 0;
    private int marginTotal = 0;
    // Offer calculation
    private int dept = 0;
    private int advancePayment = 0;
    private int payed = 0;
    private int financing = 0;
    private String tradeOutVehicleMMTTypeId = "";
    // new fields Dec 12
    private int deliveryCost = 0;
    private int dealerAccessoriesTotal = 0;
    private int recyclingFee = 0;
    private int registrationCost1 = 0;
    private int registrationCost2 = 0;
    private int tradeOutPriceTax = 0;
    private int VATPercent = 0;
    // new fields Dec 17
    private int tradeInPriceTax = 0;
    private int parentNumber = 0;
    private float priceDifference2 = 0;
    private float estAskPrice2 = 0;
    private float interestCost2 = 0;
    private float trendCost2 = 0;
    private float maxPurchasePrice2 = 0;
    private float purchasePriceDiff2 = 0;
    private float reconditioningCost2 = 0;
    private float calcMargin2 = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOriginalUserId() {
        return originalUserId;
    }

    public void setOriginalUserId(String originalUserId) {
        this.originalUserId = originalUserId;
    }

    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    public int getStatCode() {
        return statCode;
    }

    public void setStatCode(int statCode) {
        this.statCode = statCode;
    }

    public int getAreaTradeTime() {
        return areaTradeTime;
    }

    public void setAreaTradeTime(int areaTradeTime) {
        this.areaTradeTime = areaTradeTime;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getTradeInVehicleId() {
        return tradeInVehicleId;
    }

    public void setTradeInVehicleId(String tradeInVehicleId) {
        this.tradeInVehicleId = tradeInVehicleId;
    }

    public String getTradeOutVehicleId() {
        return tradeOutVehicleId;
    }

    public void setTradeOutVehicleId(String tradeOutVehicleId) {
        this.tradeOutVehicleId = tradeOutVehicleId;
    }

    public String getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
    }

    public String getCustomerVehicleSource() {
        return customerVehicleSource;
    }

    public void setCustomerVehicleSource(String customerVehicleSource) {
        this.customerVehicleSource = customerVehicleSource;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public int getTradeInVehicleApprovalMonth() {
        return tradeInVehicleApprovalMonth;
    }

    public void setTradeInVehicleApprovalMonth(int tradeInVehicleApprovalMonth) {
        this.tradeInVehicleApprovalMonth = tradeInVehicleApprovalMonth;
    }

    public int getTradeInVehicleApprovalYear() {
        return tradeInVehicleApprovalYear;
    }

    public void setTradeInVehicleApprovalYear(int tradeInVehicleApprovalYear) {
        this.tradeInVehicleApprovalYear = tradeInVehicleApprovalYear;
    }

    public int getFeaturesTotal() {
        return featuresTotal;
    }

    public void setFeaturesTotal(int featuresTotal) {
        this.featuresTotal = featuresTotal;
    }

    public String getFeatureRemark() {
        return featureRemark;
    }

    public void setFeatureRemark(String featureRemark) {
        this.featureRemark = featureRemark;
    }

    public int getFixesTotal() {
        return fixesTotal;
    }

    public void setFixesTotal(int fixesTotal) {
        this.fixesTotal = fixesTotal;
    }

    public String getFixRemark() {
        return fixRemark;
    }

    public void setFixRemark(String fixRemark) {
        this.fixRemark = fixRemark;
    }

    public int getStockDays() {
        return stockDays;
    }

    public void setStockDays(int stockDays) {
        this.stockDays = stockDays;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getExpertStatement() {
        return expertStatement;
    }

    public void setExpertStatement(int expertStatement) {
        this.expertStatement = expertStatement;
    }

    public int getEstSalesPrice() {
        return estSalesPrice;
    }

    public void setEstSalesPrice(int estSalesPrice) {
        this.estSalesPrice = estSalesPrice;
    }

    public int getSalesCost() {
        return salesCost;
    }

    public void setSalesCost(int salesCost) {
        this.salesCost = salesCost;
    }

    public int getMaxPurchasePrice() {
        return maxPurchasePrice;
    }

    public void setMaxPurchasePrice(int maxPurchasePrice) {
        this.maxPurchasePrice = maxPurchasePrice;
    }

    public int getTradeInPrice() {
        return tradeInPrice;
    }

    public void setTradeInPrice(int tradeInPrice) {
        this.tradeInPrice = tradeInPrice;
    }

    public int getPartExchangePrice() {
        return partExchangePrice;
    }

    public void setPartExchangePrice(int partExchangePrice) {
        this.partExchangePrice = partExchangePrice;
    }

    public int getCounterOffer() {
        return counterOffer;
    }

    public void setCounterOffer(int counterOffer) {
        this.counterOffer = counterOffer;
    }

    public int getAveStockDays() {
        return aveStockDays;
    }

    public void setAveStockDays(int aveStockDays) {
        this.aveStockDays = aveStockDays;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public int getAveAskPrice() {
        return aveAskPrice;
    }

    public void setAveAskPrice(int aveAskPrice) {
        this.aveAskPrice = aveAskPrice;
    }

    public int getAveSalesPrice() {
        return aveSalesPrice;
    }

    public void setAveSalesPrice(int aveSalesPrice) {
        this.aveSalesPrice = aveSalesPrice;
    }

    public int getAveExchangePrice() {
        return aveExchangePrice;
    }

    public void setAveExchangePrice(int aveExchangePrice) {
        this.aveExchangePrice = aveExchangePrice;
    }

    public int getPurchasePriceDiff() {
        return purchasePriceDiff;
    }

    public void setPurchasePriceDiff(int purchasePriceDiff) {
        this.purchasePriceDiff = purchasePriceDiff;
    }

    public int getOverCompensation() {
        return overCompensation;
    }

    public void setOverCompensation(int overCompensation) {
        this.overCompensation = overCompensation;
    }

    public int getReconditioningCost() {
        return reconditioningCost;
    }

    public void setReconditioningCost(int reconditioningCost) {
        this.reconditioningCost = reconditioningCost;
    }

    public int getCalcMargin() {
        return calcMargin;
    }

    public void setCalcMargin(int calcMargin) {
        this.calcMargin = calcMargin;
    }

    public int getInterestCost() {
        return interestCost;
    }

    public void setInterestCost(int interestCost) {
        this.interestCost = interestCost;
    }

    public int getTrendCost() {
        return trendCost;
    }

    public void setTrendCost(int trendCost) {
        this.trendCost = trendCost;
    }

    public int getGeneralCondition() {
        return generalCondition;
    }

    public void setGeneralCondition(int generalCondition) {
        this.generalCondition = generalCondition;
    }

    public int getPriceDifference() {
        return priceDifference;
    }

    public void setPriceDifference(int priceDifference) {
        this.priceDifference = priceDifference;
    }

    public int getEstAskPrice() {
        return estAskPrice;
    }

    public void setEstAskPrice(int estAskPrice) {
        this.estAskPrice = estAskPrice;
    }

    public int getRecommendedAskPrice() {
        return recommendedAskPrice;
    }

    public void setRecommendedAskPrice(int recommendedAskPrice) {
        this.recommendedAskPrice = recommendedAskPrice;
    }

    public int getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(int askPrice) {
        this.askPrice = askPrice;
    }

    public int getLowestSalesPrice() {
        return lowestSalesPrice;
    }

    public void setLowestSalesPrice(int lowestSalesPrice) {
        this.lowestSalesPrice = lowestSalesPrice;
    }

    public int getSalesCostSum() {
        return salesCostSum;
    }

    public void setSalesCostSum(int salesCostSum) {
        this.salesCostSum = salesCostSum;
    }

    public String getDifferencePercent() {
        return differencePercent;
    }

    public void setDifferencePercent(String differencePercent) {
        this.differencePercent = differencePercent;
    }

    public String getSalesCostPercent() {
        return salesCostPercent;
    }

    public void setSalesCostPercent(String salesCostPercent) {
        this.salesCostPercent = salesCostPercent;
    }

    public String getSellNew() {
        return sellNew;
    }

    public void setSellNew(String sellNew) {
        this.sellNew = sellNew;
    }

    public int getTradeOutPrice() {
        return tradeOutPrice;
    }

    public void setTradeOutPrice(int tradeOutPrice) {
        this.tradeOutPrice = tradeOutPrice;
    }

    public int getTradeOutPriceWithTax() {
        return tradeOutPriceWithTax;
    }

    public void setTradeOutPriceWithTax(int tradeOutPriceWithTax) {
        this.tradeOutPriceWithTax = tradeOutPriceWithTax;
    }

    public int getTradeOutTax() {
        return tradeOutTax;
    }

    public void setTradeOutTax(int tradeOutTax) {
        this.tradeOutTax = tradeOutTax;
    }

    public int getPriceListCO2() {
        return priceListCO2;
    }

    public void setPriceListCO2(int priceListCO2) {
        this.priceListCO2 = priceListCO2;
    }

    public int getOptionsTotal() {
        return optionsTotal;
    }

    public void setOptionsTotal(int optionsTotal) {
        this.optionsTotal = optionsTotal;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getComingIn() {
        return comingIn;
    }

    public void setComingIn(String comingIn) {
        this.comingIn = comingIn;
    }

    public String getCorrespondingVehicleId() {
        return correspondingVehicleId;
    }

    public void setCorrespondingVehicleId(String correspondingVehicleId) {
        this.correspondingVehicleId = correspondingVehicleId;
    }

    public int getTradeInPriceAdjusted() {
        return tradeInPriceAdjusted;
    }

    public void setTradeInPriceAdjusted(int tradeInPriceAdjusted) {
        this.tradeInPriceAdjusted = tradeInPriceAdjusted;
    }

    public String getUseMarketPricing() {
        return useMarketPricing;
    }

    public void setUseMarketPricing(String useMarketPricing) {
        this.useMarketPricing = useMarketPricing;
    }

    public int getOptionsChecked() {
        return optionsChecked;
    }

    public void setOptionsChecked(int optionsChecked) {
        this.optionsChecked = optionsChecked;
    }

    public int getCorrection() {
        return correction;
    }

    public void setCorrection(int correction) {
        this.correction = correction;
    }

    public int getStandardReconditioningCost() {
        return standardReconditioningCost;
    }

    public void setStandardReconditioningCost(int standardReconditioningCost) {
        this.standardReconditioningCost = standardReconditioningCost;
    }

    public int getStandardRepairCost() {
        return standardRepairCost;
    }

    public void setStandardRepairCost(int standardRepairCost) {
        this.standardRepairCost = standardRepairCost;
    }

    public int getStandardGuaranteeCost() {
        return standardGuaranteeCost;
    }

    public void setStandardGuaranteeCost(int standardGuaranteeCost) {
        this.standardGuaranteeCost = standardGuaranteeCost;
    }

    public int getCorrectionPercent() {
        return correctionPercent;
    }

    public void setCorrectionPercent(int correctionPercent) {
        this.correctionPercent = correctionPercent;
    }

    public int getATSAnswerNumber() {
        return ATSAnswerNumber;
    }

    public void setATSAnswerNumber(int ATSAnswerNumber) {
        this.ATSAnswerNumber = ATSAnswerNumber;
    }

    public String getVGSVersionId() {
        return VGSVersionId;
    }

    public void setVGSVersionId(String VGSVersionId) {
        this.VGSVersionId = VGSVersionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOptionsText() {
        return optionsText;
    }

    public void setOptionsText(String optionsText) {
        this.optionsText = optionsText;
    }

    public int getAdditionalCost1() {
        return additionalCost1;
    }

    public void setAdditionalCost1(int additionalCost1) {
        this.additionalCost1 = additionalCost1;
    }

    public int getAdditionalCost2() {
        return additionalCost2;
    }

    public void setAdditionalCost2(int additionalCost2) {
        this.additionalCost2 = additionalCost2;
    }

    public String getATNTransactionId() {
        return ATNTransactionId;
    }

    public void setATNTransactionId(String ATNTransactionId) {
        this.ATNTransactionId = ATNTransactionId;
    }

    public int getATNGuaranteedPrice() {
        return ATNGuaranteedPrice;
    }

    public void setATNGuaranteedPrice(int ATNGuaranteedPrice) {
        this.ATNGuaranteedPrice = ATNGuaranteedPrice;
    }

    public String getATNExpires() {
        return ATNExpires;
    }

    public void setATNExpires(String ATNExpires) {
        this.ATNExpires = ATNExpires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
    }

    public String getTyresLV() {
        return tyresLV;
    }

    public void setTyresLV(String tyresLV) {
        this.tyresLV = tyresLV;
    }

    public String getTyresLA() {
        return tyresLA;
    }

    public void setTyresLA(String tyresLA) {
        this.tyresLA = tyresLA;
    }

    public String getTyresRV() {
        return tyresRV;
    }

    public void setTyresRV(String tyresRV) {
        this.tyresRV = tyresRV;
    }

    public String getTyresRA() {
        return tyresRA;
    }

    public void setTyresRA(String tyresRA) {
        this.tyresRA = tyresRA;
    }

    public String getExtraRemarks() {
        return extraRemarks;
    }

    public void setExtraRemarks(String extraRemarks) {
        this.extraRemarks = extraRemarks;
    }

    public String getKmWhenReceived() {
        return kmWhenReceived;
    }

    public void setKmWhenReceived(String kmWhenReceived) {
        this.kmWhenReceived = kmWhenReceived;
    }

    public String getExtraRepairCosts() {
        return extraRepairCosts;
    }

    public void setExtraRepairCosts(String extraRepairCosts) {
        this.extraRepairCosts = extraRepairCosts;
    }

    public int getUsageType() {
        return usageType;
    }

    public void setUsageType(int usageType) {
        this.usageType = usageType;
    }

    public int getNewOffer() {
        return isNewOffer;
    }

    public void setNewOffer(int newOffer) {
        isNewOffer = newOffer;
    }

    public int getMarginExtra() {
        return marginExtra;
    }

    public void setMarginExtra(int marginExtra) {
        this.marginExtra = marginExtra;
    }

    public int getFinanceProfit() {
        return financeProfit;
    }

    public void setFinanceProfit(int financeProfit) {
        this.financeProfit = financeProfit;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getMarginTotal() {
        return marginTotal;
    }

    public void setMarginTotal(int marginTotal) {
        this.marginTotal = marginTotal;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public int getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(int advancePayment) {
        this.advancePayment = advancePayment;
    }

    public int getPayed() {
        return payed;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    public int getFinancing() {
        return financing;
    }

    public void setFinancing(int financing) {
        this.financing = financing;
    }

    public String getTradeOutVehicleMMTTypeId() {
        return tradeOutVehicleMMTTypeId;
    }

    public void setTradeOutVehicleMMTTypeId(String tradeOutVehicleMMTTypeId) {
        this.tradeOutVehicleMMTTypeId = tradeOutVehicleMMTTypeId;
    }

    public int getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(int deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public int getDealerAccessoriesTotal() {
        return dealerAccessoriesTotal;
    }

    public void setDealerAccessoriesTotal(int dealerAccessoriesTotal) {
        this.dealerAccessoriesTotal = dealerAccessoriesTotal;
    }

    public int getRecyclingFee() {
        return recyclingFee;
    }

    public void setRecyclingFee(int recyclingFee) {
        this.recyclingFee = recyclingFee;
    }

    public int getRegistrationCost1() {
        return registrationCost1;
    }

    public void setRegistrationCost1(int registrationCost1) {
        this.registrationCost1 = registrationCost1;
    }

    public int getRegistrationCost2() {
        return registrationCost2;
    }

    public void setRegistrationCost2(int registrationCost2) {
        this.registrationCost2 = registrationCost2;
    }

    public int getTradeOutPriceTax() {
        return tradeOutPriceTax;
    }

    public void setTradeOutPriceTax(int tradeOutPriceTax) {
        this.tradeOutPriceTax = tradeOutPriceTax;
    }

    public int getVATPercent() {
        return VATPercent;
    }

    public void setVATPercent(int VATPercent) {
        this.VATPercent = VATPercent;
    }

    public int getTradeInPriceTax() {
        return tradeInPriceTax;
    }

    public void setTradeInPriceTax(int tradeInPriceTax) {
        this.tradeInPriceTax = tradeInPriceTax;
    }

    public int getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(int parentNumber) {
        this.parentNumber = parentNumber;
    }

    public float getPriceDifference2() {
        return priceDifference2;
    }

    public void setPriceDifference2(float priceDifference2) {
        this.priceDifference2 = priceDifference2;
    }

    public float getEstAskPrice2() {
        return estAskPrice2;
    }

    public void setEstAskPrice2(float estAskPrice2) {
        this.estAskPrice2 = estAskPrice2;
    }

    public float getInterestCost2() {
        return interestCost2;
    }

    public void setInterestCost2(float interestCost2) {
        this.interestCost2 = interestCost2;
    }

    public float getTrendCost2() {
        return trendCost2;
    }

    public void setTrendCost2(float trendCost2) {
        this.trendCost2 = trendCost2;
    }

    public float getMaxPurchasePrice2() {
        return maxPurchasePrice2;
    }

    public void setMaxPurchasePrice2(float maxPurchasePrice2) {
        this.maxPurchasePrice2 = maxPurchasePrice2;
    }

    public float getPurchasePriceDiff2() {
        return purchasePriceDiff2;
    }

    public void setPurchasePriceDiff2(float purchasePriceDiff2) {
        this.purchasePriceDiff2 = purchasePriceDiff2;
    }

    public float getReconditioningCost2() {
        return reconditioningCost2;
    }

    public void setReconditioningCost2(float reconditioningCost2) {
        this.reconditioningCost2 = reconditioningCost2;
    }

    public float getCalcMargin2() {
        return calcMargin2;
    }

    public void setCalcMargin2(float calcMargin2) {
        this.calcMargin2 = calcMargin2;
    }
}