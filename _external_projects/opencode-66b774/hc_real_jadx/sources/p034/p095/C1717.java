package p034.p095;

import android.view.View;
import android.view.WindowId;

/* renamed from: づざかべべ.は〲ぱなで.ち〴みぎ〻び, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1717 implements InterfaceC1699 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final WindowId f7882;

    public C1717(View view) {
        this.f7882 = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1717) && ((C1717) obj).f7882.equals(this.f7882);
    }

    public int hashCode() {
        return this.f7882.hashCode();
    }
}
