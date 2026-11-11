.class public final Lぺぁあねじ/おぐぴう〸ず;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final げつ〴ぬぐ:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, Lぺぁあねじ/おぐぴう〸ず;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 〺つふすそ(Ljava/net/Socket;)Lぺぁあねじ/でどあくず;
    .registers 3

    if-eqz p0, :cond_2e

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    if-eqz v0, :cond_26

    .line 1
    new-instance v0, Lぺぁあねじ/ぇぬぎばつ;

    invoke-direct {v0, p0}, Lぺぁあねじ/ぇぬぎばつ;-><init>(Ljava/net/Socket;)V

    .line 2
    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    if-eqz p0, :cond_1e

    .line 3
    new-instance v1, Lぺぁあねじ/へぬ〴づぞ;

    invoke-direct {v1, v0, p0}, Lぺぁあねじ/へぬ〴づぞ;-><init>(Lぺぁあねじ/〻ぞまぎな〻;Ljava/io/OutputStream;)V

    .line 4
    new-instance p0, Lぺぁあねじ/げつ〴ぬぐ;

    invoke-direct {p0, v0, v1}, Lぺぁあねじ/げつ〴ぬぐ;-><init>(Lぺぁあねじ/くし〴〺ぅ;Lぺぁあねじ/でどあくず;)V

    return-object p0

    .line 5
    :cond_1e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "out == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 6
    :cond_26
    new-instance p0, Ljava/io/IOException;

    const-string v0, "socket\'s output stream == null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "socket == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static くし〴〺ぅ(Ljava/io/InputStream;Lぺぁあねじ/〻ぞまぎな〻;)Lぺぁあねじ/ぶでにく〼〳;
    .registers 3

    if-eqz p0, :cond_8

    new-instance v0, Lぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;

    invoke-direct {v0, p1, p0}, Lぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;-><init>(Lぺぁあねじ/〻ぞまぎな〻;Ljava/io/InputStream;)V

    return-object v0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "in == null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static げつ〴ぬぐ(Ljava/lang/AssertionError;)Z
    .registers 2

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getsockname failed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1a

    const/4 p0, 0x1

    goto :goto_1b

    :cond_1a
    const/4 p0, 0x0

    :goto_1b
    return p0
.end method

.method public static びぐびあび(Ljava/net/Socket;)Lぺぁあねじ/ぶでにく〼〳;
    .registers 3

    if-eqz p0, :cond_23

    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_1b

    .line 1
    new-instance v0, Lぺぁあねじ/ぇぬぎばつ;

    invoke-direct {v0, p0}, Lぺぁあねじ/ぇぬぎばつ;-><init>(Ljava/net/Socket;)V

    .line 2
    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0, v0}, Lぺぁあねじ/おぐぴう〸ず;->くし〴〺ぅ(Ljava/io/InputStream;Lぺぁあねじ/〻ぞまぎな〻;)Lぺぁあねじ/ぶでにく〼〳;

    move-result-object p0

    .line 3
    new-instance v1, Lぺぁあねじ/〺つふすそ;

    invoke-direct {v1, v0, p0}, Lぺぁあねじ/〺つふすそ;-><init>(Lぺぁあねじ/くし〴〺ぅ;Lぺぁあねじ/ぶでにく〼〳;)V

    return-object v1

    .line 4
    :cond_1b
    new-instance p0, Ljava/io/IOException;

    const-string v0, "socket\'s input stream == null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_23
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "socket == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
