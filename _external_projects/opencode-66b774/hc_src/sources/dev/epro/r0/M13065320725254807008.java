package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M13065320725254807008 {
    public O5064687772040291304 a;
    public F2091425264240644575 b;
    public boolean c;
    public final Object d = new Object();
    public F5118097716799491450 e;
    public final Context f;
    public final long g;

    public M13065320725254807008(Context context) {
        M18113111391818111737.v(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static void c(F6124250193528699243 f6124250193528699243, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            byte b = 1;
            if (f6124250193528699243 != null) {
                hashMap.put("limit_ad_tracking", true != f6124250193528699243.b ? "0" : "1");
                String str = f6124250193528699243.a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new U3506079075055770632(hashMap, b).start();
        }
    }

    public final void a() {
        M18113111391818111737.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        H12843822278061842084.D().J(this.f, this.a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        M18113111391818111737.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    a();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b = G14026964626121631668.b.b(context, 12451000);
                    if (b != 0 && b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    O5064687772040291304 o5064687772040291304 = new O5064687772040291304();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!H12843822278061842084.D().M(context, context.getClass().getName(), intent, o5064687772040291304, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = o5064687772040291304;
                        try {
                            IBinder a = o5064687772040291304.a();
                            int i = W18326855412430222222.a;
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = queryLocalInterface instanceof F2091425264240644575 ? (F2091425264240644575) queryLocalInterface : new G18232632593633845535(a);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new D6397819829364700013();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final F6124250193528699243 d() {
        F6124250193528699243 f6124250193528699243;
        M18113111391818111737.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        F5118097716799491450 f5118097716799491450 = this.e;
                        if (f5118097716799491450 == null || !f5118097716799491450.d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        b();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                M18113111391818111737.v(this.a);
                M18113111391818111737.v(this.b);
                try {
                    G18232632593633845535 g18232632593633845535 = (G18232632593633845535) this.b;
                    g18232632593633845535.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel b = g18232632593633845535.b(obtain, 1);
                    String readString = b.readString();
                    b.recycle();
                    G18232632593633845535 g182326325936338455352 = (G18232632593633845535) this.b;
                    g182326325936338455352.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = E12882278533613267972.a;
                    obtain2.writeInt(1);
                    Parcel b2 = g182326325936338455352.b(obtain2, 2);
                    if (b2.readInt() == 0) {
                        z = false;
                    }
                    b2.recycle();
                    f6124250193528699243 = new F6124250193528699243(readString, z);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            F5118097716799491450 f51180977167994914502 = this.e;
            if (f51180977167994914502 != null) {
                f51180977167994914502.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused2) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new F5118097716799491450(this, j);
            }
        }
        return f6124250193528699243;
    }

    public final void finalize() {
        a();
        super.finalize();
    }
}
