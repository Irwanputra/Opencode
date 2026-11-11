.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$ぇいうげ〱〹;
.super Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;-><init>(Ljava/lang/String;ILいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$ぺふねづ〺;)V

    return-void
.end method


# virtual methods
.method public なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;)V
    .registers 8

    const-string v0, "]]>"

    .line 1
    invoke-virtual {p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ざとぅぼこ〺(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_19

    iget-object v2, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v3, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    iget v4, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    invoke-static {v2, v3, v4, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v2

    iget v3, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v3, v1

    iput v3, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    goto :goto_1d

    :cond_19
    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object v2

    .line 2
    :goto_1d
    iget-object v1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〳ぜぞぜべっ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2e

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺふねづ〺()Z

    move-result p2

    if-eqz p2, :cond_40

    :cond_2e
    new-instance p2, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〺つふすそ;

    iget-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〳ぜぞぜべっ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〺つふすそ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)V

    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    .line 3
    iput-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    :cond_40
    return-void
.end method
