package Bridge;
public abstract class Restaurant
{
    protected Pizza pizza;
    protected Restaurant(Pizza pizza)
    {
        this.pizza =pizza;
    }
    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();
    public void deliver()
    {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qalityCheck();
        System.out.println("Order in Progress!");
    }
}
public static void main(String[] args)
{
    AmericanRestaurant americanRestaurant =new AmericanRestaurant(new PepperoniPizza());
    americanRestaurant.deliver();
    ItalianRestaurant italianRestaurant =new ItalianRestaurant(new VeggiePizza());
    italianRestaurant.deliver();
}