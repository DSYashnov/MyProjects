package les13;

public class SwitchTest2 {
    public static void main(String[] args) {
        switch ("ponedelnik"){
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "chetverg":
            case "pyatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenie":
                System.out.println("Raboti nety");
                break;
            default:
                System.out.println("takogo dnya ne syschestvyet");
        }
    }
}
