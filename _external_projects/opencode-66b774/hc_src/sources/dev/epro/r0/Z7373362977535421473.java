package dev.epro.r0;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z7373362977535421473 extends L14144435763408236280 implements U11179075180450893832, R3599537314284374589 {
    public static final X14609209722283718243 q = H13034164283484737334.a;
    public final Context j;
    public final Handler k;
    public final X14609209722283718243 l;
    public final Set m;
    public final B16853324304735504143 n;

    /* renamed from: o, reason: collision with root package name */
    public D1932759943349054292 f606o;
    public N3336634644320470588 p;

    public Z7373362977535421473(Context context, R502132765509599220 r502132765509599220, B16853324304735504143 b16853324304735504143) {
        super((byte) 2);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.j = context;
        this.k = r502132765509599220;
        this.n = b16853324304735504143;
        this.m = (Set) b16853324304735504143.b;
        this.l = q;
    }

    @Override // dev.epro.r0.U11179075180450893832
    public final void onConnected() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        D1932759943349054292 d1932759943349054292 = this.f606o;
        d1932759943349054292.getClass();
        boolean z = false;
        try {
            try {
                d1932759943349054292.d.getClass();
                Account account = new Account("<<default account>>", "com.google");
                try {
                    if ("<<default account>>".equals(account.name)) {
                        Context context = d1932759943349054292.getContext();
                        ReentrantLock reentrantLock = I5368486357706170169.c;
                        M18113111391818111737.v(context);
                        ReentrantLock reentrantLock2 = I5368486357706170169.c;
                        reentrantLock2.lock();
                        try {
                            I5368486357706170169 i5368486357706170169 = I5368486357706170169.d;
                            if (i5368486357706170169 == null) {
                                i5368486357706170169 = new I5368486357706170169(context.getApplicationContext());
                                I5368486357706170169.d = i5368486357706170169;
                            }
                            reentrantLock2.unlock();
                            String a = i5368486357706170169.a("defaultGoogleSignInAccount");
                            if (!TextUtils.isEmpty(a)) {
                                StringBuilder sb = new StringBuilder(20 + String.valueOf(a).length());
                                sb.append("googleSignInAccount:");
                                sb.append(a);
                                String a2 = i5368486357706170169.a(sb.toString());
                                if (a2 != null) {
                                    try {
                                        googleSignInAccount = GoogleSignInAccount.a(a2);
                                    } catch (JSONException unused) {
                                    }
                                    Integer num = d1932759943349054292.f;
                                    M18113111391818111737.v(num);
                                    X14549083928103405288 x14549083928103405288 = new X14549083928103405288(2, account, num.intValue(), googleSignInAccount);
                                    Y4437331984189589023 y4437331984189589023 = (Y4437331984189589023) d1932759943349054292.getService();
                                    obtain = Parcel.obtain();
                                    obtain.writeInterfaceToken(y4437331984189589023.c);
                                    int i = P5711368119050701608.a;
                                    obtain.writeInt(1);
                                    int A = C468629748621011703.A(obtain, 20293);
                                    C468629748621011703.z(obtain, 1, 4);
                                    obtain.writeInt(1);
                                    C468629748621011703.u(obtain, 2, x14549083928103405288, 0);
                                    C468629748621011703.D(obtain, A);
                                    obtain.writeStrongBinder(this);
                                    obtain2 = Parcel.obtain();
                                    y4437331984189589023.b.transact(12, obtain, obtain2, 0);
                                    obtain2.readException();
                                    obtain.recycle();
                                    obtain2.recycle();
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                    y4437331984189589023.b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain.recycle();
                    obtain2.recycle();
                    return;
                } catch (Throwable th2) {
                    obtain.recycle();
                    obtain2.recycle();
                    throw th2;
                }
                googleSignInAccount = null;
                Integer num2 = d1932759943349054292.f;
                M18113111391818111737.v(num2);
                X14549083928103405288 x145490839281034052882 = new X14549083928103405288(2, account, num2.intValue(), googleSignInAccount);
                Y4437331984189589023 y44373319841895890232 = (Y4437331984189589023) d1932759943349054292.getService();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(y44373319841895890232.c);
                int i2 = P5711368119050701608.a;
                obtain.writeInt(1);
                int A2 = C468629748621011703.A(obtain, 20293);
                C468629748621011703.z(obtain, 1, 4);
                obtain.writeInt(1);
                C468629748621011703.u(obtain, 2, x145490839281034052882, 0);
                C468629748621011703.D(obtain, A2);
                obtain.writeStrongBinder(this);
                obtain2 = Parcel.obtain();
            } catch (RemoteException unused2) {
                this.k.post(new I3863025946240164840((Object) this, (Object) new M11771061850939231904(1, new B6867906687934285025(8, null, null), null), z, (byte) 19));
            }
        } catch (RemoteException unused3) {
        }
    }

    @Override // dev.epro.r0.R3599537314284374589
    public final void onConnectionFailed(B6867906687934285025 b6867906687934285025) {
        this.p.a(b6867906687934285025);
    }

    @Override // dev.epro.r0.U11179075180450893832
    public final void onConnectionSuspended(int i) {
        this.f606o.disconnect();
    }
}
