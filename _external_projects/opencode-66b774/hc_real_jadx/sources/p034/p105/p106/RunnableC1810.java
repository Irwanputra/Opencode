package p034.p105.p106;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import p034.p080.C1502;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC1810 implements Runnable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final /* synthetic */ Rect f8121;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8122;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1787 f8123;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8124;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ C1502 f8125;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ View f8126;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ boolean f8127;

    public RunnableC1810(Fragment fragment, Fragment fragment2, boolean z, C1502 c1502, View view, AbstractC1787 abstractC1787, Rect rect) {
        this.f8122 = fragment;
        this.f8124 = fragment2;
        this.f8127 = z;
        this.f8125 = c1502;
        this.f8126 = view;
        this.f8123 = abstractC1787;
        this.f8121 = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1796.m3855(this.f8122, this.f8124, this.f8127, this.f8125, false);
        View view = this.f8126;
        if (view != null) {
            this.f8123.m3831(view, this.f8121);
        }
    }
}
