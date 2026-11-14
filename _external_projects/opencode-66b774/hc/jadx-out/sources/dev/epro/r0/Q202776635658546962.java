package dev.epro.r0;

import java.security.SecureRandom;
import java.util.ArrayList;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class Q202776635658546962 implements AutoCloseable {
    public final byte[] a;
    public final ArrayList b;
    public int c;
    public ArrayList d;

    static {
        izmyclvb.qgayjvbiagej2(717);
    }

    private native void hjzhmhdprdai(SecureRandom secureRandom);

    public final native N16746585396713622305 b(String str, byte[] bArr);

    public final native void c();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public static final class Z11244019023321623390 implements AutoCloseable {
        public final Q10994460934260637746 a;
        public final ArrayList b;
        public int c;

        static {
            izmyclvb.qgayjvbiagej2(239);
        }

        private native void gzovjxpjanng(Q10994460934260637746 q10994460934260637746);

        @Override // java.lang.AutoCloseable
        public final native void close();

        public Z11244019023321623390(Q10994460934260637746 q10994460934260637746) {
            q10994460934260637746.getClass();
            gzovjxpjanng(q10994460934260637746);
        }
    }

    public Q202776635658546962(SecureRandom secureRandom) {
        secureRandom.getClass();
        hjzhmhdprdai(secureRandom);
    }
}
