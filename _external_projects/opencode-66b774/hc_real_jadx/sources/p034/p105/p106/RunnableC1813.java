package p034.p105.p106;

import android.view.View;
import java.util.ArrayList;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぶでにく〼〳, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1813 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ int f8129;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8130;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8131;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8132;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8133;

    public RunnableC1813(AbstractC1787 abstractC1787, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f8129 = i;
        this.f8130 = arrayList;
        this.f8133 = arrayList2;
        this.f8131 = arrayList3;
        this.f8132 = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f8129; i++) {
            C1096.m2498((View) this.f8130.get(i), (String) this.f8133.get(i));
            C1096.m2498((View) this.f8131.get(i), (String) this.f8132.get(i));
        }
    }
}
