package p107.p108.p109.p110.p113.p116;

import android.util.Log;
import p131.p155.p156.p157.C2098;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.のぷのちつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1853 implements InterfaceC1855 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC1855 f8239;

    @Override // p107.p108.p109.p110.p113.p116.InterfaceC1855
    /* renamed from: げつ〴ぬぐ */
    public void mo1717(int i, String str, String str2, Throwable th) {
        if (th != null) {
            StringBuilder m4179 = C2098.m4179(str2, "\n");
            m4179.append(Log.getStackTraceString(th));
            str2 = m4179.toString();
        }
        InterfaceC1855 interfaceC1855 = this.f8239;
        if (interfaceC1855 != null) {
            interfaceC1855.mo1717(i, str, str2, th);
        }
    }
}
