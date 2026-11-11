.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$けときぜと;
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

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->びぐびあび()C

    move-result v1

    const/16 v2, 0x3e

    if-eq v1, v2, :cond_20

    const v2, 0xffff

    if-eq v1, v2, :cond_1a

    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ごづごきえ()V

    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->ぷぞてのほき:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    .line 1
    iput-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_29

    .line 2
    :cond_1a
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    .line 3
    :goto_1d
    iput-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_29

    .line 4
    :cond_20
    iget-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぺぁあねじ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

    const/4 v1, 0x1

    iput-boolean v1, p2, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ぺぁあねじ:Z

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぁごぐすすぃ()V

    goto :goto_1d

    :goto_29
    return-void
.end method
