package cool.supertextview.android;

import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class FlexboxLayoutActivity extends AppCompatActivity {

    private RecyclerView mTagListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexbox_layout);
        mTagListView = findViewById(R.id.rlv_tag_list);

        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(this);
        layoutManager.setFlexDirection(FlexDirection.ROW);
        layoutManager.setJustifyContent(JustifyContent.FLEX_START);
        mTagListView.setLayoutManager(layoutManager);

        TagAdapter tagAdapter = new TagAdapter();
        List<String> iconList = new ArrayList<>();

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");


        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");

        tagAdapter.setDataSilently(iconList);

        mTagListView.setAdapter(tagAdapter);
    }
}