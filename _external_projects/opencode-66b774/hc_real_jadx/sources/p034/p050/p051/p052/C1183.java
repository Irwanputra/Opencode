package p034.p050.p051.p052;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p034.p035.p045.C1096;
import p034.p050.C1285;
import p034.p050.p051.p052.InterfaceC1186;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1183 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f5853;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1164 f5854;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public AbstractC1199 f5856;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean f5857;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f5858;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f5859;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public View f5861;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f5862;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public InterfaceC1186.InterfaceC1187 f5863;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f5864;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f5855 = 8388611;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final PopupWindow.OnDismissListener f5860 = new C1184();

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.てぜきぽく$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1184 implements PopupWindow.OnDismissListener {
        public C1184() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C1183.this.mo130();
        }
    }

    public C1183(Context context, C1164 c1164, View view, boolean z, int i, int i2) {
        this.f5858 = context;
        this.f5854 = c1164;
        this.f5861 = view;
        this.f5857 = z;
        this.f5862 = i;
        this.f5859 = i2;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m2652() {
        AbstractC1199 abstractC1199 = this.f5856;
        return abstractC1199 != null && abstractC1199.mo176();
    }

    /* renamed from: くし〴〺ぅ */
    public void mo130() {
        this.f5856 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f5864;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC1199 m2653() {
        if (this.f5856 == null) {
            Display defaultDisplay = ((WindowManager) this.f5858.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            AbstractC1199 viewOnKeyListenerC1189 = Math.min(point.x, point.y) >= this.f5858.getResources().getDimensionPixelSize(C1285.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC1189(this.f5858, this.f5861, this.f5862, this.f5859, this.f5857) : new ViewOnKeyListenerC1174(this.f5858, this.f5854, this.f5861, this.f5862, this.f5859, this.f5857);
            viewOnKeyListenerC1189.mo2644(this.f5854);
            viewOnKeyListenerC1189.mo2640(this.f5860);
            viewOnKeyListenerC1189.mo2638(this.f5861);
            viewOnKeyListenerC1189.mo2608(this.f5863);
            viewOnKeyListenerC1189.mo2639(this.f5853);
            viewOnKeyListenerC1189.mo2642(this.f5855);
            this.f5856 = viewOnKeyListenerC1189;
        }
        return this.f5856;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m2654(int i, int i2, boolean z, boolean z2) {
        AbstractC1199 m2653 = m2653();
        m2653.mo2641(z2);
        if (z) {
            if ((C2786.m4775(this.f5855, C1096.m2491(this.f5861)) & 7) == 5) {
                i -= this.f5861.getWidth();
            }
            m2653.mo2645(i);
            m2653.mo2643(i2);
            int i3 = (int) ((this.f5858.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m2653.f5941 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        m2653.show();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean m2655() {
        if (m2652()) {
            return true;
        }
        if (this.f5861 == null) {
            return false;
        }
        m2654(0, 0, false, false);
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2656(InterfaceC1186.InterfaceC1187 interfaceC1187) {
        this.f5863 = interfaceC1187;
        AbstractC1199 abstractC1199 = this.f5856;
        if (abstractC1199 != null) {
            abstractC1199.mo2608(interfaceC1187);
        }
    }
}
