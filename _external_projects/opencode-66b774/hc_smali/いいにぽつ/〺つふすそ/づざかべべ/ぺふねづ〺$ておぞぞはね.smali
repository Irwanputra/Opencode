.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$ておぞぞはね;
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
    .registers 7

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    sget-object v1, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->こ〲しでおか:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->びぐびあび()C

    move-result p2

    const-string v2, "--"

    if-eqz p2, :cond_4b

    const/16 v3, 0x21

    if-eq p2, v3, :cond_43

    const/16 v3, 0x2d

    if-eq p2, v3, :cond_38

    const/16 v3, 0x3e

    if-eq p2, v3, :cond_30

    const v3, 0xffff

    if-eq p2, v3, :cond_2d

    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    iget-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    iget-object v0, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1
    :goto_2a
    iput-object v1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_5c

    .line 2
    :cond_2d
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    .line 3
    :cond_30
    iget-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)V

    .line 4
    iput-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_5c

    .line 5
    :cond_38
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5c

    :cond_43
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->くねねぱす〻:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    .line 6
    iput-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_5c

    .line 7
    :cond_4b
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    iget-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    iget-object p2, p2, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2a

    :goto_5c
    return-void
.end method
