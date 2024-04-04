package Bridge;
@Data
public abstract class Pizza
{
    proteted String sauce;
    protected String toppings;
    protected String crust;
    public abstract void assemble();
    public abstract void qualityCheck();
}