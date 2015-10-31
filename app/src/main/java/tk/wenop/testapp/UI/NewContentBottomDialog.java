package tk.wenop.testapp.UI;

import android.content.Context;
import android.view.View;

import com.flyco.dialog.widget.base.BottomBaseDialog;

import tk.wenop.rippleanimation.RippleBackground;
import tk.wenop.testapp.R;
import tk.wenop.testapp.Util.animatedDialogUtils.ViewFindUtils;


/*
* 主屏发消息
* */
public class NewContentBottomDialog extends BottomBaseDialog<NewContentBottomDialog> {

    RippleBackground audio_wave;
    View audio_press_region;

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
        audio_wave = ViewFindUtils.find(inflate, R.id.audio_wave);
        audio_press_region = ViewFindUtils.find(inflate, R.id.audio_press_region);

        return inflate;
    }

    @Override
    public void setUiBeforShow() {

        audio_wave.setRippleDurationTime(3500);
        audio_wave.setRippleAmount(1);
        audio_wave.setRippleRepeatCount(0);
        audio_wave.reloadAnimator();
        audio_wave.startRippleAnimation();

        /// below just a test. wenop
        /*
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                audio_wave.setRippleDurationTime(2500);
                audio_wave.setRippleAmount(1);
                audio_wave.setRippleRepeatCount(1);
                audio_wave.setRippleColor(R.color.rippelColor);
                audio_wave.reloadAnimator();
                audio_wave.startRippleAnimation();
//                T.showShort(context, "xx");
            }
        };
        handler.postDelayed(runnable, 1000);

        */

        audio_press_region.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // TODO
       /* ll_wechat_friend_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T.showShort(context, "朋友圈");
                dismiss();
            }
        });*/
    }
}
