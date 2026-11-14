package dev.epro.r0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E138661690457992157 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    static {
        izmyclvb.oeynnivvrnts0(206);
    }

    public /* synthetic */ E138661690457992157(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        byte b;
        boolean z;
        F6353700998356592239 f6353700998356592239 = (F6353700998356592239) this.b;
        X5127101262035123109 x5127101262035123109 = (X5127101262035123109) this.c;
        N12253737202470468561 n12253737202470468561 = (N12253737202470468561) f6353700998356592239.b;
        n12253737202470468561.getClass();
        T4643696886244492064 t4643696886244492064 = x5127101262035123109.a;
        String str = t4643696886244492064.a;
        ArrayList arrayList = new ArrayList();
        L16425900549479658727 l16425900549479658727 = (L16425900549479658727) n12253737202470468561.e.p(new N8306548196372912291(new L14212451929911798515(n12253737202470468561, arrayList, str, (byte) 2), (byte) 6));
        if (l16425900549479658727 == null) {
            B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
            t4643696886244492064.toString();
            b14824868959299866349N.getClass();
            n12253737202470468561.d.d.execute(new Q9622116641457785369(n12253737202470468561, t4643696886244492064, (byte) 12));
            return;
        }
        synchronized (n12253737202470468561.k) {
            try {
                synchronized (n12253737202470468561.k) {
                    b = 1;
                    z = n12253737202470468561.c(str) != null;
                }
                if (z) {
                    Set set = (Set) n12253737202470468561.h.get(str);
                    if (((X5127101262035123109) set.iterator().next()).a.b == t4643696886244492064.b) {
                        set.add(x5127101262035123109);
                        B14824868959299866349 b14824868959299866349N2 = B14824868959299866349.n();
                        t4643696886244492064.toString();
                        b14824868959299866349N2.getClass();
                    } else {
                        n12253737202470468561.d.d.execute(new Q9622116641457785369(n12253737202470468561, t4643696886244492064, (byte) 12));
                    }
                    return;
                }
                if (l16425900549479658727.t != t4643696886244492064.b) {
                    n12253737202470468561.d.d.execute(new Q9622116641457785369(n12253737202470468561, t4643696886244492064, (byte) 12));
                    return;
                }
                Context context = n12253737202470468561.b;
                W1977247516027959386 w1977247516027959386 = n12253737202470468561.c;
                Q13914734507241918864 q13914734507241918864 = n12253737202470468561.d;
                WorkDatabase workDatabase = n12253737202470468561.e;
                context.getClass();
                w1977247516027959386.getClass();
                n12253737202470468561.getClass();
                R6320827706769103704 r6320827706769103704 = new R6320827706769103704();
                r6320827706769103704.b = w1977247516027959386;
                r6320827706769103704.c = q13914734507241918864;
                r6320827706769103704.d = n12253737202470468561;
                r6320827706769103704.e = workDatabase;
                r6320827706769103704.f = l16425900549479658727;
                r6320827706769103704.g = arrayList;
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                r6320827706769103704.a = applicationContext;
                H1239233717680269921 h1239233717680269921 = new H1239233717680269921(r6320827706769103704);
                D11883231851729262595 d11883231851729262595 = h1239233717680269921.d.b;
                R5692663580087387669 r5692663580087387669K = J8045362843799184672.k();
                d11883231851729262595.getClass();
                G5920303990939058292 g5920303990939058292A = B5998207562248239613.A(S10823041268949770285.O(d11883231851729262595, r5692663580087387669K), new L228777635120727709(h1239233717680269921, null, b));
                g5920303990939058292A.b.a(new E138661690457992157(n12253737202470468561, g5920303990939058292A, h1239233717680269921, (byte) 7), n12253737202470468561.d.d);
                n12253737202470468561.g.put(str, h1239233717680269921);
                HashSet hashSet = new HashSet();
                hashSet.add(x5127101262035123109);
                n12253737202470468561.h.put(str, hashSet);
                B14824868959299866349 b14824868959299866349N3 = B14824868959299866349.n();
                t4643696886244492064.toString();
                b14824868959299866349N3.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
