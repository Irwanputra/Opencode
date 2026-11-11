.class public abstract Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u3066\u305c\u304d\u307d\u304f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;,
        Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

.field public ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

.field public いいにぽつ:Z

.field public ぇぬぎばつ:I

.field public ぉざぅち〻:I

.field public おぐぴう〸ず:I

.field public final くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい$〺つふすそ;

.field public げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

.field public づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

.field public てぜきぽく:I

.field public なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

.field public のぷのちつ:Z

.field public final びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい$〺つふすそ;

.field public へぬ〴づぞ:I

.field public ぺぁあねじ:Z

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$げつ〴ぬぐ;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい$〺つふすそ;

    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$〺つふすそ;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$〺つふすそ;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい$〺つふすそ;

    new-instance v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    invoke-direct {v2, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい$〺つふすそ;)V

    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    invoke-direct {v0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい$〺つふすそ;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぺぁあねじ:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->いいにぽつ:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぺふねづ〺:Z

    return-void
.end method

.method public static 〳ぜぞぜべっ(III)I
    .registers 5

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_15

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_14

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_14
    return p0

    :cond_15
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static ぇ〳〲〺すっ(IIIIZ)I
    .registers 9

    sub-int/2addr p0, p2

    const/4 p2, 0x0

    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 v0, -0x2

    const/4 v1, -0x1

    const/high16 v2, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-eqz p4, :cond_1a

    if-ltz p3, :cond_11

    goto :goto_1c

    :cond_11
    if-ne p3, v1, :cond_2f

    if-eq p1, v2, :cond_21

    if-eqz p1, :cond_2f

    if-eq p1, v3, :cond_21

    goto :goto_2f

    :cond_1a
    if-ltz p3, :cond_1f

    :goto_1c
    const/high16 p1, 0x40000000    # 2.0f

    goto :goto_31

    :cond_1f
    if-ne p3, v1, :cond_23

    :cond_21
    :goto_21
    move p3, p0

    goto :goto_31

    :cond_23
    if-ne p3, v0, :cond_2f

    if-eq p1, v2, :cond_2c

    if-ne p1, v3, :cond_2a

    goto :goto_2c

    :cond_2a
    const/4 p1, 0x0

    goto :goto_21

    :cond_2c
    :goto_2c
    const/high16 p1, -0x80000000

    goto :goto_21

    :cond_2f
    :goto_2f
    const/4 p1, 0x0

    const/4 p3, 0x0

    :goto_31
    invoke-static {p3, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static えがぐせほち(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;
    .registers 6

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;-><init>()V

    sget-object v1, Lづざかべべ/ぇぬぎばつ/くし〴〺ぅ;->RecyclerView:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    sget p1, Lづざかべべ/ぇぬぎばつ/くし〴〺ぅ;->RecyclerView_android_orientation:I

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->げつ〴ぬぐ:I

    sget p1, Lづざかべべ/ぇぬぎばつ/くし〴〺ぅ;->RecyclerView_spanCount:I

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->〺つふすそ:I

    sget p1, Lづざかべべ/ぇぬぎばつ/くし〴〺ぅ;->RecyclerView_reverseLayout:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->くし〴〺ぅ:Z

    sget p1, Lづざかべべ/ぇぬぎばつ/くし〴〺ぅ;->RecyclerView_stackFromEnd:I

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->びぐびあび:Z

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method public static くねねぱす〻(III)Z
    .registers 6

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_e

    if-eq p0, p2, :cond_e

    return v1

    :cond_e
    const/high16 p2, -0x80000000

    const/4 v2, 0x1

    if-eq v0, p2, :cond_1f

    if-eqz v0, :cond_1e

    const/high16 p2, 0x40000000    # 2.0f

    if-eq v0, p2, :cond_1a

    return v1

    :cond_1a
    if-ne p1, p0, :cond_1d

    const/4 v1, 0x1

    :cond_1d
    return v1

    :cond_1e
    return v2

    :cond_1f
    if-lt p1, p0, :cond_22

    const/4 v1, 0x1

    :cond_22
    return v1
.end method


# virtual methods
.method public 〱〴なぱへて(I)V
    .registers 2

    return-void
.end method

.method public 〱〵つてう(Landroid/os/Parcelable;)V
    .registers 2

    return-void
.end method

.method public 〱かけばぜぐ()V
    .registers 1

    return-void
.end method

.method public 〱こか〺ぃせ(Landroid/view/View;Z)Z
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    const/16 v1, 0x6003

    invoke-virtual {v0, p1, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;->〺つふすそ(Landroid/view/View;I)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_15

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    invoke-virtual {v0, p1, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;->〺つふすそ(Landroid/view/View;I)Z

    move-result p1

    if-eqz p1, :cond_15

    const/4 p1, 0x1

    goto :goto_16

    :cond_15
    const/4 p1, 0x0

    :goto_16
    if-eqz p2, :cond_19

    return p1

    :cond_19
    xor-int/2addr p1, v2

    return p1
.end method

.method public 〳に〴あぽ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public 〴ぐち〱へ(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    if-nez p1, :cond_b

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    goto :goto_1b

    :cond_b
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    :goto_1b
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    const/high16 p1, 0x40000000    # 2.0f

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぬ〴づぞ:I

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おぐぴう〸ず:I

    return-void
.end method

.method public 〴ねぷぐくぼ()V
    .registers 1

    return-void
.end method

.method public 〺〲に〼へ〸(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 2

    return-void
.end method

.method public 〺えなひあ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public 〺つふすそ(Landroid/view/View;)V
    .registers 4

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    return-void
.end method

.method public 〺でおいここ()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇぬぎばつ(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public 〻えぱひがこ(II)V
    .registers 11

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->おぐぴう〸ず(II)V

    return-void

    :cond_c
    const/4 v1, 0x0

    const/high16 v2, -0x80000000

    const v3, 0x7fffffff

    const/high16 v3, -0x80000000

    const v4, 0x7fffffff

    const v5, 0x7fffffff

    :goto_1a
    if-ge v1, v0, :cond_3e

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v6

    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->ぺぁあねじ:Landroid/graphics/Rect;

    invoke-virtual {p0, v6, v7}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->どぇぞほだ(Landroid/view/View;Landroid/graphics/Rect;)V

    iget v6, v7, Landroid/graphics/Rect;->left:I

    if-ge v6, v4, :cond_2c

    move v4, v6

    :cond_2c
    iget v6, v7, Landroid/graphics/Rect;->right:I

    if-le v6, v2, :cond_31

    move v2, v6

    :cond_31
    iget v6, v7, Landroid/graphics/Rect;->top:I

    if-ge v6, v5, :cond_36

    move v5, v6

    :cond_36
    iget v6, v7, Landroid/graphics/Rect;->bottom:I

    if-le v6, v3, :cond_3b

    move v3, v6

    :cond_3b
    add-int/lit8 v1, v1, 0x1

    goto :goto_1a

    :cond_3e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->ぺぁあねじ:Landroid/graphics/Rect;

    invoke-virtual {v0, v4, v5, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->ぺぁあねじ:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぺでどぜべ(Landroid/graphics/Rect;II)V

    return-void
.end method

.method public 〻しざ〹おま(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V
    .registers 4

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻はぎっぼ(I)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ(Landroid/view/View;)V

    return-void
.end method

.method public 〻ぞまぎな〻(I)Landroid/view/View;
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    if-eqz v0, :cond_11

    .line 1
    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->なぎぱいぢぎ(I)I

    move-result p1

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ(I)Landroid/view/View;

    move-result-object p1

    goto :goto_12

    :cond_11
    const/4 p1, 0x0

    :goto_12
    return-object p1
.end method

.method public 〻はぎっぼ(I)V
    .registers 5

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_29

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    .line 1
    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->なぎぱいぢぎ(I)I

    move-result p1

    iget-object v1, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v1, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_17

    goto :goto_29

    :cond_17
    iget-object v2, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ(I)Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-virtual {v0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->てぜきぽく(Landroid/view/View;)Z

    :cond_22
    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->くし〴〺ぅ(I)V

    :cond_29
    :goto_29
    return-void
.end method

.method public ぁごぐすすぃ(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 2

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_5

    :cond_4
    const/4 p1, 0x0

    :goto_5
    return p1
.end method

.method public ぁないぼぎへ(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    return-void
.end method

.method public ぁにあがあ()Landroid/os/Parcelable;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public ぃぜぶの〸ぃ()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return v0
.end method

.method public いいにぽつ(ILandroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V
    .registers 3

    return-void
.end method

.method public いおてぢび(Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;)V
    .registers 5

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    if-eqz v0, :cond_d

    if-eq p1, v0, :cond_d

    .line 1
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    if-eqz v1, :cond_d

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ()V

    :cond_d
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->くぎぶ〼のそ:Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->くし〴〺ぅ()V

    iget-boolean v1, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〳ぜぞぜべっ:Z

    if-eqz v1, :cond_28

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    :cond_28
    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget v1, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_4c

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    iput v1, v2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->げつ〴ぬぐ:I

    const/4 v2, 0x1

    iput-boolean v2, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    iput-boolean v2, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->びぐびあび:Z

    .line 4
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ごづごきえ(I)Landroid/view/View;

    move-result-object v0

    .line 5
    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->なぎぱいぢぎ:Landroid/view/View;

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->くぎぶ〼のそ:Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->げつ〴ぬぐ()V

    iput-boolean v2, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〳ぜぞぜべっ:Z

    return-void

    :cond_4c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid target position"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public いたぷすいだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;ILandroid/os/Bundle;)Z
    .registers 12

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x0

    if-nez p1, :cond_6

    return p2

    :cond_6
    const/16 p4, 0x1000

    const/4 v0, 0x1

    if-eq p3, p4, :cond_3e

    const/16 p4, 0x2000

    if-eq p3, p4, :cond_12

    const/4 v2, 0x0

    const/4 v3, 0x0

    goto :goto_6b

    :cond_12
    const/4 p3, -0x1

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result p1

    if-eqz p1, :cond_27

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result p4

    sub-int/2addr p1, p4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result p4

    sub-int/2addr p1, p4

    neg-int p1, p1

    goto :goto_28

    :cond_27
    const/4 p1, 0x0

    :goto_28
    iget-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p4, p3}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result p3

    if-eqz p3, :cond_69

    .line 3
    iget p3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result p4

    sub-int/2addr p3, p4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result p4

    sub-int/2addr p3, p4

    neg-int p3, p3

    goto :goto_66

    :cond_3e
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result p1

    if-eqz p1, :cond_51

    .line 5
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result p3

    sub-int/2addr p1, p3

    goto :goto_52

    :cond_51
    const/4 p1, 0x0

    :goto_52
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result p3

    if-eqz p3, :cond_69

    .line 7
    iget p3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result p4

    sub-int/2addr p3, p4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result p4

    sub-int/2addr p3, p4

    :goto_66
    move v3, p1

    move v2, p3

    goto :goto_6b

    :cond_69
    move v3, p1

    const/4 v2, 0x0

    :goto_6b
    if-nez v3, :cond_70

    if-nez v2, :cond_70

    return p2

    :cond_70
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v4, 0x0

    const/high16 v5, -0x80000000

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v6}, Landroidx/recyclerview/widget/RecyclerView;->ぇいうげ〱〹(IILandroid/view/animation/Interpolator;IZ)V

    return v0
.end method

.method public ぅばづそほせ(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    return-void
.end method

.method public ぅみぱぎぎ(Landroid/view/View;)I
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public ぇいうげ〱〹(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 5

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_39

    if-nez p1, :cond_7

    goto :goto_39

    :cond_7
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_29

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_29

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_29

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_28

    goto :goto_29

    :cond_28
    const/4 v1, 0x0

    :cond_29
    :goto_29
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    if-eqz v0, :cond_39

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    :cond_39
    :goto_39
    return-void
.end method

.method public ぇとしたべど()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぉざぅち〻(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public ぇぬぎばつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public え〱さぽぜ(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 7

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->いいにぽつ:Z

    if-eqz v0, :cond_1f

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くねねぱす〻(III)Z

    move-result p2

    if-eqz p2, :cond_1f

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くねねぱす〻(III)Z

    move-result p1

    if-nez p1, :cond_1d

    goto :goto_1f

    :cond_1d
    const/4 p1, 0x0

    goto :goto_20

    :cond_1f
    :goto_1f
    const/4 p1, 0x1

    :goto_20
    return p1
.end method

.method public えみにぃほす(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    .line 2
    iget-object v1, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 3
    iget-object v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    if-gez v1, :cond_f

    goto :goto_21

    .line 4
    :cond_f
    iget-object v2, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v2, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ(I)Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->てぜきぽく(Landroid/view/View;)Z

    :cond_1a
    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->くし〴〺ぅ(I)V

    .line 5
    :goto_21
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ(Landroid/view/View;)V

    return-void
.end method

.method public ぉ〲なぱぽた()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->づざかべべ()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return v0
.end method

.method public ぉざぅち〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V
    .registers 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    :goto_4
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_43

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v1

    .line 1
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v3

    if-eqz v3, :cond_17

    goto :goto_4

    :cond_17
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v3

    if-eqz v3, :cond_32

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v3

    if-nez v3, :cond_32

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    .line 2
    iget-boolean v3, v3, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ:Z

    if-nez v3, :cond_32

    .line 3
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻はぎっぼ(I)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    goto :goto_4

    .line 4
    :cond_32
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ざとぅぼこ〺(I)V

    .line 5
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->いいにぽつ(Landroid/view/View;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->ぁごぐすすぃ:Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;

    .line 6
    invoke-virtual {v1, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;->なぎぱいぢぎ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    goto :goto_4

    :cond_43
    return-void
.end method

.method public ぉねぞはがぞ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 5

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v1

    if-nez v1, :cond_1f

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぺふねづ〺(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_1f

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {p0, v1, v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->にぢ〱ぁな(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V

    :cond_1f
    return-void
.end method

.method public ぉひのべい(Landroid/view/View;)I
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, p1

    return v0
.end method

.method public おかぷせ〱()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public おぐぴう〸ず(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public かちして〹づ()V
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_7
    return-void
.end method

.method public かづげぃぁ〺(I)V
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_19

    .line 1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->づざかべべ()I

    move-result v1

    const/4 v2, 0x0

    :goto_b
    if-ge v2, v1, :cond_19

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->びぐびあび(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_19
    return-void
.end method

.method public がぐくいおす(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .registers 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->せだてはぺて()V

    return-void
.end method

.method public きぬどぼみ〸(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;
    .registers 5

    const/4 p1, 0x0

    return-object p1
.end method

.method public ぎきぁ〱ぢ()V
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public く〱なおぎ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 4

    const/4 p1, 0x0

    return p1
.end method

.method public くぎぶ〼のそ(Landroid/view/View;IIII)V
    .registers 9

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p3, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p3, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p4, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public final くし〴〺ぅ(Landroid/view/View;IZ)V
    .registers 10

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v0

    if-nez p3, :cond_15

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result p3

    if-eqz p3, :cond_d

    goto :goto_15

    :cond_d
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->ぁごぐすすぃ:Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;

    invoke-virtual {p3, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;->なぎぱいぢぎ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    goto :goto_1c

    :cond_15
    :goto_15
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->ぁごぐすすぃ:Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;

    invoke-virtual {p3, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :goto_1c
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->でどあくず()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_e7

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ()Z

    move-result v1

    if-eqz v1, :cond_31

    goto/16 :goto_e7

    :cond_31
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v4, -0x1

    if-ne v1, v3, :cond_c1

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v1, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->いいにぽつ(Landroid/view/View;)I

    move-result v1

    if-ne p2, v4, :cond_48

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->づざかべべ()I

    move-result p2

    :cond_48
    if-eq v1, v4, :cond_a6

    if-eq v1, p2, :cond_ff

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 1
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_86

    .line 2
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ざとぅぼこ〺(I)V

    .line 3
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 4
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v5

    if-eqz v5, :cond_74

    iget-object v5, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->ぁごぐすすぃ:Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;

    invoke-virtual {v5, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    goto :goto_7b

    :cond_74
    iget-object v5, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->ぁごぐすすぃ:Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;

    invoke-virtual {v5, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;->なぎぱいぢぎ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :goto_7b
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v4

    invoke-virtual {p1, v3, p2, v1, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    goto/16 :goto_ff

    .line 5
    :cond_86
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot move a child from non-existing index:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 6
    :cond_a6
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-static {p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p1, p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_c1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v1, p1, p2, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ(Landroid/view/View;IZ)V

    const/4 p2, 0x1

    iput-boolean p2, p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ:Z

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    if-eqz p2, :cond_ff

    .line 7
    iget-boolean v1, p2, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    if-eqz v1, :cond_ff

    .line 8
    iget-object v1, p2, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v1

    if-eqz v1, :cond_e0

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ()I

    move-result v4

    .line 10
    :cond_e0
    iget v1, p2, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    if-ne v4, v1, :cond_ff

    .line 11
    iput-object p1, p2, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->なぎぱいぢぎ:Landroid/view/View;

    goto :goto_ff

    .line 12
    :cond_e7
    :goto_e7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ()Z

    move-result v1

    if-eqz v1, :cond_f3

    .line 13
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    goto :goto_f6

    .line 14
    :cond_f3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび()V

    :goto_f6
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-virtual {v1, p1, p2, v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    :cond_ff
    :goto_ff
    iget-boolean p1, p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->びぐびあび:Z

    if-eqz p1, :cond_10a

    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    iput-boolean v2, p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->びぐびあび:Z

    :cond_10a
    return-void
.end method

.method public けときぜと()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v0

    goto :goto_12

    :cond_11
    const/4 v0, 0x0

    :goto_12
    return v0
.end method

.method public げがぴうあだ()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return v0
.end method

.method public こ〲しでおか(Landroid/view/View;ZLandroid/graphics/Rect;)V
    .registers 9

    if-eqz p2, :cond_22

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget v0, p2, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    iget v1, p2, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    iget v3, p2, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, p2

    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2e

    :cond_22
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p3, v1, v1, p2, v0}, Landroid/graphics/Rect;->set(IIII)V

    :goto_2e
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p2, :cond_6b

    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    if-eqz p2, :cond_6b

    invoke-virtual {p2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_6b

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->ぺふねづ〺:Landroid/graphics/RectF;

    invoke-virtual {v0, p3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget p2, v0, Landroid/graphics/RectF;->left:F

    float-to-double v1, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int p2, v1

    iget v1, v0, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, v0, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v0, v3

    invoke-virtual {p3, p2, v1, v2, v0}, Landroid/graphics/Rect;->set(IIII)V

    :cond_6b
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p3, p2, p1}, Landroid/graphics/Rect;->offset(II)V

    return-void
.end method

.method public ごづごきえ(I)Landroid/view/View;
    .registers 7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_30

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v3

    if-nez v3, :cond_12

    goto :goto_2d

    :cond_12
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ()I

    move-result v4

    if-ne v4, p1, :cond_2d

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v4

    if-nez v4, :cond_2d

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 1
    iget-boolean v4, v4, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v4, :cond_2c

    .line 2
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v3

    if-nez v3, :cond_2d

    :cond_2c
    return-object v2

    :cond_2d
    :goto_2d
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_30
    const/4 p1, 0x0

    return-object p1
.end method

.method public ごまぉてう(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぷちぅぐね(II)V

    return-void
.end method

.method public ごまけがぢは()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ざっざへづ()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
.end method

.method public final ざとぅぼこ〺(I)V
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ(I)V

    return-void
.end method

.method public しげにけぃ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 3

    return-void
.end method

.method public しぷげへが()Landroid/view/View;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public じぜこほぱ(Landroid/view/View;)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, v0

    return p1
.end method

.method public ずまげせび〳(I)V
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_19

    .line 1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->づざかべべ()I

    move-result v1

    const/4 v2, 0x0

    :goto_b
    if-ge v2, v1, :cond_19

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->びぐびあび(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_19
    return-void
.end method

.method public せだてはぺて()V
    .registers 1

    return-void
.end method

.method public せづっ〸ちね(Landroid/view/View;)I
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public ち〴みぎ〻び(Landroid/view/View;)I
    .registers 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result p1

    return p1
.end method

.method public つしけおつ(Landroidx/recyclerview/widget/RecyclerView;)Z
    .registers 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_c

    .line 2
    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    if-nez v0, :cond_15

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->ながふずは()Z

    move-result p1

    if-eqz p1, :cond_16

    :cond_15
    const/4 v1, 0x1

    :cond_16
    return v1
.end method

.method public づあてぐく(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 7

    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_25

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->いいにぽつ:Z

    if-eqz v0, :cond_25

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くねねぱす〻(III)Z

    move-result p2

    if-eqz p2, :cond_25

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くねねぱす〻(III)Z

    move-result p1

    if-nez p1, :cond_23

    goto :goto_25

    :cond_23
    const/4 p1, 0x0

    goto :goto_26

    :cond_25
    :goto_25
    const/4 p1, 0x1

    :goto_26
    return p1
.end method

.method public づおぴ〱いづ(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)V
    .registers 4

    return-void
.end method

.method public づざかべべ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public ておぞぞはね()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return v0
.end method

.method public てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public でどあくず(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 4

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public どぇぞほだ(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 9

    .line 1
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->がぐくいおす:[I

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    iget v3, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    iget v4, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    iget v5, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    invoke-virtual {p2, v2, v3, v4, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public な〱ちぉじ(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぎきぁ〱ぢ()V

    return-void
.end method

.method public ながふずは()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return v0
.end method

.method public なぎぱいぢぎ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public なぶひせが(Landroid/view/View;)I
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, p1

    return v0
.end method

.method public にぢ〱ぁな(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 11

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_d

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result p1

    move v0, p1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result p1

    if-eqz p1, :cond_1a

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result p2

    move v2, p2

    goto :goto_1b

    :cond_1a
    const/4 v2, 0x0

    :goto_1b
    const/4 v1, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;->げつ〴ぬぐ(IIIIZZ)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;

    move-result-object p1

    invoke-virtual {p4, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->ざっざへづ(Ljava/lang/Object;)V

    return-void
.end method

.method public にぷきなせこ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public のかまじえ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V
    .registers 8

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    :goto_8
    if-ltz v1, :cond_4d

    .line 2
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 3
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v4

    if-eqz v4, :cond_1f

    goto :goto_4a

    :cond_1f
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ごづごきえ(Z)V

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず()Z

    move-result v5

    if-eqz v5, :cond_2e

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_2e
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    if-eqz v5, :cond_37

    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->づざかべべ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :cond_37
    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ごづごきえ(Z)V

    .line 4
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v2

    const/4 v3, 0x0

    iput-object v3, v2, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iput-boolean v4, v2, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず:Z

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび()V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :goto_4a
    add-int/lit8 v1, v1, -0x1

    goto :goto_8

    .line 5
    :cond_4d
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    if-eqz p1, :cond_59

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_59
    if-lez v0, :cond_60

    .line 6
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    :cond_60
    return-void
.end method

.method public のね〱ばぁぢ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public のびぶけせ(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇいうげ〱〹(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public のぷのちつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public は〲ぱなで(Landroid/view/View;)Landroid/view/View;
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->どぇぞほだ(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_d

    return-object v1

    :cond_d
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    return-object v1

    :cond_18
    return-object p1
.end method

.method public はぁとそぎ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 4

    const/4 p1, 0x0

    return p1
.end method

.method public はつきどっ()Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)Z"
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public ばおぢでぎか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 3

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x1

    if-eqz p1, :cond_18

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    if-nez p1, :cond_a

    goto :goto_18

    :cond_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result p1

    if-eqz p1, :cond_18

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result p2

    :cond_18
    :goto_18
    return p2
.end method

.method public ぱでかぁ〻〹(II)V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->おぐぴう〸ず(II)V

    return-void
.end method

.method public ひぞ〴つき(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V
    .registers 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_1c

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v1

    if-nez v1, :cond_19

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻しざ〹おま(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    :cond_19
    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_1c
    return-void
.end method

.method public びえぁぜい(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 3

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x1

    if-eqz p1, :cond_18

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    if-nez p1, :cond_a

    goto :goto_18

    :cond_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result p1

    if-eqz p1, :cond_18

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result p2

    :cond_18
    :goto_18
    return p2
.end method

.method public びがえ〱な(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .registers 24

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const/4 v2, 0x2

    new-array v2, v2, [I

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v4

    .line 2
    iget v5, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 3
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v6

    sub-int/2addr v5, v6

    .line 4
    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 5
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLeft()I

    move-result v7

    iget v8, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v8

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getScrollX()I

    move-result v8

    sub-int/2addr v7, v8

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTop()I

    move-result v8

    iget v9, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v8, v9

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getScrollY()I

    move-result v9

    sub-int/2addr v8, v9

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Rect;->width()I

    move-result v9

    add-int/2addr v9, v7

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Rect;->height()I

    move-result v1

    add-int/2addr v1, v8

    sub-int/2addr v7, v3

    const/4 v3, 0x0

    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v10

    sub-int/2addr v8, v4

    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int/2addr v9, v5

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int/2addr v1, v6

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おかぷせ〱()I

    move-result v6

    const/4 v11, 0x1

    if-ne v6, v11, :cond_63

    if-eqz v5, :cond_5e

    goto :goto_6b

    :cond_5e
    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    goto :goto_6b

    :cond_63
    if-eqz v10, :cond_66

    goto :goto_6a

    :cond_66
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v10

    :goto_6a
    move v5, v10

    :goto_6b
    if-eqz v4, :cond_6e

    goto :goto_72

    :cond_6e
    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    move-result v4

    :goto_72
    aput v5, v2, v3

    aput v4, v2, v11

    .line 6
    aget v13, v2, v3

    aget v14, v2, v11

    if-eqz p5, :cond_ba

    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_83

    goto :goto_b7

    :cond_83
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v4

    .line 8
    iget v5, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 9
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v6

    sub-int/2addr v5, v6

    .line 10
    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 11
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v7

    sub-int/2addr v6, v7

    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->ぺぁあねじ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v7}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->どぇぞほだ(Landroid/view/View;Landroid/graphics/Rect;)V

    iget v1, v7, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v13

    if-ge v1, v5, :cond_b7

    iget v1, v7, Landroid/graphics/Rect;->right:I

    sub-int/2addr v1, v13

    if-le v1, v2, :cond_b7

    iget v1, v7, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v14

    if-ge v1, v6, :cond_b7

    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v14

    if-gt v1, v4, :cond_b5

    goto :goto_b7

    :cond_b5
    const/4 v1, 0x1

    goto :goto_b8

    :cond_b7
    :goto_b7
    const/4 v1, 0x0

    :goto_b8
    if-eqz v1, :cond_bf

    :cond_ba
    if-nez v13, :cond_c0

    if-eqz v14, :cond_bf

    goto :goto_c0

    :cond_bf
    return v3

    :cond_c0
    :goto_c0
    if-eqz p4, :cond_c8

    move-object/from16 v1, p1

    .line 12
    invoke-virtual {v1, v13, v14}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    goto :goto_d4

    :cond_c8
    move-object/from16 v1, p1

    const/16 v17, 0x0

    const/high16 v16, -0x80000000

    const/4 v15, 0x0

    move-object/from16 v12, p1

    .line 13
    invoke-virtual/range {v12 .. v17}, Landroidx/recyclerview/widget/RecyclerView;->ぇいうげ〱〹(IILandroid/view/animation/Interpolator;IZ)V

    :goto_d4
    return v11
.end method

.method public びぐびあび(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->ぺぁあねじ(Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method public びちづぼぬ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 7

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_12

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1e

    :cond_12
    const/16 v0, 0x2000

    .line 1
    iget-object v1, p3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 2
    iget-object v0, p3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 3
    :cond_1e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2e

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_3a

    :cond_2e
    const/16 v0, 0x1000

    .line 4
    iget-object v1, p3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 5
    iget-object v0, p3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 6
    :cond_3a
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ばおぢでぎか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result v0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->びえぁぜい(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->のね〱ばぁぢ()Z

    move-result p2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ごまけがぢは()I

    move-result v1

    invoke-static {v0, p1, p2, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$〺つふすそ;->げつ〴ぬぐ(IIZI)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$〺つふすそ;

    move-result-object p1

    invoke-virtual {p3, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->ごづごきえ(Ljava/lang/Object;)V

    return-void
.end method

.method public ぶでにく〼〳(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz v0, :cond_c

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V

    return-object v0

    :cond_c
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_18

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_18
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public ぷぞてのほき()Landroid/view/View;
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_18

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    .line 1
    iget-object v2, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto :goto_18

    :cond_17
    return-object v0

    :cond_18
    :goto_18
    return-object v1
.end method

.method public ぷちぅぐね(II)V
    .registers 4

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぬ〴づぞ:I

    const/4 v0, 0x0

    if-nez p1, :cond_15

    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->〺〲に〼へ〸:Z

    if-nez p1, :cond_15

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    :cond_15
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おぐぴう〸ず:I

    if-nez p1, :cond_29

    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->〺〲に〼へ〸:Z

    if-nez p1, :cond_29

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    :cond_29
    return-void
.end method

.method public へ〱そかのず(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/view/View;)Z
    .registers 4

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->つしけおつ(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result p1

    return p1
.end method

.method public へえどぜせ(Landroidx/recyclerview/widget/RecyclerView;III)V
    .registers 5

    return-void
.end method

.method public へぬ〴づぞ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public へぼ〳〻び(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    return-void
.end method

.method public ぺぁあねじ(IILandroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V
    .registers 5

    return-void
.end method

.method public ぺぃつぢぼ(I)V
    .registers 2

    return-void
.end method

.method public ぺがぅす〹ち()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public ぺづげぺが(Landroid/view/View;)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr p1, v0

    return p1
.end method

.method public ぺでどぜべ(Landroid/graphics/Rect;II)V
    .registers 6

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇとしたべど()I

    move-result v1

    invoke-static {p2, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺でおいここ()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p1

    .line 1
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p3, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    const/4 p1, 0x0

    return p1
.end method
