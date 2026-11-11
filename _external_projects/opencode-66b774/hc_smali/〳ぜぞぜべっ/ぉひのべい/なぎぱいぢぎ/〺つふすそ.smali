.class public final L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:Z

.field public final げつ〴ぬぐ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3033\u305c\u305e\u305c\u3079\u3063;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3033\u305c\u305e\u305c\u3079\u3063;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljavax/net/ssl/SSLSocket;)L〳ぜぞぜべっ/〳ぜぞぜべっ;
    .registers 15

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_8
    if-ge v0, v1, :cond_20

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, L〳ぜぞぜべっ/〳ぜぞぜべっ;

    invoke-virtual {v2, p1}, L〳ぜぞぜべっ/〳ぜぞぜべっ;->げつ〴ぬぐ(Ljavax/net/ssl/SSLSocket;)Z

    move-result v3

    if-eqz v3, :cond_1d

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    goto :goto_21

    :cond_1d
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_20
    const/4 v2, 0x0

    :goto_21
    if-eqz v2, :cond_ec

    .line 1
    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    :goto_25
    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x0

    if-ge v0, v1, :cond_41

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, L〳ぜぞぜべっ/〳ぜぞぜべっ;

    invoke-virtual {v1, p1}, L〳ぜぞぜべっ/〳ぜぞぜべっ;->げつ〴ぬぐ(Ljavax/net/ssl/SSLSocket;)Z

    move-result v1

    if-eqz v1, :cond_3e

    const/4 v0, 0x1

    goto :goto_42

    :cond_3e
    add-int/lit8 v0, v0, 0x1

    goto :goto_25

    :cond_41
    const/4 v0, 0x0

    .line 2
    :goto_42
    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->くし〴〺ぅ:Z

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/げつ〴ぬぐ;

    iget-boolean v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->びぐびあび:Z

    check-cast v0, L〳ぜぞぜべっ/でどあくず$げつ〴ぬぐ;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iget-object v0, v2, L〳ぜぞぜべっ/〳ぜぞぜべっ;->くし〴〺ぅ:[Ljava/lang/String;

    if-eqz v0, :cond_5e

    sget-object v0, L〳ぜぞぜべっ/なぎぱいぢぎ;->〺つふすそ:Ljava/util/Comparator;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, L〳ぜぞぜべっ/〳ぜぞぜべっ;->くし〴〺ぅ:[Ljava/lang/String;

    invoke-static {v0, v4, v5}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ざとぅぼこ〺(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_62

    :cond_5e
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    :goto_62
    iget-object v4, v2, L〳ぜぞぜべっ/〳ぜぞぜべっ;->びぐびあび:[Ljava/lang/String;

    if-eqz v4, :cond_73

    sget-object v4, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->おぐぴう〸ず:Ljava/util/Comparator;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v5

    iget-object v6, v2, L〳ぜぞぜべっ/〳ぜぞぜべっ;->びぐびあび:[Ljava/lang/String;

    invoke-static {v4, v5, v6}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ざとぅぼこ〺(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    goto :goto_77

    :cond_73
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v4

    :goto_77
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v5

    sget-object v6, L〳ぜぞぜべっ/なぎぱいぢぎ;->〺つふすそ:Ljava/util/Comparator;

    .line 5
    sget-object v7, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ:[B

    array-length v7, v5

    const/4 v8, 0x0

    :goto_81
    const/4 v9, -0x1

    if-ge v8, v7, :cond_95

    aget-object v10, v5, v8

    move-object v11, v6

    check-cast v11, L〳ぜぞぜべっ/なぎぱいぢぎ$げつ〴ぬぐ;

    const-string v12, "TLS_FALLBACK_SCSV"

    invoke-virtual {v11, v10, v12}, L〳ぜぞぜべっ/なぎぱいぢぎ$げつ〴ぬぐ;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v10

    if-nez v10, :cond_92

    goto :goto_96

    :cond_92
    add-int/lit8 v8, v8, 0x1

    goto :goto_81

    :cond_95
    const/4 v8, -0x1

    :goto_96
    if-eqz v1, :cond_a9

    if-eq v8, v9, :cond_a9

    .line 6
    aget-object v1, v5, v8

    .line 7
    array-length v5, v0

    add-int/lit8 v5, v5, 0x1

    new-array v6, v5, [Ljava/lang/String;

    array-length v7, v0

    invoke-static {v0, v3, v6, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v5, v9

    aput-object v1, v6, v5

    move-object v0, v6

    .line 8
    :cond_a9
    iget-boolean v1, v2, L〳ぜぞぜべっ/〳ぜぞぜべっ;->げつ〴ぬぐ:Z

    if-eqz v1, :cond_e4

    .line 9
    array-length v3, v0

    if-eqz v3, :cond_dc

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    if-eqz v1, :cond_d4

    .line 10
    array-length v1, v4

    if-eqz v1, :cond_cc

    invoke-virtual {v4}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    if-eqz v1, :cond_c6

    .line 11
    invoke-virtual {p1, v1}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_c6
    if-eqz v0, :cond_cb

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_cb
    return-object v2

    .line 12
    :cond_cc
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one TLS version is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_dc
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one cipher suite is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no cipher suites for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_ec
    new-instance v0, Ljava/net/UnknownServiceException;

    const-string v1, "Unable to find acceptable protocols. isFallback="

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->びぐびあび:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", modes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", supported protocols="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    goto :goto_11c

    :goto_11b
    throw v0

    :goto_11c
    goto :goto_11b
.end method
