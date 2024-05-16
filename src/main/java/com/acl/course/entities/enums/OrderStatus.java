package com.acl.course.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1), 
    PAID(2), 
    SHIPPED(3), 
    DELIVERED(4), 
    CANCELED(5);

    private int code;

    // Construtor privado para definir o código do status do pedido
    private OrderStatus(int code) {
        this.code = code;
    }

    // Método para obter o código do status do pedido
    public int getCode() {
        return code;
    }

    // Método estático para converter um código em um valor enum
    public static OrderStatus valueOf(int code) {
        // Itera sobre os valores da enum para encontrar o correspondente ao código
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        // Lança uma exceção se o código for inválido
        throw new IllegalArgumentException("Invalid order status code");
    }
}
