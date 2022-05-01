import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static void main(String[] args) throws Exception{

        JDA jda = JDABuilder.createDefault("OTA3MzAyNDY4MDY3NjU5ODU2.YYlNRQ.iChWadfKoMnaV3sIBsS_eYKj-7Y").build();

        jda.addEventListener(new FlashCards());
    }

}
