.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;
.super L〳ぜぞぜべっ/ぅみぱぎぎ;
.source ""


# instance fields
.field public final 〺つふすそ:L〳ぜぞぜべっ/ぅみぱぎぎ;

.field public くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

.field public びぐびあび:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/びぐびあび;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぅみぱぎぎ;Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V
    .registers 3

    invoke-direct {p0}, L〳ぜぞぜべっ/ぅみぱぎぎ;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    new-instance p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/びぐびあび;

    invoke-direct {p1, p2}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/びぐびあび;-><init>(Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/びぐびあび;

    return-void
.end method


# virtual methods
.method public じぜこほぱ()J
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぅみぱぎぎ;->じぜこほぱ()J

    move-result-wide v0

    return-wide v0
.end method

.method public ぺづげぺが()Lぺぁあねじ/ぁごぐすすぃ;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    if-nez v0, :cond_18

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぅみぱぎぎ;->ぺづげぺが()Lぺぁあねじ/ぁごぐすすぃ;

    move-result-object v0

    .line 1
    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-direct {v1, p0, v0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺぁあねじ;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;Lぺぁあねじ/ぶでにく〼〳;)V

    .line 2
    sget-object v0, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    new-instance v0, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 3
    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    :cond_18
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    return-object v0
.end method
