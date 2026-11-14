package dev.epro.r0;

import ads_mobile_sdk.ao;
import ads_mobile_sdk.jr0;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class R4239627874707364917 {
    public Object a;
    public Object b;

    public R4239627874707364917(jr0 jr0Var, G8001132634698687269 g8001132634698687269) {
        jr0Var.getClass();
        g8001132634698687269.getClass();
        this.a = jr0Var;
        this.b = g8001132634698687269;
    }

    public Object a$1(F4096073349764486348 f4096073349764486348, K14749510448791472029 k14749510448791472029) {
        jr0 jr0Var = (jr0) this.a;
        jr0Var.getClass();
        return ((Boolean) jr0Var.a("gads:call_all_methods_on_ui_thread:enabled", Boolean.FALSE, ao.a$11)).booleanValue() ? R7033599853981556291.d0((G8001132634698687269) this.b, new X15965119713728731855(f4096073349764486348, null, (byte) 1), k14749510448791472029) : f4096073349764486348.invoke(k14749510448791472029);
    }

    public void g() {
        W15255462148861058153 w15255462148861058153 = (W15255462148861058153) this.a;
        if (w15255462148861058153 != null) {
            try {
                ((L9687083612725928934) this.b).k.unregisterReceiver(w15255462148861058153);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter h();

    public abstract int[] i(int i);

    public abstract int j();

    public MenuItem k(MenuItem menuItem) {
        if (!(menuItem instanceof M13863035574364816451)) {
            return menuItem;
        }
        M13863035574364816451 m13863035574364816451 = (M13863035574364816451) menuItem;
        W929662112881511578 w929662112881511578 = (W929662112881511578) this.b;
        if (w929662112881511578 == null) {
            w929662112881511578 = new W929662112881511578(0);
            this.b = w929662112881511578;
        }
        MenuItem menuItem2 = (MenuItem) w929662112881511578.get(m13863035574364816451);
        if (menuItem2 != null) {
            return menuItem2;
        }
        H2233650693096395599 h2233650693096395599 = new H2233650693096395599((Context) this.a, m13863035574364816451);
        ((W929662112881511578) this.b).put(m13863035574364816451, h2233650693096395599);
        return h2233650693096395599;
    }

    public int[] l(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String m() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        S10823041268949770285.b0("text");
        throw null;
    }

    public abstract void n();

    public abstract int[] o(int i);

    public void p() {
        g();
        IntentFilter h = h();
        if (h.countActions() == 0) {
            return;
        }
        W15255462148861058153 w15255462148861058153 = (W15255462148861058153) this.a;
        if (w15255462148861058153 == null) {
            w15255462148861058153 = new W15255462148861058153(this, (byte) 0);
            this.a = w15255462148861058153;
        }
        ((L9687083612725928934) this.b).k.registerReceiver(w15255462148861058153, h);
    }

    public R4239627874707364917(W5797197595347441198 w5797197595347441198, Map map) {
        w5797197595347441198.getClass();
        map.getClass();
        this.a = w5797197595347441198;
        this.b = map;
    }

    public R4239627874707364917(Context context) {
        this.a = context;
    }

    public R4239627874707364917() {
        this.b = new int[2];
    }

    public R4239627874707364917(L9687083612725928934 l9687083612725928934) {
        this.b = l9687083612725928934;
    }
}
