import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class FlashCards extends ListenerAdapter {

  // Bot Commands
  public static String[] commandList = new String[]{"-Commands", "-Study", "-Study Options"};

  // Lesson 3 Kanji
  public static String[] L3Kanji = new String[]{"一", "二", "三", "四", "五", "六", "七", "八", "九",
      "十", "百", "千", "万", "時", "円"};
  public static String[] L3Spellings = new String[]{"いち", "に", "さん", "よん", "ご", "ろく", "なな",
      "はち", "きゅう", "じゅう", "ひゃく", "せん", "まん", "じ", "えん"};
  public static String[] L3AlternateSpellings = new String[]{"ひと", "ふた", "みっ", "よっ", "いつ",
      "むっ", "なな", "やっ", "ここの", "とお", "ひゃく", "せん", "まん", "とき", "まる"};
  public static String[] L3Definitions = new String[]{"One", "Two", "Three", "Four", "Five",
      "Six", "Seven", "Eight", "Nine", "Ten", "100", "1000", "10000", "time"};

  // Lesson 4 Kanji
  public static String[] L4Kanji = new String[]{"日", "本", "人", "月", "火", "水", "木", "金", "土",
      "曜", "上", "下", "中", "半"};
  public static String[] L4KanjiSpellings = new String[]{"に / にち", "ほん", "じん", "つき", "か",
      "みず", "き", "おかね", "つち", "よう", "うえ", "した", "なか", "はん"};
  public static String[] L4AlternateSpellings = new String[]{"ひ /び", "ほん", "ひと", "げつ", "ひ",
      "すい", "もく", "きん", "ど", "よう", "うえ", "くだ", "ちゅう", "はん"};
  public static String[] L4Definitions = new String[]{"Sun / Day", "Book", "Person", "Moon / Month",
      "Fire", "Water", "Tree", "Money / Gold", "Soil", "Weekday", "Up / Above", "Down / Below",
      "Inside", "Half"};

  // Lesson 5 Kanji
  public static String[] L5Kanji = new String[]{"山", "川", "元", "気", "天", "私", "今", "田", "女",
      "男", "見", "行", "食", "飲"};
  public static String[] L5KanjiSpellings = new String[]{"やま", "かわ", "げん", "き", "てん", "わたし",
      "いま", "た / だ", "おんな", "おとこ", "み", "い", "た", "の"};
  public static String[] L5AlternateSpellings = new String[]{};
  public static String[] L5Definitions = new String[]{};

  // Lesson 6 Kanji
  public static String[] L6Kanji = new String[]{};
  public static String[] L6KanjiSpellings = new String[]{};
  public static String[] L6AlternateSpellings = new String[]{};
  public static String[] L6Definitions = new String[]{};

  // Lesson 7 Kanji
  public static String[] L7Kanji = new String[]{};
  public static String[] L7KanjiSpellings = new String[]{};
  public static String[] L7AlternateSpellings = new String[]{};
  public static String[] L7Definitions = new String[]{};

  // Lesson 8 Kanji
  public static String[] L8Kanji = new String[]{};
  public static String[] L8KanjiSpellings = new String[]{};
  public static String[] L8AlternateSpellings = new String[]{};
  public static String[] L8Definitions = new String[]{};

  // Lesson 1 Vocab
  public static String[] L1Vocab = new String[]{};
  public static String[] L1VocabSpelling  = new String[]{};
  public static String[] L1VocabDefinitions = new String[]{};

  // Lesson 2 Vocab


  // Lesson 3 Vocab


  // Lesson 4 Vocab


  // Lesson 5 Vocab


  // Lesson 6 Vocab


  // Lesson 7 Vocab


  // Lesson 8 Vocab


  // Lesson 9 Vocab


  // Lesson 10 Vocab


  // Lesson 11 Vocab


  // Lesson 12 Vocab


  // Study Options
  public static String[] kanjiStudyOptions = new String[]{"Kanji L3", "Kanji L4", "Kanji L5",
      "Kanji L6", "Kanji L7", "Kanji L8"};

  public static String[] vocabStudyOptions = new String[]{"Vocab L3", "Vocab L4", "Vocab L5",
      "Vocab L6", "Vocab L7", "Vocab L8", "Vocab L9", "Vocab L10"};

  /**
   * Main method, contains if else statements and calls other methods such as the ones
   * which print out random elements
   *
   * @param event Message in discord server event
   */
  public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
    Random rand = new Random();

    String[] userInput = event.getMessage().getContentRaw().split(" ");

    if (!event.getMember().getUser().isBot()) {

      // Main If-Else calling to methods
      if (userInput.length == 1) {     // 1 Word Commands //
        if (userInput[0].equalsIgnoreCase("-Commands")) {
          event.getChannel().sendMessage("Here is the list of commands: ").queue();
          for (String s : commandList) {
            event.getChannel().sendMessage(">> " + s).queue();
          }
        } else if (userInput[0].equalsIgnoreCase("-Study")) {
          event.getChannel().sendMessage("To use, type -Study [kanji/vocab] " +
              "[list]").queue();
          event.getChannel().sendMessage("Type \"-Study Options\" to see the " +
              "available lists").queue();
        }

      } else if (userInput.length == 2) {      // 2 Word Commands //
        if (userInput[0].equalsIgnoreCase("-Study") &&
            userInput[1].equalsIgnoreCase("Options")) {
          event.getChannel().sendMessage("Kanji lists to study: ").queue();
          for (String kanjiStudyOption : kanjiStudyOptions) {
            event.getChannel().sendMessage(">> " + kanjiStudyOption).queue();
          }
          event.getChannel().sendMessage("Vocab lists to study: ").queue();
          for (String vocabStudyOption : vocabStudyOptions) {
            event.getChannel().sendMessage(">> " + vocabStudyOption).queue(); //todo
          }
        }

      } else if (userInput.length == 3) {      // 3 Word Commands //
        if (userInput[0].equalsIgnoreCase("-Study") &&
            userInput[1].equalsIgnoreCase("Kanji")) {   // All Kanji Outputs

          if (userInput[2].equalsIgnoreCase("L3")) {       // L3 Kanji Print
            event.getChannel().sendMessage(randomKanji(L3Kanji, L3Spellings,
                L3AlternateSpellings, L3Definitions)).queue();
          }
          if(userInput[2].equalsIgnoreCase("L4")) {
            event.getChannel().sendMessage(randomKanji(L4Kanji, L4KanjiSpellings,
                L4AlternateSpellings, L4Definitions)).queue();
          }
          if(userInput[2].equalsIgnoreCase("L5")) {
            event.getChannel().sendMessage(randomKanji(L5Kanji, L5KanjiSpellings,
                L5AlternateSpellings, L5Definitions)).queue();
          }
          if(userInput[2].equalsIgnoreCase("L6")) {
            event.getChannel().sendMessage(randomKanji(L6Kanji, L6KanjiSpellings,
                L6AlternateSpellings, L6Definitions)).queue();
          }
          if(userInput[2].equalsIgnoreCase("L7")) {
            event.getChannel().sendMessage(randomKanji(L7Kanji, L7KanjiSpellings,
                L7AlternateSpellings, L7Definitions)).queue();
          }
          if(userInput[2].equalsIgnoreCase("L8")) {
            event.getChannel().sendMessage(randomKanji(L8Kanji, L8KanjiSpellings,
                L8AlternateSpellings, L8Definitions)).queue();
          }

        } else if (userInput[0].equalsIgnoreCase("-Study") &&
            userInput[1].equalsIgnoreCase("Vocab")) {   // All Vocab Outputs

          if(userInput[2].equalsIgnoreCase("L3")) {
            //todo: create random vocab word method and call it for each lesson
          }

        }
      }

    }
  }

  /**
   * Takes in various kanji string arrays and prints a random value from it
   * along with hidden spellings and definitions
   *
   * @param kanjiList String arrays inputted by user (pretty obvious as each list has 4 arrays)
   * @return One value from the user's Array
   */
  public static String randomKanji(String[] kanjiList, String[] spellingsOne,
                                   String[] spellingsTwo, String[] definitions) {
    String returnMe = "";
    int length = kanjiList.length;
    Random rand = new Random();

    int randIndex = rand.nextInt(length);
    returnMe = "Kanji: " + kanjiList[randIndex] + "\n" + "Spellings: " + "||" +
        spellingsOne[randIndex] + "||";

    if(!spellingsTwo[randIndex].equalsIgnoreCase(spellingsOne[randIndex])) {
      returnMe += " or " + "||" + spellingsTwo[randIndex] + "||";
    }

    returnMe += "\n" + "Meaning: " + "||" + definitions[randIndex] + "||";

    return returnMe;
  }

  /**
   * Takes in 2 string arrays and outputs one long string
   * with a random vocab word and its spelling in jpn
   *
   * @param englishWord Array of english words
   * @param jpnSpelling Array of jpn words that aligns with englishWord
   * @return - long string with answers hidden
   */
  public static String randomEngToJpn(String[] englishWord, String[] jpnSpelling) {
    String returnMe = "";
    int length = englishWord.length;
    Random rand = new Random();

    int randIndex = rand.nextInt(length);
    returnMe += "Word: " + englishWord[randIndex] + "\n" + "Spelling: "+ "||" +
        jpnSpelling[randIndex] + "||";

    return returnMe;
  }

  /**
   * Takes in 2 string arrays and outputs one long string
   * consisting of a jpn word and it's translation (hidden)
   *
   * @param jpnWord Random japanese word from string array
   * @param translation English translation from parallel array
   * @return - long string with answers hidden
   */
  public static String randomJpnToEng(String[] jpnWord, String[] translation) {
    String returnMe = "";
    int length = jpnWord.length;
    Random rand = new Random();

    int randIndex = rand.nextInt(length);
    returnMe += "たんご: " + jpnWord[randIndex] + "\n" + "Meaning: " + "||" +
        translation[randIndex] + "||";

    return returnMe;
  }

}
