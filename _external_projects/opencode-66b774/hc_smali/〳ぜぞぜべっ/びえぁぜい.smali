.class public abstract L〳ぜぞぜべっ/びえぁぜい;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static くし〴〺ぅ(L〳ぜぞぜべっ/ごづごきえ;Ljava/lang/String;)L〳ぜぞぜべっ/びえぁぜい;
    .registers 2
    .param p0    # L〳ぜぞぜべっ/ごづごきえ;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    sget-object p0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ:Ljava/nio/charset/Charset;

    const/4 p0, 0x0

    .line 1
    throw p0
.end method

.method public static びぐびあび(L〳ぜぞぜべっ/ごづごきえ;[B)L〳ぜぞぜべっ/びえぁぜい;
    .registers 10
    .param p0    # L〳ぜぞぜべっ/ごづごきえ;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    array-length v0, p1

    .line 1
    array-length v1, p1

    int-to-long v2, v1

    const/4 v1, 0x0

    int-to-long v4, v1

    int-to-long v6, v0

    invoke-static/range {v2 .. v7}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->びぐびあび(JJJ)V

    new-instance v2, L〳ぜぞぜべっ/ぇ〳〲〺すっ;

    invoke-direct {v2, p0, v0, p1, v1}, L〳ぜぞぜべっ/ぇ〳〲〺すっ;-><init>(L〳ぜぞぜべっ/ごづごきえ;I[BI)V

    return-object v2
.end method


# virtual methods
.method public abstract 〺つふすそ()L〳ぜぞぜべっ/ごづごきえ;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract げつ〴ぬぐ()J
.end method

.method public abstract づざかべべ(Lぺぁあねじ/なぎぱいぢぎ;)V
.end method
