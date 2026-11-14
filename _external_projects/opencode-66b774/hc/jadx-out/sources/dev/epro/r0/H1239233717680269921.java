package dev.epro.r0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H1239233717680269921 {
    public final L16425900549479658727 a;
    public final Context b;
    public final String c;
    public final Q13914734507241918864 d;
    public final W1977247516027959386 e;
    public final N12253737202470468561 f;
    public final WorkDatabase g;
    public final R6421434650946170247 h;
    public final I16138585026445501844 i;
    public final ArrayList j;
    public final R5692663580087387669 k;

    public H1239233717680269921(R6320827706769103704 r6320827706769103704) {
        L16425900549479658727 l16425900549479658727 = (L16425900549479658727) r6320827706769103704.f;
        this.a = l16425900549479658727;
        this.b = (Context) r6320827706769103704.a;
        this.c = l16425900549479658727.a;
        this.d = (Q13914734507241918864) r6320827706769103704.c;
        W1977247516027959386 w1977247516027959386 = (W1977247516027959386) r6320827706769103704.b;
        this.e = w1977247516027959386;
        O12545633033254628644 o12545633033254628644 = w1977247516027959386.d;
        this.f = (N12253737202470468561) r6320827706769103704.d;
        WorkDatabase workDatabase = (WorkDatabase) r6320827706769103704.e;
        this.g = workDatabase;
        this.h = workDatabase.x();
        this.i = workDatabase.s();
        ArrayList arrayList = (ArrayList) r6320827706769103704.g;
        this.j = arrayList;
        R9411874267597469228.J0(arrayList, ",", null, null, 0, null, 62);
        this.k = J8045362843799184672.k();
    }

    public final void a(int i) {
        R6421434650946170247 r6421434650946170247 = this.h;
        Y8203071358079267502 y8203071358079267502 = Y8203071358079267502.a;
        String str = this.c;
        r6421434650946170247.f(y8203071358079267502, str);
        r6421434650946170247.e(System.currentTimeMillis(), str);
        r6421434650946170247.d(this.a.v, str);
        r6421434650946170247.c(-1L, str);
        r6421434650946170247.g(i, str);
    }

    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        R6421434650946170247 r6421434650946170247 = this.h;
        String str = this.c;
        r6421434650946170247.e(jCurrentTimeMillis, str);
        r6421434650946170247.f(Y8203071358079267502.a, str);
        J196785984016436306 j196785984016436306 = r6421434650946170247.a;
        ((Number) G16660188620551127941.E(j196785984016436306, false, true, new O3126593184193694660(str, (byte) 6))).intValue();
        r6421434650946170247.d(this.a.v, str);
        G16660188620551127941.E(j196785984016436306, false, true, new O3126593184193694660(str, (byte) 8));
        r6421434650946170247.c(-1L, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H1239233717680269921.c(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void d(R10975805389692362869 r10975805389692362869) {
        String str = this.c;
        ArrayList arrayListX = K5751602218013079365.X(str);
        while (true) {
            boolean zIsEmpty = arrayListX.isEmpty();
            R6421434650946170247 r6421434650946170247 = this.h;
            if (zIsEmpty) {
                Z4023314114778119473 z4023314114778119473 = ((M14267729522421844969) r10975805389692362869).a;
                z4023314114778119473.getClass();
                r6421434650946170247.d(this.a.v, str);
                G16660188620551127941.E(r6421434650946170247.a, false, true, new Y14986451238933639207(z4023314114778119473, str, (byte) 20));
                return;
            }
            String str2 = (String) P17571903987102865660.r0(arrayListX);
            if (r6421434650946170247.a(str2) != Y8203071358079267502.f) {
                r6421434650946170247.f(Y8203071358079267502.d, str2);
            }
            arrayListX.addAll(this.i.a(str2));
        }
    }
}
