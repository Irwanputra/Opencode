package dev.epro.r0;

import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R1620071977321010765 extends Writer {
    public final StringBuilder a;
    public final N6866477208811963417 b = new N6866477208811963417();

    public R1620071977321010765(StringBuilder sb) {
        this.a = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        N6866477208811963417 n6866477208811963417 = this.b;
        n6866477208811963417.a = cArr;
        n6866477208811963417.b = null;
        this.a.append((CharSequence) n6866477208811963417, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        Objects.requireNonNull(str);
        this.a.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.a.append((char) i);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
