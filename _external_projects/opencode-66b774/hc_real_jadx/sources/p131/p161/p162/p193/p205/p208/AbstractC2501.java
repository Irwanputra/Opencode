package p131.p161.p162.p193.p205.p208;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p095.C1687;
import p131.p161.p162.p193.p205.C2518;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2501<T extends IInterface> {
    private static String[] zzfyy = {"service_esmobile", "service_googleme"};
    private final Context mContext;
    public final Handler mHandler;
    private final Object mLock;
    private final Looper zzall;
    private final C2518 zzfqc;
    private int zzfyd;
    private long zzfye;
    private long zzfyf;
    private int zzfyg;
    private long zzfyh;
    private C2477 zzfyi;
    private final AbstractC2488 zzfyj;
    private final Object zzfyk;
    private InterfaceC2505 zzfyl;
    public InterfaceC2485 zzfym;
    private T zzfyn;
    private final ArrayList<AbstractC2479<?>> zzfyo;
    private ServiceConnectionC2502 zzfyp;
    private int zzfyq;
    private final InterfaceC2491 zzfyr;
    private final InterfaceC2496 zzfys;
    private final int zzfyt;
    private final String zzfyu;
    private ConnectionResult zzfyv;
    private boolean zzfyw;
    public AtomicInteger zzfyx;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC2501(android.content.Context r10, android.os.Looper r11, int r12, p131.p161.p162.p193.p205.p208.InterfaceC2491 r13, p131.p161.p162.p193.p205.p208.InterfaceC2496 r14, java.lang.String r15) {
        /*
            r9 = this;
            java.lang.Object r15 = p131.p161.p162.p193.p205.p208.AbstractC2488.f9821
            monitor-enter(r15)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.くし〴〺ぅ r0 = p131.p161.p162.p193.p205.p208.AbstractC2488.f9822     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L12
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.づざかべべ r0 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.づざかべべ     // Catch: java.lang.Throwable -> L36
            android.content.Context r1 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L36
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36
            p131.p161.p162.p193.p205.p208.AbstractC2488.f9822 = r0     // Catch: java.lang.Throwable -> L36
        L12:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L36
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.くし〴〺ぅ r3 = p131.p161.p162.p193.p205.p208.AbstractC2488.f9822
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.ぺぁあねじ r4 = p131.p161.p162.p193.p205.C2518.f9865
            if (r13 == 0) goto L2e
            if (r14 == 0) goto L26
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L26:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null reference"
            r10.<init>(r11)
            throw r10
        L2e:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null reference"
            r10.<init>(r11)
            throw r10
        L36:
            r10 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L36
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p193.p205.p208.AbstractC2501.<init>(android.content.Context, android.os.Looper, int, なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.ざっざへづ, なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.でどあくず, java.lang.String):void");
    }

    public AbstractC2501(Context context, Looper looper, AbstractC2488 abstractC2488, C2518 c2518, int i, InterfaceC2491 interfaceC2491, InterfaceC2496 interfaceC2496, String str) {
        this.mLock = new Object();
        this.zzfyk = new Object();
        this.zzfyo = new ArrayList<>();
        this.zzfyq = 1;
        this.zzfyv = null;
        this.zzfyw = false;
        this.zzfyx = new AtomicInteger(0);
        C1687.m3726(context, "Context must not be null");
        this.mContext = context;
        C1687.m3726(looper, "Looper must not be null");
        this.zzall = looper;
        C1687.m3726(abstractC2488, "Supervisor must not be null");
        this.zzfyj = abstractC2488;
        C1687.m3726(c2518, "API availability must not be null");
        this.zzfqc = c2518;
        this.mHandler = new HandlerC2504(this, looper);
        this.zzfyt = i;
        this.zzfyr = interfaceC2491;
        this.zzfys = interfaceC2496;
        this.zzfyu = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i, T t) {
        C2477 c2477;
        if (!((i == 4) == (t != null))) {
            throw new IllegalArgumentException();
        }
        synchronized (this.mLock) {
            this.zzfyq = i;
            this.zzfyn = t;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (this.zzfyp != null && (c2477 = this.zzfyi) != null) {
                        String str = c2477.f9810;
                        String str2 = c2477.f9809;
                        String.valueOf(str).length();
                        String.valueOf(str2).length();
                        AbstractC2488 abstractC2488 = this.zzfyj;
                        C2477 c24772 = this.zzfyi;
                        String str3 = c24772.f9810;
                        String str4 = c24772.f9809;
                        ServiceConnectionC2502 serviceConnectionC2502 = this.zzfyp;
                        String zzaki = zzaki();
                        abstractC2488.getClass();
                        abstractC2488.mo4516(new C2503(str3, str4, 129), serviceConnectionC2502, zzaki);
                        this.zzfyx.incrementAndGet();
                    }
                    this.zzfyp = new ServiceConnectionC2502(this, this.zzfyx.get());
                    String zzakh = zzakh();
                    String zzhi = zzhi();
                    this.zzfyi = new C2477(zzakh, zzhi);
                    if (!this.zzfyj.mo4517(new C2503(zzhi, zzakh, 129), this.zzfyp, zzaki())) {
                        C2477 c24773 = this.zzfyi;
                        String str5 = c24773.f9810;
                        String str6 = c24773.f9809;
                        String.valueOf(str5).length();
                        String.valueOf(str6).length();
                        zza(16, (Bundle) null, this.zzfyx.get());
                    }
                } else if (i == 4) {
                    zza((AbstractC2501<T>) t);
                }
            } else if (this.zzfyp != null) {
                AbstractC2488 abstractC24882 = this.zzfyj;
                String zzhi2 = zzhi();
                String zzakh2 = zzakh();
                ServiceConnectionC2502 serviceConnectionC25022 = this.zzfyp;
                String zzaki2 = zzaki();
                abstractC24882.getClass();
                abstractC24882.mo4516(new C2503(zzhi2, zzakh2, 129), serviceConnectionC25022, zzaki2);
                this.zzfyp = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzfyq != i) {
                return false;
            }
            zza(i2, (int) t);
            return true;
        }
    }

    private final String zzaki() {
        String str = this.zzfyu;
        return str == null ? this.mContext.getClass().getName() : str;
    }

    private final boolean zzakk() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzfyq == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzakq() {
        if (this.zzfyw || TextUtils.isEmpty(zzhj()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(zzhj());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcf(int i) {
        int i2;
        if (zzakk()) {
            i2 = 5;
            this.zzfyw = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i2, this.zzfyx.get(), 16));
    }

    public void disconnect() {
        this.zzfyx.incrementAndGet();
        synchronized (this.zzfyo) {
            int size = this.zzfyo.size();
            for (int i = 0; i < size; i++) {
                AbstractC2479<?> abstractC2479 = this.zzfyo.get(i);
                synchronized (abstractC2479) {
                    abstractC2479.f9813 = null;
                }
            }
            this.zzfyo.clear();
        }
        synchronized (this.zzfyk) {
            this.zzfyl = null;
        }
        zza(1, (int) null);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        InterfaceC2505 interfaceC2505;
        String str2;
        synchronized (this.mLock) {
            i = this.zzfyq;
            t = this.zzfyn;
        }
        synchronized (this.zzfyk) {
            interfaceC2505 = this.zzfyl;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) zzhj()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC2505 == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC2505.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzfyf > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzfyf;
            String format = simpleDateFormat.format(new Date(this.zzfyf));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzfye > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzfyd;
            printWriter.append((CharSequence) (i2 != 1 ? i2 != 2 ? String.valueOf(i2) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzfye;
            String format2 = simpleDateFormat.format(new Date(this.zzfye));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzfyh > 0) {
            PrintWriter append3 = printWriter.append((CharSequence) str).append("lastFailedStatus=");
            int i3 = this.zzfyg;
            switch (i3) {
                case -1:
                    str2 = "SUCCESS_CACHE";
                    break;
                case 0:
                    str2 = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("unknown status code: ");
                    sb3.append(i3);
                    str2 = sb3.toString();
                    break;
                case 2:
                    str2 = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str2 = "SERVICE_DISABLED";
                    break;
                case 4:
                    str2 = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str2 = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str2 = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str2 = "NETWORK_ERROR";
                    break;
                case 8:
                    str2 = "INTERNAL_ERROR";
                    break;
                case 10:
                    str2 = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str2 = "ERROR";
                    break;
                case 14:
                    str2 = "INTERRUPTED";
                    break;
                case 15:
                    str2 = "TIMEOUT";
                    break;
                case 16:
                    str2 = "CANCELED";
                    break;
                case 17:
                    str2 = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str2 = "DEAD_CLIENT";
                    break;
            }
            append3.append((CharSequence) str2);
            PrintWriter append4 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzfyh;
            String format3 = simpleDateFormat.format(new Date(this.zzfyh));
            StringBuilder sb4 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb4.append(j3);
            sb4.append(" ");
            sb4.append(format3);
            append4.println(sb4.toString());
        }
    }

    public Account getAccount() {
        return null;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zzall;
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzfyq == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            int i = this.zzfyq;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzfyg = connectionResult.f2855;
        this.zzfyh = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzfyd = i;
        this.zzfye = System.currentTimeMillis();
    }

    public final void zza(int i, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C2482(this, i)));
    }

    public void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2497(this, i, iBinder, bundle)));
    }

    public void zza(T t) {
        this.zzfyf = System.currentTimeMillis();
    }

    public void zza(InterfaceC2485 interfaceC2485) {
        C1687.m3726(interfaceC2485, "Connection progress callbacks cannot be null.");
        this.zzfym = interfaceC2485;
        zza(2, (int) null);
    }

    public final void zza(InterfaceC2485 interfaceC2485, int i, PendingIntent pendingIntent) {
        C1687.m3726(interfaceC2485, "Connection progress callbacks cannot be null.");
        this.zzfym = interfaceC2485;
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, this.zzfyx.get(), i, pendingIntent));
    }

    public void zza(InterfaceC2493 interfaceC2493) {
        interfaceC2493.m4519();
    }

    public final void zza(InterfaceC2506 interfaceC2506, Set<Scope> set) {
        Bundle zzaap = zzaap();
        zzz zzzVar = new zzz(this.zzfyt);
        zzzVar.f2865 = this.mContext.getPackageName();
        zzzVar.f2860 = zzaap;
        if (set != null) {
            zzzVar.f2862 = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (zzaay()) {
            zzzVar.f2868 = getAccount() != null ? getAccount() : new Account("<<default account>>", "com.google");
            if (interfaceC2506 != null) {
                zzzVar.f2866 = interfaceC2506.asBinder();
            }
        } else if (zzako()) {
            zzzVar.f2868 = getAccount();
        }
        zzzVar.f2863 = zzakl();
        try {
            try {
                synchronized (this.zzfyk) {
                    InterfaceC2505 interfaceC2505 = this.zzfyl;
                    if (interfaceC2505 != null) {
                        interfaceC2505.mo4515(new BinderC2483(this, this.zzfyx.get()), zzzVar);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                zza(8, (IBinder) null, (Bundle) null, this.zzfyx.get());
            }
        } catch (DeadObjectException unused2) {
            zzce(1);
        } catch (SecurityException e) {
            throw e;
        }
    }

    public Bundle zzaap() {
        return new Bundle();
    }

    public boolean zzaay() {
        return false;
    }

    public boolean zzabj() {
        return false;
    }

    public Bundle zzafi() {
        return null;
    }

    public boolean zzagg() {
        return true;
    }

    public final IBinder zzagh() {
        synchronized (this.zzfyk) {
            InterfaceC2505 interfaceC2505 = this.zzfyl;
            if (interfaceC2505 == null) {
                return null;
            }
            return interfaceC2505.asBinder();
        }
    }

    public final String zzagi() {
        C2477 c2477;
        if (!isConnected() || (c2477 = this.zzfyi) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c2477.f9809;
    }

    public String zzakh() {
        return "com.google.android.gms";
    }

    public final void zzakj() {
        int m4531 = this.zzfqc.m4531(this.mContext);
        if (m4531 == 0) {
            zza(new C2499(this));
        } else {
            zza(1, (int) null);
            zza(new C2499(this), m4531, (PendingIntent) null);
        }
    }

    public zzc[] zzakl() {
        return new zzc[0];
    }

    public final void zzakm() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T zzakn() {
        T t;
        synchronized (this.mLock) {
            if (this.zzfyq == 5) {
                throw new DeadObjectException();
            }
            zzakm();
            C1687.m3730(this.zzfyn != null, "Client is connected but service is null");
            t = this.zzfyn;
        }
        return t;
    }

    public boolean zzako() {
        return false;
    }

    public Set<Scope> zzakp() {
        return Collections.EMPTY_SET;
    }

    public final void zzce(int i) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.zzfyx.get(), i));
    }

    public abstract T zzd(IBinder iBinder);

    public abstract String zzhi();

    public abstract String zzhj();
}
