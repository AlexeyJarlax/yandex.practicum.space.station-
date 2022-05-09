package yandex.practicum.space.station;

class Zarya extends Mir {
    protected Zarya() {
        energyReserve = 10;
        oxygenLevel = 0;
    }

    protected Zarya(double initialOxygenLevel, double initialEnergyLevel) {
        energyReserve = initialEnergyLevel + 15;
        oxygenLevel = initialOxygenLevel + 15;
    }

    void activateModule() {
        flushEnergy();
    }

    void turnSolarPanels() {
        System.out.println("Поворот солнечных панелей для накопления энергии...");
        energyReserve += 15;
    }

    void flushEnergy() {
        System.out.println("Сброс энергии...");
        energyReserve = 0;
    }
}
