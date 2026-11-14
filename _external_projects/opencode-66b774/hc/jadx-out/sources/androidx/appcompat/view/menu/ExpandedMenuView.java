package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import dev.epro.r0.G184438488898427898;
import dev.epro.r0.I1632105416032993715;
import dev.epro.r0.I4217019646703278835;
import dev.epro.r0.O691910143173251949;
import dev.epro.r0.T8605657386197958581;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements O691910143173251949, G184438488898427898, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public T8605657386197958581 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        I1632105416032993715 i1632105416032993715T = I1632105416032993715.t(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) i1632105416032993715T.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i1632105416032993715T.g(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i1632105416032993715T.g(1));
        }
        i1632105416032993715T.v();
    }

    @Override // dev.epro.r0.G184438488898427898
    public final void a(T8605657386197958581 t8605657386197958581) {
        this.a = t8605657386197958581;
    }

    @Override // dev.epro.r0.O691910143173251949
    public final boolean b(I4217019646703278835 i4217019646703278835) {
        return this.a.q(i4217019646703278835, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b((I4217019646703278835) getAdapter().getItem(i));
    }
}
