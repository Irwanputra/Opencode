package dev.epro.r0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K3366169276883091168 extends S9684361936304835821 {
    public final byte m;
    public final byte n;

    /* renamed from: o, reason: collision with root package name */
    public H14091617879526365106 f331o;
    public I4217019646703278835 p;

    public K3366169276883091168(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = (byte) 21;
            this.n = (byte) 22;
        } else {
            this.m = (byte) 22;
            this.n = (byte) 21;
        }
    }

    @Override // dev.epro.r0.S9684361936304835821, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        U12409389856179902213 u12409389856179902213;
        int i;
        int pointToPosition;
        int i2;
        if (this.f331o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                u12409389856179902213 = (U12409389856179902213) headerViewListAdapter.getWrappedAdapter();
            } else {
                u12409389856179902213 = (U12409389856179902213) adapter;
                i = 0;
            }
            I4217019646703278835 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= u12409389856179902213.getCount()) ? null : u12409389856179902213.getItem(i2);
            I4217019646703278835 i4217019646703278835 = this.p;
            if (i4217019646703278835 != item) {
                T8605657386197958581 t8605657386197958581 = u12409389856179902213.a;
                if (i4217019646703278835 != null) {
                    this.f331o.d(t8605657386197958581, i4217019646703278835);
                }
                this.p = item;
                if (item != null) {
                    this.f331o.r(t8605657386197958581, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (U12409389856179902213) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (U12409389856179902213) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(H14091617879526365106 h14091617879526365106) {
        this.f331o = h14091617879526365106;
    }

    @Override // dev.epro.r0.S9684361936304835821, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
