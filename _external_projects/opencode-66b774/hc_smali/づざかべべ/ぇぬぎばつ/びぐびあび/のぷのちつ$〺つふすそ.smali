.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "VisibleForTests"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:[I

.field public げつ〴ぬぐ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView;Z)V
    .registers 7

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    if-eqz v0, :cond_b

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_b
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    if-eqz v1, :cond_49

    if-eqz v0, :cond_49

    .line 1
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぺふねづ〺:Z

    if-eqz v1, :cond_49

    if-eqz p2, :cond_2b

    .line 2
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;->ぁごぐすすぃ()Z

    move-result v1

    if-nez v1, :cond_3a

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->いいにぽつ(ILandroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V

    goto :goto_3a

    :cond_2b
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->ぇとしたべど()Z

    move-result v1

    if-nez v1, :cond_3a

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->げつ〴ぬぐ:I

    iget v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->〺つふすそ:I

    iget-object v3, p1, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {v0, v1, v2, v3, p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぺぁあねじ(IILandroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V

    :cond_3a
    :goto_3a
    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    iget v2, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->てぜきぽく:I

    if-le v1, v2, :cond_49

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->てぜきぽく:I

    iput-boolean p2, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->のぷのちつ:Z

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->のぷのちつ()V

    :cond_49
    return-void
.end method

.method public くし〴〺ぅ(I)Z
    .registers 6

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    mul-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    :goto_a
    if-ge v2, v0, :cond_17

    iget-object v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    aget v3, v3, v2

    if-ne v3, p1, :cond_14

    const/4 p1, 0x1

    return p1

    :cond_14
    add-int/lit8 v2, v2, 0x2

    goto :goto_a

    :cond_17
    return v1
.end method

.method public げつ〴ぬぐ(II)V
    .registers 8

    if-ltz p1, :cond_3b

    if-ltz p2, :cond_33

    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    if-nez v1, :cond_16

    const/4 v1, 0x4

    new-array v1, v1, [I

    iput-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    goto :goto_24

    :cond_16
    array-length v2, v1

    if-lt v0, v2, :cond_24

    mul-int/lit8 v2, v0, 0x2

    new-array v2, v2, [I

    iput-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_24
    :goto_24
    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    aput p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    aput p2, v1, v0

    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    return-void

    :cond_33
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Pixel distance must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Layout positions must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
