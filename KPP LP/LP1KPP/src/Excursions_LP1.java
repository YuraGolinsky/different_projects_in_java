public class Excursions_LP1 {
    private String Country;

    private String City;
    private String Name;

    private double Trivality_of_excursions;
    private String Transport;
    private double Price;

    public Excursions_LP1(String Country, String City, String Name , double Trivality_of_excursions, String Transport,
                          double Price ){

        this.Country = Country;
        this.City = City;
        this.Name = Name;
        this.Trivality_of_excursions = Trivality_of_excursions;
        this.Transport = Transport;
        this.Price = Price;

    }

    public String getCountry(){
        return Country;
    }
    public void setCountry(){
        Country = Country;
    }

    public String getCity(){
        return City;
    }
    public void setCity(){City = City;}

    public String getName(){
        return Name;
    }
    public void setName(){Name = Name;}


    public double getTrivality_of_excursions(){
        return Trivality_of_excursions;
    }
    public void setTrivality_of_excursions(){
        Trivality_of_excursions = Trivality_of_excursions;
    }

    public String getTransport(){
        return Transport;
    }
    public void setTransport(){
        Transport = Transport;
    }

    public double getPrice() {
        return Price;
    }
    public void setPrice(){Price = Price;}

    void print(){
        System.out.println(" Країна: " + Country +" Місто: " + City +" Назва екскурсій: " + Name +" Тривалість екскурсій (в годинах): "
                + Trivality_of_excursions +" Транспорт для екскурсій: " + Transport + " Ціна у гривнях: " + Price);
    }
    // Клонирование

    public Excursions_LP1 (Excursions_LP1 obj) {
        this.Country = obj.Country;
        this.City = obj.City;
        this.Name = obj.Name;
        this.Trivality_of_excursions = obj.Trivality_of_excursions;
        this.Transport = obj.Transport;
        this.Price = obj.Price;

    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
