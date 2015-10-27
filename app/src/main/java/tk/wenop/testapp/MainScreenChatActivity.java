package tk.wenop.testapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import tk.wenop.testapp.Adapter.MainScreenChatAdapter;
import tk.wenop.testapp.Overview.MainScreenOverviewItem;


public class MainScreenChatActivity extends AppCompatActivity {

    private MainScreenChatAdapter mainActRVAdapter;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mRVLayoutM;

    protected ArrayList<MainScreenOverviewItem> mainActDataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_chat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                // TODO: 按一下出现说话窗
            }
        });

        //设置recyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.mainscreen_recycler_view);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        mRVLayoutM = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mRVLayoutM);

        // wenop-test
        //   测试增加几个item... 看看效果
        mainActDataSet = new ArrayList<MainScreenOverviewItem>();
        MainScreenOverviewItem msovi_0 = new MainScreenOverviewItem();
        msovi_0.mNickName = "oh yeah";
        msovi_0.mLocation = "天津市";
        msovi_0.mCommentCount = 11;
        mainActDataSet.add(msovi_0);

        // specify an adapter (see also next example)
        mainActRVAdapter = new MainScreenChatAdapter(mainActDataSet);
        mRecyclerView.setAdapter(mainActRVAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen_chat, menu);
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
