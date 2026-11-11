package p034.p050.p053;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import p034.p035.p045.C1096;
import p034.p035.p045.C1104;
import p034.p035.p045.InterfaceC1108;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.p051.p052.C1164;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1222 extends ViewGroup {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f6027;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1223 f6028;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1104 f6029;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Context f6030;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ActionMenuPresenter f6031;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f6032;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ActionMenuView f6033;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f6034;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1223 implements InterfaceC1108 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6035;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f6037 = false;

        public C1223() {
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: 〺つふすそ */
        public void mo2539(View view) {
            if (this.f6037) {
                return;
            }
            AbstractC1222 abstractC1222 = AbstractC1222.this;
            abstractC1222.f6029 = null;
            AbstractC1222.super.setVisibility(this.f6035);
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: くし〴〺ぅ */
        public void mo2540(View view) {
            AbstractC1222.super.setVisibility(0);
            this.f6037 = false;
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: げつ〴ぬぐ */
        public void mo2541(View view) {
            this.f6037 = true;
        }
    }

    public AbstractC1222(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC1222(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6028 = new C1223();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1264.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f6030 = context;
        } else {
            this.f6030 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int getAnimatedVisibility() {
        return this.f6029 != null ? this.f6028.f6035 : getVisibility();
    }

    public int getContentHeight() {
        return this.f6032;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C1148.ActionBar, C1264.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C1148.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f6031;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f5759.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            actionMenuPresenter.f277 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            C1164 c1164 = actionMenuPresenter.f5762;
            if (c1164 != null) {
                c1164.mo2617(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f6034 = false;
        }
        if (!this.f6034) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f6034 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f6034 = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6027 = false;
        }
        if (!this.f6027) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f6027 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f6027 = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1104 c1104 = this.f6029;
            if (c1104 != null) {
                c1104.m2532();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int m2831(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1104 m2832(int i, long j) {
        C1104 c1104 = this.f6029;
        if (c1104 != null) {
            c1104.m2532();
        }
        if (i != 0) {
            C1104 m2495 = C1096.m2495(this);
            m2495.m2535(0.0f);
            m2495.m2534(j);
            C1223 c1223 = this.f6028;
            AbstractC1222.this.f6029 = m2495;
            c1223.f6035 = i;
            m2495.m2538(c1223);
            return m2495;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1104 m24952 = C1096.m2495(this);
        m24952.m2535(1.0f);
        m24952.m2534(j);
        C1223 c12232 = this.f6028;
        AbstractC1222.this.f6029 = m24952;
        c12232.f6035 = i;
        m24952.m2538(c12232);
        return m24952;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m2833(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
