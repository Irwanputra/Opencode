.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$ぃぜぶの〸ぃ;
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
    .registers 6

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->こ〲しでおか:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->びぐびあび()C

    move-result p2

    const/16 v1, 0x2d

    if-eqz p2, :cond_2e

    if-eq p2, v1, :cond_2b

    const v2, 0xffff

    if-eq p2, v2, :cond_1e

    iget-object v2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    iget-object v2, v2, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1
    :goto_1b
    iput-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_3f

    .line 2
    :cond_1e
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    .line 3
    iget-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)V

    .line 4
    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    .line 5
    :goto_28
    iput-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_3f

    .line 6
    :cond_2b
    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->のね〱ばぁぢ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_28

    :cond_2e
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    iget-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    iget-object p2, p2, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v1, 0xfffd

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1b

    :goto_3f
    return-void
.end method
