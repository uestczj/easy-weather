package com.example.caizejian.easyweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    @SerializedName("trav")
    public Travel travel;

    @SerializedName("drsg")
    public ClothAdvice clothAdvice;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

    public class Travel {

        @SerializedName("txt")
        public String info;
    }

    public class ClothAdvice{

        @SerializedName("txt")
        public String info;
    }

}
