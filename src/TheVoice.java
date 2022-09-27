public class TheVoice {
    public static void main(String[] args) {
        int NB_VOTES = 150;
        int nameCount = args.length;
        if (nameCount == 0)
            System.out.println("Il n'existe pas de candidats");
        else{
            int value;
            int[] count = new int[nameCount];
            for (int i = 0; i < NB_VOTES; i++){
                java.util.Random random = new java.util.Random();
                value = random.nextInt(nameCount);
                count[value] ++;
            }
            int i = 1;
            for (String name : args) {
                System.out.println("#" + i + " " + name);
                name += (count[i-1] * 100 / NB_VOTES);
                i++;
            }

            System.out.println("Résultats");
            for (String name : args) {
                System.out.println(name);
            }
        }


    }
}