public class StoreVisitor{
    // Refractor this code


    public double calculateBookCost(Book book){
        double cost = book.getPrice() + book.getTax()*book.getPrice();
        return cost;
    }

    public double calculateTeaCost(Tea tea){
        double cost = tea.getPrice() + tea.getTax()*tea.getPrice();
        if (tea.isDiscount())
            cost= cost - cost*0.1;
        return cost;
    }

    public double calculateCoffeeCost(Coffee coffee){
        double cost = coffee.getPrice() + coffee.getTax()*coffee.getPrice();
        if (coffee.isDiscount())
            cost= cost - cost*0.15;
        return cost;
    }
}
