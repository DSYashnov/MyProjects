package les28.tets15;

public class Test15 {
    void maraphon(int temperatureInAir, int tempoInRun) throws PodvernutNiguException{
        if(tempoInRun > 12){
            throw new PodvernutNiguException("Temp in run bil shliskom visokim: " + tempoInRun);
        }
        if (temperatureInAir > 32){
            throw new SveloMishouException();
        }
        System.out.println("you finished this maraphon");
    }

    public static void main(String[] args) {
        Test15 test = new Test15();
        try {
            test.maraphon(20, 18);
        } catch (PodvernutNiguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("V lubom sluchae vi polychite gramoty!!!");
        }
    }
}
class PodvernutNiguException extends Exception{
    PodvernutNiguException(String msg){
        super(msg);
    }
    PodvernutNiguException(){

    }
}
class SveloMishouException extends RuntimeException{
    SveloMishouException(String msg){
        super(msg);
    }
    SveloMishouException(){
    }
}

