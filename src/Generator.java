import java.util.Random;

public class Generator {
    public static String password (int length, boolean useUpperCase, boolean useLowerCase, boolean useNumbers){
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXZY";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";

        StringBuilder build = new StringBuilder();

        if(useUpperCase){
            build.append(upperCase);
        }
        if(useLowerCase){
            build.append(lowerCase);
        }
        if(useNumbers){
            build.append(numbers);
        }

        Random random = new Random();

        StringBuilder builder = new StringBuilder();

//        for (int i = 0; i < length; i++) {
//            int index = random.nextInt(build.length());
//            builder.append(build.charAt(index));
//        }
        return builder.toString();
    }
}
