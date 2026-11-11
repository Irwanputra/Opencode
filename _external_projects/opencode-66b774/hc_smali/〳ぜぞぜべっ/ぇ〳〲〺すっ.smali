.class public final L〳ぜぞぜべっ/ぇ〳〲〺すっ;
.super L〳ぜぞぜべっ/びえぁぜい;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:[B

.field public final synthetic げつ〴ぬぐ:L〳ぜぞぜべっ/ごづごきえ;

.field public final synthetic びぐびあび:I


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ごづごきえ;I[BI)V
    .registers 5

    iput-object p1, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ごづごきえ;

    iput p2, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->〺つふすそ:I

    iput-object p3, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->くし〴〺ぅ:[B

    iput p4, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->びぐびあび:I

    invoke-direct {p0}, L〳ぜぞぜべっ/びえぁぜい;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()L〳ぜぞぜべっ/ごづごきえ;
    .registers 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ごづごきえ;

    return-object v0
.end method

.method public げつ〴ぬぐ()J
    .registers 3

    iget v0, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->〺つふすそ:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public づざかべべ(Lぺぁあねじ/なぎぱいぢぎ;)V
    .registers 5

    iget-object v0, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->くし〴〺ぅ:[B

    iget v1, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->びぐびあび:I

    iget v2, p0, L〳ぜぞぜべっ/ぇ〳〲〺すっ;->〺つふすそ:I

    invoke-interface {p1, v0, v1, v2}, Lぺぁあねじ/なぎぱいぢぎ;->くし〴〺ぅ([BII)Lぺぁあねじ/なぎぱいぢぎ;

    return-void
.end method
