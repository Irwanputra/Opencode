.class public final enum Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺$ぺふねづ〺;
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
    .registers 10

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->いいにぽつ()C

    move-result v0

    if-eqz v0, :cond_56

    const/16 v1, 0x26

    if-eq v0, v1, :cond_53

    const/16 v2, 0x3c

    if-eq v0, v2, :cond_49

    const v3, 0xffff

    if-eq v0, v3, :cond_40

    .line 1
    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v0, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v3, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object v4, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    :goto_1c
    iget v5, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    if-ge v5, v3, :cond_2e

    aget-char v6, v4, v5

    if-eq v6, v1, :cond_2e

    if-eq v6, v2, :cond_2e

    if-nez v6, :cond_29

    goto :goto_2e

    :cond_29
    add-int/lit8 v5, v5, 0x1

    iput v5, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    goto :goto_1c

    :cond_2e
    :goto_2e
    if-le v5, v0, :cond_3a

    iget-object v1, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object p2, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    sub-int/2addr v5, v0

    invoke-static {v1, p2, v0, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p2

    goto :goto_3c

    :cond_3a
    const-string p2, ""

    .line 2
    :goto_3c
    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->づざかべべ(Ljava/lang/String;)V

    goto :goto_60

    :cond_40
    new-instance p2, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$なぎぱいぢぎ;

    invoke-direct {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$なぎぱいぢぎ;-><init>()V

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)V

    goto :goto_60

    :cond_49
    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->ぺぁあねじ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    .line 3
    :goto_4b
    iget-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ()V

    iput-object p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_60

    .line 4
    :cond_53
    sget-object p2, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    goto :goto_4b

    :cond_56
    invoke-virtual {p1, p0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->びぐびあび()C

    move-result p2

    invoke-virtual {p1, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->びぐびあび(C)V

    :goto_60
    return-void
.end method
