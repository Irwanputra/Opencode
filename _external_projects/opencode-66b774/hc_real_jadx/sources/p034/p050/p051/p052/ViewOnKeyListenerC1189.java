package p034.p050.p051.p052;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p034.p035.p045.C1096;
import p034.p050.C1147;
import p034.p050.C1285;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p053.InterfaceC1225;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ViewOnKeyListenerC1189 extends AbstractC1199 implements InterfaceC1186, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final int f5873 = C1147.abc_cascading_menu_item_layout;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Handler f5874;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f5875;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final boolean f5876;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public ViewTreeObserver f5878;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public View f5879;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public InterfaceC1186.InterfaceC1187 f5880;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public View f5881;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Context f5883;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f5884;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f5885;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f5886;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f5887;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f5889;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f5890;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f5891;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f5893;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f5894;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f5895;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final List<C1164> f5898 = new ArrayList();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final List<C1194> f5877 = new ArrayList();

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f5899 = new ViewTreeObserverOnGlobalLayoutListenerC1193();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final View.OnAttachStateChangeListener f5888 = new ViewOnAttachStateChangeListenerC1190();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final InterfaceC1225 f5892 = new C1191();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f5897 = 0;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f5882 = 0;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f5896 = false;

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.びぐびあび$〺つふすそ, reason: contains not printable characters */
    public class ViewOnAttachStateChangeListenerC1190 implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC1190() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC1189.this.f5878;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC1189.this.f5878 = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC1189 viewOnKeyListenerC1189 = ViewOnKeyListenerC1189.this;
                viewOnKeyListenerC1189.f5878.removeGlobalOnLayoutListener(viewOnKeyListenerC1189.f5899);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.びぐびあび$くし〴〺ぅ, reason: contains not printable characters */
    public class C1191 implements InterfaceC1225 {

        /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.びぐびあび$くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC1192 implements Runnable {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ C1194 f5902;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public final /* synthetic */ MenuItem f5903;

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public final /* synthetic */ C1164 f5905;

            public RunnableC1192(C1194 c1194, MenuItem menuItem, C1164 c1164) {
                this.f5902 = c1194;
                this.f5903 = menuItem;
                this.f5905 = c1164;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1194 c1194 = this.f5902;
                if (c1194 != null) {
                    ViewOnKeyListenerC1189.this.f5891 = true;
                    c1194.f5907.m2619(false);
                    ViewOnKeyListenerC1189.this.f5891 = false;
                }
                if (this.f5903.isEnabled() && this.f5903.hasSubMenu()) {
                    this.f5905.m2623(this.f5903, 4);
                }
            }
        }

        public C1191() {
        }

        @Override // p034.p050.p053.InterfaceC1225
        /* renamed from: くし〴〺ぅ */
        public void mo186(C1164 c1164, MenuItem menuItem) {
            ViewOnKeyListenerC1189.this.f5874.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC1189.this.f5877.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c1164 == ViewOnKeyListenerC1189.this.f5877.get(i).f5907) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC1189.this.f5874.postAtTime(new RunnableC1192(i2 < ViewOnKeyListenerC1189.this.f5877.size() ? ViewOnKeyListenerC1189.this.f5877.get(i2) : null, menuItem, c1164), c1164, SystemClock.uptimeMillis() + 200);
        }

        @Override // p034.p050.p053.InterfaceC1225
        /* renamed from: びぐびあび */
        public void mo187(C1164 c1164, MenuItem menuItem) {
            ViewOnKeyListenerC1189.this.f5874.removeCallbacksAndMessages(c1164);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC1193 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC1193() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC1189.this.mo176() || ViewOnKeyListenerC1189.this.f5877.size() <= 0 || ViewOnKeyListenerC1189.this.f5877.get(0).f5909.f433) {
                return;
            }
            View view = ViewOnKeyListenerC1189.this.f5881;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC1189.this.dismiss();
                return;
            }
            Iterator<C1194> it = ViewOnKeyListenerC1189.this.f5877.iterator();
            while (it.hasNext()) {
                it.next().f5909.show();
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.びぐびあび$びぐびあび, reason: contains not printable characters */
    public static class C1194 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C1164 f5907;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f5908;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final MenuPopupWindow f5909;

        public C1194(MenuPopupWindow menuPopupWindow, C1164 c1164, int i) {
            this.f5909 = menuPopupWindow;
            this.f5907 = c1164;
            this.f5908 = i;
        }
    }

    public ViewOnKeyListenerC1189(Context context, View view, int i, int i2, boolean z) {
        this.f5883 = context;
        this.f5879 = view;
        this.f5887 = i;
        this.f5890 = i2;
        this.f5876 = z;
        this.f5886 = C1096.m2491(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f5895 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1285.abc_config_prefDialogWidth));
        this.f5874 = new Handler();
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    public void dismiss() {
        int size = this.f5877.size();
        if (size > 0) {
            C1194[] c1194Arr = (C1194[]) this.f5877.toArray(new C1194[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1194 c1194 = c1194Arr[i];
                if (c1194.f5909.mo176()) {
                    c1194.f5909.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C1194 c1194;
        int size = this.f5877.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1194 = null;
                break;
            }
            c1194 = this.f5877.get(i);
            if (!c1194.f5909.mo176()) {
                break;
            } else {
                i++;
            }
        }
        if (c1194 != null) {
            c1194.f5907.m2619(false);
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

    @Override // p034.p050.p051.p052.InterfaceC1173
    public void show() {
        if (mo176()) {
            return;
        }
        Iterator<C1164> it = this.f5898.iterator();
        while (it.hasNext()) {
            m2659(it.next());
        }
        this.f5898.clear();
        View view = this.f5879;
        this.f5881 = view;
        if (view != null) {
            boolean z = this.f5878 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f5878 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f5899);
            }
            this.f5881.addOnAttachStateChangeListener(this.f5888);
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: 〳ぜぞぜべっ */
    public boolean mo117() {
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    /* renamed from: 〺つふすそ */
    public boolean mo176() {
        return this.f5877.size() > 0 && this.f5877.get(0).f5909.mo176();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ae  */
    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2659(p034.p050.p051.p052.C1164 r17) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p051.p052.ViewOnKeyListenerC1189.m2659(づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ):void");
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぁごぐすすぃ */
    public void mo119(boolean z) {
        Iterator<C1194> it = this.f5877.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f5909.f449.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1185) adapter).notifyDataSetChanged();
        }
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ぇぬぎばつ */
    public void mo2638(View view) {
        if (this.f5879 != view) {
            this.f5879 = view;
            this.f5882 = C2786.m4775(this.f5897, C1096.m2491(view));
        }
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ぉざぅち〻 */
    public void mo2639(boolean z) {
        this.f5896 = z;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: げつ〴ぬぐ */
    public void mo123(C1164 c1164, boolean z) {
        int size = this.f5877.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c1164 == this.f5877.get(i).f5907) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.f5877.size()) {
            this.f5877.get(i2).f5907.m2619(false);
        }
        C1194 remove = this.f5877.remove(i);
        remove.f5907.m2622(this);
        if (this.f5891) {
            MenuPopupWindow menuPopupWindow = remove.f5909;
            menuPopupWindow.getClass();
            if (Build.VERSION.SDK_INT >= 23) {
                menuPopupWindow.f448.setExitTransition(null);
            }
            remove.f5909.f448.setAnimationStyle(0);
        }
        remove.f5909.dismiss();
        int size2 = this.f5877.size();
        this.f5886 = size2 > 0 ? this.f5877.get(size2 - 1).f5908 : C1096.m2491(this.f5879) == 1 ? 0 : 1;
        if (size2 != 0) {
            if (z) {
                this.f5877.get(0).f5907.m2619(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1186.InterfaceC1187 interfaceC1187 = this.f5880;
        if (interfaceC1187 != null) {
            interfaceC1187.mo132(c1164, true);
        }
        ViewTreeObserver viewTreeObserver = this.f5878;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f5878.removeGlobalOnLayoutListener(this.f5899);
            }
            this.f5878 = null;
        }
        this.f5881.removeOnAttachStateChangeListener(this.f5888);
        this.f5894.onDismiss();
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ごづごきえ */
    public void mo2640(PopupWindow.OnDismissListener onDismissListener) {
        this.f5894 = onDismissListener;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ざっざへづ */
    public void mo2641(boolean z) {
        this.f5875 = z;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: ざとぅぼこ〺 */
    public void mo2642(int i) {
        if (this.f5897 != i) {
            this.f5897 = i;
            this.f5882 = C2786.m4775(i, C1096.m2491(this.f5879));
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: づざかべべ */
    public boolean mo124(SubMenuC1180 subMenuC1180) {
        for (C1194 c1194 : this.f5877) {
            if (subMenuC1180 == c1194.f5907) {
                c1194.f5909.f449.requestFocus();
                return true;
            }
        }
        if (!subMenuC1180.hasVisibleItems()) {
            return false;
        }
        subMenuC1180.m2610(this, this.f5883);
        if (mo176()) {
            m2659(subMenuC1180);
        } else {
            this.f5898.add(subMenuC1180);
        }
        InterfaceC1186.InterfaceC1187 interfaceC1187 = this.f5880;
        if (interfaceC1187 != null) {
            interfaceC1187.mo131(subMenuC1180);
        }
        return true;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: てぜきぽく */
    public void mo2608(InterfaceC1186.InterfaceC1187 interfaceC1187) {
        this.f5880 = interfaceC1187;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: でどあくず */
    public void mo2643(int i) {
        this.f5884 = true;
        this.f5889 = i;
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    /* renamed from: なぎぱいぢぎ */
    public ListView mo182() {
        if (this.f5877.isEmpty()) {
            return null;
        }
        return this.f5877.get(r0.size() - 1).f5909.f449;
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: のぷのちつ */
    public void mo2644(C1164 c1164) {
        c1164.m2610(this, this.f5883);
        if (mo176()) {
            m2659(c1164);
        } else {
            this.f5898.add(c1164);
        }
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: は〲ぱなで */
    public void mo2645(int i) {
        this.f5893 = true;
        this.f5885 = i;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: びぐびあび */
    public void mo127(Parcelable parcelable) {
    }

    @Override // p034.p050.p051.p052.AbstractC1199
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean mo2660() {
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺぁあねじ */
    public Parcelable mo129() {
        return null;
    }
}
