public class Characters {

    public static void main(String[] args){
        workingWithChar();
    }

    public static void workingWithChar(){
        char myChar='D';
        char myUnicodeChar = '\u0044';  //unicode-table.com
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
    }
}
