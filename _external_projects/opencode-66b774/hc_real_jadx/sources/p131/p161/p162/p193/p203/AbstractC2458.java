package p131.p161.p162.p193.p203;

import android.content.Context;
import android.os.IBinder;
import p131.p161.p162.p193.p205.C2475;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.づざかべべ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2458<T> {
    private final String zzgwn;
    private T zzgwo;

    public AbstractC2458(String str) {
        this.zzgwn = str;
    }

    public final T zzde(Context context) {
        if (this.zzgwo == null) {
            if (context == null) {
                throw new NullPointerException("null reference");
            }
            Context m4508 = C2475.m4508(context);
            if (m4508 == null) {
                throw new C2457("Could not get remote context.");
            }
            try {
                this.zzgwo = zze((IBinder) m4508.getClassLoader().loadClass(this.zzgwn).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C2457("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new C2457("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new C2457("Could not instantiate creator.", e3);
            }
        }
        return this.zzgwo;
    }

    public abstract T zze(IBinder iBinder);
}
