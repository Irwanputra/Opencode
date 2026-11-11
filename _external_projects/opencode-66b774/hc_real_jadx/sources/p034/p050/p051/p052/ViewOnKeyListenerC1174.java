package p034.p050.p051.p052;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import p034.p050.C1147;
import p034.p050.C1285;
import p034.p050.p051.p052.InterfaceC1186;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ViewOnKeyListenerC1174 extends AbstractC1199 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC1186, View.OnKeyListener {

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final int f5799 = C1147.abc_popup_menu_item_layout;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int f5800;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f5801;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final MenuPopupWindow f5802;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public InterfaceC1186.InterfaceC1187 f5803;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public ViewTreeObserver f5804;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public View f5805;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Context f5806;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f5807;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f5809;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C1185 f5810;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f5812;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean f5813;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f5814;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f5815;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C1164 f5816;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public View f5817;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final int f5818;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f5819 = new ViewTreeObserverOnGlobalLayoutListenerC1176();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final View.OnAttachStateChangeListener f5811 = new ViewOnAttachStateChangeListenerC1175();

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f5808 = 0;

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぉざぅち〻$〺つふすそ, reason: contains not printable characters */
    public class ViewOnAttachStateChangeListenerC1175 implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC1175() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC1174.this.f5804;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC1174.this.f5804 = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC1174 viewOnKeyListenerC1174 = ViewOnKeyListenerC1174.this;
                viewOnKeyListenerC1174.f5804.removeGlobalOnLayoutListener(viewOnKeyListenerC1174.f5819);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぉざぅち〻$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC1176 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC1176() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerC1174.this.mo176()) {
                ViewOnKeyListenerC1174 viewOnKeyListenerC1174 = ViewOnKeyListenerC1174.this;
                if (viewOnKeyListenerC1174.f5802.f433) {
                    return;
                }
                View view = viewOnKeyListenerC1174.f5805;
                if (view == null || !view.isShown()) {
                    ViewOnKeyListenerC1174.this.dismiss();
                } else {
                    ViewOnKeyListenerC1174.this.f5802.show();
                }
            }
        }
    }

    public ViewOnKeyListenerC1174(Context context, C1164 c1164, View view, int i, int i2, boolean z) {
        this.f5806 = context;
        this.f5816 = c1164;
        this.f5813 = z;
        this.f5810 = new C1185(c1164, LayoutInflater.from(context), z, f5799);
        this.f5800 = i;
        this.f5818 = i2;
        Resources resources = context.getResources();
        this.f5801 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1285.abc_config_prefDialogWidth));
        this.f5817 = view;
        this.f5802 = new MenuPopupWindow(context, null, i, i2);
        c1164.m2610(this, context);
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    public void dismiss() {
        if (mo176()) {
            this.f5802.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f5809 = true;
        this.f5816.m2619(true);
        ViewTreeObserver viewTreeObserver = this.f5804;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f5804 = this.f5805.getViewTreeObserver();
            }
            this.f5804.removeGlobalOnLayoutListener(this.f5819);
            this.f5804 = null;
        }
        this.f5805.removeOnAttachStateChangeListener(this.f5811);
        PopupWindow.OnDismissListener onDismissListener = this.f5814;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c9  */
    @Override // p034.p050.p051.p052.InterfaceC1173
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show() {
        /*
            r7 = this;
            boolean r0 = r7.mo176()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lb
        L8:
            r1 = 1
            goto Lc6
        Lb:
            boolean r0 = r7.f5809
            if (r0 != 0) goto Lc6
            android.view.View r0 = r7.f5817
            if (r0 != 0) goto L15
            goto Lc6
        L15:
            r7.f5805 = r0
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            android.widget.PopupWindow r0 = r0.f448
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            r0.f441 = r7
            r0.m180(r2)
            android.view.View r0 = r7.f5805
            android.view.ViewTreeObserver r3 = r7.f5804
            if (r3 != 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f5804 = r4
            if (r3 == 0) goto L3b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f5819
            r4.addOnGlobalLayoutListener(r3)
        L3b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f5811
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.MenuPopupWindow r3 = r7.f5802
            r3.f436 = r0
            int r0 = r7.f5808
            r3.f446 = r0
            boolean r0 = r7.f5815
            r3 = 0
            if (r0 != 0) goto L5b
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.なぎぱいぢぎ r0 = r7.f5810
            android.content.Context r4 = r7.f5806
            int r5 = r7.f5801
            int r0 = p034.p050.p051.p052.AbstractC1199.m2673(r0, r3, r4, r5)
            r7.f5807 = r0
            r7.f5815 = r2
        L5b:
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            int r4 = r7.f5807
            r0.m178(r4)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            r4 = 2
            android.widget.PopupWindow r0 = r0.f448
            r0.setInputMethodMode(r4)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            android.graphics.Rect r4 = r7.f5941
            r0.getClass()
            if (r4 == 0) goto L79
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L7a
        L79:
            r5 = r3
        L7a:
            r0.f435 = r5
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            r0.show()
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            づざかべべ.〺つふすそ.ぉざぅち〻.ぉざぅち〻 r0 = r0.f449
            r0.setOnKeyListener(r7)
            boolean r4 = r7.f5812
            if (r4 == 0) goto Lb8
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ r4 = r7.f5816
            java.lang.CharSequence r4 = r4.f5782
            if (r4 == 0) goto Lb8
            android.content.Context r4 = r7.f5806
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = p034.p050.C1147.abc_popup_menu_header_item_layout
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb2
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ r6 = r7.f5816
            java.lang.CharSequence r6 = r6.f5782
            r5.setText(r6)
        Lb2:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        Lb8:
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.なぎぱいぢぎ r1 = r7.f5810
            r0.mo155(r1)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f5802
            r0.show()
            goto L8
        Lc6:
            if (r1 == 0) goto Lc9
            return
        Lc9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            goto Ld2
        Ld1:
            throw r0
        Ld2:
            goto Ld1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p051.p052.ViewOnKeyListenerC1174.show():void");
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: 〳ぜぞぜべっ */
    public boolean mo117() {
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    /* renamed from: 〺つふすそ */
    public boolean mo176() {
        return !this.f5809 && this.f5802.mo176();
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぁごぐすすぃ */
    public void mo119(boolean z) {
        this.f5815 = false;
        C1185 c1185 = this.f5810;
        if (c1185 != null) {
            c1185.notifyDataSetChanged();
        }
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void mo2638(View view) {
        this.f5817 = view;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void mo2639(boolean z) {
        this.f5810.f5871 = z;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: げつ〴ぬぐ */
    public void mo123(C1164 c1164, boolean z) {
        if (c1164 != this.f5816) {
            return;
        }
        dismiss();
        InterfaceC1186.InterfaceC1187 interfaceC1187 = this.f5803;
        if (interfaceC1187 != null) {
            interfaceC1187.mo132(c1164, z);
        }
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void mo2640(PopupWindow.OnDismissListener onDismissListener) {
        this.f5814 = onDismissListener;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void mo2641(boolean z) {
        this.f5812 = z;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void mo2642(int i) {
        this.f5808 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: づざかべべ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo124(p034.p050.p051.p052.SubMenuC1180 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L76
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.てぜきぽく r0 = new づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.てぜきぽく
            android.content.Context r3 = r9.f5806
            android.view.View r5 = r9.f5805
            boolean r6 = r9.f5813
            int r7 = r9.f5800
            int r8 = r9.f5818
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.のぷのちつ$げつ〴ぬぐ r2 = r9.f5803
            r0.m2656(r2)
            boolean r2 = p034.p050.p051.p052.AbstractC1199.m2674(r10)
            r0.f5853 = r2
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぺふねづ〺 r3 = r0.f5856
            if (r3 == 0) goto L2a
            r3.mo2639(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f5814
            r0.f5864 = r2
            r2 = 0
            r9.f5814 = r2
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ r2 = r9.f5816
            r2.m2619(r1)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.f5802
            int r3 = r2.f431
            boolean r4 = r2.f432
            if (r4 != 0) goto L40
            r2 = 0
            goto L42
        L40:
            int r2 = r2.f428
        L42:
            int r4 = r9.f5808
            android.view.View r5 = r9.f5817
            int r5 = p034.p035.p045.C1096.m2491(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5a
            android.view.View r4 = r9.f5817
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5a:
            boolean r4 = r0.m2652()
            r5 = 1
            if (r4 == 0) goto L62
            goto L6b
        L62:
            android.view.View r4 = r0.f5861
            if (r4 != 0) goto L68
            r0 = 0
            goto L6c
        L68:
            r0.m2654(r3, r2, r5, r5)
        L6b:
            r0 = 1
        L6c:
            if (r0 == 0) goto L76
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.のぷのちつ$げつ〴ぬぐ r0 = r9.f5803
            if (r0 == 0) goto L75
            r0.mo131(r10)
        L75:
            return r5
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p051.p052.ViewOnKeyListenerC1174.mo124(づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ざとぅぼこ〺):boolean");
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: てぜきぽく */
    public void mo2608(InterfaceC1186.InterfaceC1187 interfaceC1187) {
        this.f5803 = interfaceC1187;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: でどあくず, reason: contains not printable characters */
    public void mo2643(int i) {
        MenuPopupWindow menuPopupWindow = this.f5802;
        menuPopupWindow.f428 = i;
        menuPopupWindow.f432 = true;
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    /* renamed from: なぎぱいぢぎ */
    public ListView mo182() {
        return this.f5802.f449;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void mo2644(C1164 c1164) {
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void mo2645(int i) {
        this.f5802.f431 = i;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: びぐびあび */
    public void mo127(Parcelable parcelable) {
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺぁあねじ */
    public Parcelable mo129() {
        return null;
    }
}
