.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$ながふずは;
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
    .registers 5

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->いいにぽつ()C

    move-result v0

    if-eqz v0, :cond_38

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_2e

    const v1, 0xffff

    if-eq v0, v1, :cond_21

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    const/4 v0, 0x2

    new-array v0, v0, [C

    fill-array-data v0, :array_4a

    invoke-virtual {p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぁごぐすすぃ([C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_48

    :cond_21
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    .line 1
    iget-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)V

    .line 2
    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    .line 3
    iput-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_48

    .line 4
    :cond_2e
    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->ぺがぅす〹ち:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    .line 5
    iget-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ()V

    iput-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_48

    .line 6
    :cond_38
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ()V

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_48
    return-void

    nop

    :array_4a
    .array-data 2
        0x2ds
        0x0s
    .end array-data
.end method
