/**
 * @param {number[]} prices
 * @return {number}
 */
const findBuyingPrice = function(prices){
var minPrice =  prices[0];
for(let i=1;i<prices.length;i++){
    if(prices[i]<minPrice){
        minPrice = prices[i];
        buyDay = i;
    }
}
 return [minPrice,buyDay];
}

const findSellingPrice =  function(prices,buyedPrice,buyedDay){
    var maxPrice = prices[ buyedDay+1];
    for(let j=buyedDay+2; j<prices.length;j++){
        if(prices[j]>maxPrice){
            maxPrice=prices[j];
        }
    }
    return maxPrice;
}

var maxProfit = function(prices) {
 const buyedPriceAndDay=findBuyingPrice(prices);
 if(buyedPriceAndDay[1]<prices.length-1){ 
 let soldPrice=  findSellingPrice(prices,buyedPriceAndDay[0],buyedPriceAndDay[1]);
 return soldPrice - buyedPriceAndDay[0];
 }
 else return 0;
};
