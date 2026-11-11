package p034.p068;

import android.media.session.MediaSessionManager;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.おぐぴう〸ず.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1422 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final MediaSessionManager.RemoteUserInfo f6684;

    public C1422(String str, int i, int i2) {
        this.f6684 = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1422) {
            return this.f6684.equals(((C1422) obj).f6684);
        }
        return false;
    }

    public int hashCode() {
        return C2786.m4799(this.f6684);
    }
}
