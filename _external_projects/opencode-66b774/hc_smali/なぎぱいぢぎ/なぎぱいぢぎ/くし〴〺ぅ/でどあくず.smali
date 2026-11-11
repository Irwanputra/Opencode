.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;
.source ""


# instance fields
.field public final げつ〴ぬぐ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;)V
    .registers 2

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;-><init>()V

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Number;)V
    .registers 2

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;-><init>()V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;-><init>()V

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    return-void
.end method

.method public static づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;)Z
    .registers 2

    iget-object p0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_1e

    check-cast p0, Ljava/lang/Number;

    instance-of v0, p0, Ljava/math/BigInteger;

    if-nez v0, :cond_1c

    instance-of v0, p0, Ljava/lang/Long;

    if-nez v0, :cond_1c

    instance-of v0, p0, Ljava/lang/Integer;

    if-nez v0, :cond_1c

    instance-of v0, p0, Ljava/lang/Short;

    if-nez v0, :cond_1c

    instance-of p0, p0, Ljava/lang/Byte;

    if-eqz p0, :cond_1e

    :cond_1c
    const/4 p0, 0x1

    goto :goto_1f

    :cond_1e
    const/4 p0, 0x0

    :goto_1f
    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-eqz p1, :cond_76

    const-class v2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_10

    goto :goto_76

    :cond_10
    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    if-nez v2, :cond_1d

    iget-object p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    if-nez p1, :cond_1b

    goto :goto_1c

    :cond_1b
    const/4 v0, 0x0

    :goto_1c
    return v0

    :cond_1d
    invoke-static {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;)Z

    move-result v2

    if-eqz v2, :cond_40

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;)Z

    move-result v2

    if-eqz v2, :cond_40

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->くし〴〺ぅ()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->くし〴〺ぅ()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-nez p1, :cond_3e

    goto :goto_3f

    :cond_3e
    const/4 v0, 0x0

    :goto_3f
    return v0

    :cond_40
    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    instance-of v3, v2, Ljava/lang/Number;

    if-eqz v3, :cond_6f

    iget-object v3, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    instance-of v3, v3, Ljava/lang/Number;

    if-eqz v3, :cond_6f

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->くし〴〺ぅ()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->くし〴〺ぅ()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    cmpl-double p1, v2, v4

    if-eqz p1, :cond_6e

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_6d

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_6d

    goto :goto_6e

    :cond_6d
    const/4 v0, 0x0

    :cond_6e
    :goto_6e
    return v0

    :cond_6f
    iget-object p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_76
    :goto_76
    return v1
.end method

.method public hashCode()I
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    if-nez v0, :cond_7

    const/16 v0, 0x1f

    return v0

    :cond_7
    invoke-static {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;)Z

    move-result v0

    const/16 v1, 0x20

    if-eqz v0, :cond_1c

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->くし〴〺ぅ()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    :goto_17
    ushr-long v0, v2, v1

    xor-long/2addr v0, v2

    long-to-int v1, v0

    return v1

    :cond_1c
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_2f

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->くし〴〺ぅ()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    goto :goto_17

    :cond_2f
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public 〺つふすそ()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_d

    .line 2
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_d
    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->びぐびあび()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public くし〴〺ぅ()Ljava/lang/Number;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_10

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ざとぅぼこ〺;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ざとぅぼこ〺;-><init>(Ljava/lang/String;)V

    goto :goto_12

    :cond_10
    check-cast v0, Ljava/lang/Number;

    :goto_12
    return-object v0
.end method

.method public びぐびあび()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->げつ〴ぬぐ:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_f

    .line 2
    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;->くし〴〺ぅ()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_f
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_1a

    .line 4
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1a
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
