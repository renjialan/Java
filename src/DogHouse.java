// blueprint for any doghouse
public class DogHouse {

    private int height = 0;
    private int width = 0;
    private String doghouseColor = "";
    private String doghouseName = "";

    ////////////////////////////////////////////////
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDoghouseColor(String doghouseColor) {
        this.doghouseColor = doghouseColor;
    }

    public void setDoghouseName(String doghouseName) {
        this.doghouseName = doghouseName;
    }
////////////////////////////////////////////////////////////////////////////
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getDoghouseColor() {
        return doghouseColor;
    }

    public String getDoghouseName() {
        return doghouseName;
    }

    public static void main(String[] args) {

    }
}
