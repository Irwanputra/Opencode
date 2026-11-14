package dev.epro.r0;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class E1636901823844057514 {
    private static final J18325703078859211263[] zze = new J18325703078859211263[0];
    private volatile String zzA;
    private B6867906687934285025 zzC;
    private boolean zzD;
    private volatile Y9189380382094246501 zzE;
    X7831914847311259349 zza;
    final C4270155929442575666 zzb;
    protected G10797274810599614742 zzc;
    protected final AtomicInteger zzd;
    private volatile String zzk;
    private final Context zzl;
    private final K4690422250417820120 zzn;
    private final G14026964626121631668 zzo;
    private final Object zzp;
    private final Object zzq;
    private Q444194404169614612 zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private S14544699827375243894 zzu;
    private byte zzv;
    private final I8344119817086563006 zzw;
    private final Z5019126814379845930 zzx;
    private final short zzy;
    private final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    public E1636901823844057514(Context context, Looper looper, K4690422250417820120 k4690422250417820120, G14026964626121631668 g14026964626121631668, int i, I8344119817086563006 i8344119817086563006, Z5019126814379845930 z5019126814379845930, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = (byte) 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        M18113111391818111737.w("Context must not be null", context);
        this.zzl = context;
        M18113111391818111737.w("Looper must not be null", looper);
        M18113111391818111737.w("Supervisor must not be null", k4690422250417820120);
        this.zzn = k4690422250417820120;
        M18113111391818111737.w("API availability must not be null", g14026964626121631668);
        this.zzo = g14026964626121631668;
        this.zzb = new C4270155929442575666(this, looper);
        this.zzy = i;
        this.zzw = i8344119817086563006;
        this.zzx = z5019126814379845930;
        this.zzz = str;
    }

    public IInterface b(IBinder iBinder) {
        int i = H8862315553088445192.j;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof C13221748483180666768 ? (C13221748483180666768) queryLocalInterface : new E16447877528733527200(iBinder, "com.google.android.gms.gass.internal.IGassService", (byte) 1);
    }

    public String c() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final void checkAvailabilityAndConnect() {
        int b = this.zzo.b(this.zzl, getMinApkVersion());
        if (b == 0) {
            connect(new H12843822278061842084(this));
            return;
        }
        e(1, null);
        this.zzc = new H12843822278061842084(this);
        int i = this.zzd.get();
        C4270155929442575666 c4270155929442575666 = this.zzb;
        c4270155929442575666.sendMessage(c4270155929442575666.obtainMessage(3, i, b, null));
    }

    public final void connect(G10797274810599614742 g10797274810599614742) {
        this.zzc = g10797274810599614742;
        e(2, null);
    }

    public String d() {
        return "com.google.android.gms.gass.START";
    }

    public final void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    J17338357039098224162 j17338357039098224162 = (J17338357039098224162) arrayList.get(i);
                    synchronized (j17338357039098224162) {
                        j17338357039098224162.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        e(1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, IInterface iInterface) {
        X7831914847311259349 x7831914847311259349;
        if ((i == 4) != (iInterface != null)) {
            K2042933864045806308.h();
            return;
        }
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    S14544699827375243894 s14544699827375243894 = this.zzu;
                    if (s14544699827375243894 != null) {
                        K4690422250417820120 k4690422250417820120 = this.zzn;
                        String str = this.zza.a;
                        M18113111391818111737.v(str);
                        this.zza.getClass();
                        if (this.zzz == null) {
                            this.zzl.getClass();
                        }
                        k4690422250417820120.c(str, s14544699827375243894, this.zza.b);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    S14544699827375243894 s145446998273752438942 = this.zzu;
                    if (s145446998273752438942 != null && (x7831914847311259349 = this.zza) != null) {
                        new StringBuilder(String.valueOf(x7831914847311259349.a).length() + 70 + "com.google.android.gms".length());
                        K4690422250417820120 k46904222504178201202 = this.zzn;
                        String str2 = this.zza.a;
                        M18113111391818111737.v(str2);
                        this.zza.getClass();
                        if (this.zzz == null) {
                            this.zzl.getClass();
                        }
                        k46904222504178201202.c(str2, s145446998273752438942, this.zza.b);
                        this.zzd.incrementAndGet();
                    }
                    S14544699827375243894 s145446998273752438943 = new S14544699827375243894(this, this.zzd.get());
                    this.zzu = s145446998273752438943;
                    String d = d();
                    boolean useDynamicLookup = getUseDynamicLookup();
                    this.zza = new X7831914847311259349(d, useDynamicLookup);
                    if (useDynamicLookup && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a)));
                    }
                    K4690422250417820120 k46904222504178201203 = this.zzn;
                    String str3 = this.zza.a;
                    M18113111391818111737.v(str3);
                    this.zza.getClass();
                    String str4 = this.zzz;
                    if (str4 == null) {
                        str4 = this.zzl.getClass().getName();
                    }
                    B6867906687934285025 b = k46904222504178201203.b(new B7526239878873455655(str3, this.zza.b), s145446998273752438943, str4, null);
                    if (!(b.e == 0)) {
                        new StringBuilder(String.valueOf(this.zza.a).length() + 34 + "com.google.android.gms".length());
                        int i2 = b.e;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (b.f != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b.f);
                        }
                        int i3 = this.zzd.get();
                        S7688660466602962762 s7688660466602962762 = new S7688660466602962762(this, i2, bundle);
                        C4270155929442575666 c4270155929442575666 = this.zzb;
                        c4270155929442575666.sendMessage(c4270155929442575666.obtainMessage(7, i3, -1, s7688660466602962762));
                    }
                } else if (i == 4) {
                    M18113111391818111737.v(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public Account getAccount() {
        return null;
    }

    public J18325703078859211263[] getApiFeatures() {
        return zze;
    }

    public final J18325703078859211263[] getAvailableFeatures() {
        Y9189380382094246501 y9189380382094246501 = this.zzE;
        if (y9189380382094246501 == null) {
            return null;
        }
        return y9189380382094246501.e;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public final void getEndpointPackageName() {
        if (!isConnected() || this.zza == null) {
            K2042933864045806308.i("Failed to connect when checking package");
        }
    }

    public final int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public final String getLastDisconnectMessage() {
        return this.zzk;
    }

    public int getMinApkVersion() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getRemoteService(W15728808418604800610 w15728808418604800610, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        short s = this.zzy;
        int i = G14026964626121631668.a;
        Scope[] scopeArr = U15967579131276469447.r;
        Bundle bundle = new Bundle();
        J18325703078859211263[] j18325703078859211263Arr = U15967579131276469447.s;
        U15967579131276469447 u15967579131276469447 = new U15967579131276469447(6, s, i, null, null, scopeArr, bundle, null, j18325703078859211263Arr, j18325703078859211263Arr, true, 0, false, str);
        u15967579131276469447.g = this.zzl.getPackageName();
        u15967579131276469447.j = getServiceRequestExtraArgs;
        if (set != null) {
            u15967579131276469447.i = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            u15967579131276469447.k = account;
            if (w15728808418604800610 != 0) {
                u15967579131276469447.h = ((I11267981316413440737) w15728808418604800610).b;
            }
        }
        u15967579131276469447.l = zze;
        u15967579131276469447.m = getApiFeatures();
        if (this instanceof E17451188492285078839) {
            u15967579131276469447.p = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    try {
                        Q444194404169614612 q444194404169614612 = this.zzr;
                        if (q444194404169614612 != null) {
                            q444194404169614612.b(new J6898713825537015797(this, this.zzd.get()), u15967579131276469447);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i2 = this.zzd.get();
                A12579232015529019125 a12579232015529019125 = new A12579232015529019125(this, 8, null, null);
                C4270155929442575666 c4270155929442575666 = this.zzb;
                c4270155929442575666.sendMessage(c4270155929442575666.obtainMessage(1, i2, -1, a12579232015529019125));
            }
        } catch (DeadObjectException unused2) {
            int i3 = this.zzd.get();
            C4270155929442575666 c42701559294425756662 = this.zzb;
            c42701559294425756662.sendMessage(c42701559294425756662.obtainMessage(6, i3, 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.zzs;
                M18113111391818111737.w("Client is connected but service is null", iInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public final M3288231786426044629 getTelemetryConfiguration() {
        Y9189380382094246501 y9189380382094246501 = this.zzE;
        if (y9189380382094246501 == null) {
            return null;
        }
        return y9189380382094246501.g;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public final boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            byte b = this.zzv;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public final void onUserSignOut(M204440408817344908 m204440408817344908) {
        ((Z102412548944701279) m204440408817344908.b).m.m.post(new U3594978070141619353((Object) m204440408817344908, (byte) 13));
    }

    public boolean requiresSignIn() {
        return false;
    }

    public final void setAttributionTag(String str) {
        this.zzA = str;
    }

    public final void zzc(Y9189380382094246501 y9189380382094246501) {
        this.zzE = y9189380382094246501;
        if (this instanceof E17451188492285078839) {
            M3288231786426044629 m3288231786426044629 = y9189380382094246501.g;
            H12843822278061842084 C = H12843822278061842084.C();
            F5577235160184315757 f5577235160184315757 = m3288231786426044629 == null ? null : m3288231786426044629.d;
            synchronized (C) {
                if (f5577235160184315757 == null) {
                    C.b = H12843822278061842084.d;
                    return;
                }
                F5577235160184315757 f55772351601843157572 = (F5577235160184315757) C.b;
                if (f55772351601843157572 == null || f55772351601843157572.d < f5577235160184315757.d) {
                    C.b = f5577235160184315757;
                }
            }
        }
    }

    public final /* synthetic */ boolean zze(int i, int i2, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                e(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf() {
        byte b;
        int i;
        synchronized (this.zzp) {
            b = this.zzv;
        }
        if (b == 3) {
            this.zzD = true;
            i = 5;
        } else {
            i = 4;
        }
        C4270155929442575666 c4270155929442575666 = this.zzb;
        c4270155929442575666.sendMessage(c4270155929442575666.obtainMessage(i, this.zzd.get(), 16));
    }

    public final boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(c()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(c());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(Q444194404169614612 q444194404169614612) {
        this.zzr = q444194404169614612;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ I8344119817086563006 zzk() {
        return this.zzw;
    }

    public final /* synthetic */ Z5019126814379845930 zzl() {
        return this.zzx;
    }

    public final /* synthetic */ B6867906687934285025 zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(B6867906687934285025 b6867906687934285025) {
        this.zzC = b6867906687934285025;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public final void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public E1636901823844057514(int i, Context context, Looper looper, I8344119817086563006 i8344119817086563006, Z5019126814379845930 z5019126814379845930) {
        this(context, looper, K4690422250417820120.a(context), G14026964626121631668.b, i, i8344119817086563006, z5019126814379845930, null);
    }
}
