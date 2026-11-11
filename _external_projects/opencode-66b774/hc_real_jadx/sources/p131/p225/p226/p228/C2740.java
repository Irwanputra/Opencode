package p131.p225.p226.p228;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import p107.p108.p109.p110.p118.C1862;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぉざぅち〻.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2740 extends Authenticator {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C1862 f10308;

    public C2740(C2731 c2731, C1862 c1862) {
        this.f10308 = c1862;
    }

    @Override // java.net.Authenticator
    public PasswordAuthentication getPasswordAuthentication() {
        C1862 c1862 = this.f10308;
        return new PasswordAuthentication(c1862.f8258, c1862.f8261.toCharArray());
    }
}
