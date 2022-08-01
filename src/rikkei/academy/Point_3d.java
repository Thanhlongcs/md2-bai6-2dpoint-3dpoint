package rikkei.academy;

public class Point_3d extends Point_2d{
    private float z = 0.0f;

    public Point_3d(float z) {
        this.z = z;
    }

    public Point_3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        float[] XYZ = {super.getX(),super.getY(),this.z};
    }
    public float[]getXYZ(){
        float[] XYZ= {super.getX(),super.getY(),this.z};
        return  XYZ;
    }

    @Override
    public String toString() {
        return "Point_3d{" +
                super.toString()+
                "z=" + z +
                '}';
    }
}
