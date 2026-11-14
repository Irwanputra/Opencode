package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class E138661690457992157 implements java.lang.Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(206);
    }

    public /* synthetic */ E138661690457992157(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        boolean z;
        dev.epro.r0.F6353700998356592239 f6353700998356592239 = (dev.epro.r0.F6353700998356592239) this.b;
        dev.epro.r0.X5127101262035123109 x5127101262035123109 = (dev.epro.r0.X5127101262035123109) this.c;
        dev.epro.r0.N12253737202470468561 n12253737202470468561 = (dev.epro.r0.N12253737202470468561) f6353700998356592239.b;
        n12253737202470468561.getClass();
        dev.epro.r0.T4643696886244492064 t4643696886244492064 = x5127101262035123109.a;
        java.lang.String str = t4643696886244492064.a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dev.epro.r0.L16425900549479658727 l16425900549479658727 = (dev.epro.r0.L16425900549479658727) n12253737202470468561.e.p(new dev.epro.r0.N8306548196372912291(new dev.epro.r0.L14212451929911798515(n12253737202470468561, arrayList, str, (byte) 2), (byte) 6));
        if (l16425900549479658727 == null) {
            dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
            t4643696886244492064.toString();
            b14824868959299866349N.getClass();
            n12253737202470468561.d.d.execute(new dev.epro.r0.Q9622116641457785369(n12253737202470468561, t4643696886244492064, (byte) 12));
            return;
        }
        synchronized (n12253737202470468561.k) {
            try {
                synchronized (n12253737202470468561.k) {
                    z = n12253737202470468561.c(str) != null;
                }
                if (z) {
                    java.util.Set set = (java.util.Set) n12253737202470468561.h.get(str);
                    if (((dev.epro.r0.X5127101262035123109) set.iterator().next()).a.b == t4643696886244492064.b) {
                        set.add(x5127101262035123109);
                        dev.epro.r0.B14824868959299866349 b14824868959299866349N2 = dev.epro.r0.B14824868959299866349.n();
                        t4643696886244492064.toString();
                        b14824868959299866349N2.getClass();
                    } else {
                        n12253737202470468561.d.d.execute(new dev.epro.r0.Q9622116641457785369(n12253737202470468561, t4643696886244492064, (byte) 12));
                    }
                    return;
                }
                if (l16425900549479658727.t != t4643696886244492064.b) {
                    n12253737202470468561.d.d.execute(new dev.epro.r0.Q9622116641457785369(n12253737202470468561, t4643696886244492064, (byte) 12));
                    return;
                }
                android.content.Context context = n12253737202470468561.b;
                dev.epro.r0.W1977247516027959386 w1977247516027959386 = n12253737202470468561.c;
                dev.epro.r0.Q13914734507241918864 q13914734507241918864 = n12253737202470468561.d;
                androidx.work.impl.WorkDatabase workDatabase = n12253737202470468561.e;
                context.getClass();
                w1977247516027959386.getClass();
                n12253737202470468561.getClass();
                dev.epro.r0.R6320827706769103704 r6320827706769103704 = new dev.epro.r0.R6320827706769103704();
                r6320827706769103704.b = w1977247516027959386;
                r6320827706769103704.c = q13914734507241918864;
                r6320827706769103704.d = n12253737202470468561;
                r6320827706769103704.e = workDatabase;
                r6320827706769103704.f = l16425900549479658727;
                r6320827706769103704.g = arrayList;
                android.content.Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                r6320827706769103704.a = applicationContext;
                dev.epro.r0.H1239233717680269921 h1239233717680269921 = new dev.epro.r0.H1239233717680269921(r6320827706769103704);
                dev.epro.r0.D11883231851729262595 d11883231851729262595 = h1239233717680269921.d.b;
                dev.epro.r0.R5692663580087387669 r5692663580087387669K = dev.epro.r0.J8045362843799184672.k();
                d11883231851729262595.getClass();
                dev.epro.r0.G5920303990939058292 g5920303990939058292A = dev.epro.r0.B5998207562248239613.A(dev.epro.r0.S10823041268949770285.O(d11883231851729262595, r5692663580087387669K), new dev.epro.r0.L228777635120727709(h1239233717680269921, (dev.epro.r0.R4833348786910499294) null, (byte) 1));
                g5920303990939058292A.b.a(new dev.epro.r0.E138661690457992157(n12253737202470468561, g5920303990939058292A, h1239233717680269921, (byte) 7), n12253737202470468561.d.d);
                n12253737202470468561.g.put(str, h1239233717680269921);
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(x5127101262035123109);
                n12253737202470468561.h.put(str, hashSet);
                dev.epro.r0.B14824868959299866349 b14824868959299866349N3 = dev.epro.r0.B14824868959299866349.n();
                t4643696886244492064.toString();
                b14824868959299866349N3.getClass();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
