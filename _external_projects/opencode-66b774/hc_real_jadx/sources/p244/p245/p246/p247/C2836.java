package p244.p245.p246.p247;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ.〳ぜぞぜべっ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2836<T> extends AbstractC2834<T> {
    public C2836(T t) {
        super(t);
    }

    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: 〺つふすそ */
    public Context mo4938() {
        T t = this.f10524;
        if (t instanceof Activity) {
            return (Context) t;
        }
        if (t instanceof Fragment) {
            return ((Fragment) t).m484();
        }
        StringBuilder m4207 = C2098.m4207("Unknown host: ");
        m4207.append(this.f10524);
        throw new IllegalStateException(m4207.toString());
    }

    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: げつ〴ぬぐ */
    public void mo4939(int i, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: づざかべべ */
    public void mo4942(String str, String str2, String str3, int i, int i2, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: びぐびあび */
    public boolean mo4941(String str) {
        return false;
    }
}
