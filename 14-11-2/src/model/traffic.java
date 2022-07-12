package model;

abstract class traffic {
    private int fee;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public traffic(int fee) {
        this.fee = fee;
    }

}
