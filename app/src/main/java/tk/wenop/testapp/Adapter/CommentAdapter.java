package tk.wenop.testapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import tk.wenop.testapp.Overview.MainScreenOverviewItem;
import tk.wenop.testapp.R;
import tk.wenop.testapp.UI.PeopleDetailActivity;

/**
 * Created by wenop_000 on 2015/10/12.
 */
public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<MainScreenOverviewItem> mDataset;
    protected Context mContext;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View mView;

        public TextView  mNickName;
        public TextView  mAudioTimeSec;
        public ImageView mAvatar;
        public TextView  mTime;

        public ViewHolder(View v) {
            super(v);
            mView = v;

            mNickName      = (TextView)  v.findViewById(R.id.textView_nickName        );
            mAudioTimeSec  = (TextView)  v.findViewById(R.id.textView_audioLength     );
            mAvatar        = (ImageView) v.findViewById(R.id.imageView_avatar         );
            mTime          = (TextView)  v.findViewById(R.id.textView_time            );

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CommentAdapter(Context context, ArrayList<MainScreenOverviewItem> myDataset) {
        mDataset = myDataset;
        mContext = context;
        inflater = LayoutInflater.from(mContext);
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CommentAdapter.ViewHolder onCreateViewHolder(final ViewGroup viewGroup,
                                                   int viewType) {
        // create a new view
        View v = inflater.inflate(R.layout.item_comment_list__comment, viewGroup, false);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: onClick在这里
            }
        });

        return new ViewHolder(v);
    }

    // 点击头像要跳转到用户详情页
    private final View.OnClickListener onAvatarClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(mContext, PeopleDetailActivity.class);
//            TODO 把用户信息传过去?
//            intent.putExtra("BAR_CODE_RESULT", result);
            mContext.startActivity(intent);
        }
    };

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        // TODO wenop 把对应数据取出来, 然后设置view
//        Object data = mDataset.get(position);
//        holder.mAvatar.setImageResource(  );
//        holder.mNickName.setText(data.mNickName);
        holder.mAvatar.setOnClickListener(onAvatarClickListener);

        // TODO 长按头像可以at人
        holder.mAvatar.setOnLongClickListener(null);

    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}