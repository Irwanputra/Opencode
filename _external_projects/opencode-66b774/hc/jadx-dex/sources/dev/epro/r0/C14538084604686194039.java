package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C14538084604686194039 implements dev.epro.r0.Y1226494281320458288, dev.epro.r0.U13539487668147601899, android.widget.AdapterView.OnItemClickListener {
    public android.graphics.Rect a;

    public static int m(android.widget.ListAdapter listAdapter, android.content.Context context, int i) {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        android.widget.FrameLayout frameLayout = null;
        android.view.View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public final boolean j(dev.epro.r0.I4217019646703278835 i4217019646703278835) {
        return false;
    }

    public final boolean k(dev.epro.r0.I4217019646703278835 i4217019646703278835) {
        return false;
    }

    public abstract void n(android.view.View view);

    public abstract void o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        dev.epro.r0.U12409389856179902213 u12409389856179902213 = (android.widget.ListAdapter) adapterView.getAdapter();
        (u12409389856179902213 instanceof android.widget.HeaderViewListAdapter ? (dev.epro.r0.U12409389856179902213) ((android.widget.HeaderViewListAdapter) u12409389856179902213).getWrappedAdapter() : u12409389856179902213).a.q((android.view.MenuItem) u12409389856179902213.getItem(i), this, !(this instanceof dev.epro.r0.T16502368487833955839) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);

    public void l(dev.epro.r0.T8605657386197958581 t8605657386197958581) {
    }

    public final void d(android.content.Context context, dev.epro.r0.T8605657386197958581 t8605657386197958581) {
    }
}
