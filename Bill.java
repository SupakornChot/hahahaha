
public abstract class Bill {
    protected long billId;
    private Customer cust;
    private double totalPrice;
    private double promoPrice;

    public Bill(Customer cust, double price) {
        this.cust = cust;
        this.totalPrice = price;
    }
    

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPromoPrice(Bill bill, double minPrice, double percentPro,double maxPro) {
        this.promoPrice = promoPrice;
    }

    @Override
    public String toString() {
        return "Bill{" + "billId=" + billId + ", cust=" + cust + ", totalPrice=" + totalPrice + ", promoPrice=" + promoPrice + '}';
    }
    
    
}
