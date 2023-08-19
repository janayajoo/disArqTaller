package tarea_2.problema_2.orden;

import tarea_2.problema_2.strategies.PagoStrategy;

public class Orden {
    private int totalCost = 0;

    public void procesarOrden(PagoStrategy strategy) {
        strategy.detallesDePago();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }
}