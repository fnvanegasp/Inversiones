/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Stock extends ShareAsset{
    public int totalShare;

    public Stock(int totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShare = totalShares;
    }

    
    
    @Override
    public double getMarketValue() {
        return this.totalCost*this.currentPrice;
    }

    @Override
    public double getProfit() {
        return (this.totalShare*this.currentPrice) - this.totalCost;
    }
    
    
}
