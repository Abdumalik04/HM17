import java.util.Arrays;

public class Company {

    private String address;
    private Java [] javas;

    private Android[] androids;
private Go [] go;
    public Company(String address, Java[] javas, Android[] androids, Go [] go) {
        this.address = address;
        this.javas = javas;
        this.androids = androids;
        this.go=go;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Java[] getJavas() {
        return javas;
    }

    public void setJavas(Java[] javas) {
        this.javas = javas;
    }

    public Android[] getAndroids() {
        return androids;
    }

    public void setAndroids(Android[] androids) {
        this.androids = androids;
    }

    public Go[] getGo() {
        return go;
    }

    public void setGo(Go[] go) {
        this.go = go;
    }



    @Override
    public String toString() {
        return
                "address: " + address +
                ", javas:" + Arrays.toString(javas) +
                ", androids:" + Arrays.toString(androids) +
                ", companies:" + Arrays.toString(go);

    }
}



