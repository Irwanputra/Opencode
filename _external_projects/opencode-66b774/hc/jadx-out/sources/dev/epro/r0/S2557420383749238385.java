package dev.epro.r0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S2557420383749238385 {
    public final Context a;
    public final L841391951668269384 b;
    public final U9296548531947164180 c;
    public final Activity d;
    public boolean e;
    public final U14177313425639231181 f;
    public final boolean g;

    public S2557420383749238385(Context context) {
        Object next;
        context.getClass();
        this.a = context;
        this.b = new L841391951668269384(this, new L11725228430494186389(this, (byte) 0));
        this.c = new U9296548531947164180(context, false);
        Iterator it = T2881242016550624223.D(context, new P16607035664026122700((byte) 20)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
        this.f = new U14177313425639231181(this, (byte) 2);
        this.g = true;
        G1840519957725232630 g1840519957725232630 = this.b.s;
        g1840519957725232630.a(new A10188109575003443817(g1840519957725232630));
        this.b.s.a(new V14103802012446701729(this.a));
        new O12494175665883759871(new L11725228430494186389(this, (byte) 1));
    }

    public final R14289894334981469490 a(String str) {
        Object objPrevious;
        str.getClass();
        L841391951668269384 l841391951668269384 = this.b;
        l841391951668269384.getClass();
        N11678082982039175888 n11678082982039175888 = l841391951668269384.f;
        ListIterator listIterator = n11678082982039175888.listIterator(n11678082982039175888.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            R14289894334981469490 r14289894334981469490 = (R14289894334981469490) objPrevious;
            if (r14289894334981469490.b.c(str, r14289894334981469490.c())) {
                break;
            }
        }
        R14289894334981469490 r142898943349814694902 = (R14289894334981469490) objPrevious;
        if (r142898943349814694902 != null) {
            return r142898943349814694902;
        }
        D11988991656201568495.n("No destination with route ", str, " is on the NavController's back stack. The current destination is ", l841391951668269384.g());
        return null;
    }

    public final void b(String str, F4096073349764486348 f4096073349764486348) {
        str.getClass();
        f4096073349764486348.getClass();
        L841391951668269384 l841391951668269384 = this.b;
        l841391951668269384.getClass();
        X4698849316906551159 x4698849316906551159G = E12775674050813925581.G(f4096073349764486348);
        if (l841391951668269384.c == null) {
            D11988991656201568495.t("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", l841391951668269384, ".");
            return;
        }
        Q4132023691817090890 q4132023691817090890I = l841391951668269384.i();
        W6610499404761400913 w6610499404761400913K = q4132023691817090890I.k(str, true, q4132023691817090890I);
        if (w6610499404761400913K == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + l841391951668269384.c);
        }
        V7801742040189616406 v7801742040189616406 = w6610499404761400913K.a;
        Bundle bundleA = v7801742040189616406.a(w6610499404761400913K.b);
        if (bundleA == null) {
            bundleA = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
        }
        int i = V7801742040189616406.e;
        String str2 = (String) v7801742040189616406.b.e;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        l841391951668269384.k(v7801742040189616406, bundleA, x4698849316906551159G);
    }

    public final void c() {
        L841391951668269384 l841391951668269384 = this.b;
        if (l841391951668269384.f.isEmpty()) {
            return;
        }
        V7801742040189616406 v7801742040189616406G = l841391951668269384.g();
        v7801742040189616406G.getClass();
        if (l841391951668269384.l(v7801742040189616406G.b.a, true, false)) {
            l841391951668269384.b();
        }
    }
}
