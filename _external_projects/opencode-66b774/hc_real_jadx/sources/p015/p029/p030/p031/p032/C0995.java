package p015.p029.p030.p031.p032;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import p015.p029.p030.p033.C0996;
import p015.p029.p030.p033.C0997;

/* renamed from: いいにぽつ.びぐびあび.げつ〴ぬぐ.〺つふすそ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0995 extends BufferedWriter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public char[] f5368;

    public C0995(Writer writer) {
        super(writer);
        this.f5368 = new char[64];
        String property = System.getProperty("line.separator");
        if (property != null) {
            property.length();
        }
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public void m2323(InterfaceC0993 interfaceC0993) {
        char[] cArr;
        int i;
        C0992 c0992 = (C0992) interfaceC0993;
        write("-----BEGIN CERTIFICATE-----");
        newLine();
        if (!c0992.f5367.isEmpty()) {
            Iterator it = c0992.f5367.iterator();
            while (it.hasNext()) {
                ((C0994) it.next()).getClass();
                write((String) null);
                write(": ");
                write((String) null);
                newLine();
            }
            newLine();
        }
        byte[] bArr = c0992.f5366;
        C0996 c0996 = C0997.f5371;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((bArr.length + 2) / 3) * 4);
        try {
            C0997.f5371.m2324(bArr, 0, bArr.length, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i2 = 0;
            while (i2 < byteArray.length) {
                int i3 = 0;
                while (true) {
                    cArr = this.f5368;
                    if (i3 != cArr.length && (i = i2 + i3) < byteArray.length) {
                        cArr[i3] = (char) byteArray[i];
                        i3++;
                    }
                }
                write(cArr, 0, i3);
                newLine();
                i2 += this.f5368.length;
            }
            write("-----END CERTIFICATE-----");
            newLine();
        } catch (IOException e) {
            throw new RuntimeException("exception encoding base64 string: " + e);
        }
    }
}
