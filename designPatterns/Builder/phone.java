package Builder;

public class phone {
    int ram;
    String name;
    int memory;
    int cameracount;
    String color;
    int size;
    int brand;
    
    phone(builder build){
        this.ram = build.ram;
        this.name=build.name;
        this.memory=build.memory;
        this.cameracount=build.cameracount;
        this.color=build.color;
        this.size=build.size;
        this.brand=build.brand;
    }

    static class builder{

        int ram;
        String name;
        int memory;
        int cameracount;
        String color;
        int size;
        int brand;

        builder setRam(int ram){
            this.ram = ram;
            return this;
        }

        builder setName(String name){
            this.name = name;
            return this;
        }
        
        builder build(){
           return this;
        }

    }
}
