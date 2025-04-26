class product
{
   private String itemno;
   private String name;
   private double price;
   private byte qty;
   
   public String getItemno()
   {
    return itemno;
   }
   public String getName()
   {
    return name;
   }
   public double getPrice()
   {
    return price;
   }
   public byte getQty()
   {
    return qty;
   }
   public void setPrice(double price)
   {
    this.price=price;
   }
   public void setQty(byte qty)
   {
    this.qty=qty;
   }
   public product(String itemno,String name)
   {
    itemno=itemno;
    this.name=name;
   }
   public product(String itemno,String name, double price, byte qty)
   {
    itemno=itemno;
    this.name=name;
    setPrice(price);
    setQty(qty);
   }
}
public class customer
{
    private String custId;
    private String name;
    private String address;
    private String phNo;

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phNo)
    {
        this.phNo=phNo;
    }
    public String getAddress()
    {
        return address;
    }
    public String getName()
    {
        return name;
    }
    public String getCustId()
    {
        return custId;
    }
    public String getPhno()
    {
        return phNo;
    }
    public customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    public customer(String custId,String name,String address,String phNo)
    {
        this.custId=custId;
        this.name=name;
        this.address=address;
        setAddress();
        setPhno();
    }

}


public class sc_product_customer
{
    public static void main(String[] args) 
    {

    }
}
