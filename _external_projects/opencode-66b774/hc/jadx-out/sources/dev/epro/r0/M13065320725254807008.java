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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
            HashMap map = new HashMap();
            map.put("app_context", "1");
            byte b = 1;
            if (f6124250193528699243 != null) {
                map.put("limit_ad_tracking", true != f6124250193528699243.b ? "0" : "1");
                String str = f6124250193528699243.a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new U3506079075055770632(map, b).start();
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
                    int iB = G14026964626121631668.b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
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
                            IBinder iBinderA = o5064687772040291304.a();
                            int i = W18326855412430222222.a;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof F2091425264240644575 ? (F2091425264240644575) iInterfaceQueryLocalInterface : new G18232632593633845535(iBinderA);
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
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel parcelB = g18232632593633845535.b(parcelObtain, 1);
                    String string = parcelB.readString();
                    parcelB.recycle();
                    G18232632593633845535 g182326325936338455352 = (G18232632593633845535) this.b;
                    g182326325936338455352.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = E12882278533613267972.a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelB2 = g182326325936338455352.b(parcelObtain2, 2);
                    if (parcelB2.readInt() == 0) {
                        z = false;
                    }
                    parcelB2.recycle();
                    f6124250193528699243 = new F6124250193528699243(string, z);
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

    public final void finalize() throws Throwable {
        a();
        super.finalize();
    }
}
