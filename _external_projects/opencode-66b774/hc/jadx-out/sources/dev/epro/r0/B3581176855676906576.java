package dev.epro.r0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B3581176855676906576 extends F7956685821435437215 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ B3581176855676906576(U1644378183406225904 u1644378183406225904, byte b) {
        this.a = b;
        this.b = u1644378183406225904;
    }

    @Override // dev.epro.r0.Q9935855302591369244
    public final Object a(J9761478802862050991 j9761478802862050991) {
        TimeZone timeZone;
        switch (this.a) {
            case 0:
                U1644378183406225904 u1644378183406225904 = (U1644378183406225904) this.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                boolean z = j9761478802862050991 instanceof X4173267666364425010;
                F16470721565862751885 f16470721565862751885 = j9761478802862050991.b;
                if (!z) {
                    throw new P13193549499509261669("while constructing an ordered map", f16470721565862751885, "expected a sequence, but found " + j9761478802862050991.a(), f16470721565862751885);
                }
                ArrayList arrayList = ((X4173267666364425010) j9761478802862050991).h;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    J9761478802862050991 j97614788028620509912 = (J9761478802862050991) obj;
                    if (!(j97614788028620509912 instanceof A12478465957355731346)) {
                        throw new P13193549499509261669("while constructing an ordered map", f16470721565862751885, "expected a mapping of length 1, but found " + j97614788028620509912.a(), j97614788028620509912.b);
                    }
                    A12478465957355731346 a12478465957355731346 = (A12478465957355731346) j97614788028620509912;
                    int size2 = a12478465957355731346.h.size();
                    List list = a12478465957355731346.h;
                    if (size2 != 1) {
                        throw new P13193549499509261669("while constructing an ordered map", f16470721565862751885, "expected a single mapping item, but found " + list.size() + " items", a12478465957355731346.b);
                    }
                    linkedHashMap.put(u1644378183406225904.a(((S16582019754975640369) list.get(0)).a), u1644378183406225904.a(((S16582019754975640369) a12478465957355731346.h.get(0)).b));
                }
                return linkedHashMap;
            case 1:
                U1644378183406225904 u16443781834062259042 = (U1644378183406225904) this.b;
                boolean z2 = j9761478802862050991 instanceof X4173267666364425010;
                F16470721565862751885 f164707215658627518852 = j9761478802862050991.b;
                if (!z2) {
                    throw new P13193549499509261669("while constructing pairs", f164707215658627518852, "expected a sequence, but found " + j9761478802862050991.a(), f164707215658627518852);
                }
                ArrayList arrayList2 = ((X4173267666364425010) j9761478802862050991).h;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size3 = arrayList2.size();
                int i2 = 0;
                while (i2 < size3) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    J9761478802862050991 j97614788028620509913 = (J9761478802862050991) obj2;
                    if (!(j97614788028620509913 instanceof A12478465957355731346)) {
                        throw new P13193549499509261669("while constructingpairs", f164707215658627518852, "expected a mapping of length 1, but found " + j97614788028620509913.a(), j97614788028620509913.b);
                    }
                    A12478465957355731346 a124784659573557313462 = (A12478465957355731346) j97614788028620509913;
                    int size4 = a124784659573557313462.h.size();
                    List list2 = a124784659573557313462.h;
                    if (size4 != 1) {
                        throw new P13193549499509261669("while constructing pairs", f164707215658627518852, "expected a single mapping item, but found " + list2.size() + " items", a124784659573557313462.b);
                    }
                    arrayList3.add(new Object[]{u16443781834062259042.a(((S16582019754975640369) list2.get(0)).a), u16443781834062259042.a(((S16582019754975640369) a124784659573557313462.h.get(0)).b)});
                }
                return arrayList3;
            default:
                String str = ((R17669967605394073670) j9761478802862050991).h;
                Matcher matcher = U1644378183406225904.u.matcher(str);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    String strGroup3 = matcher.group(3);
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    this.b = calendar;
                    calendar.clear();
                    ((Calendar) this.b).set(1, Integer.parseInt(strGroup));
                    ((Calendar) this.b).set(2, Integer.parseInt(strGroup2) - 1);
                    ((Calendar) this.b).set(5, Integer.parseInt(strGroup3));
                    return ((Calendar) this.b).getTime();
                }
                Matcher matcher2 = U1644378183406225904.t.matcher(str);
                if (!matcher2.matches()) {
                    throw new M8821877208104636290(G6547577305291411977.C("Unexpected timestamp: ", str));
                }
                String strGroup4 = matcher2.group(1);
                String strGroup5 = matcher2.group(2);
                String strGroup6 = matcher2.group(3);
                String strGroup7 = matcher2.group(4);
                String strGroup8 = matcher2.group(5);
                String strGroup9 = matcher2.group(6);
                String strGroup10 = matcher2.group(7);
                if (strGroup10 != null) {
                    strGroup9 = strGroup9 + "." + strGroup10;
                }
                double d = Double.parseDouble(strGroup9);
                int iRound = (int) Math.round(Math.floor(d));
                int iRound2 = (int) Math.round((d - ((double) iRound)) * 1000.0d);
                String strGroup11 = matcher2.group(8);
                String strGroup12 = matcher2.group(9);
                if (strGroup11 != null) {
                    timeZone = TimeZone.getTimeZone("GMT" + strGroup11 + (strGroup12 != null ? ":".concat(strGroup12) : "00"));
                } else {
                    timeZone = TimeZone.getTimeZone("UTC");
                }
                Calendar calendar2 = Calendar.getInstance(timeZone);
                this.b = calendar2;
                calendar2.set(1, Integer.parseInt(strGroup4));
                ((Calendar) this.b).set(2, Integer.parseInt(strGroup5) - 1);
                ((Calendar) this.b).set(5, Integer.parseInt(strGroup6));
                ((Calendar) this.b).set(11, Integer.parseInt(strGroup7));
                ((Calendar) this.b).set(12, Integer.parseInt(strGroup8));
                ((Calendar) this.b).set(13, iRound);
                ((Calendar) this.b).set(14, iRound2);
                return ((Calendar) this.b).getTime();
        }
    }

    public /* synthetic */ B3581176855676906576() {
        this.a = (byte) 2;
    }
}
