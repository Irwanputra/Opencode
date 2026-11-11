.class public final L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;
.super L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

.field public final 〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;

.field public ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

.field public いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

.field public おぐぴう〸ず:J

.field public final くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

.field public づざかべべ:Ljava/net/Socket;

.field public てぜきぽく:I

.field public なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

.field public のぷのちつ:I

.field public びぐびあび:Ljava/net/Socket;

.field public final へぬ〴づぞ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u306a\u304e\u3071\u3044\u3062\u304e/\u3041\u3054\u3050\u3059\u3059\u3043;",
            ">;>;"
        }
    .end annotation
.end field

.field public ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぁごぐすすぃ;L〳ぜぞぜべっ/じぜこほぱ;)V
    .registers 5

    invoke-direct {p0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->のぷのちつ:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->へぬ〴づぞ:Ljava/util/List;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->おぐぴう〸ず:J

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "Connection{"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 1
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 2
    iget-object v1, v1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 3
    iget-object v1, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 5
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 6
    iget-object v1, v1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 7
    iget v1, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 9
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 11
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

    if-eqz v1, :cond_45

    .line 13
    iget-object v1, v1, L〳ぜぞぜべっ/ぇぬぎばつ;->〺つふすそ:L〳ぜぞぜべっ/なぎぱいぢぎ;

    goto :goto_47

    :cond_45
    const-string v1, "none"

    .line 14
    :goto_47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〳ぜぞぜべっ()Z
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public 〺つふすそ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;)V
    .registers 3

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {p1, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->くし〴〺ぅ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    return-void
.end method

.method public ぁごぐすすぃ(L〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/じぜこほぱ;)Z
    .registers 7
    .param p2    # L〳ぜぞぜべっ/じぜこほぱ;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->へぬ〴づぞ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->のぷのちつ:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_83

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺふねづ〺:Z

    if-eqz v0, :cond_10

    goto :goto_83

    :cond_10
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/げつ〴ぬぐ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 1
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 2
    check-cast v0, L〳ぜぞぜべっ/でどあくず$げつ〴ぬぐ;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, p1}, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ(L〳ぜぞぜべっ/げつ〴ぬぐ;)Z

    move-result v0

    if-nez v0, :cond_22

    return v2

    .line 4
    :cond_22
    iget-object v0, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 5
    iget-object v0, v0, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 6
    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 7
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 8
    iget-object v1, v1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 9
    iget-object v1, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_36

    return v1

    :cond_36
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    if-nez v0, :cond_3b

    return v2

    :cond_3b
    if-nez p2, :cond_3e

    return v2

    .line 11
    :cond_3e
    iget-object v0, p2, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    .line 12
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_49

    return v2

    :cond_49
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 13
    iget-object v0, v0, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    .line 14
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_56

    return v2

    :cond_56
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 15
    iget-object v0, v0, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    iget-object v3, p2, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    .line 16
    invoke-virtual {v0, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_63

    return v2

    .line 17
    :cond_63
    iget-object p2, p2, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 18
    iget-object p2, p2, L〳ぜぞぜべっ/げつ〴ぬぐ;->いいにぽつ:Ljavax/net/ssl/HostnameVerifier;

    .line 19
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/びぐびあび;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/びぐびあび;

    if-eq p2, v0, :cond_6c

    return v2

    .line 20
    :cond_6c
    iget-object p2, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 21
    invoke-virtual {p0, p2}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ(L〳ぜぞぜべっ/ざとぅぼこ〺;)Z

    move-result p2

    if-nez p2, :cond_75

    return v2

    .line 22
    :cond_75
    :try_start_75
    iget-object p2, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺふねづ〺:L〳ぜぞぜべっ/づざかべべ;

    .line 23
    iget-object p1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 24
    iget-object p1, p1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 25
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

    .line 26
    iget-object v0, v0, L〳ぜぞぜべっ/ぇぬぎばつ;->くし〴〺ぅ:Ljava/util/List;

    .line 27
    invoke-virtual {p2, p1, v0}, L〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/util/List;)V
    :try_end_82
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_75 .. :try_end_82} :catch_83

    return v1

    :catch_83
    :cond_83
    :goto_83
    return v2
