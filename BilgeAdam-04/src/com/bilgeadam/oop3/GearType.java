package com.bilgeadam.oop3;

public enum GearType {
    MANUEL {
        @Override
        public double consumeRatePerMile(EngineType engineType) {
            if(engineType == EngineType.DIESEL){
                return 0.5;
            } else if(engineType == EngineType.GASOLINE){
                return 0.7;
            } else if(engineType == EngineType.ELECTRIC){
                return 0.0;
            } else if(engineType == EngineType.HYBRID){
                return 0.3;
            }
            return 0.0;
        }
    },
    AUTOMATIC {
        @Override
        public double consumeRatePerMile(EngineType engineType) {
            switch (engineType) {
                case DIESEL:
                    return 0.6;
                case ELECTRIC:
                    return 0.0;
                case GASOLINE:
                    return 0.8;
                case HYBRID:
                    return 0.45;
                default:
                    return 0.0;
            }
        }
    };

    public abstract double consumeRatePerMile(EngineType engineType);



}
