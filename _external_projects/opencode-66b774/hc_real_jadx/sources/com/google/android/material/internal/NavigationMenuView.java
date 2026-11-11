package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.InterfaceC1195;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC1195 {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p034.p050.p051.p052.InterfaceC1195
    /* renamed from: 〺つふすそ */
    public void mo91(C1164 c1164) {
    }
}
