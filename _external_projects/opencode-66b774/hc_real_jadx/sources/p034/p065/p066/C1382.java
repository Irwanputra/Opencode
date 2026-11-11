package p034.p065.p066;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p034.p035.p042.C1053;
import p034.p065.p066.C1378;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1382 implements C1378.InterfaceC1379 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final InterfaceC1384 f6550;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1053<C1383> f6548 = new C1053<>(30);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ArrayList<C1383> f6546 = new ArrayList<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ArrayList<C1383> f6547 = new ArrayList<>();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C1378 f6549 = new C1378(this);

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static class C1383 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6551;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Object f6552;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f6553;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6554;

        public C1383(int i, int i2, int i3, Object obj) {
            this.f6553 = i;
            this.f6551 = i2;
            this.f6554 = i3;
            this.f6552 = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1383.class != obj.getClass()) {
                return false;
            }
            C1383 c1383 = (C1383) obj;
            int i = this.f6553;
            if (i != c1383.f6553) {
                return false;
            }
            if (i == 8 && Math.abs(this.f6554 - this.f6551) == 1 && this.f6554 == c1383.f6551 && this.f6551 == c1383.f6554) {
                return true;
            }
            if (this.f6554 != c1383.f6554 || this.f6551 != c1383.f6551) {
                return false;
            }
            Object obj2 = this.f6552;
            Object obj3 = c1383.f6552;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f6553 * 31) + this.f6551) * 31) + this.f6554;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f6553;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f6551);
            sb.append("c:");
            sb.append(this.f6554);
            sb.append(",p:");
            sb.append(this.f6552);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1384 {
    }

    public C1382(InterfaceC1384 interfaceC1384) {
        this.f6550 = interfaceC1384;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C1383 m3112(int i, int i2, int i3, Object obj) {
        C1383 mo2386 = this.f6548.mo2386();
        if (mo2386 == null) {
            return new C1383(i, i2, i3, obj);
        }
        mo2386.f6553 = i;
        mo2386.f6551 = i2;
        mo2386.f6554 = i3;
        mo2386.f6552 = obj;
        return mo2386;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3113() {
        int size = this.f6547.size();
        for (int i = 0; i < size; i++) {
            ((C1409) this.f6550).m3175(this.f6547.get(i));
        }
        m3119(this.f6547);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m3114() {
        return this.f6546.size() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
    
        if (r4 > r12.f6551) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017d, code lost:
    
        r2.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
    
        if (r11.f6551 == r11.f6554) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
    
        r2.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018d, code lost:
    
        if (r6 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        r2.add(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        r2.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0178, code lost:
    
        r11.f6554 = r4 - r12.f6554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0176, code lost:
    
        if (r4 >= r12.f6551) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ce A[SYNTHETIC] */
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3115() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p065.p066.C1382.m3115():void");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3116() {
        m3113();
        int size = this.f6546.size();
        for (int i = 0; i < size; i++) {
            C1383 c1383 = this.f6546.get(i);
            int i2 = c1383.f6553;
            if (i2 == 1) {
                ((C1409) this.f6550).m3175(c1383);
                ((C1409) this.f6550).m3177(c1383.f6551, c1383.f6554);
            } else if (i2 == 2) {
                ((C1409) this.f6550).m3175(c1383);
                InterfaceC1384 interfaceC1384 = this.f6550;
                int i3 = c1383.f6551;
                int i4 = c1383.f6554;
                C1409 c1409 = (C1409) interfaceC1384;
                c1409.f6634.m728(i3, i4, true);
                RecyclerView recyclerView = c1409.f6634;
                recyclerView.f1409 = true;
                recyclerView.f1386.f1545 += i4;
            } else if (i2 == 4) {
                ((C1409) this.f6550).m3175(c1383);
                ((C1409) this.f6550).m3174(c1383.f6551, c1383.f6554, c1383.f6552);
            } else if (i2 == 8) {
                ((C1409) this.f6550).m3175(c1383);
                ((C1409) this.f6550).m3176(c1383.f6551, c1383.f6554);
            }
        }
        m3119(this.f6546);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean m3117(int i) {
        int size = this.f6547.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1383 c1383 = this.f6547.get(i2);
            int i3 = c1383.f6553;
            if (i3 == 8) {
                if (m3120(c1383.f6554, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c1383.f6551;
                int i5 = c1383.f6554 + i4;
                while (i4 < i5) {
                    if (m3120(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m3118(C1383 c1383, int i) {
        ((C1409) this.f6550).m3175(c1383);
        int i2 = c1383.f6553;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((C1409) this.f6550).m3174(i, c1383.f6554, c1383.f6552);
            return;
        }
        InterfaceC1384 interfaceC1384 = this.f6550;
        int i3 = c1383.f6554;
        C1409 c1409 = (C1409) interfaceC1384;
        c1409.f6634.m728(i, i3, true);
        RecyclerView recyclerView = c1409.f6634;
        recyclerView.f1409 = true;
        recyclerView.f1386.f1545 += i3;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m3119(List<C1383> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m3124(list.get(i));
        }
        list.clear();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int m3120(int i, int i2) {
        int size = this.f6547.size();
        while (i2 < size) {
            C1383 c1383 = this.f6547.get(i2);
            int i3 = c1383.f6553;
            if (i3 == 8) {
                int i4 = c1383.f6551;
                if (i4 == i) {
                    i = c1383.f6554;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1383.f6554 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c1383.f6551;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c1383.f6554;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c1383.f6554;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final int m3121(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f6547.size() - 1; size >= 0; size--) {
            C1383 c1383 = this.f6547.get(size);
            int i9 = c1383.f6553;
            if (i9 == 8) {
                int i10 = c1383.f6551;
                int i11 = c1383.f6554;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            c1383.f6551 = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            c1383.f6551 = i10 - 1;
                            i6 = i11 - 1;
                        }
                        c1383.f6554 = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    c1383.f6554 = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    c1383.f6551 = i7;
                    i--;
                }
            } else {
                int i12 = c1383.f6551;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    c1383.f6551 = i3;
                } else if (i9 == 1) {
                    i -= c1383.f6554;
                } else if (i9 == 2) {
                    i += c1383.f6554;
                }
            }
        }
        for (int size2 = this.f6547.size() - 1; size2 >= 0; size2--) {
            C1383 c13832 = this.f6547.get(size2);
            if (c13832.f6553 == 8) {
                int i13 = c13832.f6554;
                if (i13 != c13832.f6551 && i13 >= 0) {
                }
                this.f6547.remove(size2);
                m3124(c13832);
            } else {
                if (c13832.f6554 > 0) {
                }
                this.f6547.remove(size2);
                m3124(c13832);
            }
        }
        return i;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m3122(C1383 c1383) {
        int i;
        int i2 = c1383.f6553;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m3121 = m3121(c1383.f6551, i2);
        int i3 = c1383.f6551;
        int i4 = c1383.f6553;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1383);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c1383.f6554; i6++) {
            int m31212 = m3121((i * i6) + c1383.f6551, c1383.f6553);
            int i7 = c1383.f6553;
            if (i7 == 2 ? m31212 == m3121 : i7 == 4 && m31212 == m3121 + 1) {
                i5++;
            } else {
                C1383 m3112 = m3112(i7, m3121, i5, c1383.f6552);
                m3118(m3112, i3);
                m3124(m3112);
                if (c1383.f6553 == 4) {
                    i3 += i5;
                }
                m3121 = m31212;
                i5 = 1;
            }
        }
        Object obj = c1383.f6552;
        m3124(c1383);
        if (i5 > 0) {
            C1383 m31122 = m3112(c1383.f6553, m3121, i5, obj);
            m3118(m31122, i3);
            m3124(m31122);
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m3123(C1383 c1383) {
        this.f6547.add(c1383);
        int i = c1383.f6553;
        if (i == 1) {
            ((C1409) this.f6550).m3177(c1383.f6551, c1383.f6554);
            return;
        }
        if (i == 2) {
            C1409 c1409 = (C1409) this.f6550;
            c1409.f6634.m728(c1383.f6551, c1383.f6554, false);
            c1409.f6634.f1409 = true;
            return;
        }
        if (i == 4) {
            ((C1409) this.f6550).m3174(c1383.f6551, c1383.f6554, c1383.f6552);
        } else if (i == 8) {
            ((C1409) this.f6550).m3176(c1383.f6551, c1383.f6554);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c1383);
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m3124(C1383 c1383) {
        c1383.f6552 = null;
        this.f6548.mo2385(c1383);
    }
}
