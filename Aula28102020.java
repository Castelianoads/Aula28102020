
public class Aula28102020 {
    public static void main(String[] args) throws Exception {    
        Carro carro1;  //Instância da outra classe
        Carro carro2;  //Instância da outra classe
          
        
        carro1 = new Carro("VW", "Gol", 2008, "Branco"); //criando carro
        carro1.status();

        carro2 = new Carro("Fiat", "Palio", 2019, "Preto");  //criando carro
        carro2.status();
    }
}