package id.co.noz.dynamic.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayout ll;
    private CheckBox cbsort;
    private ArrayList<String> al ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.llutama);
        al = new ArrayList<>();

        al.add("Pohong");
        al.add("Telo");
        al.add("Mboteh");
        al.add("Wortel");
        al.add("Kacang");
        al.add("Kentang");
        al.add("Gingseng");
        al.add("Jahe");
        al.add("Kencur");

        for(int i = 0; i< al.size(); i++){
            cbsort = new CheckBox(this);
            cbsort.setId(i);
            cbsort.setText(al.get(i));
            cbsort.setOnClickListener(getOnClickDoSomething(cbsort));
            ll.addView(cbsort);
        }
    }


    private View.OnClickListener getOnClickDoSomething(final Button button){
        return  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("CHECKBOX ID : " + button.getId() + " Text: " + button.getText());
            }
        };
    }
}
