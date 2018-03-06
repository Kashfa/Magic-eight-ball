import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {

    private ArrayList<String> answers;

    public MagicEightBall(){
        this.answers = new ArrayList();
    }

    public void addAnswer(String word){
        this.answers.add(word);
    }

    public int getWordCount(){
      return this.answers.size();
    }

    public String getAnswer(){
        Collections.shuffle(this.answers);
        return this.answers.get(0);
      }
    }
