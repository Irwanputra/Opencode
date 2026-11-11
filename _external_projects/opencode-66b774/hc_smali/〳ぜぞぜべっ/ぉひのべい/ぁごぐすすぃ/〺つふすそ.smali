.class public final L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements L〳ぜぞぜべっ/は〲ぱなで;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Z)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:Z

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(L〳ぜぞぜべっ/は〲ぱなで$げつ〴ぬぐ;)L〳ぜぞぜべっ/なぶひせが;
    .registers 12

    check-cast p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;

    .line 1
    iget-object v0, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;

    .line 2
    iget-object v1, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    .line 3
    iget-object v2, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;

    .line 4
    iget-object v3, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 6
    iget-object v6, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ;

    .line 7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    invoke-interface {v0, v3}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->〺つふすそ(L〳ぜぞぜべっ/ぉ〲なぱぽた;)V

    .line 9
    iget-object v6, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ;

    .line 10
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iget-object v6, v3, L〳ぜぞぜべっ/ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/String;

    .line 12
    invoke-static {v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->な〱ちぉじ(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_7c

    .line 13
    iget-object v6, v3, L〳ぜぞぜべっ/ぉ〲なぱぽた;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    if-eqz v6, :cond_7c

    .line 14
    iget-object v6, v3, L〳ぜぞぜべっ/ぉ〲なぱぽた;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v8, "Expect"

    invoke-virtual {v6, v8}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "100-continue"

    .line 15
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_46

    invoke-interface {v0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->びぐびあび()V

    .line 16
    iget-object v6, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ;

    .line 17
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x1

    .line 18
    invoke-interface {v0, v6}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->なぎぱいぢぎ(Z)L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    move-result-object v6

    goto :goto_47

    :cond_46
    move-object v6, v7

    :goto_47
    if-nez v6, :cond_72

    .line 19
    iget-object v2, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ;

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iget-object v2, v3, L〳ぜぞぜべっ/ぉ〲なぱぽた;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    .line 22
    invoke-virtual {v2}, L〳ぜぞぜべっ/びえぁぜい;->げつ〴ぬぐ()J

    move-result-wide v8

    new-instance v2, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {v0, v3, v8, v9}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->づざかべべ(L〳ぜぞぜべっ/ぉ〲なぱぽた;J)Lぺぁあねじ/でどあくず;

    move-result-object v8

    invoke-direct {v2, v8}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;-><init>(Lぺぁあねじ/でどあくず;)V

    .line 23
    sget-object v8, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    new-instance v8, Lぺぁあねじ/ぉざぅち〻;

    invoke-direct {v8, v2}, Lぺぁあねじ/ぉざぅち〻;-><init>(Lぺぁあねじ/でどあくず;)V

    .line 24
    iget-object v2, v3, L〳ぜぞぜべっ/ぉ〲なぱぽた;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    .line 25
    invoke-virtual {v2, v8}, L〳ぜぞぜべっ/びえぁぜい;->づざかべべ(Lぺぁあねじ/なぎぱいぢぎ;)V

    invoke-virtual {v8}, Lぺぁあねじ/ぉざぅち〻;->close()V

    .line 26
    iget-object v2, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ;

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_7d

    .line 28
    :cond_72
    invoke-virtual {v2}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->〳ぜぞぜべっ()Z

    move-result v2

    if-nez v2, :cond_7d

    invoke-virtual {v1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->なぎぱいぢぎ()V

    goto :goto_7d

    :cond_7c
    move-object v6, v7

    :cond_7d
    :goto_7d
    invoke-interface {v0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->げつ〴ぬぐ()V

    const/4 v2, 0x0

    if-nez v6, :cond_8c

    .line 29
    iget-object v6, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ;

    .line 30
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-interface {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->なぎぱいぢぎ(Z)L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    move-result-object v6

    .line 32
    :cond_8c
    iput-object v3, v6, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 33
    invoke-virtual {v1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->〺つふすそ()L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;

    move-result-object v8

    .line 34
    iget-object v8, v8, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

    .line 35
    iput-object v8, v6, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->づざかべべ:L〳ぜぞぜべっ/ぇぬぎばつ;

    .line 36
    iput-wide v4, v6, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->ぺふねづ〺:J

    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 38
    iput-wide v8, v6, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->てぜきぽく:J

    .line 39
    invoke-virtual {v6}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object v6

    .line 40
    iget v8, v6, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    const/16 v9, 0x64

    if-ne v8, v9, :cond_c4

    .line 41
    invoke-interface {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->なぎぱいぢぎ(Z)L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    move-result-object v2

    .line 42
    iput-object v3, v2, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 43
    invoke-virtual {v1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->〺つふすそ()L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;

    move-result-object v3

    .line 44
    iget-object v3, v3, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぇぬぎばつ;

    .line 45
    iput-object v3, v2, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->づざかべべ:L〳ぜぞぜべっ/ぇぬぎばつ;

    .line 46
    iput-wide v4, v2, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->ぺふねづ〺:J

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 48
    iput-wide v3, v2, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->てぜきぽく:J

    .line 49
    invoke-virtual {v2}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object v6

    .line 50
    iget v8, v6, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    .line 51
    :cond_c4
    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ;

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    iget-boolean p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz p1, :cond_d9

    const/16 p1, 0x65

    if-ne v8, p1, :cond_d9

    .line 54
    new-instance p1, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    invoke-direct {p1, v6}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/なぶひせが;)V

    .line 55
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    goto :goto_e2

    .line 56
    :cond_d9
    new-instance p1, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;

    invoke-direct {p1, v6}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/なぶひせが;)V

    .line 57
    invoke-interface {v0, v6}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;->くし〴〺ぅ(L〳ぜぞぜべっ/なぶひせが;)L〳ぜぞぜべっ/ぅみぱぎぎ;

    move-result-object v0

    .line 58
    :goto_e2
    iput-object v0, p1, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 59
    invoke-virtual {p1}, L〳ぜぞぜべっ/なぶひせが$げつ〴ぬぐ;->げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object p1

    .line 60
    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 61
    iget-object v0, v0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v2, "Connection"

    invoke-virtual {v0, v2}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "close"

    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_109

    .line 63
    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉざぅち〻;

    invoke-virtual {v0, v2}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_103

    move-object v7, v0

    .line 64
    :cond_103
    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10c

    :cond_109
    invoke-virtual {v1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->なぎぱいぢぎ()V

    :cond_10c
    const/16 v0, 0xcc

    if-eq v8, v0, :cond_114

    const/16 v0, 0xcd

    if-ne v8, v0, :cond_120

    .line 65
    :cond_114
    iget-object v0, p1, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 66
    invoke-virtual {v0}, L〳ぜぞぜべっ/ぅみぱぎぎ;->じぜこほぱ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_121

    :cond_120
    return-object p1

    :cond_121
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    iget-object p1, p1, L〳ぜぞぜべっ/なぶひせが;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 68
    invoke-virtual {p1}, L〳ぜぞぜべっ/ぅみぱぎぎ;->じぜこほぱ()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
