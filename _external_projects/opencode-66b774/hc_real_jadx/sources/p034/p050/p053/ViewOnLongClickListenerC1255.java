package p034.p050.p053;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import p034.p035.p045.C1096;
import p034.p035.p045.C1115;
import p034.p050.C1285;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぷぞてのほき, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnLongClickListenerC1255 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static ViewOnLongClickListenerC1255 f6143;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static ViewOnLongClickListenerC1255 f6144;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f6145;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final View f6146;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f6147;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f6148;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final CharSequence f6149;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Runnable f6150 = new RunnableC1257();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Runnable f6151 = new RunnableC1256();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f6152;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1220 f6153;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぷぞてのほき$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1256 implements Runnable {
        public RunnableC1256() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC1255.this.m2904();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぷぞてのほき$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1257 implements Runnable {
        public RunnableC1257() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC1255.this.m2906(false);
        }
    }

    public ViewOnLongClickListenerC1255(View view, CharSequence charSequence) {
        this.f6146 = view;
        this.f6149 = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C1115.f5613;
        this.f6152 = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        m2905();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m2903(ViewOnLongClickListenerC1255 viewOnLongClickListenerC1255) {
        ViewOnLongClickListenerC1255 viewOnLongClickListenerC12552 = f6144;
        if (viewOnLongClickListenerC12552 != null) {
            viewOnLongClickListenerC12552.f6146.removeCallbacks(viewOnLongClickListenerC12552.f6150);
        }
        f6144 = viewOnLongClickListenerC1255;
        if (viewOnLongClickListenerC1255 != null) {
            viewOnLongClickListenerC1255.f6146.postDelayed(viewOnLongClickListenerC1255.f6150, ViewConfiguration.getLongPressTimeout());
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f6153 != null && this.f6148) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f6146.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m2905();
                m2904();
            }
        } else if (this.f6146.isEnabled() && this.f6153 == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f6147) > this.f6152 || Math.abs(y - this.f6145) > this.f6152) {
                this.f6147 = x;
                this.f6145 = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m2903(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f6147 = view.getWidth() / 2;
        this.f6145 = view.getHeight() / 2;
        m2906(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2904();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2904() {
        if (f6143 == this) {
            f6143 = null;
            C1220 c1220 = this.f6153;
            if (c1220 != null) {
                c1220.m2827();
                this.f6153 = null;
                m2905();
                this.f6146.removeOnAttachStateChangeListener(this);
            }
        }
        if (f6144 == this) {
            m2903(null);
        }
        this.f6146.removeCallbacks(this.f6151);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2905() {
        this.f6147 = Integer.MAX_VALUE;
        this.f6145 = Integer.MAX_VALUE;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2906(boolean z) {
        int height;
        int i;
        long longPressTimeout;
        if (C1096.m2507(this.f6146)) {
            m2903(null);
            ViewOnLongClickListenerC1255 viewOnLongClickListenerC1255 = f6143;
            if (viewOnLongClickListenerC1255 != null) {
                viewOnLongClickListenerC1255.m2904();
            }
            f6143 = this;
            this.f6148 = z;
            C1220 c1220 = new C1220(this.f6146.getContext());
            this.f6153 = c1220;
            View view = this.f6146;
            int i2 = this.f6147;
            int i3 = this.f6145;
            boolean z2 = this.f6148;
            CharSequence charSequence = this.f6149;
            if (c1220.f6020.getParent() != null) {
                c1220.m2827();
            }
            c1220.f6022.setText(charSequence);
            WindowManager.LayoutParams layoutParams = c1220.f6026;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = c1220.f6023.getResources().getDimensionPixelOffset(C1285.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = c1220.f6023.getResources().getDimensionPixelOffset(C1285.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = c1220.f6023.getResources().getDimensionPixelOffset(z2 ? C1285.tooltip_y_offset_touch : C1285.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(c1220.f6024);
                Rect rect = c1220.f6024;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = c1220.f6023.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    c1220.f6024.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(c1220.f6021);
                view.getLocationOnScreen(c1220.f6025);
                int[] iArr = c1220.f6025;
                int i4 = iArr[0];
                int[] iArr2 = c1220.f6021;
                iArr[0] = i4 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                c1220.f6020.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = c1220.f6020.getMeasuredHeight();
                int[] iArr3 = c1220.f6025;
                int i5 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i6 = iArr3[1] + height + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i6 <= c1220.f6024.height() : i5 < 0) {
                    layoutParams.y = i5;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) c1220.f6023.getSystemService("window")).addView(c1220.f6020, c1220.f6026);
            this.f6146.addOnAttachStateChangeListener(this);
            if (this.f6148) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((C1096.m2499(this.f6146) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f6146.removeCallbacks(this.f6151);
            this.f6146.postDelayed(this.f6151, longPressTimeout);
        }
    }
}
