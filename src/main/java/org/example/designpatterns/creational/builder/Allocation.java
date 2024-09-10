package org.example.designpatterns.creational.builder;

public class Allocation {
    private Allocation(){}
    private int dealId;
    public int getDealId(){
        return dealId;
    }
    private void setDealId(int dealId){
        this.dealId=dealId;
    }
    public static AllocationBuilder getAllocationBuilder(){
        return new AllocationBuilder();
    }

    public static class AllocationBuilder{
        private Allocation allocation;
        private int dealId;
        public AllocationBuilder withDealId(int dealId){
            this.dealId=dealId;
            return this;
        }
        public Allocation build(){
            this.allocation=new Allocation();
            allocation.setDealId(dealId);
            return allocation;
        }
        public Allocation getAllocation(){
            return allocation;
        }
    }
}
