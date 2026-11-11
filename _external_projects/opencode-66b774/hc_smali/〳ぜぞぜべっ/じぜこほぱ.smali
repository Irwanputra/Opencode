.class public final L〳ぜぞぜべっ/じぜこほぱ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:Ljava/net/Proxy;

.field public final くし〴〺ぅ:Ljava/net/InetSocketAddress;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/げつ〴ぬぐ;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_16

    if-eqz p3, :cond_e

    iput-object p1, p0, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    iput-object p2, p0, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    iput-object p3, p0, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    return-void

    :cond_e
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "inetSocketAddress == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "address == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, L〳ぜぞぜべっ/じぜこほぱ;

    if-eqz v0, :cond_26

    check-cast p1, L〳ぜぞぜべっ/じぜこほぱ;

    iget-object v0, p1, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v1, p0, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/げつ〴ぬぐ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    iget-object v0, p1, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    iget-object v1, p0, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    invoke-virtual {v0, v1}, Ljava/net/Proxy;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    iget-object p1, p1, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    iget-object v0, p0, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    invoke-virtual {p1, v0}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_26

    const/4 p1, 0x1

    goto :goto_27

    :cond_26
    const/4 p1, 0x0

    :goto_27
    return p1
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/げつ〴ぬぐ;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    invoke-virtual {v1}, Ljava/net/Proxy;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "Route{"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, L〳ぜぞぜべっ/じぜこほぱ;->くし〴〺ぅ:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ()Z
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v0, v0, L〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_12

    iget-object v0, p0, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    return v0
.end method
