package p034.p050.p060;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p034.p035.p045.C1096;
import p034.p050.p051.WindowCallbackC1149;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p053.C1229;
import p034.p050.p053.InterfaceC1218;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1311 extends ActionBar {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Toolbar.InterfaceC0108 f6325;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f6326;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Window.Callback f6328;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC1218 f6329;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f6330;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f6332;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ArrayList<ActionBar.InterfaceC0037> f6331 = new ArrayList<>();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Runnable f6327 = new RunnableC1314();

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ざっざへづ$〺つふすそ, reason: contains not printable characters */
    public class C1312 implements Toolbar.InterfaceC0108 {
        public C1312() {
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ざっざへづ$くし〴〺ぅ, reason: contains not printable characters */
    public final class C1313 implements InterfaceC1186.InterfaceC1187 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f6334;

        public C1313() {
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: 〺つふすそ */
        public boolean mo131(C1164 c1164) {
            Window.Callback callback = C1311.this.f6328;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, c1164);
            return true;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: げつ〴ぬぐ */
        public void mo132(C1164 c1164, boolean z) {
            if (this.f6334) {
                return;
            }
            this.f6334 = true;
            C1311.this.f6329.mo2820();
            Window.Callback callback = C1311.this.f6328;
            if (callback != null) {
                callback.onPanelClosed(108, c1164);
            }
            this.f6334 = false;
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ざっざへづ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1314 implements Runnable {
        public RunnableC1314() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1311 c1311 = C1311.this;
            Menu m2965 = c1311.m2965();
            C1164 c1164 = m2965 instanceof C1164 ? (C1164) m2965 : null;
            if (c1164 != null) {
                c1164.m2627();
            }
            try {
                m2965.clear();
                if (!c1311.f6328.onCreatePanelMenu(0, m2965) || !c1311.f6328.onPreparePanel(0, null, m2965)) {
                    m2965.clear();
                }
            } finally {
                if (c1164 != null) {
                    c1164.m2629();
                }
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ざっざへづ$づざかべべ, reason: contains not printable characters */
    public class C1315 extends WindowCallbackC1149 {
        public C1315(Window.Callback callback) {
            super(callback);
        }

        @Override // p034.p050.p051.WindowCallbackC1149, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C1311.this.f6329.getContext()) : this.f5682.onCreatePanelView(i);
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = this.f5682.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C1311 c1311 = C1311.this;
                if (!c1311.f6326) {
                    c1311.f6329.setMenuPrepared();
                    C1311.this.f6326 = true;
                }
            }
            return onPreparePanel;
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ざっざへづ$びぐびあび, reason: contains not printable characters */
    public final class C1316 implements C1164.InterfaceC1166 {
        public C1316() {
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: 〺つふすそ */
        public void mo141(C1164 c1164) {
            C1311 c1311 = C1311.this;
            if (c1311.f6328 != null) {
                if (c1311.f6329.mo2813()) {
                    C1311.this.f6328.onPanelClosed(108, c1164);
                } else if (C1311.this.f6328.onPreparePanel(0, null, c1164)) {
                    C1311.this.f6328.onMenuOpened(108, c1164);
                }
            }
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: げつ〴ぬぐ */
        public boolean mo142(C1164 c1164, MenuItem menuItem) {
            return false;
        }
    }

    public C1311(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C1312 c1312 = new C1312();
        this.f6325 = c1312;
        this.f6329 = new C1229(toolbar, false);
        C1315 c1315 = new C1315(callback);
        this.f6328 = c1315;
        this.f6329.setWindowCallback(c1315);
        toolbar.setOnMenuItemClickListener(c1312);
        this.f6329.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: 〳ぜぞぜべっ */
    public void mo42() {
        this.f6329.mo2825().removeCallbacks(this.f6327);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: 〺つふすそ */
    public boolean mo43() {
        if (!this.f6329.mo2826()) {
            return false;
        }
        this.f6329.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぁごぐすすぃ */
    public void mo44(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: いいにぽつ */
    public boolean mo45(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f6329.mo2823();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぇぬぎばつ */
    public void mo46(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぉざぅち〻 */
    public void mo47(CharSequence charSequence) {
        this.f6329.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: おぐぴう〸ず */
    public void mo48(Drawable drawable) {
        this.f6329.mo2815(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: くし〴〺ぅ */
    public void mo49(boolean z) {
        if (z == this.f6330) {
            return;
        }
        this.f6330 = z;
        int size = this.f6331.size();
        for (int i = 0; i < size; i++) {
            this.f6331.get(i).m66(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: げつ〴ぬぐ */
    public boolean mo50() {
        return this.f6329.mo2812();
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final Menu m2965() {
        if (!this.f6332) {
            this.f6329.mo2807(new C1313(), new C1316());
            this.f6332 = true;
        }
        return this.f6329.mo2824();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ざとぅぼこ〺 */
    public void mo51(CharSequence charSequence) {
        this.f6329.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: づざかべべ */
    public Context mo52() {
        return this.f6329.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: てぜきぽく */
    public void mo53(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: なぎぱいぢぎ */
    public boolean mo54() {
        this.f6329.mo2825().removeCallbacks(this.f6327);
        C1096.m2482(this.f6329.mo2825(), this.f6327);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: のぷのちつ */
    public void mo55(boolean z) {
        this.f6329.mo2818(((z ? 4 : 0) & 4) | ((-5) & this.f6329.mo2821()));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: びぐびあび */
    public int mo57() {
        return this.f6329.mo2821();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: へぬ〴づぞ */
    public void mo58(int i) {
        this.f6329.mo2809(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぺぁあねじ */
    public boolean mo59(int i, KeyEvent keyEvent) {
        Menu m2965 = m2965();
        if (m2965 == null) {
            return false;
        }
        m2965.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return m2965.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぺふねづ〺 */
    public boolean mo60() {
        return this.f6329.mo2823();
    }
}
