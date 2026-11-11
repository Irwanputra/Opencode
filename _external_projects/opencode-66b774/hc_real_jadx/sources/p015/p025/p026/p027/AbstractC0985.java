package p015.p025.p026.p027;

import java.io.OutputStream;
import p015.p025.p026.C0989;

/* renamed from: いいにぽつ.づざかべべ.げつ〴ぬぐ.〺つふすそ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0985 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String[] f5350;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f5351;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f5353;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f5348 = false;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f5349 = false;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C0989 f5352 = null;

    public AbstractC0985(String... strArr) {
        this.f5350 = strArr;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2316(String str) {
        synchronized (this) {
            this.f5353 = -1;
            this.f5348 = true;
            notifyAll();
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m2317(OutputStream outputStream) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f5350.length; i++) {
            sb.append(this.f5350[i] + " 2>&1");
            sb.append('\n');
        }
        sb.toString();
        outputStream.write(sb.toString().getBytes());
    }

    /* renamed from: げつ〴ぬぐ */
    public abstract void mo2315(int i, String str);
}
