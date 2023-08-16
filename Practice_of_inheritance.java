package hello.com;
class vehicle{
    public int car;

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        System.out.println("Setting the car");
        this.car = car;
    }
}
class tyre extends vehicle{
    public int tyre;

    public int getTyre() {
        return tyre;
    }
//    class engine extends vehicle{
//        private int engine;
//
//        public int getEngine() {
//            return engine;
//        }
//
//        public void setEngine(int engine) {
//            this.engine = engine;
//        }
//    }

    public void setTyre(int tyre) {
        System.out.println("Setting the tyre");
        this.tyre = tyre;
    }
}
public class Practice_of_inheritance {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.setCar(1);
        System.out.println(v.getCar());
        tyre t = new tyre();
        t.setTyre(4);
        System.out.println(t.getTyre());


    }
}
