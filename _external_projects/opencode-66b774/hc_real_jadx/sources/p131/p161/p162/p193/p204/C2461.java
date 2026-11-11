package p131.p161.p162.p193.p204;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.zzeu;
import com.google.android.gms.internal.zzew;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.なぎぱいぢぎ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2461 extends zzeu implements InterfaceC2465 {
    public C2461(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // p131.p161.p162.p193.p204.InterfaceC2465
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final InterfaceC2455 mo4505(InterfaceC2455 interfaceC2455, String str, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeString(str);
        zzbe.writeInt(i);
        Parcel zza = zza(2, zzbe);
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }

    @Override // p131.p161.p162.p193.p204.InterfaceC2465
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final int mo4506(InterfaceC2455 interfaceC2455, String str, boolean z) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeString(str);
        zzew.zza(zzbe, z);
        Parcel zza = zza(3, zzbe);
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
