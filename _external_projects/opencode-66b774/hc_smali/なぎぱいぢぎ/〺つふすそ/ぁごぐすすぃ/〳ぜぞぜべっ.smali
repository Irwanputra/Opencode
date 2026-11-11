.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;
.super L〳ぜぞぜべっ/びえぁぜい;
.source ""


# instance fields
.field public 〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

.field public くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺふねづ〺;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/びえぁぜい;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/びえぁぜい;Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;)V
    .registers 3

    invoke-direct {p0}, L〳ぜぞぜべっ/びえぁぜい;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/びえぁぜい;

    new-instance p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺふねづ〺;

    invoke-direct {p1, p2}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺふねづ〺;-><init>(Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;)V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺふねづ〺;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()L〳ぜぞぜべっ/ごづごきえ;
    .registers 2

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/びえぁぜい;

    invoke-virtual {v0}, L〳ぜぞぜべっ/びえぁぜい;->〺つふすそ()L〳ぜぞぜべっ/ごづごきえ;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ()J
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/びえぁぜい;

    invoke-virtual {v0}, L〳ぜぞぜべっ/びえぁぜい;->げつ〴ぬぐ()J

    move-result-wide v0

    return-wide v0
.end method

.method public づざかべべ(Lぺぁあねじ/なぎぱいぢぎ;)V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    if-nez v0, :cond_12

    .line 1
    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;

    invoke-direct {v0, p0, p1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;Lぺぁあねじ/でどあくず;)V

    .line 2
    sget-object p1, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    new-instance p1, Lぺぁあねじ/ぉざぅち〻;

    invoke-direct {p1, v0}, Lぺぁあねじ/ぉざぅち〻;-><init>(Lぺぁあねじ/でどあくず;)V

    .line 3
    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    :cond_12
    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ:L〳ぜぞぜべっ/びえぁぜい;

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-virtual {p1, v0}, L〳ぜぞぜべっ/びえぁぜい;->づざかべべ(Lぺぁあねじ/なぎぱいぢぎ;)V

    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->〺つふすそ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V

    return-void
.end method
