package dev.epro.r0;

import android.content.Context;
import dev.epro.r0.R8506001224295282223;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class T13399098270394742793 implements AutoCloseable {
    public static final /* synthetic */ int u = 0;
    public final Context a;
    public final List b;
    public final int c;
    public final int d;
    public volatile B6422008915496466102 e;
    public volatile String f;
    public volatile int g;
    public volatile int h;
    public volatile int i;
    public ServerSocket j;
    public final N18249742966722306189 k;
    public final A2789795882633926065 l;
    public final A18119328133183277592 m;
    public final P14517886259276714806 n;

    /* renamed from: o, reason: collision with root package name */
    public final A18119328133183277592 f496o;
    public final Set p;
    public final Q17985518054311056423 q;
    public volatile boolean r;
    public final B18437066071346442440 s;
    public final O1495669038463313080 t;

    static {
        izmyclvb.qgayjvbiagej2(1310);
        hwsnwiapnvjs();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T13399098270394742793(android.content.Context r40, int r41, java.util.List r42, java.lang.String r43, int r44, int r45, int r46, dev.epro.r0.B6422008915496466102 r47, int r48, int r49, dev.epro.r0.O18369580107802500074 r50) {
        /*
            r39 = this;
            r14 = r39
            r15 = r40
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            r22 = r47
            r23 = r48
            r24 = r49
            r25 = r50
            r26 = r14
            java.lang.Object[] r0 = cxrtdwjafhie(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r1 = 0
            r2 = r0[r1]
            android.content.Context r2 = (android.content.Context) r2
            r5 = r2
            r1 = 1
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6 = r2
            r1 = 2
            r2 = r0[r1]
            java.util.List r2 = (java.util.List) r2
            r7 = r2
            r1 = 3
            r2 = r0[r1]
            java.lang.String r2 = (java.lang.String) r2
            r8 = r2
            r1 = 4
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r9 = r2
            r1 = 5
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r10 = r2
            r1 = 6
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11 = r2
            r1 = 7
            r2 = r0[r1]
            dev.epro.r0.B6422008915496466102 r2 = (dev.epro.r0.B6422008915496466102) r2
            r12 = r2
            r1 = 8
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r13 = r2
            r4 = r26
            r27 = r4
            r28 = r5
            r29 = r6
            r30 = r7
            r31 = r8
            r32 = r9
            r33 = r10
            r34 = r11
            r35 = r12
            r36 = r13
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r27 = r4
            r27.sihdehatsjkd()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T13399098270394742793.<init>(android.content.Context, int, java.util.List, java.lang.String, int, int, int, dev.epro.r0.B6422008915496466102, int, int, dev.epro.r0.O18369580107802500074):void");
    }

    public static native Object b(T13399098270394742793 t13399098270394742793, K14749510448791472029 k14749510448791472029);

    public static native void c(Socket socket);

    private static native Object[] cxrtdwjafhie(Context context, int i, List list, String str, int i2, int i3, int i4, B6422008915496466102 b6422008915496466102, int i5, int i6, O18369580107802500074 o18369580107802500074);

    public static native void g(InputStream inputStream, OutputStream outputStream, int i, Socket socket, Socket socket2);

    public static native T13328233054345968915 h(T13399098270394742793 t13399098270394742793, int i, List list, Integer num, Integer num2, C13199856549537327585 c13199856549537327585, H13181800873099545702 h13181800873099545702, int i2);

    private static native void hwsnwiapnvjs();

    private native void jyfkrtkdfisi(Context context, int i, List<H4191455248956457601> list, String str, int i2, int i3, int i4, B6422008915496466102 b6422008915496466102, int i5);

    public static native boolean p(IOException iOException);

    private native void sihdehatsjkd();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native Y11460403151847909905 d(int i, R8506001224295282223.Z11244019023321623390 z11244019023321623390, Y6921797927338498306 y6921797927338498306);

    public final native Y11460403151847909905 e(int i);

    public final native Object j(Socket socket, K14749510448791472029 k14749510448791472029);

    public final native Object o(K14749510448791472029 k14749510448791472029);

    public final native Object q(Socket socket, Socket socket2, InputStream inputStream, OutputStream outputStream, InputStream inputStream2, OutputStream outputStream2, A13517599045192279344 a13517599045192279344);

    public final native void s(Socket socket);

    public final native Y6921797927338498306 u(R8506001224295282223.Z11244019023321623390 z11244019023321623390);

    public final native void v();

    public static final class Y11460403151847909905 {
        public final int a;
        public final Socket b;
        public final String c;
        public final Integer d;

        static {
            izmyclvb.qgayjvbiagej2(2132);
        }

        public /* synthetic */ Y11460403151847909905(int i, Socket socket, String str, Integer num, int i2, O18369580107802500074 o18369580107802500074) {
            this(i, socket, str, (Integer) rjypjpkvvgra(i, socket, str, num, i2, o18369580107802500074)[0]);
            stvjbfirbznx();
        }

        private native void konfttlmixeg(int i, Socket socket, String str, Integer num);

        private static native Object[] rjypjpkvvgra(int i, Socket socket, String str, Integer num, int i2, O18369580107802500074 o18369580107802500074);

        private native void stvjbfirbznx();

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y11460403151847909905(int i, Socket socket, String str, Integer num) {
            socket.getClass();
            str.getClass();
            konfttlmixeg(i, socket, str, num);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Y6921797927338498306 {
        public static final Y6921797927338498306 a;
        public static final Y6921797927338498306 b;
        public static final Y6921797927338498306 c;
        public static final /* synthetic */ Y6921797927338498306[] d;

        static {
            int pewkpxhnapaq;
            izmyclvb.qgayjvbiagej2(426);
            Object[] objArr = new Object[7];
            while (true) {
                try {
                    pewkpxhnapaq = pewkpxhnapaq(objArr);
                } finally {
                    Arrays.fill(objArr, (Object) null);
                }
                if (pewkpxhnapaq != 0) {
                    switch (pewkpxhnapaq) {
                        case 1:
                            a = (Y6921797927338498306) objArr[1];
                            continue;
                        case 2:
                            b = (Y6921797927338498306) objArr[1];
                            continue;
                        case 3:
                            c = (Y6921797927338498306) objArr[1];
                            continue;
                        case 4:
                            d = (Y6921797927338498306[]) objArr[1];
                            continue;
                        default:
                            throw null;
                    }
                    Arrays.fill(objArr, (Object) null);
                }
                return;
            }
        }

        private native void ndsahijrzfpc(String str, int i);

        private static native int pewkpxhnapaq(Object[] objArr);

        public static native Y6921797927338498306 valueOf(String str);

        public static native Y6921797927338498306[] values();

        private Y6921797927338498306(String str, int i) {
            ndsahijrzfpc(str, i);
        }
    }

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(1608);
        }

        private native void hvwyyuvvrggl();

        private native void vtevysfziofk(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            vtevysfziofk(o18369580107802500074);
        }

        private Z11244019023321623390() {
            hvwyyuvvrggl();
        }
    }

    public T13399098270394742793(Context context, int i, List<H4191455248956457601> list, String str, int i2, int i3, int i4, B6422008915496466102 b6422008915496466102, int i5) {
        context.getClass();
        list.getClass();
        str.getClass();
        b6422008915496466102.getClass();
        jyfkrtkdfisi(context, i, list, str, i2, i3, i4, b6422008915496466102, i5);
    }

    public static final class H4191455248956457601 {
        public final String a;
        public final int b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final B13729205492206812220 f;

        static {
            izmyclvb.qgayjvbiagej2(171);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ H4191455248956457601(java.lang.String r25, int r26, java.lang.String r27, boolean r28, boolean r29, dev.epro.r0.B13729205492206812220 r30, int r31, dev.epro.r0.O18369580107802500074 r32) {
            /*
                r24 = this;
                r5 = r24
                r6 = r25
                r7 = r26
                r8 = r27
                r9 = r28
                r10 = r29
                r11 = r30
                r12 = r31
                r13 = r32
                r14 = r5
                java.lang.Object[] r0 = fwfmzoexrrmh(r25, r26, r27, r28, r29, r30, r31, r32)
                r1 = 0
                r2 = r0[r1]
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r9 = r2
                r1 = 1
                r2 = r0[r1]
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r10 = r2
                r1 = 2
                r2 = r0[r1]
                dev.epro.r0.B13729205492206812220 r2 = (dev.epro.r0.B13729205492206812220) r2
                r11 = r2
                r5 = r14
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r8
                r19 = r9
                r20 = r10
                r21 = r11
                r15.<init>(r16, r17, r18, r19, r20, r21)
                r15 = r5
                r15.seqbtfofnuok()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T13399098270394742793.H4191455248956457601.<init>(java.lang.String, int, java.lang.String, boolean, boolean, dev.epro.r0.B13729205492206812220, int, dev.epro.r0.O18369580107802500074):void");
        }

        private static native Object[] fwfmzoexrrmh(String str, int i, String str2, boolean z, boolean z2, B13729205492206812220 b13729205492206812220, int i2, O18369580107802500074 o18369580107802500074);

        private native void ihaurthacevn(String str, int i, String str2, boolean z, boolean z2, B13729205492206812220 b13729205492206812220);

        private native void seqbtfofnuok();

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public H4191455248956457601(String str, int i, String str2, boolean z, boolean z2, B13729205492206812220 b13729205492206812220) {
            str.getClass();
            str2.getClass();
            b13729205492206812220.getClass();
            ihaurthacevn(str, i, str2, z, z2, b13729205492206812220);
        }
    }
}
