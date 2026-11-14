package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements dev.epro.r0.O691910143173251949, dev.epro.r0.G184438488898427898, android.widget.AdapterView.OnItemClickListener {
    public static final int[] b = {android.R.attr.background, android.R.attr.divider};
    public dev.epro.r0.T8605657386197958581 a;

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        dev.epro.r0.I1632105416032993715 i1632105416032993715T = dev.epro.r0.I1632105416032993715.t(context, attributeSet, b, android.R.attr.listViewStyle);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) i1632105416032993715T.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i1632105416032993715T.g(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i1632105416032993715T.g(1));
        }
        i1632105416032993715T.v();
    }

    public final void a(dev.epro.r0.T8605657386197958581 t8605657386197958581) {
        this.a = t8605657386197958581;
    }

    public final boolean b(dev.epro.r0.I4217019646703278835 i4217019646703278835) {
        return this.a.q(i4217019646703278835, (dev.epro.r0.U13539487668147601899) null, 0);
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
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        b((dev.epro.r0.I4217019646703278835) getAdapter().getItem(i));
    }
}
