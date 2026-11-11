package p034.p103.p104;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: づざかべべ.ぺぁあねじ.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1776 extends AbstractC1777 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f7995;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public LayoutInflater f7996;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f7997;

    @Deprecated
    public AbstractC1776(Context context, int i, Cursor cursor, boolean z) {
        super(context, null, z);
        this.f7997 = i;
        this.f7995 = i;
        this.f7996 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p034.p103.p104.AbstractC1777
    /* renamed from: びぐびあび */
    public View mo2691(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f7996.inflate(this.f7995, viewGroup, false);
    }
}
