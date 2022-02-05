public class PaintJob {
    public static void main(String[] args){
        System.out.println(getBucketCount(1.2d, 1.4d));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double bucket = Math.ceil(area / areaPerBucket);
        bucket -= extraBuckets;
        return (int) bucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double bucket = Math.ceil(area / areaPerBucket);
        return (int) bucket;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucket = Math.ceil(area / areaPerBucket);
        return (int) bucket;
    }
}