package dev.epro.r0;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U15967579131276469447 extends X9848659370812859730 {
    public static final Parcelable.Creator<U15967579131276469447> CREATOR = new B10553407071691721287((byte) 5);
    public static final Scope[] r = new Scope[0];
    public static final J18325703078859211263[] s = new J18325703078859211263[0];
    public final int d;
    public final int e;
    public final int f;
    public String g;
    public IBinder h;
    public Scope[] i;
    public Bundle j;
    public Account k;
    public J18325703078859211263[] l;
    public J18325703078859211263[] m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final int f522o;
    public boolean p;
    public final String q;

    public U15967579131276469447(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, J18325703078859211263[] j18325703078859211263Arr, J18325703078859211263[] j18325703078859211263Arr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? r : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        J18325703078859211263[] j18325703078859211263Arr3 = s;
        J18325703078859211263[] j18325703078859211263Arr4 = j18325703078859211263Arr == null ? j18325703078859211263Arr3 : j18325703078859211263Arr;
        j18325703078859211263Arr3 = j18325703078859211263Arr2 != null ? j18325703078859211263Arr2 : j18325703078859211263Arr3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        if ("com.google.android.gms".equals(str)) {
            this.g = "com.google.android.gms";
        } else {
            this.g = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = X9247881914193501773.j;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface t8731205310522354167 = queryLocalInterface instanceof W15728808418604800610 ? (W15728808418604800610) queryLocalInterface : new T8731205310522354167(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    T8731205310522354167 t87312053105223541672 = (T8731205310522354167) t8731205310522354167;
                    Parcel b = t87312053105223541672.b(t87312053105223541672.c(), 2);
                    Account account3 = (Account) R17194208210488071321.a(b, Account.CREATOR);
                    b.recycle();
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    account2 = account3;
                } catch (RemoteException unused) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.h = iBinder;
            account2 = account;
        }
        this.k = account2;
        this.i = scopeArr2;
        this.j = bundle2;
        this.l = j18325703078859211263Arr4;
        this.m = j18325703078859211263Arr3;
        this.n = z;
        this.f522o = i4;
        this.p = z2;
        this.q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        B10553407071691721287.a(this, parcel, i);
    }
}
