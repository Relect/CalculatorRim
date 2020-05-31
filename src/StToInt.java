public class StToInt {
    public static int argToInt (String arg){
        int argToInt = 0;
        switch (arg) {
            case "I":
                argToInt=1;
                break;
            case "II":
                argToInt=2;
                break;
            case "III":
                argToInt=3;
                break;
            case "IV":
                argToInt=5;
                break;
            case "V":
                argToInt=5;
                break;
            case "VI":
                argToInt=6;
                break;
            case "VII":
                argToInt=7;
                break;
            case "VIII":
                argToInt=8;
                break;
            case "IX":
                argToInt=9;
                break;
            case "X":
                argToInt=10;
                break;
            case "1":
                argToInt=1;
                break;
            case "2":
                argToInt=2;
                break;
            case "3":
                argToInt=3;
                break;
            case "4":
                argToInt=4;
                break;
            case "5":
                argToInt=5;
                break;
            case "6":
                argToInt=6;
                break;
            case "7":
                argToInt=7;
                break;
            case "8":
                argToInt=8;
                break;
            case "9":
                argToInt=9;
                break;
            case "10":
                argToInt=10;
                break;
            default:
                System.out.println("число не распознано.");
        }
        return argToInt;
    }
}
