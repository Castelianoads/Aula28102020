public class Carro {
    private String marca;
    private String modelo;
    public int ano;
    public String cor;

    public Carro (String m, String ma, int a, String c){ //Metodo Construtor
        this.setMarca(m);
        this.setModelo(ma);
        this.setAno(a);
        this.setCor(c);
    }

    public String getModelo(){  //Acessa informações, retorna algo.
        return this.modelo;    
    }
    public void setModelo(String ma){   //Passa informaçoes, passa parâmetros.
        this.modelo = ma;    
    }

    public String getMarca(){ //Acessa informações, retorna algo.
        return this.marca;    
    }
    public void setMarca(String m){   //Passa informaçoes, passa parâmetros.
        this.marca = m;    
    }    
        
    public int getAno(){ //Acessa informações, retorna algo.
        return this.ano;    
    }
    public void setAno(int a){   //Passa informaçoes, passa parâmetros.
         this.ano = a;    
    }

    public String getCor(){ //Acessa informações, retorna algo.
        return this.cor;    
    }
    public void setCor(String c){   //Passa informaçoes, passa parâmetros.
        this.cor = c;    
    }
    
    public void status() {
        System.out.println("características do carro: ");
        System.out.println("Marca: " +this.getMarca() );
        System.out.println("Modelo: " +this.getModelo() );
        System.out.println("Ano: " +this.getAno() );
        System.out.println("Cor: " +this.getCor() );
        System.out.println();
    }    
}
