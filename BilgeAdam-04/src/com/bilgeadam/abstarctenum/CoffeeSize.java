package com.bilgeadam.abstarctenum;

public enum CoffeeSize {

    SMALL(10, "Tall size"){
        @Override
        public String getIngredient() {
            return "30 gr.coffee, 10 gr.milk";
        }
    },
    MEDIUM(12, "Grande size"){
        @Override
        public String getIngredient() {
            return "50 gr.coffee, 18 gr.milk";
        }
    },
    LARGE(15,"Vendi size"){
        @Override
        public String getIngredient() {
            return "70 gr.coffee, 25 gr.milk";
        }
    };

    private int price;
    private String commersialName;

    private CoffeeSize(int price, String commersialName) {
        this.price = price;
        this.commersialName = commersialName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCommersialName() {
        return commersialName;
    }

    public void setCommersialName(String commersialName) {
        this.commersialName = commersialName;
    }

    public abstract String getIngredient();

}
