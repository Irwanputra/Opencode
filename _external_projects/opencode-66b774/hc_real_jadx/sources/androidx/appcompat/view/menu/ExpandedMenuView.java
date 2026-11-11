package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1195;
import p034.p050.p055.p056.C1266;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class ExpandedMenuView extends ListView implements C1164.InterfaceC1165, InterfaceC1195, AdapterView.OnItemClickListener {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final int[] f193 = {R.attr.background, R.attr.divider};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1164 f194;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f193, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C1266.m2928(context, resourceId2));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider((!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) ? obtainStyledAttributes.getDrawable(1) : C1266.m2928(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo92((C1197) getAdapter().getItem(i));
    }

    @Override // p034.p050.p051.p052.InterfaceC1195
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo91(C1164 c1164) {
        this.f194 = c1164;
    }

    @Override // p034.p050.p051.p052.C1164.InterfaceC1165
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo92(C1197 c1197) {
        return this.f194.m2631(c1197, null, 0);
    }
}
