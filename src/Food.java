public class Food {

    private String FoodName;
    private double FoodPrice;
    private NationalCard nationalCard;

    public Food(String foodName, double foodPrice, NationalCard nationalCard) {
        FoodName = foodName;
        FoodPrice = foodPrice;
        this.nationalCard = nationalCard;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public double getFoodPrice(double price) {
        return FoodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        FoodPrice = foodPrice;
    }

    public NationalCard getNationalCard() {
        return nationalCard;
    }

    public void setNationalCard(NationalCard nationalCard) {
        this.nationalCard = nationalCard;
    }
}
