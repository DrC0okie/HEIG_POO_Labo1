public class TheVoice {
    static final int NB_VOTES = 150;

    public static void main(String[] args) {
        int nameCount = args.length;
        if (nameCount == 0)
            System.out.println("Il n'existe pas de candidats");
        else {
            System.out.println("Candidats:");
            for (int i = 0; i < nameCount; ++i)
                System.out.println("#" + (i + 1) + " " + args[i]);

            java.util.Random random = new java.util.Random();
            int[] count = new int[nameCount];

            System.out.println("\n" + NB_VOTES + " votes:");

            for (int i = 0; i < NB_VOTES; ++i) {
                count[random.nextInt(nameCount)]++;
                System.out.print('.');
            }

            System.out.println("\n\nResultats : ");

            for (int i = 0; i < nameCount; ++i) {
                int percent = count[i] * 100 / NB_VOTES;
                System.out.println(percent + "% " + args[i]);
            }
        }
    }
}