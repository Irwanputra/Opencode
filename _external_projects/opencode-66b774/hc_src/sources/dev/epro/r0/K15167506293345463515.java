package dev.epro.r0;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class K15167506293345463515 {
    public static final /* synthetic */ int a = 0;

    static {
        B14824868959299866349.o("DiagnosticsWrkr");
    }

    public static final void a(V86870880106114790 v86870880106114790, O7265960433762398955 o7265960433762398955, O11820069373841472725 o11820069373841472725, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L16425900549479658727 l16425900549479658727 = (L16425900549479658727) it.next();
            T4643696886244492064 k = Q9282725956684299602.k(l16425900549479658727);
            String str = l16425900549479658727.a;
            o11820069373841472725.getClass();
            String str2 = k.a;
            int i = k.b;
            str2.getClass();
            Z9812534989346881836 z9812534989346881836 = (Z9812534989346881836) G16660188620551127941.E(o11820069373841472725.a, true, false, new F16156260086280662456(str2, i, (byte) 2));
            Integer valueOf = z9812534989346881836 != null ? Integer.valueOf(z9812534989346881836.c) : null;
            v86870880106114790.getClass();
            str.getClass();
            String J0 = R9411874267597469228.J0((List) G16660188620551127941.E(v86870880106114790.a, true, false, new O3126593184193694660(str, (byte) 2)), ",", null, null, 0, null, 62);
            o7265960433762398955.getClass();
            String J02 = R9411874267597469228.J0((List) G16660188620551127941.E(o7265960433762398955.a, true, false, new O3126593184193694660(str, (byte) 11)), ",", null, null, 0, null, 62);
            StringBuilder g = X2485016533998461232.g("\n", str, "\t ");
            g.append(l16425900549479658727.c);
            g.append("\t ");
            g.append(valueOf);
            g.append("\t ");
            g.append(l16425900549479658727.b.name());
            g.append("\t ");
            g.append(J0);
            g.append("\t ");
            g.append(J02);
            g.append('\t');
        }
    }
}
