package gr.aueb.cf.cf9.ch7;

/**
 * concat becomes efficient with stringbuilder
 */
public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //mutable
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i < 15000; i++) {
            concatStr = concatStr + i; //to i metatrepetai se string 15000 sinenoseis
        }

        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0; //gia na paroume seconds

        timeStart = System.currentTimeMillis();
        for (int i = 1; i < 15000; i++) {
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd- timeStart) / 1000.0;

        System.out.println("String concat time: " + stringElapsedTime + " seconds");
        System.out.println("String Builder concat time: " + sbElapsedTime + " seconds");
    }
}
