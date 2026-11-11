package p034.p105.p106;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p034.p080.C1502;
import p034.p105.p106.C1796;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC1795 implements Runnable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8070;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1787 f8071;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ View f8072;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8073;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1502 f8074;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ C1796.C1797 f8075;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final /* synthetic */ Object f8076;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8077;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final /* synthetic */ Rect f8078;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ Object f8079;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8080;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8081;

    public RunnableC1795(AbstractC1787 abstractC1787, C1502 c1502, Object obj, C1796.C1797 c1797, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f8071 = abstractC1787;
        this.f8074 = c1502;
        this.f8079 = obj;
        this.f8075 = c1797;
        this.f8077 = arrayList;
        this.f8072 = view;
        this.f8070 = fragment;
        this.f8080 = fragment2;
        this.f8073 = z;
        this.f8081 = arrayList2;
        this.f8076 = obj2;
        this.f8078 = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1502<String, View> m3857 = C1796.m3857(this.f8071, this.f8074, this.f8079, this.f8075);
        if (m3857 != null) {
            this.f8077.addAll(m3857.values());
            this.f8077.add(this.f8072);
        }
        C1796.m3855(this.f8070, this.f8080, this.f8073, m3857, false);
        Object obj = this.f8079;
        if (obj != null) {
            this.f8071.mo3774(obj, this.f8081, this.f8077);
            View m3864 = C1796.m3864(m3857, this.f8075, this.f8076, this.f8073);
            if (m3864 != null) {
                this.f8071.m3831(m3864, this.f8078);
            }
        }
    }
}
