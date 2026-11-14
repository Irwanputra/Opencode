package dev.epro.r0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P5966767792677138996 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public P5966767792677138996(long j, long j2, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public static P5966767792677138996 a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            P5966767792677138996 p5966767792677138996 = new P5966767792677138996(dataInputStream.readLong(), dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt());
            dataInputStream.close();
            return p5966767792677138996;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof P5966767792677138996)) {
            P5966767792677138996 p5966767792677138996 = (P5966767792677138996) obj;
            if (this.b == p5966767792677138996.b && this.c == p5966767792677138996.c && this.a == p5966767792677138996.a && this.d == p5966767792677138996.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.a), Long.valueOf(this.d));
    }
}
