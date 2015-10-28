package tk.wenop.testapp.UI;

import android.content.Context;
import android.view.View;

import com.flyco.dialog.widget.base.BottomBaseDialog;

import tk.wenop.testapp.R;

public class NewContentBottomDialog extends BottomBaseDialog<NewContentBottomDialog> {

    public NewContentBottomDialog(Context context, View animateView) {
        super(context, animateView);
    }

    public NewContentBottomDialog(Context context) {
        super(context);
    }

    @Override
    public View onCreateView() {
//        showAnim(new FlipVerticalSwingEnter());
//        dismissAnim(null);
        View inflate = View.inflate(context, R.layout.dialog_new_content, null);

        return inflate;
    }

    @Override
    public void setUiBeforShow() {

       /* ll_wechat_friend_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T.showShort(context, "朋友圈");
                dismiss();
            }
        });*/
    }
}
