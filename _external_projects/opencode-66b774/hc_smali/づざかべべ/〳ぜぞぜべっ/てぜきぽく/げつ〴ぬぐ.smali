.class public Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;
.super Ljava/io/Writer;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/String;

.field public くし〴〺ぅ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 4

    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/StringBuilder;

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 1

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->じぜこほぱ()V

    return-void
.end method

.method public flush()V
    .registers 1

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->じぜこほぱ()V

    return-void
.end method

.method public write([CII)V
    .registers 7

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p3, :cond_17

    add-int v1, p2, v0

    aget-char v1, p1, v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_f

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->じぜこほぱ()V

    goto :goto_14

    :cond_f
    iget-object v2, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_14
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_17
    return-void
.end method

.method public final じぜこほぱ()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_17

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_17
    return-void
.end method
