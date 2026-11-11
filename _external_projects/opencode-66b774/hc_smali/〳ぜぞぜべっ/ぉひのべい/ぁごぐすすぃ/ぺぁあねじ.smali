.class public final L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:I

.field public final くし〴〺ぅ:Ljava/lang/String;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/ぶでにく〼〳;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぶでにく〼〳;ILjava/lang/String;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぶでにく〼〳;

    iput p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ:I

    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    return-void
.end method

.method public static げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;
    .registers 8

    sget-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->くし〴〺ぅ:L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v1, "HTTP/1."

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/16 v2, 0x20

    const/16 v3, 0x9

    const-string v4, "Unexpected status line: "

    if-eqz v1, :cond_42

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v3, :cond_38

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_38

    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    add-int/lit8 v1, v1, -0x30

    if-nez v1, :cond_28

    goto :goto_4b

    :cond_28
    const/4 v0, 0x1

    if-ne v1, v0, :cond_2e

    sget-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->びぐびあび:L〳ぜぞぜべっ/ぶでにく〼〳;

    goto :goto_4b

    :cond_2e
    new-instance v0, Ljava/net/ProtocolException;

    invoke-static {v4, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Ljava/net/ProtocolException;

    invoke-static {v4, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_42
    const-string v1, "ICY "

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_94

    const/4 v3, 0x4

    :goto_4b
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v5, v3, 0x3

    if-lt v1, v5, :cond_8a

    :try_start_53
    invoke-virtual {p0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_5b
    .catch Ljava/lang/NumberFormatException; {:try_start_53 .. :try_end_5b} :catch_80

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-le v6, v5, :cond_78

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v2, :cond_6e

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_7a

    :cond_6e
    new-instance v0, Ljava/net/ProtocolException;

    invoke-static {v4, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_78
    const-string p0, ""

    :goto_7a
    new-instance v2, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;

    invoke-direct {v2, v0, v1, p0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;-><init>(L〳ぜぞぜべっ/ぶでにく〼〳;ILjava/lang/String;)V

    return-object v2

    :catch_80
    new-instance v0, Ljava/net/ProtocolException;

    invoke-static {v4, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8a
    new-instance v0, Ljava/net/ProtocolException;

    invoke-static {v4, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_94
    new-instance v0, Ljava/net/ProtocolException;

    invoke-static {v4, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぶでにく〼〳;

    sget-object v2, L〳ぜぞぜべっ/ぶでにく〼〳;->くし〴〺ぅ:L〳ぜぞぜべっ/ぶでにく〼〳;

    if-ne v1, v2, :cond_e

    const-string v1, "HTTP/1.0"

    goto :goto_10

    :cond_e
    const-string v1, "HTTP/1.1"

    :goto_10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    if-eqz v2, :cond_29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
