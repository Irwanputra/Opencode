package p034.p050.p051.p052;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1199 implements InterfaceC1173, InterfaceC1186, AdapterView.OnItemClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Rect f5941;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static int m2673(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C1185 c1185 = (C1185) listAdapter;
        int count = c1185.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c1185.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c1185.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
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

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static boolean m2674(C1164 c1164) {
        int size = c1164.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c1164.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    public int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1185) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1185) listAdapter).f5866.m2631((MenuItem) listAdapter.getItem(i), this, mo2660() ? 0 : 4);
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: いいにぽつ */
    public boolean mo242(C1164 c1164, C1197 c1197) {
        return false;
    }

    /* renamed from: ぇぬぎばつ */
    public abstract void mo2638(View view);

    /* renamed from: ぉざぅち〻 */
    public abstract void mo2639(boolean z);

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: くし〴〺ぅ */
    public void mo122(Context context, C1164 c1164) {
    }

    /* renamed from: ごづごきえ */
    public abstract void mo2640(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: ざっざへづ */
    public abstract void mo2641(boolean z);

    /* renamed from: ざとぅぼこ〺 */
    public abstract void mo2642(int i);

    /* renamed from: でどあくず */
    public abstract void mo2643(int i);

    /* renamed from: のぷのちつ */
    public abstract void mo2644(C1164 c1164);

    /* renamed from: は〲ぱなで */
    public abstract void mo2645(int i);

    /* renamed from: へぬ〴づぞ */
    public boolean mo2660() {
        return true;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺふねづ〺 */
    public boolean mo243(C1164 c1164, C1197 c1197) {
        return false;
    }
}
