package ProxyPattern;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Real Image with filename " + this.getFileName());
    }

    public String getFileName() {
        return this.fileName;
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
