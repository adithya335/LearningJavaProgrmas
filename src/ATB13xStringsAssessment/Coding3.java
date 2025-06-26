package ATB13xStringsAssessment;

public class Coding3 {

    public static void main(String[] args) {
        String concat = "";
        long timeTaken;
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            concat += "test";
        }
        timeTaken = System.currentTimeMillis() - currentTime;

        System.out.println("String perfomance: " + timeTaken);

        StringBuilder sb = new StringBuilder();
        long currentTime1 = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            sb.append("test");
        }
        timeTaken = System.currentTimeMillis() - currentTime1;
        System.out.println("StringBuilder perfomance: " + timeTaken);

        StringBuffer stringBuffer = new StringBuffer();
        long currentTime2 = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            stringBuffer.append("test");
        }
        timeTaken = System.currentTimeMillis() - currentTime2;
        System.out.println("StringBuffer perfomance: " + timeTaken);
    }
}
