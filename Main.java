import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static void main(String[] args) throws Exception{

        JDA jda = JDABuilder.createDefault("KEY FROM DISCORD WEBSITE -- UNIQUE TO EACH BOT").build();

        jda.addEventListener(new FlashCards());
    }

}
