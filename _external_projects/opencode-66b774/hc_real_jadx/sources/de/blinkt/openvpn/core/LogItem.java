package de.blinkt.openvpn.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import p010.p011.p012.p013.C0753;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LogItem implements Parcelable {
    public static final Parcelable.Creator<LogItem> CREATOR = new C0494();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Object[] f3689;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f3690;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f3691;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C0753.EnumC0754 f3692;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public long f3693;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f3694;

    /* renamed from: de.blinkt.openvpn.core.LogItem$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0494 implements Parcelable.Creator<LogItem> {
        @Override // android.os.Parcelable.Creator
        public LogItem createFromParcel(Parcel parcel) {
            return new LogItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LogItem[] newArray(int i) {
            return new LogItem[i];
        }
    }

    public LogItem(Parcel parcel) {
        this.f3689 = null;
        this.f3691 = null;
        this.f3692 = C0753.EnumC0754.f4886;
        this.f3693 = System.currentTimeMillis();
        this.f3690 = -1;
        this.f3689 = parcel.readArray(Object.class.getClassLoader());
        this.f3691 = parcel.readString();
        this.f3694 = parcel.readInt();
        this.f3692 = C0753.EnumC0754.m2054(parcel.readInt());
        this.f3690 = parcel.readInt();
        this.f3693 = parcel.readLong();
    }

    public LogItem(C0753.EnumC0754 enumC0754, int i) {
        this.f3689 = null;
        this.f3691 = null;
        this.f3692 = C0753.EnumC0754.f4886;
        this.f3693 = System.currentTimeMillis();
        this.f3690 = -1;
        this.f3694 = i;
        this.f3692 = enumC0754;
    }

    public LogItem(C0753.EnumC0754 enumC0754, int i, String str) {
        this.f3689 = null;
        this.f3691 = null;
        this.f3692 = C0753.EnumC0754.f4886;
        this.f3693 = System.currentTimeMillis();
        this.f3690 = -1;
        this.f3691 = str;
        this.f3692 = enumC0754;
        this.f3690 = i;
    }

    public LogItem(C0753.EnumC0754 enumC0754, int i, Object... objArr) {
        this.f3689 = null;
        this.f3691 = null;
        this.f3692 = C0753.EnumC0754.f4886;
        this.f3693 = System.currentTimeMillis();
        this.f3690 = -1;
        this.f3694 = i;
        this.f3689 = objArr;
        this.f3692 = enumC0754;
    }

    public LogItem(C0753.EnumC0754 enumC0754, String str) {
        this.f3689 = null;
        this.f3691 = null;
        this.f3692 = C0753.EnumC0754.f4886;
        this.f3693 = System.currentTimeMillis();
        this.f3690 = -1;
        this.f3692 = enumC0754;
        this.f3691 = str;
    }

    public LogItem(byte[] bArr, int i) {
        this.f3689 = null;
        this.f3691 = null;
        this.f3692 = C0753.EnumC0754.f4886;
        this.f3693 = System.currentTimeMillis();
        this.f3690 = -1;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        wrap.get();
        this.f3693 = wrap.getLong();
        this.f3690 = wrap.getInt();
        this.f3692 = C0753.EnumC0754.m2054(wrap.getInt());
        this.f3694 = wrap.getInt();
        int i2 = wrap.getInt();
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (i2 == 0) {
            this.f3691 = null;
        } else {
            if (i2 > wrap.remaining()) {
                throw new IndexOutOfBoundsException(Crypt.a(Crypt.xrc("IfhKefI7iOaf\u001b09I1g\u001c4gLgnIco\u001dehI0")) + i2 + Crypt.a(Crypt.xrc("\u0019jhM1;I6kHd9H3:\u001a`n@klNenLc9J4hLg<@cnNej\u001939H7:L1i\u001delOkh\u001cfmH1;\u001dg9\u001a4kNgjJ4>@ff\u001a6jKcmHb>J7jN4>JdnLa=")) + wrap.remaining());
            }
            byte[] bArr2 = new byte[i2];
            wrap.get(bArr2);
            this.f3691 = new String(bArr2, a);
        }
        int i3 = wrap.getInt();
        if (i3 > 30) {
            throw new IndexOutOfBoundsException(Crypt.a(Crypt.xrc("N0mIa9A7;\u001c1hH1<N7jHc>NknHbh\u001acoJco\u001dkmOao\u001d49Ijf\u001ckfNggKchKgh\u001b1:J4fLe9A6=\u001ce;A4=Mkf\u001ech\u00196iOghHgo@ggIgn")));
        }
        if (i3 == 0) {
            this.f3689 = null;
        } else {
            this.f3689 = new Object[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                char c = wrap.getChar();
                if (c == '0') {
                    this.f3689[i4] = null;
                } else if (c == 'd') {
                    this.f3689[i4] = Double.valueOf(wrap.getDouble());
                } else if (c == 'f') {
                    this.f3689[i4] = Float.valueOf(wrap.getFloat());
                } else if (c == 'i') {
                    this.f3689[i4] = Integer.valueOf(wrap.getInt());
                } else if (c == 'l') {
                    this.f3689[i4] = Long.valueOf(wrap.getLong());
                } else {
                    if (c != 's') {
                        throw new UnsupportedEncodingException(Crypt.a(Crypt.xrc("L0j\u001ag:Jf<\u001bcgKal@1l\u001c0lLjjA1o\u001dfo\u001adh\u001efl\u001e49\u001cjh\u001b4>\u001edi\u001c3fJjk\u001a3<Lc;\u001ckh\u0019")) + c);
                    }
                    Object[] objArr = this.f3689;
                    byte[] bArr3 = new byte[wrap.getInt()];
                    wrap.get(bArr3);
                    objArr[i4] = new String(bArr3, a);
                }
            }
        }
        if (wrap.hasRemaining()) {
            throw new UnsupportedEncodingException(wrap.remaining() + Crypt.a(Crypt.xrc("\u001db<Og>\u001b4:\u001djf@3fK6;\u00196>Kfl@7kNgoN3>I0>N1hK3;\u001bgo@e9Ac;MbhJ4m\u001cbfH0iMjfN`=OcgN4oNghH`:\u001bb<H4hLfh\u001da9M7;")));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        C0753.EnumC0754 enumC0754;
        if (!(obj instanceof LogItem)) {
            return obj.equals(this);
        }
        LogItem logItem = (LogItem) obj;
        return Arrays.equals(this.f3689, logItem.f3689) && (((str = logItem.f3691) == null && this.f3691 == str) || this.f3691.equals(str)) && this.f3694 == logItem.f3694 && ((((enumC0754 = this.f3692) == null && logItem.f3692 == enumC0754) || logItem.f3692.equals(enumC0754)) && this.f3690 == logItem.f3690 && this.f3693 == logItem.f3693);
    }

    public String toString() {
        return m1574(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeArray(this.f3689);
        parcel.writeString(this.f3691);
        parcel.writeInt(this.f3694);
        parcel.writeInt(this.f3692.f4890);
        parcel.writeInt(this.f3690);
        parcel.writeLong(this.f3693);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String m1574(Context context) {
        try {
            String str = this.f3691;
            if (str != null) {
                return str;
            }
            if (context != null) {
                int i = this.f3694;
                if (i == 2131820982) {
                    return m1575(context);
                }
                Object[] objArr = this.f3689;
                return objArr == null ? context.getString(i) : context.getString(i, objArr);
            }
            boolean z = true;
            String format = String.format(Locale.ENGLISH, Crypt.a(Crypt.xrc("H4o\u0019kfNanJ1g\u001adh\u001e3>Kf=Lc9\u001bgf@3gH0gIf;\u001c6gH1oA4fO4i@a>M6:\u0019e:Mki\u001e1lA")), Integer.valueOf(this.f3694));
            if (this.f3689 == null) {
                return format;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            String a = Crypt.a(Crypt.xrc("\u001dan@cn\u001cjkN3:\u001c`9Afm\u001c6:Ib:\u00194iJ69Hg"));
            Object[] objArr2 = this.f3689;
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr2) {
                if (z) {
                    z = false;
                } else {
                    sb2.append((CharSequence) a);
                }
                sb2.append(obj);
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (FormatFlagsConversionMismatchException e) {
            if (context == null) {
                throw e;
            }
            throw new FormatFlagsConversionMismatchException(e.getLocalizedMessage() + m1574(null), e.getConversion());
        } catch (UnknownFormatConversionException e2) {
            if (context == null) {
                throw e2;
            }
            throw new UnknownFormatConversionException(e2.getLocalizedMessage() + m1574(null));
        }
    }

    @SuppressLint({"StringFormatMatches"})
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final String m1575(Context context) {
        String a;
        String a2;
        context.getPackageManager();
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(Crypt.a(Crypt.xrc("\u001df;\u001cji\u001d`i\u001e7:J`kMjn\u0019a;\u001e1n@6;K7;@7"))).generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()));
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            messageDigest.update(x509Certificate.getEncoded());
            byte[] digest = messageDigest.digest();
            a = Arrays.equals(digest, C0753.f4877) ? context.getString(2131821074) : Arrays.equals(digest, C0753.f4879) ? context.getString(2131820760) : Arrays.equals(digest, C0753.f4881) ? Crypt.a(Crypt.xrc("\u0019a9Ij=Me:L0k\u001d1m@4;Lc=\u001ef=O7j\u001d3f\u00193")) : Arrays.equals(digest, C0753.f4873) ? Crypt.a(Crypt.xrc("Je>\u001cdm\u001eg<J`f\u001bdm\u001dc>IjoL7o\u001e`9\u001cd9L19Ok<Aa9\u001bjoI0nJj:K`>\u001ajk\u001a69L1=H`iA4lM6lL6oMgi\u0019e>\u001bf>N4=\u001aa9Mf9Oa;\u001c`=")) : context.getString(2131820668, x509Certificate.getSubjectX500Principal().getName());
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException unused) {
            a = Crypt.a(Crypt.xrc("M1o\u001a3>O7jM1f\u001ee=\u001a7l\u001ab>O3mN1gIgo\u001c4:JgmL`;\u001ba;J6f\u00196mJd:\u001bgoIj<Ag=Kd9I"));
        }
        try {
            a2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException unused2) {
            a2 = Crypt.a(Crypt.xrc("\u001ejk\u001e1hI1mN0mM3lAejI1<\u001b6f\u001ed:M69Haf\u0019glM0k@cnLaiH3o\u001e0<\u001c4>N7fIfi\u001eg=I"));
            Object[] objArr = this.f3689;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[copyOf.length - 1] = a;
            copyOf[copyOf.length - 2] = a2;
            return context.getString(2131820982, copyOf);
        }
        Object[] objArr2 = this.f3689;
        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
        copyOf2[copyOf2.length - 1] = a;
        copyOf2[copyOf2.length - 2] = a2;
        return context.getString(2131820982, copyOf2);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public byte[] m1576() {
        ByteBuffer allocate = ByteBuffer.allocate(16384);
        allocate.put((byte) 0);
        allocate.putLong(this.f3693);
        allocate.putInt(this.f3690);
        allocate.putInt(this.f3692.f4890);
        allocate.putInt(this.f3694);
        String str = this.f3691;
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (str == null || str.length() == 0) {
            allocate.putInt(0);
        } else {
            byte[] bytes = this.f3691.getBytes(a);
            allocate.putInt(bytes.length);
            allocate.put(bytes);
        }
        Object[] objArr = this.f3689;
        if (objArr == null || objArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(objArr.length);
            for (Object obj : this.f3689) {
                if (obj instanceof String) {
                    allocate.putChar('s');
                    byte[] bytes2 = ((String) obj).getBytes(a);
                    allocate.putInt(bytes2.length);
                    allocate.put(bytes2);
                } else if (obj instanceof Integer) {
                    allocate.putChar('i');
                    allocate.putInt(((Integer) obj).intValue());
                } else if (obj instanceof Float) {
                    allocate.putChar('f');
                    allocate.putFloat(((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    allocate.putChar('d');
                    allocate.putDouble(((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    allocate.putChar('l');
                    allocate.putLong(((Long) obj).longValue());
                } else if (obj == null) {
                    allocate.putChar('0');
                } else {
                    C0753.m2030(Crypt.a(Crypt.xrc("H1>A7oNe<\u001dk:\u001a4>\u001d`m\u001e3>\u001d3hHj;\u001bb<\u001ddm@1i\u001bji\u001deoMem\u001ed=\u001cdl\u001c`m\u001cblHblO1fM4=@7=H0h\u001a7jA4mM6=O1=Ha=\u001aafKd=\u001de<")) + obj);
                    allocate.putChar('s');
                    byte[] bytes3 = obj.toString().getBytes(a);
                    allocate.putInt(bytes3.length);
                    allocate.put(bytes3);
                }
            }
        }
        int position = allocate.position();
        allocate.rewind();
        return Arrays.copyOf(allocate.array(), position);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int m1577() {
        int i = this.f3690;
        return i == -1 ? this.f3692.f4890 : i;
    }
}
