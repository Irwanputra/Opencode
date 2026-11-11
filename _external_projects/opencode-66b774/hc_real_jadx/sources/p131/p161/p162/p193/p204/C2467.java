package p131.p161.p162.p193.p204;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.zzeu;
import com.google.android.gms.internal.zzew;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.なぎぱいぢぎ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2467 extends zzeu implements InterfaceC2459 {
    public C2467(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // p131.p161.p162.p193.p204.InterfaceC2459
    /* renamed from: てぜきぽく */
    public final InterfaceC2455 mo4504(InterfaceC2455 interfaceC2455, String str, int i, InterfaceC2455 interfaceC24552) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeString(str);
        zzbe.writeInt(i);
        zzew.zza(zzbe, interfaceC24552);
        Parcel zza = zza(2, zzbe);
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }
}
