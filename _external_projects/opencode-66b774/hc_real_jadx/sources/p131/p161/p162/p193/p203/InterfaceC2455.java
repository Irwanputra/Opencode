package p131.p161.p162.p193.p203;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.zzev;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.づざかべべ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public interface InterfaceC2455 extends IInterface {

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.づざかべべ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static abstract class AbstractBinderC2456 extends zzev implements InterfaceC2455 {
        public AbstractBinderC2456() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static InterfaceC2455 m4503(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC2455 ? (InterfaceC2455) queryLocalInterface : new C2453(iBinder);
        }
    }
}
