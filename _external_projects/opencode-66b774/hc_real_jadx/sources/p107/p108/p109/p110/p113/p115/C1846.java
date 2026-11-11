package p107.p108.p109.p110.p113.p115;

import android.os.Build;
import android.os.Process;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.てぜきぽく.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1846 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final AtomicBoolean f8217 = new AtomicBoolean(false);

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.てぜきぽく.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static final class C1847 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final byte[] f8218;

        /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.てぜきぽく.げつ〴ぬぐ$〺つふすそ$〺つふすそ, reason: contains not printable characters */
        public static class C1848 extends Provider {
            public C1848() {
                super(Crypt.a(Crypt.xrc("AeoM3=\u001b0lKblH6iH`lM`<Md;@kh\u001ag>Jk")), 1.0d, Crypt.a(Crypt.xrc("\u001bc:AjjK`fM6m\u001909I1jMj=JjoOf:JboNjoKgkL`oIkm\u001da:J6gJ`=\u001aj>Igl\u0019b<I3i@39\u00194<Ofo\u001cj<@0<H4j\u001e3;\u001a0>\u001ekg\u001c0>\u001edfH0h\u001aj9@go\u001c`;AjoK4gL6nM4l\u0019gh\u001bglO1")));
                put(Crypt.a(Crypt.xrc("K0jKa=\u001ck:\u001c4j\u001agnHf;Of>I1gN3>KklNagNa>Kk<J`nA`j\u001b0nA4h\u001b3=@0>Ld>N3f\u001a")), C1849.class.getName());
                put(Crypt.a(Crypt.xrc("K0jKa=\u001ck:\u001c4j\u001agnHf;Of>I1gN3>KklNanObj\u001a4>N3>J6gOckJakNdg\u001d0nA4f\u0019fh\u001d3nNf>O`n\u00190kLehO7mHfn\u001bj>@e:\u0019fiA6j")), Crypt.a(Crypt.xrc("\u001d4=K3nJkf\u001b7i\u001d1n\u001cgoJam\u001d7iJkm\u001d1fIb")));
            }
        }

        /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.てぜきぽく.げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C1849 extends SecureRandomSpi {

            /* renamed from: づざかべべ, reason: contains not printable characters */
            public static DataInputStream f8220;

            /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
            public static OutputStream f8221;

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public boolean f8223;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public static final File f8219 = new File(Crypt.a(Crypt.xrc("A4n\u001cb<\u001egg\u001ab9\u001cc:Oj<\u001bbnI`kAefOenM1")));

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public static final Object f8222 = new Object();

            @Override // java.security.SecureRandomSpi
            public byte[] engineGenerateSeed(int i) {
                byte[] bArr = new byte[i];
                engineNextBytes(bArr);
                return bArr;
            }

            @Override // java.security.SecureRandomSpi
            public void engineNextBytes(byte[] bArr) {
                DataInputStream m3973;
                if (!this.f8223) {
                    engineSetSeed(C1847.m3971());
                }
                try {
                    synchronized (f8222) {
                        m3973 = m3973();
                    }
                    synchronized (m3973) {
                        m3973.readFully(bArr);
                    }
                } catch (IOException e) {
                    StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("M`mLj>OcgMkl\u001aei\u001d3h\u001dbnJ79\u001cfnMfoI7:\u001bdj@am\u001cgo\u001919@0nH3lAdk\u001d3>Nko\u001a3hK")));
                    m4207.append(f8219);
                    throw new SecurityException(m4207.toString(), e);
                }
            }

            @Override // java.security.SecureRandomSpi
            public void engineSetSeed(byte[] bArr) {
                Object obj;
                OutputStream outputStream;
                try {
                    try {
                        obj = f8222;
                    } catch (IOException unused) {
                        String str = Crypt.a(Crypt.xrc("\u0019g=\u001bdm\u001aj9A0:\u001efk\u001cflLem\u001eg:\u001djo\u001b3k\u00193gO7fO0;\u001b`g\u001ce9Hko\u001c39\u001abhKam\u0019k=Jfm\u001d")) + f8219;
                    }
                    synchronized (obj) {
                        synchronized (obj) {
                            if (f8221 == null) {
                                f8221 = new FileOutputStream(f8219);
                            }
                            outputStream = f8221;
                        }
                        outputStream.write(bArr);
                        outputStream.flush();
                    }
                    outputStream.write(bArr);
                    outputStream.flush();
                } finally {
                    this.f8223 = true;
                }
            }

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public final DataInputStream m3973() {
                DataInputStream dataInputStream;
                synchronized (f8222) {
                    if (f8220 == null) {
                        try {
                            f8220 = new DataInputStream(new FileInputStream(f8219));
                        } catch (IOException e) {
                            throw new SecurityException(Crypt.a(Crypt.xrc("J3fJa=\u001da>\u001b19\u001ae:\u001c4l\u0019`i\u001d1=Ia=Ngk@4")) + f8219 + Crypt.a(Crypt.xrc("\u001bchM6mJfmAcnHc;\u001ef9\u001d7gM3k@1;\u001agi\u001ec")), e);
                        }
                    }
                    dataInputStream = f8220;
                }
                return dataInputStream;
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            String str = Build.FINGERPRINT;
            if (str != null) {
                sb.append(str);
            }
            String str2 = null;
            try {
                str2 = (String) Build.class.getField(Crypt.a(Crypt.xrc("L6=K3:Mg>\u001egoI7fK39@6h@7oOalL3=@j"))).get(null);
            } catch (Exception unused) {
            }
            if (str2 != null) {
                sb.append(str2);
            }
            try {
                f8218 = sb.toString().getBytes(Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")));
            } catch (UnsupportedEncodingException unused2) {
                throw new RuntimeException(Crypt.a(Crypt.xrc("J7o\u001bj:\u001edk\u001bdh\u001a4mA0lI7h\u001e4>\u001cahOe:\u001e6oLdk@0gO4=\u0019an\u001bcj\u001acoK49\u001c49JffH`mA")));
            }
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static byte[] m3971() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(f8218);
                dataOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new SecurityException(Crypt.a(Crypt.xrc("N1=\u001cdi\u001eclM6o\u001c1o\u001afj\u001bao\u001bafO6<L1:\u001benJ3<@b:\u001ajk\u0019d9\u00191nM4<Kc:O6;\u001b7<\u001c4o\u0019")), e);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
        
            if (r0[0].getClass().getSimpleName().equals(p107.p108.p109.p110.p113.p115.C1846.C1847.C1848.class.getSimpleName()) != false) goto L24;
         */
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void m3972() {
            /*
                Method dump skipped, instructions count: 387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p113.p115.C1846.C1847.m3972():void");
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.てぜきぽく.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1850 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public SecretKey f8224;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public SecretKey f8225;

        public C1850(SecretKey secretKey, SecretKey secretKey2) {
            this.f8225 = secretKey;
            this.f8224 = secretKey2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1850.class != obj.getClass()) {
                return false;
            }
            C1850 c1850 = (C1850) obj;
            return this.f8224.equals(c1850.f8224) && this.f8225.equals(c1850.f8225);
        }

        public int hashCode() {
            return this.f8224.hashCode() + ((this.f8225.hashCode() + 31) * 31);
        }

        public String toString() {
            return Base64.encodeToString(this.f8225.getEncoded(), 2) + Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")) + Base64.encodeToString(this.f8224.getEncoded(), 2);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.てぜきぽく.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1851 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final byte[] f8226;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final byte[] f8227;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final byte[] f8228;

        public C1851(String str) {
            String[] split = str.split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
            if (split.length != 3) {
                throw new IllegalArgumentException(Crypt.a(Crypt.xrc("Mff\u001dd;O6jAcg\u001e`l\u001bgg\u001b69H6fAfoM3mHfjO0gObm\u001ce=@jl\u001dbiKjn\u0019`j\u0019`oO3lJ3<H")));
            }
            this.f8226 = Base64.decode(split[0], 2);
            this.f8227 = Base64.decode(split[1], 2);
            this.f8228 = Base64.decode(split[2], 2);
        }

        public C1851(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            byte[] bArr4 = new byte[bArr.length];
            this.f8228 = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            byte[] bArr5 = new byte[bArr2.length];
            this.f8226 = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
            byte[] bArr6 = new byte[bArr3.length];
            this.f8227 = bArr6;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static byte[] m3974(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1851.class != obj.getClass()) {
                return false;
            }
            C1851 c1851 = (C1851) obj;
            return Arrays.equals(this.f8228, c1851.f8228) && Arrays.equals(this.f8226, c1851.f8226) && Arrays.equals(this.f8227, c1851.f8227);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f8227) + ((Arrays.hashCode(this.f8226) + ((Arrays.hashCode(this.f8228) + 31) * 31)) * 31);
        }

        public String toString() {
            String encodeToString = Base64.encodeToString(this.f8226, 2);
            String encodeToString2 = Base64.encodeToString(this.f8228, 2);
            String encodeToString3 = Base64.encodeToString(this.f8227, 2);
            StringBuilder sb = new StringBuilder();
            sb.append(encodeToString);
            String a = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
            sb.append(a);
            sb.append(encodeToString3);
            sb.append(a);
            sb.append(encodeToString2);
            return String.format(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C1851 m3965(String str, C1850 c1850) {
        byte[] bytes = str.getBytes(Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")));
        m3966();
        byte[] bArr = new byte[16];
        SecureRandom.getInstance(Crypt.a(Crypt.xrc("Ka>\u001bal\u001a4=\u001e6mH1:IgfAahI1j\u0019bhI7kMj"))).nextBytes(bArr);
        Cipher cipher = Cipher.getInstance(Crypt.a(Crypt.xrc("IknLa=L39I1h@6l\u001c6iN`>\u001cjmK3:@0h@7<\u001dbfMkkNcf\u001cehNam@jlH`;\u001e4<NdoAjf\u001d")));
        cipher.init(1, c1850.f8225, new IvParameterSpec(bArr));
        byte[] iv = cipher.getIV();
        byte[] doFinal = cipher.doFinal(bytes);
        byte[] m3974 = C1851.m3974(iv, doFinal);
        SecretKey secretKey = c1850.f8224;
        Mac mac = Mac.getInstance(Crypt.a(Crypt.xrc("O`g\u001efn@3oNf>H1f\u001ea9I4<\u001d6n\u001ad:Ak>\u0019k")));
        mac.init(secretKey);
        return new C1851(doFinal, iv, mac.doFinal(m3974));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m3966() {
        AtomicBoolean atomicBoolean = f8217;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (C1847.class) {
            if (!atomicBoolean.get()) {
                C1847.m3972();
                atomicBoolean.set(true);
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m3967(C1851 c1851, C1850 c1850) {
        byte[] m3974 = C1851.m3974(c1851.f8226, c1851.f8228);
        SecretKey secretKey = c1850.f8224;
        Mac mac = Mac.getInstance(Crypt.a(Crypt.xrc("O`g\u001efn@3oNf>H1f\u001ea9I4<\u001d6n\u001ad:Ak>\u0019k")));
        mac.init(secretKey);
        byte[] doFinal = mac.doFinal(m3974);
        byte[] bArr = c1851.f8227;
        boolean z = false;
        if (doFinal.length == bArr.length) {
            int i = 0;
            for (int i2 = 0; i2 < doFinal.length; i2++) {
                i |= doFinal[i2] ^ bArr[i2];
            }
            if (i == 0) {
                z = true;
            }
        }
        if (!z) {
            throw new GeneralSecurityException(Crypt.a(Crypt.xrc("\u001cafOgjHen\u001dfh\u00193i@a=JgnKdgHjhA1f\u001ajl\u001af>N7>@7nKb<\u001a0;Na<\u001c3n@6jMj<\u001ebf\u001b7f\u00190fM3jIgl\u0019dmKkgNekH4gHknNg>M4>")));
        }
        Cipher cipher = Cipher.getInstance(Crypt.a(Crypt.xrc("IknLa=L39I1h@6l\u001c6iN`>\u001cjmK3:@0h@7<\u001dbfMkkNcf\u001cehNam@jlH`;\u001e4<NdoAjf\u001d")));
        cipher.init(2, c1850.f8225, new IvParameterSpec(c1851.f8226));
        return new String(cipher.doFinal(c1851.f8228), Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")));
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static C1850 m3968(String str, byte[] bArr, int i) {
        m3966();
        byte[] encoded = SecretKeyFactory.getInstance(Crypt.a(Crypt.xrc("Kkh\u001eji\u001e`jAcn\u001e7>HdoA49\u001b6o\u0019g:LjnAfh\u001ebh\u001ac:K69L7j\u0019dl\u001e1oNj=@4k\u0019a>\u001ak>\u001e"))).generateSecret(new PBEKeySpec(str.toCharArray(), bArr, i, 384)).getEncoded();
        byte[] bArr2 = new byte[16];
        System.arraycopy(encoded, 0, bArr2, 0, 16);
        byte[] bArr3 = new byte[32];
        System.arraycopy(encoded, 16, bArr3, 0, 32);
        return new C1850(new SecretKeySpec(bArr2, Crypt.a(Crypt.xrc("\u001akjAej\u001af=HegMfj\u001e1o\u001b3:\u001dkhMgh\u00194>Ig"))), new SecretKeySpec(bArr3, Crypt.a(Crypt.xrc("O`g\u001efn@3oNf>H1f\u001ea9I4<\u001d6n\u001ad:Ak>\u0019k"))));
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static C1850 m3969(String str) {
        String[] split = str.split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
        if (split.length != 2) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("@7jM4iKel@`9Mah\u001d7fMa=\u001d1g\u001bj;Ac>If:Lki\u00190h\u00190kAen\u001b7oI1oJf=\u00194h\u001cao\u001ca;\u001d")));
        }
        byte[] decode = Base64.decode(split[0], 2);
        if (decode.length != 16) {
            throw new InvalidKeyException(Crypt.a(Crypt.xrc("Ik9Jeo\u001d0<M0;Md;@g=J3>\u001c39@d:H0oOki\u001b4=Kf=O7l@bhJfi\u001bflI0h\u001cjiMj;Mg>J0fA1<N1jLfiHbg\u001bc9\u001e`:LclMbi@3j\u00197h")));
        }
        byte[] decode2 = Base64.decode(split[1], 2);
        if (decode2.length == 32) {
            return new C1850(new SecretKeySpec(decode, 0, decode.length, Crypt.a(Crypt.xrc("\u001akjAej\u001af=HegMfj\u001e1o\u001b3:\u001dkhMgh\u00194>Ig"))), new SecretKeySpec(decode2, Crypt.a(Crypt.xrc("O`g\u001efn@3oNf>H1f\u001ea9I4<\u001d6n\u001ad:Ak>\u0019k"))));
        }
        throw new InvalidKeyException(Crypt.a(Crypt.xrc("Ik9Jeo\u001d0<M0;Md;@g=J3>\u001c39@d:H0oOk9If>H3l\u001c`k\u0019jiNe<HggJ1=\u001egl\u001dao\u001a`n\u0019kjHj;Njf@19\u001a6gJe9\u001eflLckJjoNj;I39")));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C1850 m3970() {
        m3966();
        KeyGenerator keyGenerator = KeyGenerator.getInstance(Crypt.a(Crypt.xrc("\u001akjAej\u001af=HegMfj\u001e1o\u001b3:\u001dkhMgh\u00194>Ig")));
        keyGenerator.init(NotificationCompat.FLAG_HIGH_PRIORITY);
        SecretKey generateKey = keyGenerator.generateKey();
        m3966();
        byte[] bArr = new byte[32];
        SecureRandom.getInstance(Crypt.a(Crypt.xrc("Ka>\u001bal\u001a4=\u001e6mH1:IgfAahI1j\u0019bhI7kMj"))).nextBytes(bArr);
        return new C1850(generateKey, new SecretKeySpec(bArr, Crypt.a(Crypt.xrc("O`g\u001efn@3oNf>H1f\u001ea9I4<\u001d6n\u001ad:Ak>\u0019k"))));
    }
}
