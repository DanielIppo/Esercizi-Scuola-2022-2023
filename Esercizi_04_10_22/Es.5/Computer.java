public class Computer {
    public int ram, hdd, wattPsu;
    public String cpu, gpu, chassis;
    public double price, cpuFreq, gpuFreq, ramFreq;
    public boolean isOverclocked;

    public Computer(int ram, int hdd, int wattPsu, String cpu, String gpu, String chassis, double price, double cpuFreq, double gpuFreq, double ramFreq, boolean isOverclocked) {
        this.ram = ram;
        this.hdd = hdd;
        this.wattPsu = wattPsu;
        this.cpu = cpu;
        this.gpu = gpu;
        this.chassis = chassis;
        this.price = price;
        this.cpuFreq = cpuFreq;
        this.gpuFreq = gpuFreq;
        this.ramFreq = ramFreq;
        this.isOverclocked = isOverclocked;
    }

    public void showData(){
        System.out.println("RAM: " + ram + "GB");
        System.out.println("HDD: " + hdd + "GB");
        System.out.println("Watt PSU: " + wattPsu + "W");
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
        System.out.println("Chassis: " + chassis);
        System.out.println("Price: " + price + "$");
        System.out.println("CPU Frequency: " + cpuFreq + "GHz");
        System.out.println("GPU Frequency: " + gpuFreq + "GHz");
        System.out.println("RAM Frequency: " + ramFreq + "GHz");
        if(isOverclocked){
            System.out.println("Overclocked: Yes");
        }else{
            System.out.println("Overclocked: No");
        }
    }

    public void addRam(int addedRam){
        ram += addedRam;
    }
}
