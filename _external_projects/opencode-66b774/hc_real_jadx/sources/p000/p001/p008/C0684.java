package p000.p001.p008;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p000.p001.C0629;
import p000.p001.p008.C0675;
import p131.p155.p156.p157.C2098;
import p243.C2801;
import p243.C2810;
import p243.C2817;
import p243.C2819;
import p243.InterfaceC2805;
import p243.InterfaceC2827;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0684 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Map<C2801, Integer> f4562;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C0671[] f4563;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.びぐびあび$〺つふすそ, reason: contains not printable characters */
    public static final class C0685 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f4567;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C2819 f4568;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f4565 = Integer.MAX_VALUE;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C0671[] f4569 = new C0671[8];

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f4570 = 7;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f4566 = 0;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f4564 = 0;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f4571 = NotificationCompat.FLAG_BUBBLE;

        public C0685(C2819 c2819) {
            this.f4568 = c2819;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int m1924(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f4569.length;
                while (true) {
                    length--;
                    i2 = this.f4570;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C0671[] c0671Arr = this.f4569;
                    i -= c0671Arr[length].f4525;
                    this.f4564 -= c0671Arr[length].f4525;
                    this.f4566--;
                    i3++;
                }
                C0671[] c0671Arr2 = this.f4569;
                System.arraycopy(c0671Arr2, i2 + 1, c0671Arr2, i2 + 1 + i3, this.f4566);
                C0671[] c0671Arr3 = this.f4569;
                int i4 = this.f4570;
                Arrays.fill(c0671Arr3, i4 + 1, i4 + 1 + i3, (Object) null);
                this.f4570 += i3;
            }
            return i3;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m1925(C0671 c0671) {
            int i = c0671.f4525;
            int i2 = this.f4571;
            if (i > i2) {
                m1926();
                return;
            }
            m1924((this.f4564 + i) - i2);
            int i3 = this.f4566 + 1;
            C0671[] c0671Arr = this.f4569;
            if (i3 > c0671Arr.length) {
                C0671[] c0671Arr2 = new C0671[c0671Arr.length * 2];
                System.arraycopy(c0671Arr, 0, c0671Arr2, c0671Arr.length, c0671Arr.length);
                this.f4570 = this.f4569.length - 1;
                this.f4569 = c0671Arr2;
            }
            int i4 = this.f4570;
            this.f4570 = i4 - 1;
            this.f4569[i4] = c0671;
            this.f4566++;
            this.f4564 += i;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m1926() {
            Arrays.fill(this.f4569, (Object) null);
            this.f4570 = this.f4569.length - 1;
            this.f4566 = 0;
            this.f4564 = 0;
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void m1927(List<C0671> list) {
            int i;
            int i2;
            if (this.f4567) {
                int i3 = this.f4565;
                if (i3 < this.f4571) {
                    m1928(i3, 31, 32);
                }
                this.f4567 = false;
                this.f4565 = Integer.MAX_VALUE;
                m1928(this.f4571, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0671 c0671 = list.get(i4);
                C2801 mo4851 = c0671.f4526.mo4851();
                C2801 c2801 = c0671.f4524;
                Integer num = C0684.f4562.get(mo4851);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        C0671[] c0671Arr = C0684.f4563;
                        if (C0629.m1817(c0671Arr[i - 1].f4524, c2801)) {
                            i2 = i;
                        } else if (C0629.m1817(c0671Arr[i].f4524, c2801)) {
                            i2 = i;
                            i++;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1) {
                    int i5 = this.f4570 + 1;
                    int length = this.f4569.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (C0629.m1817(this.f4569[i5].f4526, mo4851)) {
                            if (C0629.m1817(this.f4569[i5].f4524, c2801)) {
                                i = C0684.f4563.length + (i5 - this.f4570);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.f4570) + C0684.f4563.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    m1928(i, 127, NotificationCompat.FLAG_HIGH_PRIORITY);
                } else {
                    if (i2 == -1) {
                        this.f4568.m4927(64);
                        m1929(mo4851);
                    } else {
                        C2801 c28012 = C0671.f4522;
                        mo4851.getClass();
                        if (!mo4851.mo4854(0, c28012, 0, c28012.mo4855()) || C0671.f4523.equals(mo4851)) {
                            m1928(i2, 63, 64);
                        } else {
                            m1928(i2, 15, 0);
                            m1929(c2801);
                        }
                    }
                    m1929(c2801);
                    m1925(c0671);
                }
            }
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void m1928(int i, int i2, int i3) {
            int i4;
            C2819 c2819;
            if (i < i2) {
                c2819 = this.f4568;
                i4 = i | i3;
            } else {
                this.f4568.m4927(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f4568.m4927(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                c2819 = this.f4568;
            }
            c2819.m4927(i4);
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m1929(C2801 c2801) {
            C0675.f4532.getClass();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < c2801.mo4855(); i++) {
                j2 += C0675.f4531[c2801.mo4850(i) & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < c2801.mo4855()) {
                C2819 c2819 = new C2819();
                C0675.f4532.getClass();
                int i2 = 0;
                for (int i3 = 0; i3 < c2801.mo4855(); i3++) {
                    int mo4850 = c2801.mo4850(i3) & 255;
                    int i4 = C0675.f4530[mo4850];
                    byte b = C0675.f4531[mo4850];
                    j = (j << b) | i4;
                    i2 += b;
                    while (i2 >= 8) {
                        i2 -= 8;
                        c2819.mo4892((int) (j >> i2));
                    }
                }
                if (i2 > 0) {
                    c2819.mo4892((int) ((j << (8 - i2)) | (Base64.BASELENGTH >>> i2)));
                }
                c2801 = c2819.m4914();
                m1928(c2801.f10465.length, 127, NotificationCompat.FLAG_HIGH_PRIORITY);
            } else {
                m1928(c2801.mo4855(), 127, 0);
            }
            this.f4568.m4910(c2801);
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0686 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final InterfaceC2805 f4573;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f4575;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f4579;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final List<C0671> f4576 = new ArrayList();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C0671[] f4577 = new C0671[8];

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f4578 = 7;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f4574 = 0;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f4572 = 0;

        public C0686(int i, InterfaceC2827 interfaceC2827) {
            this.f4575 = i;
            this.f4579 = i;
            Logger logger = C2810.f10480;
            this.f4573 = new C2817(interfaceC2827);
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int m1930(int i) {
            return this.f4578 + 1 + i;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int m1931(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int mo4865 = this.f4573.mo4865() & 255;
                if ((mo4865 & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
                    return i2 + (mo4865 << i4);
                }
                i2 += (mo4865 & 127) << i4;
                i4 += 7;
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int m1932(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f4577.length;
                while (true) {
                    length--;
                    i2 = this.f4578;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C0671[] c0671Arr = this.f4577;
                    i -= c0671Arr[length].f4525;
                    this.f4572 -= c0671Arr[length].f4525;
                    this.f4574--;
                    i3++;
                }
                C0671[] c0671Arr2 = this.f4577;
                System.arraycopy(c0671Arr2, i2 + 1, c0671Arr2, i2 + 1 + i3, this.f4574);
                this.f4578 += i3;
            }
            return i3;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m1933() {
            Arrays.fill(this.f4577, (Object) null);
            this.f4578 = this.f4577.length - 1;
            this.f4574 = 0;
            this.f4572 = 0;
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final void m1934(int i, C0671 c0671) {
            this.f4576.add(c0671);
            int i2 = c0671.f4525;
            if (i != -1) {
                i2 -= this.f4577[(this.f4578 + 1) + i].f4525;
            }
            int i3 = this.f4579;
            if (i2 > i3) {
                m1933();
                return;
            }
            int m1932 = m1932((this.f4572 + i2) - i3);
            if (i == -1) {
                int i4 = this.f4574 + 1;
                C0671[] c0671Arr = this.f4577;
                if (i4 > c0671Arr.length) {
                    C0671[] c0671Arr2 = new C0671[c0671Arr.length * 2];
                    System.arraycopy(c0671Arr, 0, c0671Arr2, c0671Arr.length, c0671Arr.length);
                    this.f4578 = this.f4577.length - 1;
                    this.f4577 = c0671Arr2;
                }
                int i5 = this.f4578;
                this.f4578 = i5 - 1;
                this.f4577[i5] = c0671;
                this.f4574++;
            } else {
                this.f4577[this.f4578 + 1 + i + m1932 + i] = c0671;
            }
            this.f4572 += i2;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C2801 m1935() {
            int mo4865 = this.f4573.mo4865() & 255;
            boolean z = (mo4865 & NotificationCompat.FLAG_HIGH_PRIORITY) == 128;
            int m1931 = m1931(mo4865, 127);
            if (!z) {
                return this.f4573.mo4872(m1931);
            }
            C0675 c0675 = C0675.f4532;
            byte[] mo4867 = this.f4573.mo4867(m1931);
            c0675.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C0675.C0676 c0676 = c0675.f4533;
            int i = 0;
            int i2 = 0;
            for (byte b : mo4867) {
                i = (i << 8) | (b & 255);
                i2 += 8;
                while (i2 >= 8) {
                    int i3 = i2 - 8;
                    c0676 = c0676.f4536[(i >>> i3) & Base64.BASELENGTH];
                    if (c0676.f4536 == null) {
                        byteArrayOutputStream.write(c0676.f4534);
                        i2 -= c0676.f4535;
                        c0676 = c0675.f4533;
                    } else {
                        i2 = i3;
                    }
                }
            }
            while (i2 > 0) {
                C0675.C0676 c06762 = c0676.f4536[(i << (8 - i2)) & Base64.BASELENGTH];
                if (c06762.f4536 != null || c06762.f4535 > i2) {
                    break;
                }
                byteArrayOutputStream.write(c06762.f4534);
                i2 -= c06762.f4535;
                c0676 = c0675.f4533;
            }
            return C2801.m4840(byteArrayOutputStream.toByteArray());
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final C2801 m1936(int i) {
            C0671 c0671;
            if (!(i >= 0 && i <= C0684.f4563.length + (-1))) {
                int m1930 = m1930(i - C0684.f4563.length);
                if (m1930 >= 0) {
                    C0671[] c0671Arr = this.f4577;
                    if (m1930 < c0671Arr.length) {
                        c0671 = c0671Arr[m1930];
                    }
                }
                StringBuilder m4207 = C2098.m4207("Header index too large ");
                m4207.append(i + 1);
                throw new IOException(m4207.toString());
            }
            c0671 = C0684.f4563[i];
            return c0671.f4526;
        }
    }

    static {
        C0671 c0671 = new C0671(C0671.f4523, "");
        int i = 0;
        C2801 c2801 = C0671.f4521;
        C2801 c28012 = C0671.f4519;
        C2801 c28013 = C0671.f4518;
        C2801 c28014 = C0671.f4520;
        C0671[] c0671Arr = {c0671, new C0671(c2801, "GET"), new C0671(c2801, "POST"), new C0671(c28012, "/"), new C0671(c28012, "/index.html"), new C0671(c28013, "http"), new C0671(c28013, "https"), new C0671(c28014, "200"), new C0671(c28014, "204"), new C0671(c28014, "206"), new C0671(c28014, "304"), new C0671(c28014, "400"), new C0671(c28014, "404"), new C0671(c28014, "500"), new C0671("accept-charset", ""), new C0671("accept-encoding", "gzip, deflate"), new C0671("accept-language", ""), new C0671("accept-ranges", ""), new C0671("accept", ""), new C0671("access-control-allow-origin", ""), new C0671("age", ""), new C0671("allow", ""), new C0671("authorization", ""), new C0671("cache-control", ""), new C0671("content-disposition", ""), new C0671("content-encoding", ""), new C0671("content-language", ""), new C0671("content-length", ""), new C0671("content-location", ""), new C0671("content-range", ""), new C0671("content-type", ""), new C0671("cookie", ""), new C0671("date", ""), new C0671("etag", ""), new C0671("expect", ""), new C0671("expires", ""), new C0671("from", ""), new C0671("host", ""), new C0671("if-match", ""), new C0671("if-modified-since", ""), new C0671("if-none-match", ""), new C0671("if-range", ""), new C0671("if-unmodified-since", ""), new C0671("last-modified", ""), new C0671("link", ""), new C0671("location", ""), new C0671("max-forwards", ""), new C0671("proxy-authenticate", ""), new C0671("proxy-authorization", ""), new C0671("range", ""), new C0671("referer", ""), new C0671("refresh", ""), new C0671("retry-after", ""), new C0671("server", ""), new C0671("set-cookie", ""), new C0671("strict-transport-security", ""), new C0671("transfer-encoding", ""), new C0671("user-agent", ""), new C0671("vary", ""), new C0671("via", ""), new C0671("www-authenticate", "")};
        f4563 = c0671Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0671Arr.length);
        while (true) {
            C0671[] c0671Arr2 = f4563;
            if (i >= c0671Arr2.length) {
                f4562 = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(c0671Arr2[i].f4526)) {
                    linkedHashMap.put(c0671Arr2[i].f4526, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C2801 m1923(C2801 c2801) {
        int mo4855 = c2801.mo4855();
        for (int i = 0; i < mo4855; i++) {
            byte mo4850 = c2801.mo4850(i);
            if (mo4850 >= 65 && mo4850 <= 90) {
                StringBuilder m4207 = C2098.m4207("PROTOCOL_ERROR response malformed: mixed case name: ");
                m4207.append(c2801.mo4847());
                throw new IOException(m4207.toString());
            }
        }
        return c2801;
    }
}
