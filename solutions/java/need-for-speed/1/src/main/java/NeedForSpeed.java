class NeedForSpeed {
    int speed;
    int batteryDrain;
    int battery = 100;
    int distance = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery - this.batteryDrain < 0;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()){
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
         return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance = 800;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return this.distance <= (100 / car.batteryDrain) * car.speed;
    }
}
