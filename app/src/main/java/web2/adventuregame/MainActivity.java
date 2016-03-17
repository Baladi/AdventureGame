package web2.adventuregame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Data data;
    private Frame frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            data = new Data(this);


            ////// obtenir et afficher page 1 --> setFrame(int)
            setFrame(1);


        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void setFrame(int i) {

        Frame tmp = data.get(i);

        if(tmp != null) {
            frame = tmp;
            TextView textView = (TextView) findViewById(R.id.BoiteDialogue);
            textView.setText(frame.text);

            if (frame.choix[0] == -1){
                Button button1 = (Button) findViewById(R.id.choix1);
                button1.setEnabled(false);
            } else {
                Button button1 = (Button) findViewById(R.id.choix1);
                button1.setEnabled(true);
            }

            if (frame.choix[1] == -1){
                Button button2 = (Button) findViewById(R.id.choix2);
                button2.setEnabled(false);
            } else {
                Button button2 = (Button) findViewById(R.id.choix2);
                button2.setEnabled(true);
            }
        }
    }

    // Button choix 1
    public void onClick1(View view){
        setFrame(frame.choix[0]);
    }

    // Button choix 2
    public void onClick2(View view){
        setFrame(frame.choix[1]);

    }

    // Button MENU
    public void onClickMenu(View view){
        setFrame(1);
    }

    // onClick

    // setFRame ( frame.choix[0]

    //

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
