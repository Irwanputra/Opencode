.class public final Lぺぁあねじ/は〲ぱなで;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:[B

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

.field public びぐびあび:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lぺぁあねじ/は〲ぱなで;->づざかべべ:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lぺぁあねじ/は〲ぱなで;->びぐびあび:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iput p2, p0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iput p3, p0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iput-boolean p4, p0, Lぺぁあねじ/は〲ぱなで;->びぐびあび:Z

    iput-boolean p5, p0, Lぺぁあねじ/は〲ぱなで;->づざかべべ:Z

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lぺぁあねじ/は〲ぱなで;)Lぺぁあねじ/は〲ぱなで;
    .registers 3

    iput-object p0, p1, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iget-object v0, p0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iput-object v0, p1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iget-object v0, p0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iput-object p1, v0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iput-object p1, p0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    return-object p1
.end method

.method public くし〴〺ぅ()Lぺぁあねじ/は〲ぱなで;
    .registers 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lぺぁあねじ/は〲ぱなで;->びぐびあび:Z

    new-instance v0, Lぺぁあねじ/は〲ぱなで;

    iget-object v2, p0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v3, p0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget v4, p0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lぺぁあねじ/は〲ぱなで;-><init>([BIIZZ)V

    return-object v0
.end method

.method public げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;
    .registers 5
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_7

    move-object v2, v0

    goto :goto_8

    :cond_7
    move-object v2, v1

    :goto_8
    iget-object v3, p0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iput-object v0, v3, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iget-object v0, p0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iput-object v3, v0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iput-object v1, p0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iput-object v1, p0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    return-object v2
.end method

.method public びぐびあび(Lぺぁあねじ/は〲ぱなで;I)V
    .registers 7

    iget-boolean v0, p1, Lぺぁあねじ/は〲ぱなで;->づざかべべ:Z

    if-eqz v0, :cond_4a

    iget v0, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int v1, v0, p2

    const/16 v2, 0x2000

    if-le v1, v2, :cond_34

    iget-boolean v1, p1, Lぺぁあねじ/は〲ぱなで;->びぐびあび:Z

    if-nez v1, :cond_2e

    add-int v1, v0, p2

    iget v3, p1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v3

    if-gt v1, v2, :cond_28

    iget-object v1, p1, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    sub-int/2addr v0, v3

    const/4 v2, 0x0

    invoke-static {v1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v1, p1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v0, v1

    iput v0, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iput v2, p1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    goto :goto_34

    :cond_28
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_34
    :goto_34
    iget-object v0, p0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v1, p0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget-object v2, p1, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v3, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    invoke-static {v0, v1, v2, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/2addr v0, p2

    iput v0, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget p1, p0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    add-int/2addr p1, p2

    iput p1, p0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    return-void

    :cond_4a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
