package dev.epro.r0;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class R11411706056986754302 extends E1636901823844057514 implements N2113054325721141872 {
    public final Set b;

    /* JADX WARN: Illegal instructions before constructor call */
    public R11411706056986754302(Context context, Looper looper, int i, B16853324304735504143 b16853324304735504143, U11179075180450893832 u11179075180450893832, R3599537314284374589 r3599537314284374589) {
        K4690422250417820120 k4690422250417820120A = K4690422250417820120.a(context);
        X11123940576545591343 x11123940576545591343 = X11123940576545591343.d;
        M18113111391818111737.v(u11179075180450893832);
        M18113111391818111737.v(r3599537314284374589);
        super(context, looper, k4690422250417820120A, x11123940576545591343, i, new M204440408817344908(u11179075180450893832, (byte) 9), new M204440408817344908(r3599537314284374589, (byte) 10), (String) b16853324304735504143.e);
        Set set = (Set) b16853324304735504143.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                S10973172697741180971.m("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.b = set;
    }

    @Override // dev.epro.r0.N2113054325721141872
    public final Set a() {
        return requiresSignIn() ? this.b : Collections.EMPTY_SET;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final Account getAccount() {
        return null;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final Set getScopes() {
        return this.b;
    }
}
