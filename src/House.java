public abstract class House {
    private int  id;
    private String name;
    private String address;
    private int price;
    private  int year;
    private  String person;

     public abstract void city();
     public abstract void electricity();

     public House(int id, String name,String address,int price,int year,String person){
         if (name.contains("r") && name.contains("o") && name.contains("b") && name.contains("m") && name.contains("w") && name.contains("h")){
             this.name=name;
         }else {
             System.out.println("Уй кабыл алынбайт биздин шарт боюнча болсун ");
         }
         if (price>70000){
             this.price=price;
         }else{
             System.out.println("Baasy tuura kelbeyt");
         }
         if (year<2015){
             System.out.println("Sizdin uyunuz eski");
         }else{ this.year=year;}
         this.id=id;
         this.address=address;
         this.person=person;
     }

    public int getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", person='" + person + '\'' +
                '}';
    }
}
