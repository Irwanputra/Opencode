package p034.p105.p106;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC1798 implements Runnable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8091;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Object f8092;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8093;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1787 f8094;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8095;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8096;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ View f8097;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final /* synthetic */ Object f8098;

    public RunnableC1798(Object obj, AbstractC1787 abstractC1787, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f8092 = obj;
        this.f8094 = abstractC1787;
        this.f8097 = view;
        this.f8095 = fragment;
        this.f8096 = arrayList;
        this.f8093 = arrayList2;
        this.f8091 = arrayList3;
        this.f8098 = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f8092;
        if (obj != null) {
            this.f8094.mo3779(obj, this.f8097);
            this.f8093.addAll(C1796.m3850(this.f8094, this.f8092, this.f8095, this.f8096, this.f8097));
        }
        if (this.f8091 != null) {
            if (this.f8098 != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f8097);
                this.f8094.mo3781(this.f8098, this.f8091, arrayList);
            }
            this.f8091.clear();
            this.f8091.add(this.f8097);
        }
    }
}
