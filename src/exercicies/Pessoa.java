package exercicies;

import java.util.Scanner;
//Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e
//modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
public class Pessoa {
    private final Scanner sc = new Scanner(System.in);
    public String name;
    private String lastName;
    public int age;
    private String address;
    private String cellphoneNumber;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setCellphoneNumber(String cellphoneNumber){
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getCellphoneNumber(){
        return cellphoneNumber;
    }

    public void veriryAge(){
        if (this.age > 18){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade");
        }
    }

    public void bornYear(){
        System.out.println("Digite o ano atual: ");
        int year = sc.nextInt();
        System.out.println("O seu ano de nascimento é " + (year - this.age));
    }
}
