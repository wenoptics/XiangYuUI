package tk.wenop.testapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import tk.wenop.testapp.Overview.MainScreenOverviewItem;
import tk.wenop.testapp.R;

/**
 * Created by wenop_000 on 2015/10/12.
 */
public class MainScreenChatAdapter extends RecyclerView.Adapter<MainScreenChatAdapter.ViewHolder> {

    private ArrayList<MainScreenOverviewItem> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View mView;

        public TextView  mNickName;
        public TextView  mAudioTimeSec;
        public ImageView mAvatar;
        public ImageView mContentPhoto;
        public TextView  mLocation;
        public TextView  mCommentCount;
        public TextView  mTime;

        public ViewHolder(View v) {
            super(v);
            mView = v;

            mNickName      = (TextView)  v.findViewById(R.id.textView_nickName        );
            mAudioTimeSec  = (TextView)  v.findViewById(R.id.textView_audioLength     );
            mAvatar        = (ImageView) v.findViewById(R.id.imageView_avatar        );
            mContentPhoto  = (ImageView) v.findViewById(R.id.imageView_contentPhoto  );
            mLocation      = (TextView)  v.findViewById(R.id.textView_location        );
            mCommentCount  = (TextView)  v.findViewById(R.id.textView_commentCount    );
            mTime          = (TextView)  v.findViewById(R.id.textView_time            );

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MainScreenChatAdapter(ArrayList<MainScreenOverviewItem> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MainScreenChatAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_received_list__main_screen_chat, parent, false);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: onClick在这里
            }
        });

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        MainScreenOverviewItem data = mDataset.get(position);
        holder.mAvatar.setImageResource(  );
        holder.mNickName.setText(data.mNickName);
        ...

    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}