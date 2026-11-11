package p131.p161.p162.p193.p205.p208;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.zzeu;
import com.google.android.gms.internal.zzew;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2481 extends zzeu implements InterfaceC2506 {
    public C2481(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2506
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Account mo4511() {
        Parcel zza = zza(2, zzbe());
        Account account = (Account) zzew.zza(zza, Account.CREATOR);
        zza.recycle();
        return account;
    }
}
