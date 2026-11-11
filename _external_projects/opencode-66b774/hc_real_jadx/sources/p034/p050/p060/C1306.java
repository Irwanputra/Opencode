package p034.p050.p060;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1306 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final int[] f6311 = {R.attr.homeAsUpIndicator};

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1307 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Method f6312;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ImageView f6313;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Method f6314;

        public C1307(Activity activity) {
            try {
                this.f6314 = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f6312 = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(R.id.home);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f6313 = (ImageView) childAt;
                }
            }
        }
    }
}
