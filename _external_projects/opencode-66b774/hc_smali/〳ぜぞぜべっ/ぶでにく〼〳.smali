.class public final enum L〳ぜぞぜべっ/ぶでにく〼〳;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3076\u3067\u306b\u304f\u303c\u3033;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic 〳ぜぞぜべっ:[L〳ぜぞぜべっ/ぶでにく〼〳;

.field public static final enum ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

.field public static final enum くし〴〺ぅ:L〳ぜぞぜべっ/ぶでにく〼〳;

.field public static final enum づざかべべ:L〳ぜぞぜべっ/ぶでにく〼〳;

.field public static final enum なぎぱいぢぎ:L〳ぜぞぜべっ/ぶでにく〼〳;

.field public static final enum びぐびあび:L〳ぜぞぜべっ/ぶでにく〼〳;


# instance fields
.field public final 〺つふすそ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 12

    new-instance v0, L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v1, "HTTP_1_0"

    const/4 v2, 0x0

    const-string v3, "http/1.0"

    invoke-direct {v0, v1, v2, v3}, L〳ぜぞぜべっ/ぶでにく〼〳;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->くし〴〺ぅ:L〳ぜぞぜべっ/ぶでにく〼〳;

    new-instance v1, L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v3, "HTTP_1_1"

    const/4 v4, 0x1

    const-string v5, "http/1.1"

    invoke-direct {v1, v3, v4, v5}, L〳ぜぞぜべっ/ぶでにく〼〳;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, L〳ぜぞぜべっ/ぶでにく〼〳;->びぐびあび:L〳ぜぞぜべっ/ぶでにく〼〳;

    new-instance v3, L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v5, "SPDY_3"

    const/4 v6, 0x2

    const-string v7, "spdy/3.1"

    invoke-direct {v3, v5, v6, v7}, L〳ぜぞぜべっ/ぶでにく〼〳;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, L〳ぜぞぜべっ/ぶでにく〼〳;->づざかべべ:L〳ぜぞぜべっ/ぶでにく〼〳;

    new-instance v5, L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v7, "HTTP_2"

    const/4 v8, 0x3

    const-string v9, "h2"

    invoke-direct {v5, v7, v8, v9}, L〳ぜぞぜべっ/ぶでにく〼〳;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, L〳ぜぞぜべっ/ぶでにく〼〳;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぶでにく〼〳;

    new-instance v7, L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v9, "QUIC"

    const/4 v10, 0x4

    const-string v11, "quic"

    invoke-direct {v7, v9, v10, v11}, L〳ぜぞぜべっ/ぶでにく〼〳;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, L〳ぜぞぜべっ/ぶでにく〼〳;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

    const/4 v9, 0x5

    new-array v9, v9, [L〳ぜぞぜべっ/ぶでにく〼〳;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, L〳ぜぞぜべっ/ぶでにく〼〳;->〳ぜぞぜべっ:[L〳ぜぞぜべっ/ぶでにく〼〳;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, L〳ぜぞぜべっ/ぶでにく〼〳;->〺つふすそ:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)L〳ぜぞぜべっ/ぶでにく〼〳;
    .registers 2

    const-class v0, L〳ぜぞぜべっ/ぶでにく〼〳;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, L〳ぜぞぜべっ/ぶでにく〼〳;

    return-object p0
.end method

.method public static values()[L〳ぜぞぜべっ/ぶでにく〼〳;
    .registers 1

    sget-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->〳ぜぞぜべっ:[L〳ぜぞぜべっ/ぶでにく〼〳;

    invoke-virtual {v0}, [L〳ぜぞぜべっ/ぶでにく〼〳;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [L〳ぜぞぜべっ/ぶでにく〼〳;

    return-object v0
.end method

.method public static げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ぶでにく〼〳;
    .registers 3

    sget-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->くし〴〺ぅ:L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v1, "http/1.0"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    return-object v0

    :cond_b
    sget-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->びぐびあび:L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v1, "http/1.1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    return-object v0

    :cond_16
    sget-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v1, "h2"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    return-object v0

    :cond_21
    sget-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->づざかべべ:L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v1, "spdy/3.1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    return-object v0

    :cond_2c
    sget-object v0, L〳ぜぞぜべっ/ぶでにく〼〳;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぶでにく〼〳;

    const-string v1, "quic"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_37

    return-object v0

    :cond_37
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected protocol: "

    invoke-static {v1, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぶでにく〼〳;->〺つふすそ:Ljava/lang/String;

    return-object v0
.end method
