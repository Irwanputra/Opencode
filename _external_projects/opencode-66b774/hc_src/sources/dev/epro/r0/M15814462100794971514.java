package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class M15814462100794971514 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ L7222411163342326563 b;

    public /* synthetic */ M15814462100794971514(L7222411163342326563 l7222411163342326563, byte b) {
        this.a = b;
        this.b = l7222411163342326563;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        L7222411163342326563 l7222411163342326563 = this.b;
        switch (b) {
            case 0:
                C6935141804827476266 c6935141804827476266 = (C6935141804827476266) l7222411163342326563.f350o.invoke();
                int a = c6935141804827476266.a();
                int i = 0;
                while (true) {
                    if (i >= a) {
                        i = -1;
                    } else if (!c6935141804827476266.b(i).equals(obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            default:
                int intValue = ((Integer) obj).intValue();
                C6935141804827476266 c69351418048274762662 = (C6935141804827476266) l7222411163342326563.f350o.invoke();
                if (intValue < 0 || intValue >= c69351418048274762662.a()) {
                    Y16081827717826519461.a("Can't scroll to index " + intValue + ", it is out of bounds [0, " + c69351418048274762662.a() + ")");
                }
                R7033599853981556291.E(l7222411163342326563.V0(), null, null, new I3566570148522791385(l7222411163342326563, intValue, null, (byte) 3), 3);
                return Boolean.TRUE;
        }
    }
}
