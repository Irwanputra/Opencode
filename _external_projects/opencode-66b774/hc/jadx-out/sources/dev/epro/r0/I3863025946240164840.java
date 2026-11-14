package dev.epro.r0;

import ads_mobile_sdk.c7;
import ads_mobile_sdk.ga3;
import ads_mobile_sdk.qm1;
import ads_mobile_sdk.s7;
import ads_mobile_sdk.sh3;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import android.view.WindowManager;
import com.trilead.ssh2.Connection;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I3863025946240164840 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public I3863025946240164840(F4673815160636847046 f4673815160636847046, int i, int i2, Bundle bundle) {
        this.a = (byte) 8;
        this.c = f4673815160636847046;
        this.b = bundle;
    }

    private final void a() {
        try {
            ((Runnable) this.c).run();
            synchronized (((V15499216873564893116) this.b).d) {
                ((V15499216873564893116) this.b).a();
            }
        } catch (Throwable th) {
            synchronized (((V15499216873564893116) this.b).d) {
                ((V15499216873564893116) this.b).a();
                throw th;
            }
        }
    }

    private final void b() {
        L16425900549479658727 l16425900549479658727;
        N12253737202470468561 n12253737202470468561 = ((Y13568929412073945273) this.c).a.f;
        String str = (String) this.b;
        synchronized (n12253737202470468561.k) {
            try {
                H1239233717680269921 h1239233717680269921C = n12253737202470468561.c(str);
                l16425900549479658727 = h1239233717680269921C != null ? h1239233717680269921C.a : null;
            } finally {
            }
        }
        if (l16425900549479658727 == null || S10823041268949770285.t(K13184022901285147448.j, l16425900549479658727.j)) {
            return;
        }
        synchronized (((Y13568929412073945273) this.c).c) {
            ((Y13568929412073945273) this.c).f.put(Q9282725956684299602.k(l16425900549479658727), l16425900549479658727);
            Y13568929412073945273 y13568929412073945273 = (Y13568929412073945273) this.c;
            ((Y13568929412073945273) this.c).g.put(Q9282725956684299602.k(l16425900549479658727), T975435490942095199.a(y13568929412073945273.h, l16425900549479658727, y13568929412073945273.b.b, y13568929412073945273));
        }
    }

    private final void c() {
        P17112279574965248524 p17112279574965248524 = (P17112279574965248524) this.b;
        Runnable runnable = (Runnable) this.c;
        if (((IInterface) p17112279574965248524.j) != null || p17112279574965248524.a) {
            if (!p17112279574965248524.a) {
                runnable.run();
                return;
            }
            ArrayList arrayList = (ArrayList) p17112279574965248524.d;
            synchronized (arrayList) {
                arrayList.add(runnable);
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) p17112279574965248524.d;
        synchronized (arrayList2) {
            arrayList2.add(runnable);
        }
        P16318072974459194610 p16318072974459194610 = new P16318072974459194610(p17112279574965248524);
        p17112279574965248524.i = p16318072974459194610;
        p17112279574965248524.a = true;
        if (((Context) p17112279574965248524.c).bindService((Intent) p17112279574965248524.f, p16318072974459194610, 65)) {
            return;
        }
        p17112279574965248524.a = false;
        ArrayList arrayList3 = (ArrayList) p17112279574965248524.d;
        synchronized (arrayList3) {
            arrayList3.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            dev.epro.r0.P16318072974459194610 r0 = (dev.epro.r0.P16318072974459194610) r0
            java.lang.Object r1 = r0.b
            dev.epro.r0.P17112279574965248524 r1 = (dev.epro.r0.P17112279574965248524) r1
            java.lang.Object r2 = r1.g
            dev.epro.r0.P5733283974459951585 r2 = (dev.epro.r0.P5733283974459951585) r2
            java.lang.Object r7 = r7.c
            android.os.IBinder r7 = (android.os.IBinder) r7
            byte r2 = r2.a
            r3 = 3
            r4 = 0
            switch(r2) {
                case 17: goto L30;
                default: goto L17;
            }
        L17:
            int r2 = dev.epro.r0.M17162186110215363482.j
            java.lang.String r2 = "com.google.android.play.core.hsdp.protocol.IHsdpService"
            if (r7 != 0) goto L1f
        L1d:
            r5 = r4
            goto L47
        L1f:
            android.os.IInterface r5 = r7.queryLocalInterface(r2)
            boolean r6 = r5 instanceof dev.epro.r0.T8664623300549140039
            if (r6 == 0) goto L2a
            dev.epro.r0.T8664623300549140039 r5 = (dev.epro.r0.T8664623300549140039) r5
            goto L47
        L2a:
            dev.epro.r0.V18155119740721705968 r5 = new dev.epro.r0.V18155119740721705968
            r5.<init>(r7, r2, r3)
            goto L47
        L30:
            int r2 = dev.epro.r0.O1141021239057409612.j
            java.lang.String r2 = "com.google.android.play.core.hsdp.protocol.IHpoaService"
            if (r7 != 0) goto L37
            goto L1d
        L37:
            android.os.IInterface r5 = r7.queryLocalInterface(r2)
            boolean r6 = r5 instanceof dev.epro.r0.E16253938867888995076
            if (r6 == 0) goto L42
            dev.epro.r0.E16253938867888995076 r5 = (dev.epro.r0.E16253938867888995076) r5
            goto L47
        L42:
            dev.epro.r0.R14018015077011593505 r5 = new dev.epro.r0.R14018015077011593505
            r5.<init>(r7, r2, r3)
        L47:
            android.os.IInterface r5 = (android.os.IInterface) r5
            r1.j = r5
            java.lang.Object r7 = r1.e
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L53:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r7.next()
            dev.epro.r0.R2847330884077978889 r2 = (dev.epro.r0.R2847330884077978889) r2
            r2.getClass()
            goto L53
        L63:
            r7 = 0
            java.lang.Object r2 = r1.j     // Catch: android.os.RemoteException -> L77
            android.os.IInterface r2 = (android.os.IInterface) r2     // Catch: android.os.RemoteException -> L77
            if (r2 == 0) goto L76
            android.os.IBinder r2 = r2.asBinder()     // Catch: android.os.RemoteException -> L77
            java.lang.Object r1 = r1.h     // Catch: android.os.RemoteException -> L77
            dev.epro.r0.D1811628803814760955 r1 = (dev.epro.r0.D1811628803814760955) r1     // Catch: android.os.RemoteException -> L77
            r2.linkToDeath(r1, r7)     // Catch: android.os.RemoteException -> L77
            goto L77
        L76:
            throw r4     // Catch: android.os.RemoteException -> L77
        L77:
            java.lang.Object r0 = r0.b
            dev.epro.r0.P17112279574965248524 r0 = (dev.epro.r0.P17112279574965248524) r0
            r0.a = r7
            java.lang.Object r1 = r0.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.d     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L98
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L98
        L8a:
            if (r7 >= r3) goto L9a
            java.lang.Object r4 = r2.get(r7)     // Catch: java.lang.Throwable -> L98
            int r7 = r7 + 1
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L98
            r4.run()     // Catch: java.lang.Throwable -> L98
            goto L8a
        L98:
            r7 = move-exception
            goto La3
        L9a:
            java.lang.Object r7 = r0.d     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L98
            r7.clear()     // Catch: java.lang.Throwable -> L98
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
            return
        La3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I3863025946240164840.d():void");
    }

    private final void e() {
        boolean zBooleanValue;
        A4716120536771319554 a4716120536771319554 = (A4716120536771319554) this.b;
        String str = (String) this.c;
        synchronized (E686369837194379706.class) {
            Boolean bool = E686369837194379706.a;
            if (bool == null) {
                try {
                    a4716120536771319554.evaluateJavascript("(function(){})()", null);
                    bool = Boolean.TRUE;
                    E686369837194379706.a = bool;
                } catch (IllegalStateException unused) {
                    bool = Boolean.FALSE;
                    E686369837194379706.a = bool;
                }
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (zBooleanValue) {
            a4716120536771319554.evaluateJavascript(str, null);
        } else {
            a4716120536771319554.loadUrl("javascript:".concat(str));
        }
    }

    private final void f() {
        synchronized (((I6845661640435175914) this.c).c) {
            ((P7827270438547540384) ((I6845661640435175914) this.c).d).onComplete((S14461012662136963693) this.b);
        }
    }

    private final void g() {
        synchronized (((I6845661640435175914) this.c).c) {
            I6845661640435175914 i6845661640435175914 = (I6845661640435175914) ((I6845661640435175914) this.c).d;
            Exception excB = ((S14461012662136963693) this.b).b();
            M18113111391818111737.v(excB);
            i6845661640435175914.b(excB);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = dev.epro.r0.X14397327929232388191.f;
        r4 = java.util.logging.Level.SEVERE;
        java.util.Objects.toString((java.lang.Runnable) r10.b);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L58
            dev.epro.r0.X14397327929232388191 r2 = (dev.epro.r0.X14397327929232388191) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            dev.epro.r0.X14397327929232388191 r0 = (dev.epro.r0.X14397327929232388191) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L6e
        L22:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            dev.epro.r0.X14397327929232388191 r4 = (dev.epro.r0.X14397327929232388191) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.c     // Catch: java.lang.Throwable -> L20
            dev.epro.r0.X14397327929232388191 r10 = (dev.epro.r0.X14397327929232388191) r10     // Catch: java.lang.Throwable -> L20
            r10.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L70
        L5a:
            r0 = move-exception
            goto L6b
        L5c:
            java.util.logging.Logger r3 = dev.epro.r0.X14397327929232388191.f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r4 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L5a
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L5a
            r3.getClass()     // Catch: java.lang.Throwable -> L5a
            goto L55
        L6b:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L6e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L70:
            if (r1 == 0) goto L79
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L79:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I3863025946240164840.h():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        S17787728937930228535 s17787728937930228535;
        W15728808418604800610 w15728808418604800610;
        W15728808418604800610 t8731205310522354167;
        byte b = 16;
        int i = 0;
        switch (this.a) {
            case 0:
                c7 c7Var = (c7) this.c;
                I13152720973475179368 i13152720973475179368 = (I13152720973475179368) this.b;
                Throwable thN = i13152720973475179368.n();
                if (thN != null) {
                    c7Var.onFailure(thN);
                    return;
                }
                try {
                    Object objF = M9216324016624295870.F(i13152720973475179368);
                    switch (c7Var.d) {
                        case 8:
                            K17751841687800543607 k17751841687800543607 = (K17751841687800543607) objF;
                            qm1 qm1Var = ((ga3) c7Var.a).c;
                            synchronized (qm1Var.n) {
                                L6589127411573323482 l6589127411573323482 = qm1Var.q;
                                String strB = k17751841687800543607.b();
                                l6589127411573323482.b();
                                ((s7) l6589127411573323482.b).b(strB);
                                break;
                            }
                            return;
                        default:
                            ((sh3) c7Var.a).a();
                            return;
                    }
                } catch (Error e) {
                    e = e;
                    c7Var.onFailure(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    c7Var.onFailure(e);
                    return;
                } catch (ExecutionException e3) {
                    c7Var.onFailure(e3.getCause());
                    return;
                }
            case 1:
                H10500197361170225543 h10500197361170225543 = (H10500197361170225543) this.b;
                T1878852318042345820 t1878852318042345820 = (T1878852318042345820) this.c;
                T8605657386197958581 t8605657386197958581 = t1878852318042345820.c;
                if (t8605657386197958581 != null && (s17787728937930228535 = t8605657386197958581.e) != null) {
                    s17787728937930228535.f(t8605657386197958581);
                }
                View view = (View) t1878852318042345820.h;
                if (view != null && view.getWindowToken() != null) {
                    if (h10500197361170225543.b()) {
                        t1878852318042345820.s = h10500197361170225543;
                    } else if (h10500197361170225543.e != null) {
                        h10500197361170225543.d(0, 0, false, false);
                        t1878852318042345820.s = h10500197361170225543;
                    }
                }
                t1878852318042345820.u = null;
                return;
            case 2:
                ((A6652734277159111577) this.b).a = this.c;
                return;
            case 3:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((A6652734277159111577) this.c);
                return;
            case 4:
                Object obj = this.c;
                Object obj2 = this.b;
                try {
                    Method method = N6190736363796470908.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        N6190736363796470908.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                M9197813449740923653 m9197813449740923653 = (M9197813449740923653) this.b;
                Typeface typeface = (Typeface) this.c;
                I15162792415829416729 i15162792415829416729 = (I15162792415829416729) m9197813449740923653.b;
                if (i15162792415829416729 != null) {
                    i15162792415829416729.k(typeface);
                    return;
                }
                return;
            case 6:
                synchronized (((L18233974379278055712) this.b)) {
                    try {
                        L18233974379278055712 l18233974379278055712 = (L18233974379278055712) this.b;
                        if (l18233974379278055712.b) {
                            return;
                        }
                        l18233974379278055712.c = true;
                        ((Connection) this.c).d(new SocketTimeoutException("The connect timeout expired"));
                        return;
                    } finally {
                    }
                }
            case 7:
                ((F4673815160636847046) this.c).b.onRelationshipValidationResult((Uri) this.b);
                return;
            case 8:
                ((F4673815160636847046) this.c).b.onActivityResized((Bundle) this.b);
                return;
            case 9:
                B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
                int i2 = F4784789088091152965.d;
                L16425900549479658727 l16425900549479658727 = (L16425900549479658727) this.b;
                b14824868959299866349N.getClass();
                ((F4784789088091152965) this.c).a.b(l16425900549479658727);
                return;
            case 10:
                ((H7219028874700587498) this.b).D((N10515736137377992627) this.c);
                return;
            case 11:
                B73407611111492471 b73407611111492471 = (B73407611111492471) this.c;
                D11883231851729262595 d11883231851729262595 = b73407611111492471.d;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th) {
                        C9869900372345142877.I(I3826119971291161142.a, th);
                    }
                    Runnable runnableD = b73407611111492471.D();
                    if (runnableD == null) {
                        return;
                    }
                    this.b = runnableD;
                    i++;
                    if (i >= 16 && d11883231851729262595.B(b73407611111492471)) {
                        d11883231851729262595.z(b73407611111492471, this);
                        return;
                    }
                    break;
                }
                break;
            case 12:
                ((O3606826322388932410) this.b).i((F14416013867653465450) this.c, O9245300239821758723.a);
                return;
            case 13:
                ((S9315175385921259790) this.b).accept(this.c);
                return;
            case 14:
                ((H7219028874700587498) this.c).D((N18249742966722306189) this.b);
                return;
            case 15:
                try {
                    h();
                    return;
                } catch (Error e5) {
                    synchronized (((X14397327929232388191) this.c).b) {
                        ((X14397327929232388191) this.c).c = 1;
                        throw e5;
                    }
                }
            case 16:
                a();
                return;
            case 17:
                b();
                return;
            case 18:
                B6867906687934285025 b6867906687934285025 = (B6867906687934285025) this.b;
                N3336634644320470588 n3336634644320470588 = (N3336634644320470588) this.c;
                N2113054325721141872 n2113054325721141872 = (N2113054325721141872) n3336634644320470588.b;
                Z102412548944701279 z102412548944701279 = (Z102412548944701279) ((X12014589167171900524) n3336634644320470588.f).j.get((H9807528374655572032) n3336634644320470588.c);
                if (z102412548944701279 == null) {
                    return;
                }
                if (b6867906687934285025.e != 0) {
                    z102412548944701279.l(b6867906687934285025, null);
                    return;
                }
                n3336634644320470588.a = true;
                if (n2113054325721141872.requiresSignIn()) {
                    if (!n3336634644320470588.a || (w15728808418604800610 = (W15728808418604800610) n3336634644320470588.d) == null) {
                        return;
                    }
                    n2113054325721141872.getRemoteService(w15728808418604800610, (Set) n3336634644320470588.e);
                    return;
                }
                try {
                    n2113054325721141872.getRemoteService(null, n2113054325721141872.a());
                    return;
                } catch (SecurityException unused2) {
                    n2113054325721141872.disconnect("Failed to get service from broker.");
                    z102412548944701279.l(new B6867906687934285025(10, null, null), null);
                    return;
                }
            case 19:
                Z7373362977535421473 z7373362977535421473 = (Z7373362977535421473) this.c;
                M11771061850939231904 m11771061850939231904 = (M11771061850939231904) this.b;
                B6867906687934285025 b68679066879342850252 = m11771061850939231904.e;
                if (b68679066879342850252.e == 0) {
                    Q1083297855554014009 q1083297855554014009 = m11771061850939231904.f;
                    M18113111391818111737.v(q1083297855554014009);
                    B6867906687934285025 b68679066879342850253 = q1083297855554014009.f;
                    if (b68679066879342850253.e != 0) {
                        String strValueOf = String.valueOf(b68679066879342850253);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                        z7373362977535421473.p.a(b68679066879342850253);
                        z7373362977535421473.f606o.disconnect();
                        return;
                    }
                    N3336634644320470588 n33366346443204705882 = z7373362977535421473.p;
                    IBinder iBinder = q1083297855554014009.e;
                    if (iBinder == null) {
                        t8731205310522354167 = null;
                    } else {
                        int i3 = X9247881914193501773.j;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        t8731205310522354167 = iInterfaceQueryLocalInterface instanceof W15728808418604800610 ? (W15728808418604800610) iInterfaceQueryLocalInterface : new T8731205310522354167(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
                    }
                    Set set = z7373362977535421473.m;
                    n33366346443204705882.getClass();
                    if (t8731205310522354167 == null || set == null) {
                        new Exception();
                        n33366346443204705882.a(new B6867906687934285025(4, null, null));
                    } else {
                        n33366346443204705882.d = t8731205310522354167;
                        n33366346443204705882.e = set;
                        if (n33366346443204705882.a) {
                            ((N2113054325721141872) n33366346443204705882.b).getRemoteService(t8731205310522354167, set);
                        }
                    }
                } else {
                    z7373362977535421473.p.a(b68679066879342850252);
                }
                z7373362977535421473.f606o.disconnect();
                return;
            case 20:
                I1632105416032993715 i1632105416032993715 = (I1632105416032993715) this.b;
                View view2 = (View) this.c;
                try {
                    if (view2.getParent() != null) {
                        ((WindowManager) i1632105416032993715.c).removeView(view2);
                    }
                    break;
                } catch (RuntimeException unused3) {
                }
                i1632105416032993715.d = null;
                return;
            case 21:
                c();
                return;
            case 22:
                ((X17123927029532314696) this.c).b(new M204440408817344908(((G15068739404623149094) this.b).d, (byte) 13), new U11450443558875589191(b));
                return;
            case 23:
                d();
                return;
            case 24:
                e();
                return;
            case 25:
                I6845661640435175914 i6845661640435175914 = (I6845661640435175914) this.c;
                S14461012662136963693 s14461012662136963693 = (S14461012662136963693) i6845661640435175914.d;
                try {
                    S14461012662136963693 s14461012662136963693K = ((M204440408817344908) i6845661640435175914.c).k((S14461012662136963693) this.b);
                    N10542843603712830247 n10542843603712830247 = s14461012662136963693K.b;
                    E8496491261769853844 e8496491261769853844 = P12466553659249280316.b;
                    n10542843603712830247.b(new I6845661640435175914((Executor) e8496491261769853844, i6845661640435175914, (char) 0));
                    s14461012662136963693K.i();
                    n10542843603712830247.b(new I6845661640435175914(e8496491261769853844, i6845661640435175914, (byte) 0));
                    s14461012662136963693K.i();
                    n10542843603712830247.b(new I6845661640435175914(e8496491261769853844, i6845661640435175914));
                    s14461012662136963693K.i();
                    return;
                } catch (Z6733768557799306456 e6) {
                    if (e6.getCause() instanceof Exception) {
                        s14461012662136963693.e((Exception) e6.getCause());
                        return;
                    } else {
                        s14461012662136963693.e(e6);
                        return;
                    }
                } catch (Exception e7) {
                    s14461012662136963693.e(e7);
                    return;
                }
            case 26:
                W12609257429008829531 w12609257429008829531 = (W12609257429008829531) this.b;
                S14461012662136963693 s144610126621369636932 = ((M17133811648581684718) this.c).a;
                Context context = (Context) w12609257429008829531.b;
                String string = W12609257429008829531.b(context).getString("app_set_id", null);
                long j = W12609257429008829531.b(context).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (string != null && System.currentTimeMillis() <= j2) {
                    try {
                        W12609257429008829531.c(context);
                    } catch (Z17584938815677520411 e8) {
                        s144610126621369636932.e(e8);
                        return;
                    }
                    break;
                } else {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf2 = String.valueOf(context.getPackageName());
                            if (strValueOf2.length() != 0) {
                                "Failed to store app set ID generated for App ".concat(strValueOf2);
                            }
                            throw new Z17584938815677520411("Failed to store the app set ID.");
                        }
                        W12609257429008829531.c(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf3 = String.valueOf(context.getPackageName());
                            if (strValueOf3.length() != 0) {
                                "Failed to store app set ID creation time for App ".concat(strValueOf3);
                            }
                            throw new Z17584938815677520411("Failed to store the app set ID creation time.");
                        }
                    } catch (Z17584938815677520411 e9) {
                        s144610126621369636932.e(e9);
                        return;
                    }
                }
                s144610126621369636932.f(new R122968600551594484(string, 1));
                return;
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                synchronized (((I6845661640435175914) this.c).c) {
                    I6845661640435175914 i68456616404351759142 = (I6845661640435175914) ((I6845661640435175914) this.c).d;
                    Object objC = ((S14461012662136963693) this.b).c();
                    switch (i68456616404351759142.a) {
                        case 0:
                            ((S14461012662136963693) i68456616404351759142.d).f(objC);
                            break;
                        default:
                            ((S14461012662136963693) i68456616404351759142.d).f(objC);
                            break;
                    }
                    break;
                }
                return;
        }
    }

    public String toString() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                Q7316561721656982910 q7316561721656982910 = new Q7316561721656982910(I3863025946240164840.class.getSimpleName());
                V10300877997588547986 v10300877997588547986 = new V10300877997588547986((byte) 5, false);
                ((V10300877997588547986) q7316561721656982910.d).c = v10300877997588547986;
                q7316561721656982910.d = v10300877997588547986;
                v10300877997588547986.b = (c7) obj;
                return q7316561721656982910.toString();
            case 15:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((X14397327929232388191) obj).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ I3863025946240164840(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public I3863025946240164840(X14397327929232388191 x14397327929232388191) {
        this.a = (byte) 15;
        this.c = x14397327929232388191;
    }

    public I3863025946240164840(F4673815160636847046 f4673815160636847046, int i, Uri uri, boolean z, Bundle bundle) {
        this.a = (byte) 7;
        this.c = f4673815160636847046;
        this.b = uri;
    }

    public /* synthetic */ I3863025946240164840(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
