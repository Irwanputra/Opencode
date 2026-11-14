package dev.epro.r0;

import ads_mobile_sdk.f01;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.chromium.net.InlineExecutionProhibitedException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F16393152783805540385 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ F16393152783805540385(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        Object obj = null;
        switch (this.a) {
            case 0:
                if (Thread.currentThread() == ((Thread) this.c)) {
                    this.d = new InlineExecutionProhibitedException();
                    return;
                } else {
                    ((Runnable) this.b).run();
                    return;
                }
            case 1:
                try {
                    obj = ((Q17938270031678740860) this.b).call();
                } catch (Exception unused) {
                }
                ((Handler) this.d).post(new I3863025946240164840((S9315175385921259790) this.c, obj, (byte) 13));
                return;
            case 2:
                H7219028874700587498 h7219028874700587498 = (H7219028874700587498) this.b;
                try {
                    J8045362843799184672.r0(h7219028874700587498.e.minusKey(T13350664027331345869.s), new O12152244488187446230((J196785984016436306) this.c, h7219028874700587498, (J14057654040986470873) this.d, null, (byte) 16));
                    return;
                } catch (Throwable th) {
                    h7219028874700587498.k(th);
                    return;
                }
            case 3:
                String str = (String) this.b;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String str2 = (String) this.c;
                final String lowerCase = str.toLowerCase();
                if (TextUtils.isEmpty(str2)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (JSONException unused2) {
                        return;
                    }
                }
                final JSONObject jSONObject2 = jSONObject;
                Y14924988016309632925[] y14924988016309632925Arr = (Y14924988016309632925[]) this.d;
                jSONObject2.toString();
                for (final Y14924988016309632925 y14924988016309632925 : y14924988016309632925Arr) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: dev.epro.r0.P8953139822787522472
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(Y14924988016309632925.this.g(lowerCase, jSONObject2));
                        }
                    });
                    y14924988016309632925.f().execute(futureTask);
                    try {
                    } catch (InterruptedException unused3) {
                    } catch (ExecutionException e) {
                        e.getCause();
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
                return;
            case 4:
                Bundle bundle = (Bundle) this.c;
                V9493494307739248620 v9493494307739248620 = (V9493494307739248620) this.b;
                X17317415102512733138 x17317415102512733138 = (X17317415102512733138) this.d;
                try {
                    P17112279574965248524 p17112279574965248524 = v9493494307739248620.a;
                    if (p17112279574965248524 == null) {
                        throw null;
                    }
                    E16253938867888995076 e16253938867888995076 = (E16253938867888995076) ((IInterface) p17112279574965248524.j);
                    if (e16253938867888995076 == null) {
                        return;
                    }
                    R14018015077011593505 r14018015077011593505 = (R14018015077011593505) e16253938867888995076;
                    Parcel c = r14018015077011593505.c();
                    int i = H15787954015490686430.a;
                    c.writeInt(1);
                    bundle.writeToParcel(c, 0);
                    c.writeStrongBinder(x17317415102512733138);
                    r14018015077011593505.d(c, 1);
                    return;
                } catch (RemoteException unused4) {
                    return;
                }
            case 5:
                O11692414993408430441 o11692414993408430441 = (O11692414993408430441) this.b;
                O16666702949169506062 o16666702949169506062 = (O16666702949169506062) this.c;
                Y16414919402539525744 y16414919402539525744 = (Y16414919402539525744) this.d;
                ((Handler) o11692414993408430441.b).post(new U3594978070141619353((Object) o16666702949169506062, (byte) 23));
                if (y16414919402539525744.b != 2) {
                    ((G15068739404623149094) o11692414993408430441.e).a();
                    return;
                }
                return;
            default:
                R2847330884077978889 r2847330884077978889 = (R2847330884077978889) this.b;
                List<B2825725843028148090> list = (List) this.c;
                f01 f01Var = (f01) this.d;
                try {
                    T8664623300549140039 t8664623300549140039 = (T8664623300549140039) ((IInterface) r2847330884077978889.b.j);
                    if (t8664623300549140039 == null) {
                        return;
                    }
                    String packageName = r2847330884077978889.a.getPackageName();
                    ArrayList arrayList = new ArrayList();
                    for (B2825725843028148090 b2825725843028148090 : list) {
                        String str3 = b2825725843028148090.a;
                        arrayList.add(new T9787743509987680105(str3, C468629748621011703.C(str3, b2825725843028148090.b, b2825725843028148090.c).toString(), b2825725843028148090.d));
                    }
                    H3351639798230113779 h3351639798230113779 = new H3351639798230113779(r2847330884077978889, f01Var);
                    V18155119740721705968 v18155119740721705968 = (V18155119740721705968) t8664623300549140039;
                    Parcel c2 = v18155119740721705968.c();
                    c2.writeString(packageName);
                    c2.writeTypedList(arrayList);
                    int i2 = H15787954015490686430.a;
                    c2.writeStrongBinder(h3351639798230113779);
                    v18155119740721705968.d(c2, 1);
                    return;
                } catch (DeadObjectException | RemoteException unused5) {
                    return;
                }
        }
    }

    public /* synthetic */ F16393152783805540385() {
        this.a = (byte) 1;
    }

    public F16393152783805540385(Runnable runnable, Thread thread) {
        this.a = (byte) 0;
        this.b = runnable;
        this.c = thread;
    }
}
