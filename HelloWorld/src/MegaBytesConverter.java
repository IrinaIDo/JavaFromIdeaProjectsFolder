public class MegaBytesConverter {
    public static void main(String[] args){

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = (kiloBytes / 1024);
            int restKiloBytes = (kiloBytes % 1024);
            System.out.print(kiloBytes + " KB = " + megaBytes + " MB and " + restKiloBytes + " KB");
        }
    }
}