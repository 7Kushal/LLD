package BuilderDesign;

public class phoneBuilder {
    int ram;
    int brand;
    int storage;
    boolean screentouch;
    int size;
    int model;

    phoneBuilder build(){
        return this;
    }

    public int getRam() {
        return ram;
    }

    public phoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public int getBrand() {
        return brand;
    }

    public phoneBuilder setBrand(int brand) {
        this.brand = brand;
        return this;
    }

    public int getStorage() {
        return storage;
    }

    public phoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public boolean isScreentouch() {
        return screentouch;
    }

    public phoneBuilder setScreentouch(boolean screentouch) {
        this.screentouch = screentouch;
        return this;
    }

    public int getSize() {
        return size;
    }

    public phoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public int getModel() {
        return model;
    }

    public phoneBuilder setModel(int model) {
        this.model = model;
        return this;
    }

    
}
