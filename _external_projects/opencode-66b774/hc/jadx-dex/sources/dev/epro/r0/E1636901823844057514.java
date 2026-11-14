package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E1636901823844057514 {
    private static final dev.epro.r0.J18325703078859211263[] zze = new dev.epro.r0.J18325703078859211263[0];
    private volatile java.lang.String zzA;
    private dev.epro.r0.B6867906687934285025 zzC;
    private boolean zzD;
    private volatile dev.epro.r0.Y9189380382094246501 zzE;
    dev.epro.r0.X7831914847311259349 zza;
    final dev.epro.r0.C4270155929442575666 zzb;
    protected dev.epro.r0.G10797274810599614742 zzc;
    protected final java.util.concurrent.atomic.AtomicInteger zzd;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final dev.epro.r0.K4690422250417820120 zzn;
    private final dev.epro.r0.G14026964626121631668 zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private dev.epro.r0.Q444194404169614612 zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private dev.epro.r0.S14544699827375243894 zzu;
    private byte zzv;
    private final dev.epro.r0.I8344119817086563006 zzw;
    private final dev.epro.r0.Z5019126814379845930 zzx;
    private final short zzy;
    private final java.lang.String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    public E1636901823844057514(android.content.Context context, android.os.Looper looper, dev.epro.r0.K4690422250417820120 k4690422250417820120, dev.epro.r0.G14026964626121631668 g14026964626121631668, int i, dev.epro.r0.I8344119817086563006 i8344119817086563006, dev.epro.r0.Z5019126814379845930 z5019126814379845930, java.lang.String str) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = (byte) 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        dev.epro.r0.M18113111391818111737.w("Context must not be null", context);
        this.zzl = context;
        dev.epro.r0.M18113111391818111737.w("Looper must not be null", looper);
        dev.epro.r0.M18113111391818111737.w("Supervisor must not be null", k4690422250417820120);
        this.zzn = k4690422250417820120;
        dev.epro.r0.M18113111391818111737.w("API availability must not be null", g14026964626121631668);
        this.zzo = g14026964626121631668;
        this.zzb = new dev.epro.r0.C4270155929442575666(this, looper);
        this.zzy = i;
        this.zzw = i8344119817086563006;
        this.zzx = z5019126814379845930;
        this.zzz = str;
    }

    public android.os.IInterface b(android.os.IBinder iBinder) {
        int i = dev.epro.r0.H8862315553088445192.j;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof dev.epro.r0.C13221748483180666768 ? (dev.epro.r0.C13221748483180666768) iInterfaceQueryLocalInterface : new dev.epro.r0.E16447877528733527200(iBinder, "com.google.android.gms.gass.internal.IGassService", (byte) 1);
    }

    public java.lang.String c() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final void checkAvailabilityAndConnect() {
        int iB = this.zzo.b(this.zzl, getMinApkVersion());
        if (iB == 0) {
            connect(new dev.epro.r0.H12843822278061842084(this));
            return;
        }
        e(1, null);
        this.zzc = new dev.epro.r0.H12843822278061842084(this);
        int i = this.zzd.get();
        dev.epro.r0.R502132765509599220 r502132765509599220 = this.zzb;
        r502132765509599220.sendMessage(r502132765509599220.obtainMessage(3, i, iB, null));
    }

    public final void connect(dev.epro.r0.G10797274810599614742 g10797274810599614742) {
        this.zzc = g10797274810599614742;
        e(2, null);
    }

    public java.lang.String d() {
        return "com.google.android.gms.gass.START";
    }

    public final void disconnect() {
        this.zzd.incrementAndGet();
        java.util.ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dev.epro.r0.J17338357039098224162 j17338357039098224162 = (dev.epro.r0.J17338357039098224162) arrayList.get(i);
                    synchronized (j17338357039098224162) {
                        j17338357039098224162.a = null;
                    }
                }
                arrayList.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        e(1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, android.os.IInterface iInterface) {
        dev.epro.r0.X7831914847311259349 x7831914847311259349;
        if ((i == 4) != (iInterface != null)) {
            dev.epro.r0.K2042933864045806308.h();
            return;
        }
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                android.os.Bundle bundle = null;
                if (i == 1) {
                    dev.epro.r0.S14544699827375243894 s14544699827375243894 = this.zzu;
                    if (s14544699827375243894 != null) {
                        dev.epro.r0.K4690422250417820120 k4690422250417820120 = this.zzn;
                        java.lang.String str = this.zza.a;
                        dev.epro.r0.M18113111391818111737.v(str);
                        this.zza.getClass();
                        if (this.zzz == null) {
                            this.zzl.getClass();
                        }
                        k4690422250417820120.c(str, s14544699827375243894, this.zza.b);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    dev.epro.r0.S14544699827375243894 s145446998273752438942 = this.zzu;
                    if (s145446998273752438942 != null && (x7831914847311259349 = this.zza) != null) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(x7831914847311259349.a).length() + 70 + "com.google.android.gms".length());
                        dev.epro.r0.K4690422250417820120 k46904222504178201202 = this.zzn;
                        java.lang.String str2 = this.zza.a;
                        dev.epro.r0.M18113111391818111737.v(str2);
                        this.zza.getClass();
                        if (this.zzz == null) {
                            this.zzl.getClass();
                        }
                        k46904222504178201202.c(str2, s145446998273752438942, this.zza.b);
                        this.zzd.incrementAndGet();
                    }
                    dev.epro.r0.S14544699827375243894 s145446998273752438943 = new dev.epro.r0.S14544699827375243894(this, this.zzd.get());
                    this.zzu = s145446998273752438943;
                    java.lang.String strD = d();
                    boolean useDynamicLookup = getUseDynamicLookup();
                    this.zza = new dev.epro.r0.X7831914847311259349(strD, useDynamicLookup);
                    if (useDynamicLookup && getMinApkVersion() < 17895000) {
                        throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf(this.zza.a)));
                    }
                    dev.epro.r0.K4690422250417820120 k46904222504178201203 = this.zzn;
                    java.lang.String str3 = this.zza.a;
                    dev.epro.r0.M18113111391818111737.v(str3);
                    this.zza.getClass();
                    java.lang.String name = this.zzz;
                    if (name == null) {
                        name = this.zzl.getClass().getName();
                    }
                    dev.epro.r0.B6867906687934285025 b6867906687934285025B = k46904222504178201203.b(new dev.epro.r0.B7526239878873455655(str3, this.zza.b), s145446998273752438943, name, (java.util.concurrent.Executor) null);
                    if (!(b6867906687934285025B.e == 0)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(this.zza.a).length() + 34 + "com.google.android.gms".length());
                        int i2 = b6867906687934285025B.e;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (b6867906687934285025B.f != null) {
                            bundle = new android.os.Bundle();
                            bundle.putParcelable("pendingIntent", b6867906687934285025B.f);
                        }
                        int i3 = this.zzd.get();
                        java.lang.Object s7688660466602962762 = new dev.epro.r0.S7688660466602962762(this, i2, bundle);
                        dev.epro.r0.R502132765509599220 r502132765509599220 = this.zzb;
                        r502132765509599220.sendMessage(r502132765509599220.obtainMessage(7, i3, -1, s7688660466602962762));
                    }
                } else if (i == 4) {
                    dev.epro.r0.M18113111391818111737.v(iInterface);
                    java.lang.System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public android.accounts.Account getAccount() {
        return null;
    }

    public dev.epro.r0.J18325703078859211263[] getApiFeatures() {
        return zze;
    }

    public final dev.epro.r0.J18325703078859211263[] getAvailableFeatures() {
        dev.epro.r0.Y9189380382094246501 y9189380382094246501 = this.zzE;
        if (y9189380382094246501 == null) {
            return null;
        }
        return y9189380382094246501.e;
    }

    public final android.content.Context getContext() {
        return this.zzl;
    }

    public final void getEndpointPackageName() {
        if (!isConnected() || this.zza == null) {
            dev.epro.r0.K2042933864045806308.i("Failed to connect when checking package");
        }
    }

    public final int getGCoreServiceId() {
        return this.zzy;
    }

    public android.os.Bundle getGetServiceRequestExtraArgs() {
        return new android.os.Bundle();
    }

    public final java.lang.String getLastDisconnectMessage() {
        return this.zzk;
    }

    public int getMinApkVersion() {
        return 12451000;
    }

    public final void getRemoteService(dev.epro.r0.W15728808418604800610 w15728808418604800610, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        android.os.Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        java.lang.String str = this.zzA;
        short s = this.zzy;
        int i = dev.epro.r0.G14026964626121631668.a;
        com.google.android.gms.common.api.Scope[] scopeArr = dev.epro.r0.U15967579131276469447.r;
        android.os.Bundle bundle = new android.os.Bundle();
        dev.epro.r0.J18325703078859211263[] j18325703078859211263Arr = dev.epro.r0.U15967579131276469447.s;
        dev.epro.r0.U15967579131276469447 u15967579131276469447 = new dev.epro.r0.U15967579131276469447(6, s, i, (java.lang.String) null, (android.os.IBinder) null, scopeArr, bundle, (android.accounts.Account) null, j18325703078859211263Arr, j18325703078859211263Arr, true, 0, false, str);
        u15967579131276469447.g = this.zzl.getPackageName();
        u15967579131276469447.j = getServiceRequestExtraArgs;
        if (set != null) {
            u15967579131276469447.i = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (requiresSignIn()) {
            android.accounts.Account account = getAccount();
            if (account == null) {
                account = new android.accounts.Account("<<default account>>", "com.google");
            }
            u15967579131276469447.k = account;
            if (w15728808418604800610 != null) {
                u15967579131276469447.h = ((dev.epro.r0.I11267981316413440737) w15728808418604800610).b;
            }
        }
        u15967579131276469447.l = zze;
        u15967579131276469447.m = getApiFeatures();
        if (this instanceof dev.epro.r0.E17451188492285078839) {
            u15967579131276469447.p = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    try {
                        dev.epro.r0.Q444194404169614612 q444194404169614612 = this.zzr;
                        if (q444194404169614612 != null) {
                            q444194404169614612.b(new dev.epro.r0.J6898713825537015797(this, this.zzd.get()), u15967579131276469447);
                        }
                    } finally {
                    }
                }
            } catch (android.os.RemoteException | java.lang.RuntimeException unused) {
                int i2 = this.zzd.get();
                java.lang.Object a12579232015529019125 = new dev.epro.r0.A12579232015529019125(this, 8, null, null);
                dev.epro.r0.R502132765509599220 r502132765509599220 = this.zzb;
                r502132765509599220.sendMessage(r502132765509599220.obtainMessage(1, i2, -1, a12579232015529019125));
            }
        } catch (android.os.DeadObjectException unused2) {
            int i3 = this.zzd.get();
            dev.epro.r0.R502132765509599220 r5021327655095992202 = this.zzb;
            r5021327655095992202.sendMessage(r5021327655095992202.obtainMessage(6, i3, 3));
        } catch (java.lang.SecurityException e) {
            throw e;
        }
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return java.util.Collections.EMPTY_SET;
    }

    public final android.os.IInterface getService() {
        android.os.IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new android.os.DeadObjectException();
                }
                if (!isConnected()) {
                    throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.zzs;
                dev.epro.r0.M18113111391818111737.w("Client is connected but service is null", iInterface);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public final dev.epro.r0.M3288231786426044629 getTelemetryConfiguration() {
        dev.epro.r0.Y9189380382094246501 y9189380382094246501 = this.zzE;
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

    public final void onUserSignOut(dev.epro.r0.M204440408817344908 m204440408817344908) {
        ((dev.epro.r0.Z102412548944701279) m204440408817344908.b).m.m.post(new dev.epro.r0.U3594978070141619353(m204440408817344908, (byte) 13));
    }

    public boolean requiresSignIn() {
        return false;
    }

    public final void setAttributionTag(java.lang.String str) {
        this.zzA = str;
    }

    public final void zzc(dev.epro.r0.Y9189380382094246501 y9189380382094246501) {
        this.zzE = y9189380382094246501;
        if (this instanceof dev.epro.r0.E17451188492285078839) {
            dev.epro.r0.M3288231786426044629 m3288231786426044629 = y9189380382094246501.g;
            dev.epro.r0.H12843822278061842084 h12843822278061842084C = dev.epro.r0.H12843822278061842084.C();
            dev.epro.r0.F5577235160184315757 f5577235160184315757 = m3288231786426044629 == null ? null : m3288231786426044629.d;
            synchronized (h12843822278061842084C) {
                if (f5577235160184315757 == null) {
                    h12843822278061842084C.b = dev.epro.r0.H12843822278061842084.d;
                    return;
                }
                dev.epro.r0.F5577235160184315757 f55772351601843157572 = (dev.epro.r0.F5577235160184315757) h12843822278061842084C.b;
                if (f55772351601843157572 == null || f55772351601843157572.d < f5577235160184315757.d) {
                    h12843822278061842084C.b = f5577235160184315757;
                }
            }
        }
    }

    public final /* synthetic */ boolean zze(int i, int i2, android.os.IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                e(i2, iInterface);
                return true;
            } catch (java.lang.Throwable th) {
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
        dev.epro.r0.R502132765509599220 r502132765509599220 = this.zzb;
        r502132765509599220.sendMessage(r502132765509599220.obtainMessage(i, this.zzd.get(), 16));
    }

    public final boolean zzg() {
        if (this.zzD || android.text.TextUtils.isEmpty(c()) || android.text.TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            java.lang.Class.forName(c());
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ java.lang.Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(dev.epro.r0.Q444194404169614612 q444194404169614612) {
        this.zzr = q444194404169614612;
    }

    public final /* synthetic */ java.util.ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ dev.epro.r0.I8344119817086563006 zzk() {
        return this.zzw;
    }

    public final /* synthetic */ dev.epro.r0.Z5019126814379845930 zzl() {
        return this.zzx;
    }

    public final /* synthetic */ dev.epro.r0.B6867906687934285025 zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(dev.epro.r0.B6867906687934285025 b6867906687934285025) {
        this.zzC = b6867906687934285025;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public final void disconnect(java.lang.String str) {
        this.zzk = str;
        disconnect();
    }

    public E1636901823844057514(int i, android.content.Context context, android.os.Looper looper, dev.epro.r0.I8344119817086563006 i8344119817086563006, dev.epro.r0.Z5019126814379845930 z5019126814379845930) {
        this(context, looper, dev.epro.r0.K4690422250417820120.a(context), dev.epro.r0.G14026964626121631668.b, i, i8344119817086563006, z5019126814379845930, null);
    }
}
