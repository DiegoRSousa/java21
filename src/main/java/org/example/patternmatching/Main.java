package org.example.patternmatching;

import java.math.BigDecimal;

public class Main {
    private static  BigDecimal balance = BigDecimal.ZERO;

    public static void main(String[] args) {
        System.out.println("Balance: " + balance);

        add(new Credit(BigDecimal.TEN));
        System.out.println("Balance: " + balance);


        apply(new Debit(BigDecimal.TEN));
        System.out.println("Balance: " + balance);

        apply(new Credit(new BigDecimal(20)));
        System.out.println("Balance: " + balance);



    }

    static void add(Transaction transaction) {
        if(transaction instanceof Credit c) {
            balance = balance.add(c.value());
        } else {
            throw new IllegalArgumentException("Transação inválida...");
        }
    }

    static void apply(Transaction transaction) {
        switch (transaction) {
            case Credit c when !c.isBlocked() -> balance = balance.add(c.value());
            case Debit d when !d.isBlocked() && balance.compareTo(d.value()) >= 0 -> balance = balance.subtract(d.value());
            default -> throw new IllegalArgumentException("Transação inválida...");
        }
    }
}
sealed interface Transaction permits Debit, Credit {
    default boolean isBlocked() {
        return false;
    }
}

record Debit(BigDecimal value) implements Transaction {
}

record Credit(BigDecimal value) implements Transaction {
}