.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$ぉねぞはがぞ;
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

    if-eqz v0, :cond_1d

    const v1, 0xffff

    if-eq v0, v1, :cond_14

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->なぎぱいぢぎ(C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->づざかべべ(Ljava/lang/String;)V

    goto :goto_29

    :cond_14
    new-instance p2, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$なぎぱいぢぎ;

    invoke-direct {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$なぎぱいぢぎ;-><init>()V

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)V

    goto :goto_29

    :cond_1d
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ()V

    const p2, 0xfffd

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->びぐびあび(C)V

    :goto_29
    return-void
.end method
