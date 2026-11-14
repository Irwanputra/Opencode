package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B3581176855676906576 extends dev.epro.r0.F7956685821435437215 {
    public final /* synthetic */ byte a;
    public java.lang.Object b;

    public /* synthetic */ B3581176855676906576(dev.epro.r0.U1644378183406225904 u1644378183406225904, byte b) {
        this.a = b;
        this.b = u1644378183406225904;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.M8821877208104636290 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.P13193549499509261669 */
    public final java.lang.Object a(dev.epro.r0.J9761478802862050991 j9761478802862050991) throws dev.epro.r0.M8821877208104636290, dev.epro.r0.P13193549499509261669 {
        java.util.TimeZone timeZone;
        switch (this.a) {
            case 0:
                dev.epro.r0.U1644378183406225904 u1644378183406225904 = (dev.epro.r0.U1644378183406225904) this.b;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                boolean z = j9761478802862050991 instanceof dev.epro.r0.X4173267666364425010;
                dev.epro.r0.F16470721565862751885 f16470721565862751885 = j9761478802862050991.b;
                if (!z) {
                    throw new dev.epro.r0.P13193549499509261669("while constructing an ordered map", f16470721565862751885, "expected a sequence, but found " + j9761478802862050991.a(), f16470721565862751885);
                }
                java.util.ArrayList arrayList = ((dev.epro.r0.X4173267666364425010) j9761478802862050991).h;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    java.lang.Object obj = arrayList.get(i);
                    i++;
                    dev.epro.r0.A12478465957355731346 a12478465957355731346 = (dev.epro.r0.J9761478802862050991) obj;
                    if (!(a12478465957355731346 instanceof dev.epro.r0.A12478465957355731346)) {
                        throw new dev.epro.r0.P13193549499509261669("while constructing an ordered map", f16470721565862751885, "expected a mapping of length 1, but found " + a12478465957355731346.a(), ((dev.epro.r0.J9761478802862050991) a12478465957355731346).b);
                    }
                    dev.epro.r0.A12478465957355731346 a124784659573557313462 = a12478465957355731346;
                    int size2 = a124784659573557313462.h.size();
                    java.util.List list = a124784659573557313462.h;
                    if (size2 != 1) {
                        throw new dev.epro.r0.P13193549499509261669("while constructing an ordered map", f16470721565862751885, "expected a single mapping item, but found " + list.size() + " items", ((dev.epro.r0.J9761478802862050991) a124784659573557313462).b);
                    }
                    linkedHashMap.put(u1644378183406225904.a(((dev.epro.r0.S16582019754975640369) list.get(0)).a), u1644378183406225904.a(((dev.epro.r0.S16582019754975640369) a124784659573557313462.h.get(0)).b));
                }
                return linkedHashMap;
            case 1:
                dev.epro.r0.U1644378183406225904 u16443781834062259042 = (dev.epro.r0.U1644378183406225904) this.b;
                boolean z2 = j9761478802862050991 instanceof dev.epro.r0.X4173267666364425010;
                dev.epro.r0.F16470721565862751885 f164707215658627518852 = j9761478802862050991.b;
                if (!z2) {
                    throw new dev.epro.r0.P13193549499509261669("while constructing pairs", f164707215658627518852, "expected a sequence, but found " + j9761478802862050991.a(), f164707215658627518852);
                }
                java.util.ArrayList arrayList2 = ((dev.epro.r0.X4173267666364425010) j9761478802862050991).h;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
                int size3 = arrayList2.size();
                int i2 = 0;
                while (i2 < size3) {
                    java.lang.Object obj2 = arrayList2.get(i2);
                    i2++;
                    dev.epro.r0.A12478465957355731346 a124784659573557313463 = (dev.epro.r0.J9761478802862050991) obj2;
                    if (!(a124784659573557313463 instanceof dev.epro.r0.A12478465957355731346)) {
                        throw new dev.epro.r0.P13193549499509261669("while constructingpairs", f164707215658627518852, "expected a mapping of length 1, but found " + a124784659573557313463.a(), ((dev.epro.r0.J9761478802862050991) a124784659573557313463).b);
                    }
                    dev.epro.r0.A12478465957355731346 a124784659573557313464 = a124784659573557313463;
                    int size4 = a124784659573557313464.h.size();
                    java.util.List list2 = a124784659573557313464.h;
                    if (size4 != 1) {
                        throw new dev.epro.r0.P13193549499509261669("while constructing pairs", f164707215658627518852, "expected a single mapping item, but found " + list2.size() + " items", ((dev.epro.r0.J9761478802862050991) a124784659573557313464).b);
                    }
                    arrayList3.add(new java.lang.Object[]{u16443781834062259042.a(((dev.epro.r0.S16582019754975640369) list2.get(0)).a), u16443781834062259042.a(((dev.epro.r0.S16582019754975640369) a124784659573557313464.h.get(0)).b)});
                }
                return arrayList3;
            default:
                java.lang.String str = ((dev.epro.r0.R17669967605394073670) j9761478802862050991).h;
                java.util.regex.Matcher matcher = dev.epro.r0.U1644378183406225904.u.matcher(str);
                if (matcher.matches()) {
                    java.lang.String strGroup = matcher.group(1);
                    java.lang.String strGroup2 = matcher.group(2);
                    java.lang.String strGroup3 = matcher.group(3);
                    java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
                    this.b = calendar;
                    calendar.clear();
                    ((java.util.Calendar) this.b).set(1, java.lang.Integer.parseInt(strGroup));
                    ((java.util.Calendar) this.b).set(2, java.lang.Integer.parseInt(strGroup2) - 1);
                    ((java.util.Calendar) this.b).set(5, java.lang.Integer.parseInt(strGroup3));
                    return ((java.util.Calendar) this.b).getTime();
                }
                java.util.regex.Matcher matcher2 = dev.epro.r0.U1644378183406225904.t.matcher(str);
                if (!matcher2.matches()) {
                    throw new dev.epro.r0.M8821877208104636290(dev.epro.r0.G6547577305291411977.C("Unexpected timestamp: ", str));
                }
                java.lang.String strGroup4 = matcher2.group(1);
                java.lang.String strGroup5 = matcher2.group(2);
                java.lang.String strGroup6 = matcher2.group(3);
                java.lang.String strGroup7 = matcher2.group(4);
                java.lang.String strGroup8 = matcher2.group(5);
                java.lang.String strGroup9 = matcher2.group(6);
                java.lang.String strGroup10 = matcher2.group(7);
                if (strGroup10 != null) {
                    strGroup9 = strGroup9 + "." + strGroup10;
                }
                double d = java.lang.Double.parseDouble(strGroup9);
                int iRound = (int) java.lang.Math.round(java.lang.Math.floor(d));
                int iRound2 = (int) java.lang.Math.round((d - ((double) iRound)) * 1000.0d);
                java.lang.String strGroup11 = matcher2.group(8);
                java.lang.String strGroup12 = matcher2.group(9);
                if (strGroup11 != null) {
                    timeZone = java.util.TimeZone.getTimeZone("GMT" + strGroup11 + (strGroup12 != null ? ":".concat(strGroup12) : "00"));
                } else {
                    timeZone = java.util.TimeZone.getTimeZone("UTC");
                }
                java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone);
                this.b = calendar2;
                calendar2.set(1, java.lang.Integer.parseInt(strGroup4));
                ((java.util.Calendar) this.b).set(2, java.lang.Integer.parseInt(strGroup5) - 1);
                ((java.util.Calendar) this.b).set(5, java.lang.Integer.parseInt(strGroup6));
                ((java.util.Calendar) this.b).set(11, java.lang.Integer.parseInt(strGroup7));
                ((java.util.Calendar) this.b).set(12, java.lang.Integer.parseInt(strGroup8));
                ((java.util.Calendar) this.b).set(13, iRound);
                ((java.util.Calendar) this.b).set(14, iRound2);
                return ((java.util.Calendar) this.b).getTime();
        }
    }
}
