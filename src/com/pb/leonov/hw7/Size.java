package com.pb.leonov.hw7;

public enum Size {
    XXS("Детский размер", "32"),
    XS("Взрослый размер","34"),
    S("Взрослый размер", "36"),
    M("Взрослый размер","38"),
    L("Взрослый размер", "40");

    private String description;
    private String euroSize;


    Size(String description, String euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public String getEuroSize() {
        return euroSize;
    }
}

