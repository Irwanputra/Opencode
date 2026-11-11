.class public final L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$ぁごぐすすぃ;,
        L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;,
        L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$なぎぱいぢぎ;,
        L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;,
        L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$くし〴〺ぅ;,
        L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

.field public final くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

.field public づざかべべ:I

.field public なぎぱいぢぎ:J

.field public final びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/でどあくず;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;Lぺぁあねじ/ぁごぐすすぃ;Lぺぁあねじ/なぎぱいぢぎ;)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:J

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    return-void
.end method


# virtual methods
.method public cancel()V
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->〺つふすそ()L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 1
    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    invoke-static {v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->なぎぱいぢぎ(Ljava/net/Socket;)V

    :cond_d
    return-void
.end method

.method public 〳ぜぞぜべっ(J)Lぺぁあねじ/ぶでにく〼〳;
    .registers 5

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_e

    const/4 v0, 0x5

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$なぎぱいぢぎ;

    invoke-direct {v0, p0, p1, p2}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$なぎぱいぢぎ;-><init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;J)V

    return-object v0

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "state: "

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public 〺つふすそ(L〳ぜぞぜべっ/ぉ〲なぱぽた;)V
    .registers 6

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->〺つふすそ()L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;

    move-result-object v0

    .line 1
    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 2
    iget-object v0, v0, L〳ぜぞぜべっ/じぜこほぱ;->〺つふすそ:Ljava/net/Proxy;

    .line 3
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    iget-object v2, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/String;

    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 7
    iget-object v2, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 8
    iget-object v2, v2, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    const-string v3, "https"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2f

    .line 9
    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v2, :cond_2f

    const/4 v0, 0x1

    goto :goto_30

    :cond_2f
    const/4 v0, 0x0

    :goto_30
    if-eqz v0, :cond_38

    .line 10
    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_41

    .line 12
    :cond_38
    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 13
    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->びちづぼぬ(L〳ぜぞぜべっ/ざとぅぼこ〺;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_41
    const-string v0, " HTTP/1.1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    iget-object p1, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

    .line 15
    invoke-virtual {p0, p1, v0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->ぺふねづ〺(L〳ぜぞぜべっ/ぉざぅち〻;Ljava/lang/String;)V

    return-void
.end method

.method public ぁごぐすすぃ(Lぺぁあねじ/ぺふねづ〺;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    .line 2
    sget-object v1, Lぺぁあねじ/〻ぞまぎな〻;->びぐびあび:Lぺぁあねじ/〻ぞまぎな〻;

    .line 3
    iput-object v1, p1, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    .line 4
    invoke-virtual {v0}, Lぺぁあねじ/〻ぞまぎな〻;->げつ〴ぬぐ()Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lぺぁあねじ/〻ぞまぎな〻;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    return-void
.end method

.method public いいにぽつ()L〳ぜぞぜべっ/ぉざぅち〻;
    .registers 7

    new-instance v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;-><init>()V

    :goto_5
    invoke-virtual {p0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_4a

    sget-object v2, L〳ぜぞぜべっ/ぉひのべい/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/げつ〴ぬぐ;

    check-cast v2, L〳ぜぞぜべっ/でどあくず$げつ〴ぬぐ;

    .line 1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, ":"

    const/4 v3, 0x1

    .line 2
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_2f

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->〺つふすそ(Ljava/lang/String;Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    goto :goto_5

    :cond_2f
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_39

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    :cond_39
    iget-object v2, v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    const-string v3, ""

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 4
    :cond_4a
    new-instance v1, L〳ぜぞぜべっ/ぉざぅち〻;

    invoke-direct {v1, v0}, L〳ぜぞぜべっ/ぉざぅち〻;-><init>(L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;)V

    return-object v1
.end method

.method public くし〴〺ぅ(L〳ぜぞぜべっ/なぶひせが;)L〳ぜぞぜべっ/ぅみぱぎぎ;
    .registers 11

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->なぎぱいぢぎ:L〳ぜぞぜべっ/のぷのちつ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    goto :goto_14

    :cond_13
    move-object v0, v1

    .line 3
    :goto_14
    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->〺つふすそ(L〳ぜぞぜべっ/なぶひせが;)Z

    move-result v2

    if-nez v2, :cond_2d

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ(J)Lぺぁあねじ/ぶでにく〼〳;

    move-result-object p1

    new-instance v3, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;

    .line 4
    sget-object v4, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    new-instance v4, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {v4, p1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 5
    invoke-direct {v3, v0, v1, v2, v4}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;-><init>(Ljava/lang/String;JLぺぁあねじ/ぁごぐすすぃ;)V

    return-object v3

    .line 6
    :cond_2d
    iget-object v2, p1, L〳ぜぞぜべっ/なぶひせが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v3, "Transfer-Encoding"

    invoke-virtual {v2, v3}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_38

    move-object v1, v2

    :cond_38
    const-string v2, "chunked"

    .line 7
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x5

    const-string v3, "state: "

    const/4 v4, 0x4

    const-wide/16 v5, -0x1

    if-eqz v1, :cond_75

    .line 8
    iget-object p1, p1, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 9
    iget-object p1, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 10
    iget v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    if-ne v1, v4, :cond_62

    iput v2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    new-instance v1, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;

    invoke-direct {v1, p0, p1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;-><init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/ざとぅぼこ〺;)V

    .line 11
    new-instance p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;

    .line 12
    sget-object v2, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    new-instance v2, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {v2, v1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 13
    invoke-direct {p1, v0, v5, v6, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;-><init>(Ljava/lang/String;JLぺぁあねじ/ぁごぐすすぃ;)V

    return-object p1

    .line 14
    :cond_62
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_75
    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ(L〳ぜぞぜべっ/なぶひせが;)J

    move-result-wide v7

    cmp-long p1, v7, v5

    if-eqz p1, :cond_8e

    invoke-virtual {p0, v7, v8}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〳ぜぞぜべっ(J)Lぺぁあねじ/ぶでにく〼〳;

    move-result-object p1

    new-instance v1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;

    .line 16
    sget-object v2, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    new-instance v2, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {v2, p1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 17
    invoke-direct {v1, v0, v7, v8, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;-><init>(Ljava/lang/String;JLぺぁあねじ/ぁごぐすすぃ;)V

    return-object v1

    :cond_8e
    new-instance p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;

    .line 18
    iget v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    if-ne v1, v4, :cond_b5

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    if-eqz v1, :cond_ad

    iput v2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->なぎぱいぢぎ()V

    new-instance v1, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$ぁごぐすすぃ;

    invoke-direct {v1, p0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$ぁごぐすすぃ;-><init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;)V

    .line 19
    sget-object v2, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    new-instance v2, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {v2, v1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 20
    invoke-direct {p1, v0, v5, v6, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぁごぐすすぃ;-><init>(Ljava/lang/String;JLぺぁあねじ/ぁごぐすすぃ;)V

    return-object p1

    .line 21
    :cond_ad
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "streamAllocation == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V

    return-void
.end method

.method public づざかべべ(L〳ぜぞぜべっ/ぉ〲なぱぽた;J)Lぺぁあねじ/でどあくず;
    .registers 9

    .line 1
    iget-object p1, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x2

    const-string v1, "state: "

    const/4 v2, 0x1

    if-eqz p1, :cond_33

    .line 3
    iget p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    if-ne p1, v2, :cond_20

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    new-instance p1, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$くし〴〺ぅ;

    invoke-direct {p1, p0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$くし〴〺ぅ;-><init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;)V

    return-object p1

    :cond_20
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget p3, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_33
    const-wide/16 v3, -0x1

    cmp-long p1, p2, v3

    if-eqz p1, :cond_58

    .line 4
    iget p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    if-ne p1, v2, :cond_45

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    new-instance p1, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;

    invoke-direct {p1, p0, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;-><init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;J)V

    return-object p1

    :cond_45
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget p3, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_58
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public なぎぱいぢぎ(Z)L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;
    .registers 6

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1e

    if-ne v0, v1, :cond_9

    goto :goto_1e

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "state: "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1e
    :goto_1e
    :try_start_1e
    invoke-virtual {p0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ(Ljava/lang/String;)L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;

    move-result-object v0

    new-instance v2, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    invoke-direct {v2}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;-><init>()V

    iget-object v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぶでにく〼〳;

    .line 1
    iput-object v3, v2, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぶでにく〼〳;

    .line 2
    iget v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ:I

    .line 3
    iput v3, v2, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->くし〴〺ぅ:I

    .line 4
    iget-object v3, v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    .line 5
    iput-object v3, v2, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    .line 6
    invoke-virtual {p0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->いいにぽつ()L〳ぜぞぜべっ/ぉざぅち〻;

    move-result-object v3

    invoke-virtual {v2, v3}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->びぐびあび(L〳ぜぞぜべっ/ぉざぅち〻;)L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    const/16 v3, 0x64

    if-eqz p1, :cond_48

    iget p1, v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ:I

    if-ne p1, v3, :cond_48

    const/4 p1, 0x0

    return-object p1

    :cond_48
    iget p1, v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ:I

    if-ne p1, v3, :cond_4f

    iput v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    return-object v2

    :cond_4f
    const/4 p1, 0x4

    iput p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I
    :try_end_52
    .catch Ljava/io/EOFException; {:try_start_1e .. :try_end_52} :catch_53

    return-object v2

    :catch_53
    move-exception p1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "unexpected end of stream on "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0
.end method

.method public びぐびあび()V
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V

    return-void
.end method

.method public final ぺぁあねじ()Ljava/lang/String;
    .registers 6

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    iget-wide v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:J

    invoke-interface {v0, v1, v2}, Lぺぁあねじ/ぁごぐすすぃ;->でどあくず(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->なぎぱいぢぎ:J

    return-object v0
.end method

.method public ぺふねづ〺(L〳ぜぞぜべっ/ぉざぅち〻;Ljava/lang/String;)V
    .registers 7

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    if-nez v0, :cond_3d

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0, p2}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    const/4 p2, 0x0

    invoke-virtual {p1}, L〳ぜぞぜべっ/ぉざぅち〻;->づざかべべ()I

    move-result v1

    :goto_14
    if-ge p2, v1, :cond_34

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-virtual {p1, p2}, L〳ぜぞぜべっ/ぉざぅち〻;->〺つふすそ(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v2

    const-string v3, ": "

    invoke-interface {v2, v3}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v2

    invoke-virtual {p1, p2}, L〳ぜぞぜべっ/ぉざぅち〻;->なぎぱいぢぎ(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object v2

    invoke-interface {v2, v0}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    add-int/lit8 p2, p2, 0x1

    goto :goto_14

    :cond_34
    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1, v0}, Lぺぁあねじ/なぎぱいぢぎ;->ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;

    const/4 p1, 0x1

    iput p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    return-void

    :cond_3d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "state: "

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_53

    :goto_52
    throw p1

    :goto_53
    goto :goto_52
.end method
