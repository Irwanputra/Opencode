.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$〻ぞまぎな〻;
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

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->ぅみぱぎぎ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->びぐびあび()C

    move-result p2

    if-eqz p2, :cond_37

    const/16 v1, 0x2d

    if-eq p2, v1, :cond_33

    const/16 v1, 0x3c

    if-eq p2, v1, :cond_2d

    const/16 v1, 0x3e

    if-eq p2, v1, :cond_27

    const v1, 0xffff

    if-eq p2, v1, :cond_1f

    :goto_19
    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->びぐびあび(C)V

    .line 1
    iput-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_3e

    .line 2
    :cond_1f
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    .line 3
    :goto_24
    iput-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_3e

    .line 4
    :cond_27
    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->びぐびあび(C)V

    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->ぁごぐすすぃ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_24

    :cond_2d
    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->びぐびあび(C)V

    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->ぉひのべい:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_24

    :cond_33
    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->びぐびあび(C)V

    goto :goto_3e

    :cond_37
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    const p2, 0xfffd

    goto :goto_19

    :goto_3e
    return-void
.end method
