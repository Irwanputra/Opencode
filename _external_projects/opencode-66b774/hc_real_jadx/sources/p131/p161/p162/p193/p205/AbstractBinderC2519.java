package p131.p161.p162.p193.p205;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzev;
import com.google.android.gms.internal.zzew;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;
import p131.p161.p162.p193.p205.p208.InterfaceC2507;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractBinderC2519 extends zzev implements InterfaceC2507 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f9867;

    public AbstractBinderC2519(byte[] bArr) {
        String str;
        String str2;
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            int length = bArr.length;
            if (bArr.length == 0 || length <= 0 || length > bArr.length) {
                str = null;
            } else {
                StringBuilder sb = new StringBuilder((((length + 16) - 1) / 16) * 57);
                int i = length;
                int i2 = 0;
                int i3 = 0;
                while (i > 0) {
                    if (i2 == 0) {
                        str2 = length < 65536 ? String.format("%04X:", Integer.valueOf(i3)) : String.format("%08X:", Integer.valueOf(i3));
                    } else {
                        str2 = i2 == 8 ? " -" : str2;
                        sb.append(String.format(" %02X", Integer.valueOf(bArr[i3] & 255)));
                        i--;
                        i2++;
                        if (i2 != 16 || i == 0) {
                            sb.append('\n');
                            i2 = 0;
                        }
                        i3++;
                    }
                    sb.append(str2);
                    sb.append(String.format(" %02X", Integer.valueOf(bArr[i3] & 255)));
                    i--;
                    i2++;
                    if (i2 != 16) {
                    }
                    sb.append('\n');
                    i2 = 0;
                    i3++;
                }
                str = sb.toString();
            }
            String.valueOf(str).length();
            new Exception();
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            boolean z = bArr.length == 25;
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("cert hash data has incorrect length. length=");
            sb2.append(length2);
            String sb3 = sb2.toString();
            if (!z) {
                throw new IllegalArgumentException(String.valueOf(sb3));
            }
        }
        this.f9867 = Arrays.hashCode(bArr);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static byte[] m4532(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        InterfaceC2455 mo4523;
        if (obj != null && (obj instanceof InterfaceC2507)) {
            try {
                InterfaceC2507 interfaceC2507 = (InterfaceC2507) obj;
                if (interfaceC2507.mo4524() == this.f9867 && (mo4523 = interfaceC2507.mo4523()) != null) {
                    return Arrays.equals(mo4526(), (byte[]) BinderC2454.m4502(mo4523));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f9867;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            BinderC2454 binderC2454 = new BinderC2454(mo4526());
            parcel2.writeNoException();
            zzew.zza(parcel2, binderC2454);
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.f9867;
        parcel2.writeNoException();
        parcel2.writeInt(i3);
        return true;
    }

    /* renamed from: 〺つふすそ */
    public abstract byte[] mo4526();

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2507
    /* renamed from: いいにぽつ */
    public final InterfaceC2455 mo4523() {
        return new BinderC2454(mo4526());
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2507
    /* renamed from: くし〴〺ぅ */
    public final int mo4524() {
        return this.f9867;
    }
}
