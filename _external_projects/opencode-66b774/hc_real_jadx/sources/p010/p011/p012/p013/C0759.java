package p010.p011.p012.p013;

import android.content.Context;
import android.content.ServiceConnection;
import java.io.Closeable;
import p010.p011.p012.p014.InterfaceC0778;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0759 implements Closeable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Context f4895;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ServiceConnection f4896;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final InterfaceC0778 f4897;

    public C0759(Context context, ServiceConnection serviceConnection, InterfaceC0778 interfaceC0778) {
        this.f4895 = context;
        this.f4896 = serviceConnection;
        this.f4897 = interfaceC0778;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4895.unbindService(this.f4896);
    }
}
