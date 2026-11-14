package dev.epro.r0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I17862628329628029572 extends ViewGroup {
    public final byte a;
    public final ArrayList b;
    public final ArrayList c;
    public final V10300877997588547986 d;
    public int e;

    public I17862628329628029572(Context context) {
        super(context);
        this.a = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new V10300877997588547986((byte) 17);
        setClipChildren(false);
        T10804465336881022126 t10804465336881022126 = new T10804465336881022126(context);
        addView(t10804465336881022126);
        arrayList.add(t10804465336881022126);
        arrayList2.add(t10804465336881022126);
        this.e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
