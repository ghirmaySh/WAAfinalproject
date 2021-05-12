package com.waa.ecommerce.model;


    public enum Category {
        FOOD(1),
        ELECTRONICS(2),
        CARS(3),
        BOOKS(4);

        Category(int i) {
            this.catagoryToRead = i;
        }
        private int catagoryToRead;

        public int getCategoryToRead() {
            return catagoryToRead;
        }
    }

