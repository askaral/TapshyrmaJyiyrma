public class Parallelepiped {

    private int length;
    private int width;
    private int height;


    public Parallelepiped(int length, int width, int height ) {
        this.length = length;
        this.width = width;
        this.height = height;


    }
    public Parallelepiped(){

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void getArea(){

            System.out.println("Area: "+(2 * ((length * height) + (length * width) + (height * width))));

    }
    public void getVolume(){
        System.out.println("Volume: "+length*height*width);
    }

}

