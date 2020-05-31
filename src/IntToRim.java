public class IntToRim {
    public static String argToRim (int arg){
        String argToRim = "";
        switch (arg) {
            case 1:
                argToRim="I";
                break;
            case 2:
                argToRim="II";
                break;
            case 3:
                argToRim="III";
                break;
            case 4:
                argToRim="IV";
                break;
            case 5:
                argToRim="V";
                break;
            case 6:
                argToRim="VI";
                break;
            case 7:
                argToRim="VII";
                break;
            case 8:
                argToRim="VIII";
                break;
            case 9:
                argToRim="IX";
                break;
            case 10:
                argToRim="X";
                break;
        }
        return argToRim;
    }
}