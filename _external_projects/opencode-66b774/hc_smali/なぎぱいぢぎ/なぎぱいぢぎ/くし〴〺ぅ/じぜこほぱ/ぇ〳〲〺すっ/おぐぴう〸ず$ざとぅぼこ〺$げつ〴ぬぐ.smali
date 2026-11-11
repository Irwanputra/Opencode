.class public Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/おぐぴう〸ず$ざとぅぼこ〺$げつ〴ぬぐ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/おぐぴう〸ず$ざとぅぼこ〺;->げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u306a\u3076\u3072\u305b\u304c<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/おぐぴう〸ず$ざとぅぼこ〺;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;)V
    .registers 3

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/おぐぴう〸ず$ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;Ljava/lang/Object;)V
    .registers 4

    check-cast p2, Ljava/sql/Timestamp;

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/おぐぴう〸ず$ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    invoke-virtual {v0, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;->〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;Ljava/lang/Object;)V

    return-void
.end method

.method public げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;)Ljava/lang/Object;
    .registers 5

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/おぐぴう〸ず$ざとぅぼこ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;->げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_14

    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_15

    :cond_14
    const/4 v0, 0x0

    :goto_15
    return-object v0
.end method
