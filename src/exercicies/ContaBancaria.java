package exercicies;

//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), balance (privado) e titular (publico).
//Implemente métodos getters e setters para os atributos privados.
public class ContaBancaria {
    private double balance;
    private int accountNumber;
    public String owner;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int numeroConta) {
        this.accountNumber = numeroConta;
    }

    public void setOwner(String titular) {
        this.owner = titular;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void registerClientInfo(String owner, int accountNumber, double balance){
        this.setOwner(owner);
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }

    public void showAccountInfo(){
        System.out.println("Titular: " + this.getOwner());
        System.out.println("Numero da Conta : " + this.getAccountNumber());
        System.out.println("Saldo: " + this.getBalance());
    }
}
