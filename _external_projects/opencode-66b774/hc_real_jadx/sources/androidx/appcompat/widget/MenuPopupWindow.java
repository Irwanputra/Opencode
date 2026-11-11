package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1185;
import p034.p050.p051.p052.C1197;
import p034.p050.p053.C1212;
import p034.p050.p053.InterfaceC1225;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MenuPopupWindow extends ListPopupWindow implements InterfaceC1225 {

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static Method f459;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public InterfaceC1225 f460;

    public static class MenuDropDownListView extends C1212 {

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public final int f461;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public InterfaceC1225 f462;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public final int f463;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public MenuItem f464;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f463 = 22;
                this.f461 = 21;
            } else {
                this.f463 = 21;
                this.f461 = 22;
            }
        }

        @Override // p034.p050.p053.C1212, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f462 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C1185 c1185 = (C1185) adapter;
                C1197 c1197 = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c1185.getCount()) {
                    c1197 = c1185.getItem(i2);
                }
                MenuItem menuItem = this.f464;
                if (menuItem != c1197) {
                    C1164 c1164 = c1185.f5866;
                    if (menuItem != null) {
                        this.f462.mo187(c1164, menuItem);
                    }
                    this.f464 = c1197;
                    if (c1197 != null) {
                        this.f462.mo186(c1164, c1197);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f463) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f461) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ((C1185) getAdapter()).f5866.m2619(false);
            return true;
        }

        public void setHoverListener(InterfaceC1225 interfaceC1225) {
            this.f462 = interfaceC1225;
        }

        @Override // p034.p050.p053.C1212, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f459 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    /* renamed from: ぇぬぎばつ */
    public C1212 mo177(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    @Override // p034.p050.p053.InterfaceC1225
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo186(C1164 c1164, MenuItem menuItem) {
        InterfaceC1225 interfaceC1225 = this.f460;
        if (interfaceC1225 != null) {
            interfaceC1225.mo186(c1164, menuItem);
        }
    }

    @Override // p034.p050.p053.InterfaceC1225
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo187(C1164 c1164, MenuItem menuItem) {
        InterfaceC1225 interfaceC1225 = this.f460;
        if (interfaceC1225 != null) {
            interfaceC1225.mo187(c1164, menuItem);
        }
    }
}