.end method

.method public いいにぽつ(L〳ぜぞぜべっ/ざとぅぼこ〺;)Z
    .registers 6

    .line 1
    iget v0, p1, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    .line 2
    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 3
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 4
    iget-object v1, v1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 5
    iget v2, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    const/4 v3, 0x0

    if-eq v0, v2, :cond_e

    return v3

    .line 6
    :cond_e
    iget-object v0, p1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    iget-object v1, v1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_31

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

    if-eqz v0, :cond_30

    sget-object v2, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/びぐびあび;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/びぐびあび;

    .line 8
    iget-object p1, p1, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 9
    iget-object v0, v0, L〳ぜぞぜべっ/ぇぬぎばつ;->くし〴〺ぅ:Ljava/util/List;

    .line 10
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2, p1, v0}, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/びぐびあび;->くし〴〺ぅ(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_30

    const/4 v3, 0x1

    :cond_30
    return v3

    :cond_31
    return v1
.end method

.method public くし〴〺ぅ(IIIIZL〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V
    .registers 23

    move-object v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

    if-nez v0, :cond_12c

    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 1
    iget-object v0, v0, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 2
    iget-object v1, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/List;

    .line 3
    new-instance v10, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;

    invoke-direct {v10, v1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;-><init>(Ljava/util/List;)V

    .line 4
    iget-object v0, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_51

    .line 5
    sget-object v0, L〳ぜぞぜべっ/〳ぜぞぜべっ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/〳ぜぞぜべっ;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 6
    iget-object v0, v0, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 7
    iget-object v0, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 8
    iget-object v0, v0, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 9
    sget-object v1, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    .line 10
    invoke-virtual {v1, v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->いいにぽつ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_31

    goto :goto_51

    :cond_31
    new-instance v1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;

    new-instance v2, Ljava/net/UnknownServiceException;

    const-string v3, "CLEARTEXT communication to "

    const-string v4, " not permitted by network security policy"

    invoke-static {v3, v0, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_44
    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_51
    :goto_51
    const/4 v11, 0x0

    move-object v12, v11

    :goto_53
    :try_start_53
    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_73

    move-object v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-virtual/range {v1 .. v6}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ(IIIL〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V

    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;
    :try_end_6b
    .catch Ljava/io/IOException; {:try_start_53 .. :try_end_6b} :catch_bb

    if-nez v0, :cond_6e

    goto :goto_86

    :cond_6e
    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_7a

    :cond_73
    move/from16 v1, p1

    move/from16 v2, p2

    :try_start_77
    invoke-virtual {p0, v1, v2, v8, v9}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび(IIL〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V
    :try_end_7a
    .catch Ljava/io/IOException; {:try_start_77 .. :try_end_7a} :catch_b7

    :goto_7a
    move/from16 v3, p4

    :try_start_7c
    invoke-virtual {p0, v10, v3, v8, v9}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->なぎぱいぢぎ(L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;IL〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V

    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 11
    iget-object v0, v0, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    .line 12
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_86
    .catch Ljava/io/IOException; {:try_start_7c .. :try_end_86} :catch_b5

    .line 13
    :goto_86
    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_a0

    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    if-eqz v0, :cond_93

    goto :goto_a0

    :cond_93
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Too many tunnel connections attempted: 21"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    new-instance v1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;

    invoke-direct {v1, v0}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_a0
    :goto_a0
    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_b4

    iget-object v1, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;

    monitor-enter v1

    :try_start_a7
    iget-object v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->せづっ〸ちね()I

    move-result v0

    iput v0, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->のぷのちつ:I

    monitor-exit v1

    goto :goto_b4

    :catchall_b1
    move-exception v0

    monitor-exit v1
    :try_end_b3
    .catchall {:try_start_a7 .. :try_end_b3} :catchall_b1

    throw v0

    :cond_b4
    :goto_b4
    return-void

    :catch_b5
    move-exception v0

    goto :goto_c1

    :catch_b7
    move-exception v0

    :goto_b8
    move/from16 v3, p4

    goto :goto_c1

    :catch_bb
    move-exception v0

    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_b8

    :goto_c1
    iget-object v4, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    invoke-static {v4}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->なぎぱいぢぎ(Ljava/net/Socket;)V

    iget-object v4, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    invoke-static {v4}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->なぎぱいぢぎ(Ljava/net/Socket;)V

    iput-object v11, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    iput-object v11, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    iput-object v11, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

    iput-object v11, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

    iput-object v11, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

    iput-object v11, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

    iput-object v11, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v4, v7, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 14
    iget-object v4, v4, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    .line 15
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v12, :cond_ea

    .line 16
    new-instance v12, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;

    invoke-direct {v12, v0}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;-><init>(Ljava/io/IOException;)V

    goto :goto_f9

    .line 17
    :cond_ea
    iget-object v6, v12, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;->〺つふすそ:Ljava/io/IOException;

    .line 18
    sget-object v13, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;->くし〴〺ぅ:Ljava/lang/reflect/Method;

    if-eqz v13, :cond_f7

    :try_start_f0
    new-array v14, v4, [Ljava/lang/Object;

    aput-object v6, v14, v5

    invoke-virtual {v13, v0, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f7
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_f0 .. :try_end_f7} :catch_f7
    .catch Ljava/lang/IllegalAccessException; {:try_start_f0 .. :try_end_f7} :catch_f7

    .line 19
    :catch_f7
    :cond_f7
    iput-object v0, v12, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/づざかべべ;->〺つふすそ:Ljava/io/IOException;

    :goto_f9
    if-eqz p5, :cond_12b

    .line 20
    iput-boolean v4, v10, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->びぐびあび:Z

    iget-boolean v6, v10, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->くし〴〺ぅ:Z

    if-nez v6, :cond_102

    goto :goto_127

    :cond_102
    instance-of v6, v0, Ljava/net/ProtocolException;

    if-eqz v6, :cond_107

    goto :goto_127

    :cond_107
    instance-of v6, v0, Ljava/io/InterruptedIOException;

    if-eqz v6, :cond_10c

    goto :goto_127

    :cond_10c
    instance-of v6, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v6, :cond_119

    invoke-virtual {v0}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v13

    instance-of v13, v13, Ljava/security/cert/CertificateException;

    if-eqz v13, :cond_119

    goto :goto_127

    :cond_119
    instance-of v13, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v13, :cond_11e

    goto :goto_127

    :cond_11e
    if-nez v6, :cond_126

    instance-of v0, v0, Ljavax/net/ssl/SSLProtocolException;

    if-eqz v0, :cond_125

    goto :goto_126

    :cond_125
    const/4 v4, 0x0

    :cond_126
    :goto_126
    move v5, v4

    :goto_127
    if-eqz v5, :cond_12b

    goto/16 :goto_53

    .line 21
    :cond_12b
    throw v12

    :cond_12c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_135

    :goto_134
    throw v0

    :goto_135
    goto :goto_134
.end method

.method public げつ〴ぬぐ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->せづっ〸ちね()I

    move-result p1

    iput p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->のぷのちつ:I

    monitor-exit v0

    return-void

    :catchall_b
    move-exception p1

    monitor-exit v0
    :try_end_d
    .catchall {:try_start_3 .. :try_end_d} :catchall_b

    throw p1
.end method

.method public final づざかべべ(IIIL〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V
    .registers 12

    .line 1
    new-instance v0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;-><init>()V

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 2
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 3
    iget-object v1, v1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 4
    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->なぎぱいぢぎ(L〳ぜぞぜべっ/ざとぅぼこ〺;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 5
    iget-object v1, v1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 6
    iget-object v1, v1, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    const/4 v2, 0x1

    .line 7
    invoke-static {v1, v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->へぬ〴づぞ(L〳ぜぞぜべっ/ざとぅぼこ〺;Z)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Host"

    invoke-virtual {v0, v3, v1}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;

    .line 8
    iget-object v1, v0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    const-string v3, "Proxy-Connection"

    const-string v4, "Keep-Alive"

    .line 9
    invoke-virtual {v1, v3, v4}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 10
    iget-object v5, v1, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v1, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v1, v0, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    const-string v3, "User-Agent"

    const-string v4, "okhttp/3.10.0"

    .line 12
    invoke-virtual {v1, v3, v4}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->びぐびあび(Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 13
    iget-object v5, v1, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v1, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ()L〳ぜぞぜべっ/ぉ〲なぱぽた;

    move-result-object v0

    .line 15
    iget-object v1, v0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 16
    invoke-virtual {p0, p1, p2, p4, p5}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび(IIL〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V

    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "CONNECT "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1, v2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->へぬ〴づぞ(L〳ぜぞぜべっ/ざとぅぼこ〺;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p4, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object p5, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

    const/4 v2, 0x0

    invoke-direct {p4, v2, v2, p5, v1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/でどあくず;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;Lぺぁあねじ/ぁごぐすすぃ;Lぺぁあねじ/なぎぱいぢぎ;)V

    invoke-interface {p5}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p5

    int-to-long v1, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p5, v1, v2, p2}, Lぺぁあねじ/〻ぞまぎな〻;->ぁごぐすすぃ(JLjava/util/concurrent/TimeUnit;)Lぺぁあねじ/〻ぞまぎな〻;

    iget-object p5, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p5}, Lぺぁあねじ/でどあくず;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p5

    int-to-long v1, p3

    invoke-virtual {p5, v1, v2, p2}, Lぺぁあねじ/〻ぞまぎな〻;->ぁごぐすすぃ(JLjava/util/concurrent/TimeUnit;)Lぺぁあねじ/〻ぞまぎな〻;

    .line 18
    iget-object p3, v0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

    .line 19
    invoke-virtual {p4, p3, p1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->ぺふねづ〺(L〳ぜぞぜべっ/ぉざぅち〻;Ljava/lang/String;)V

    .line 20
    iget-object p1, p4, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V

    const/4 p1, 0x0

    .line 21
    invoke-virtual {p4, p1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ(Z)L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    move-result-object p1

    .line 22
    iput-object v0, p1, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 23
    invoke-virtual {p1}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object p1

    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ(L〳ぜぞぜべっ/なぶひせが;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p3, v0, v2

    if-nez p3, :cond_ac

    const-wide/16 v0, 0x0

    :cond_ac
    invoke-virtual {p4, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ(J)Lぺぁあねじ/ぶでにく〼〳;

    move-result-object p3

    const p4, 0x7fffffff

    invoke-static {p3, p4, p2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ざっざへづ(Lぺぁあねじ/ぶでにく〼〳;ILjava/util/concurrent/TimeUnit;)Z

    check-cast p3, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$なぎぱいぢぎ;

    invoke-virtual {p3}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$なぎぱいぢぎ;->close()V

    .line 24
    iget p2, p1, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    const/16 p3, 0xc8

    if-eq p2, p3, :cond_eb

    const/16 p3, 0x197

    if-ne p2, p3, :cond_d6

    .line 25
    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 26
    iget-object p1, p1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 27
    iget-object p1, p1, L〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/〺つふすそ;

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d6
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Unexpected response code for CONNECT: "

    invoke-static {p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    .line 29
    iget p1, p1, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    .line 30
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_eb
    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p1}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object p1

    invoke-virtual {p1}, Lぺぁあねじ/づざかべべ;->のぷのちつ()Z

    move-result p1

    if-eqz p1, :cond_104

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object p1

    invoke-virtual {p1}, Lぺぁあねじ/づざかべべ;->のぷのちつ()Z

    move-result p1

    if-eqz p1, :cond_104

    return-void

    :cond_104
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final なぎぱいぢぎ(L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;IL〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V
    .registers 13

    sget-object p3, L〳ぜぞぜべっ/ぶでにく〼〳;->びぐびあび:L〳ぜぞぜべっ/ぶでにく〼〳;

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 1
    iget-object v0, v0, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 2
    iget-object v0, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_11

    .line 3
    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    return-void

    .line 4
    :cond_11
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iget-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 6
    iget-object p4, p4, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 7
    iget-object v0, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    .line 8
    :try_start_1b
    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    .line 9
    iget-object v3, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 10
    iget-object v4, v3, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 11
    iget v3, v3, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    const/4 v5, 0x1

    .line 12
    invoke-virtual {v0, v2, v4, v3, v5}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLSocket;
    :try_end_2a
    .catch Ljava/lang/AssertionError; {:try_start_1b .. :try_end_2a} :catch_1f1
    .catchall {:try_start_1b .. :try_end_2a} :catchall_1ef

    :try_start_2a
    invoke-virtual {p1, v0}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ(Ljavax/net/ssl/SSLSocket;)L〳ぜぞぜべっ/〳ぜぞぜべっ;

    move-result-object p1

    .line 13
    iget-boolean v2, p1, L〳ぜぞぜべっ/〳ぜぞぜべっ;->〺つふすそ:Z

    if-eqz v2, :cond_3d

    .line 14
    sget-object v2, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    .line 15
    iget-object v3, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 16
    iget-object v3, v3, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 17
    iget-object v4, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    .line 18
    invoke-virtual {v2, v0, v3, v4}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->づざかべべ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_3d
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    move-result-object v3

    const-string v4, "NONE"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_5f

    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    move-result-object v3

    const-string v6, "SSL_NULL_WITH_NULL_NULL"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5f

    const/4 v3, 0x1

    goto :goto_60

    :cond_5f
    const/4 v3, 0x0

    :goto_60
    if-eqz v3, :cond_1e2

    .line 20
    invoke-static {v2}, L〳ぜぞぜべっ/ぇぬぎばつ;->げつ〴ぬぐ(Ljavax/net/ssl/SSLSession;)L〳ぜぞぜべっ/ぇぬぎばつ;

    move-result-object v3

    .line 21
    iget-object v6, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->いいにぽつ:Ljavax/net/ssl/HostnameVerifier;

    .line 22
    iget-object v7, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 23
    iget-object v7, v7, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 24
    invoke-interface {v6, v7, v2}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v2

    if-eqz v2, :cond_197

    .line 25
    iget-object v2, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺふねづ〺:L〳ぜぞぜべっ/づざかべべ;

    .line 26
    iget-object p4, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 27
    iget-object p4, p4, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 28
    iget-object v6, v3, L〳ぜぞぜべっ/ぇぬぎばつ;->くし〴〺ぅ:Ljava/util/List;

    .line 29
    invoke-virtual {v2, p4, v6}, L〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/util/List;)V

    .line 30
    iget-boolean p1, p1, L〳ぜぞぜべっ/〳ぜぞぜべっ;->〺つふすそ:Z

    if-eqz p1, :cond_87

    .line 31
    sget-object p1, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    .line 32
    invoke-virtual {p1, v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->〳ぜぞぜべっ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v1

    :cond_87
    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    invoke-static {v0}, Lぺぁあねじ/おぐぴう〸ず;->びぐびあび(Ljava/net/Socket;)Lぺぁあねじ/ぶでにく〼〳;

    move-result-object p1

    .line 33
    new-instance p4, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {p4, p1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 34
    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    invoke-static {p1}, Lぺぁあねじ/おぐぴう〸ず;->〺つふすそ(Ljava/net/Socket;)Lぺぁあねじ/でどあくず;

    move-result-object p1

    .line 35
    new-instance p4, Lぺぁあねじ/ぉざぅち〻;

    invoke-direct {p4, p1}, Lぺぁあねじ/ぉざぅち〻;-><init>(Lぺぁあねじ/でどあくず;)V

    .line 36
    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

    iput-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

    if-eqz v1, :cond_a9

    invoke-static {v1}, L〳ぜぞぜべっ/ぶでにく〼〳;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ぶでにく〼〳;

    move-result-object p3

    :cond_a9
    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;
    :try_end_ab
    .catch Ljava/lang/AssertionError; {:try_start_2a .. :try_end_ab} :catch_1ec
    .catchall {:try_start_2a .. :try_end_ab} :catchall_1ea

    .line 37
    sget-object p1, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    .line 38
    invoke-virtual {p1, v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljavax/net/ssl/SSLSocket;)V

    .line 39
    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

    sget-object p3, L〳ぜぞぜべっ/ぶでにく〼〳;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぶでにく〼〳;

    if-ne p1, p3, :cond_196

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    invoke-virtual {p1, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;

    invoke-direct {p1, v5}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;-><init>(Z)V

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    iget-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 40
    iget-object p4, p4, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 41
    iget-object p4, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 42
    iget-object p4, p4, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 43
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

    .line 44
    iput-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/net/Socket;

    iput-object p4, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    iput-object v0, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    iput-object v1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    .line 45
    iput-object p0, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;

    .line 46
    iput p2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;->なぎぱいぢぎ:I

    .line 47
    new-instance p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-direct {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$くし〴〺ぅ;)V

    .line 48
    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    .line 49
    iget-object p1, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    .line 50
    monitor-enter p1

    :try_start_e4
    iget-boolean p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez p3, :cond_18b

    iget-boolean p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Z

    if-nez p3, :cond_ed

    goto :goto_11a

    :cond_ed
    sget-object p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〳ぜぞぜべっ:Ljava/util/logging/Logger;

    sget-object p4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p3, p4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p4

    if-eqz p4, :cond_10a

    const-string p4, ">> CONNECTION %s"

    new-array v0, v5, [Ljava/lang/Object;

    sget-object v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-virtual {v1}, Lぺぁあねじ/〳ぜぞぜべっ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {p4, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_10a
    iget-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    sget-object p4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-virtual {p4}, Lぺぁあねじ/〳ぜぞぜべっ;->へぬ〴づぞ()[B

    move-result-object p4

    invoke-interface {p3, p4}, Lぺぁあねじ/なぎぱいぢぎ;->ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p3}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V
    :try_end_11a
    .catchall {:try_start_e4 .. :try_end_11a} :catchall_193

    :goto_11a
    monitor-exit p1

    .line 51
    iget-object p1, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    iget-object p3, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->おぐぴう〸ず:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    .line 52
    monitor-enter p1

    :try_start_120
    iget-boolean p4, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->なぎぱいぢぎ:Z

    if-nez p4, :cond_180

    .line 53
    iget p4, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:I

    invoke-static {p4}, Ljava/lang/Integer;->bitCount(I)I

    move-result p4

    mul-int/lit8 p4, p4, 0x6

    const/4 v0, 0x4

    .line 54
    invoke-virtual {p1, v4, p4, v0, v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->ぉひのべい(IIBB)V

    const/4 p4, 0x0

    :goto_131
    const/16 v1, 0xa

    if-ge p4, v1, :cond_15d

    shl-int v1, v5, p4

    .line 55
    iget v2, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_13e

    const/4 v1, 0x1

    goto :goto_13f

    :cond_13e
    const/4 v1, 0x0

    :goto_13f
    if-nez v1, :cond_142

    goto :goto_15a

    :cond_142
    if-ne p4, v0, :cond_146

    const/4 v1, 0x3

    goto :goto_14c

    :cond_146
    const/4 v1, 0x7

    if-ne p4, v1, :cond_14b

    const/4 v1, 0x4

    goto :goto_14c

    :cond_14b
    move v1, p4

    .line 56
    :goto_14c
    iget-object v2, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v2, v1}, Lぺぁあねじ/なぎぱいぢぎ;->〳ぜぞぜべっ(I)Lぺぁあねじ/なぎぱいぢぎ;

    iget-object v1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    .line 57
    iget-object v2, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->〺つふすそ:[I

    aget v2, v2, p4

    .line 58
    invoke-interface {v1, v2}, Lぺぁあねじ/なぎぱいぢぎ;->いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;

    :goto_15a
    add-int/lit8 p4, p4, 0x1

    goto :goto_131

    :cond_15d
    iget-object p3, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p3}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V
    :try_end_162
    .catchall {:try_start_120 .. :try_end_162} :catchall_188

    monitor-exit p1

    .line 59
    iget-object p1, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->おぐぴう〸ず:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ()I

    move-result p1

    const p3, 0xffff

    if-eq p1, p3, :cond_175

    iget-object p4, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    sub-int/2addr p1, p3

    int-to-long v0, p1

    invoke-virtual {p4, v4, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->〺でおいここ(IJ)V

    :cond_175
    new-instance p1, Ljava/lang/Thread;

    iget-object p2, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ごづごきえ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    goto :goto_196

    .line 60
    :cond_180
    :try_start_180
    new-instance p2, Ljava/io/IOException;

    const-string p3, "closed"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_188
    .catchall {:try_start_180 .. :try_end_188} :catchall_188

    :catchall_188
    move-exception p2

    monitor-exit p1

    throw p2

    .line 61
    :cond_18b
    :try_start_18b
    new-instance p2, Ljava/io/IOException;

    const-string p3, "closed"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_193
    .catchall {:try_start_18b .. :try_end_193} :catchall_193

    :catchall_193
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_196
    :goto_196
    return-void

    .line 62
    :cond_197
    :try_start_197
    iget-object p1, v3, L〳ぜぞぜべっ/ぇぬぎばつ;->くし〴〺ぅ:Ljava/util/List;

    .line 63
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Hostname "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    iget-object p4, p4, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 65
    iget-object p4, p4, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    .line 66
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " not verified:\n    certificate: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, L〳ぜぞぜべっ/づざかべべ;->〺つふすそ(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "\n    DN: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p4

    invoke-interface {p4}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "\n    subjectAltNames: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/びぐびあび;->げつ〴ぬぐ(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1e2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "a valid ssl session was not established"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1ea
    .catch Ljava/lang/AssertionError; {:try_start_197 .. :try_end_1ea} :catch_1ec
    .catchall {:try_start_197 .. :try_end_1ea} :catchall_1ea

    :catchall_1ea
    move-exception p1

    goto :goto_200

    :catch_1ec
    move-exception p1

    move-object v1, v0

    goto :goto_1f2

    :catchall_1ef
    move-exception p1

    goto :goto_1ff

    :catch_1f1
    move-exception p1

    :goto_1f2
    :try_start_1f2
    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->は〲ぱなで(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_1fe

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_1fe
    throw p1
    :try_end_1ff
    .catchall {:try_start_1f2 .. :try_end_1ff} :catchall_1ef

    :goto_1ff
    move-object v0, v1

    :goto_200
    if-eqz v0, :cond_207

    .line 67
    sget-object p2, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    .line 68
    invoke-virtual {p2, v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljavax/net/ssl/SSLSocket;)V

    :cond_207
    invoke-static {v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->なぎぱいぢぎ(Ljava/net/Socket;)V

    goto :goto_20c

    :goto_20b
    throw p1

    :goto_20c
    goto :goto_20b
.end method

.method public final びぐびあび(IIL〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;)V
    .registers 8

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 1
    iget-object v0, p3, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    .line 2
    iget-object p3, p3, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 3
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v1, v2, :cond_1d

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v1, v2, :cond_17

    goto :goto_1d

    :cond_17
    new-instance p3, Ljava/net/Socket;

    invoke-direct {p3, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_23

    .line 4
    :cond_1d
    :goto_1d
    iget-object p3, p3, L〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Ljavax/net/SocketFactory;

    .line 5
    invoke-virtual {p3}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object p3

    :goto_23
    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 6
    iget-object p3, p3, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 9
    :try_start_31
    sget-object p2, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    .line 10
    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    iget-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 11
    iget-object p4, p4, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    .line 12
    invoke-virtual {p2, p3, p4, p1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->なぎぱいぢぎ(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_3c
    .catch Ljava/net/ConnectException; {:try_start_31 .. :try_end_3c} :catch_6b

    :try_start_3c
    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    invoke-static {p1}, Lぺぁあねじ/おぐぴう〸ず;->びぐびあび(Ljava/net/Socket;)Lぺぁあねじ/ぶでにく〼〳;

    move-result-object p1

    .line 13
    new-instance p2, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {p2, p1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 14
    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    invoke-static {p1}, Lぺぁあねじ/おぐぴう〸ず;->〺つふすそ(Ljava/net/Socket;)Lぺぁあねじ/でどあくず;

    move-result-object p1

    .line 15
    new-instance p2, Lぺぁあねじ/ぉざぅち〻;

    invoke-direct {p2, p1}, Lぺぁあねじ/ぉざぅち〻;-><init>(Lぺぁあねじ/でどあくず;)V

    .line 16
    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;
    :try_end_56
    .catch Ljava/lang/NullPointerException; {:try_start_3c .. :try_end_56} :catch_57

    goto :goto_64

    :catch_57
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_65

    :goto_64
    return-void

    :cond_65
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_6b
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    const-string p3, "Failed to connect to "

    invoke-static {p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    iget-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 17
    iget-object p4, p4, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    .line 18
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/net/ConnectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public ぺぁあねじ(L〳ぜぞぜべっ/でどあくず;L〳ぜぞぜべっ/は〲ぱなで$げつ〴ぬぐ;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;)L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;
    .registers 8

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_c

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    invoke-direct {v0, p1, p2, p3, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ;-><init>(L〳ぜぞぜべっ/でどあくず;L〳ぜぞぜべっ/は〲ぱなで$げつ〴ぬぐ;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;)V

    return-object v0

    :cond_c
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    check-cast p2, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;

    .line 1
    iget v1, p2, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->いいにぽつ:I

    .line 2
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    .line 3
    iget v1, p2, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->いいにぽつ:I

    int-to-long v1, v1

    .line 4
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lぺぁあねじ/〻ぞまぎな〻;->ぁごぐすすぃ(JLjava/util/concurrent/TimeUnit;)Lぺぁあねじ/〻ぞまぎな〻;

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0}, Lぺぁあねじ/でどあくず;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    .line 5
    iget p2, p2, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->ぺふねづ〺:I

    int-to-long v1, p2

    .line 6
    invoke-virtual {v0, v1, v2, v3}, Lぺぁあねじ/〻ぞまぎな〻;->ぁごぐすすぃ(JLjava/util/concurrent/TimeUnit;)Lぺぁあねじ/〻ぞまぎな〻;

    new-instance p2, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺぁあねじ:Lぺぁあねじ/ぁごぐすすぃ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-direct {p2, p1, p3, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/でどあくず;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;Lぺぁあねじ/ぁごぐすすぃ;Lぺぁあねじ/なぎぱいぢぎ;)V

    return-object p2
.end method
