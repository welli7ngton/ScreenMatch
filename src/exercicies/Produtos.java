package exercicies;

//Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e
//modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
public class Produtos {
    private String name;
    private double price;
    private int amount;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void calculateLiquidValue(){
        System.out.println(this.price * this.amount);
    }

    public double addDiscount(double percentageDiscount){
        return this.price - (this.price *(percentageDiscount/100));
    }
}
