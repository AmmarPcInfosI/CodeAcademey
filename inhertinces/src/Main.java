
public class Main {
    public static void main(String[] args) {
        Muscat gov= new Muscat();
        gov.population=988866;
        gov.setPopulation();
        Seeb city=new Seeb();
        city.seebPopulation=50008;
        city.setPopulation();

    }
}
class Muscat{
    int population;
    int area;
    String[]cities;
    void setPopulation(){
        System.out.println("The population of Muscat:"+population);
    }
}
class Seeb extends Muscat{
    String[]vilages;
    String seebDescription;
    int seebPopulation;
    @Override
    void setPopulation() {
        System.out.println("The Population of Seeb:"+seebPopulation);;
    }
}