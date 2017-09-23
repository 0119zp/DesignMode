package zp.com.zpmodeldemo.Decorator;

import android.util.Log;

/**
 * 子类，封装最高成绩
 */

public class HighScorDecorator extends Decorator{

    public HighScorDecorator(SchoolReport sr) {
        super(sr);
    }

    public void reportHighScore(){
        Log.e("zhang","学校最高成绩 == 80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
