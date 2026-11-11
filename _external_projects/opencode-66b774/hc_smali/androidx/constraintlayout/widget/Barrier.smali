.class public Landroidx/constraintlayout/widget/Barrier;
.super Landroidx/constraintlayout/widget/ConstraintHelper;
.source ""


# instance fields
.field public いいにぽつ:I

.field public てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x8

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x8

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public getMargin()I
    .registers 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 1
    iget v0, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->かちして〹づ:I

    return v0
.end method

.method public getType()I
    .registers 2

    iget v0, p0, Landroidx/constraintlayout/widget/Barrier;->いいにぽつ:I

    return v0
.end method

.method public setAllowsGoneWidget(Z)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 1
    iput-boolean p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->びがえ〱な:Z

    return-void
.end method

.method public setDpMargin(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->かちして〹づ:I

    return-void
.end method

.method public setMargin(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->かちして〹づ:I

    return-void
.end method

.method public setType(I)V
    .registers 2

    iput p1, p0, Landroidx/constraintlayout/widget/Barrier;->いいにぽつ:I

    return-void
.end method

.method public final ごづごきえ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;IZ)V
    .registers 9

    iput p2, p0, Landroidx/constraintlayout/widget/Barrier;->ぺふねづ〺:I

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x6

    const/4 v3, 0x5

    const/16 v4, 0x11

    if-ge p2, v4, :cond_16

    iget p2, p0, Landroidx/constraintlayout/widget/Barrier;->いいにぽつ:I

    if-ne p2, v3, :cond_13

    :goto_10
    iput v1, p0, Landroidx/constraintlayout/widget/Barrier;->ぺふねづ〺:I

    goto :goto_28

    :cond_13
    if-ne p2, v2, :cond_28

    :goto_15
    goto :goto_1c

    :cond_16
    iget p2, p0, Landroidx/constraintlayout/widget/Barrier;->いいにぽつ:I

    if-eqz p3, :cond_22

    if-ne p2, v3, :cond_1f

    :goto_1c
    iput v0, p0, Landroidx/constraintlayout/widget/Barrier;->ぺふねづ〺:I

    goto :goto_28

    :cond_1f
    if-ne p2, v2, :cond_28

    goto :goto_10

    :cond_22
    if-ne p2, v3, :cond_25

    goto :goto_10

    :cond_25
    if-ne p2, v2, :cond_28

    goto :goto_15

    :cond_28
    :goto_28
    instance-of p2, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    if-eqz p2, :cond_32

    check-cast p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget p2, p0, Landroidx/constraintlayout/widget/Barrier;->ぺふねづ〺:I

    .line 1
    iput p2, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->〻はぎっぼ:I

    :cond_32
    return-void
.end method

.method public てぜきぽく(Landroid/util/AttributeSet;)V
    .registers 8

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->てぜきぽく(Landroid/util/AttributeSet;)V

    new-instance v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    if-eqz p1, :cond_4e

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1c
    if-ge v2, v0, :cond_4b

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_barrierDirection:I

    if-ne v3, v4, :cond_2e

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    goto :goto_48

    :cond_2e
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_barrierAllowsGoneWidgets:I

    if-ne v3, v4, :cond_3c

    iget-object v4, p0, Landroidx/constraintlayout/widget/Barrier;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    const/4 v5, 0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    .line 1
    iput-boolean v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->びがえ〱な:Z

    goto :goto_48

    .line 2
    :cond_3c
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_barrierMargin:I

    if-ne v3, v4, :cond_48

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iget-object v4, p0, Landroidx/constraintlayout/widget/Barrier;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 3
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->かちして〹づ:I

    :cond_48
    :goto_48
    add-int/lit8 v2, v2, 0x1

    goto :goto_1c

    .line 4
    :cond_4b
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_4e
    iget-object p1, p0, Landroidx/constraintlayout/widget/Barrier;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->づざかべべ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/〳ぜぞぜべっ;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintHelper;->は〲ぱなで()V

    return-void
.end method

.method public のぷのちつ(Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺぁあねじ;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u304f\u3057\u3034\u303a\u3045$\u3052\u3064\u3034\u306c\u3050;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u307a\u3041\u3042\u306d\u3058;",
            "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;",
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u3073\u3050\u3073\u3042\u3073;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintHelper;->のぷのちつ(Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺぁあねじ;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V

    instance-of p3, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    if-eqz p3, :cond_21

    move-object p3, p2

    check-cast p3, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 1
    iget-object p2, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ち〴みぎ〻び:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    .line 2
    check-cast p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/づざかべべ;

    .line 3
    iget-boolean p2, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/づざかべべ;->かちして〹づ:Z

    .line 4
    iget-object p4, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;

    iget p4, p4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->ずまげせび〳:I

    invoke-virtual {p0, p3, p4, p2}, Landroidx/constraintlayout/widget/Barrier;->ごづごきえ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;IZ)V

    iget-object p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;

    iget-boolean p2, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->のびぶけせ:Z

    .line 5
    iput-boolean p2, p3, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->びがえ〱な:Z

    .line 6
    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$〺つふすそ;->かづげぃぁ〺:I

    .line 7
    iput p1, p3, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/げつ〴ぬぐ;->かちして〹づ:I

    :cond_21
    return-void
.end method

.method public へぬ〴づぞ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;Z)V
    .registers 4

    iget v0, p0, Landroidx/constraintlayout/widget/Barrier;->いいにぽつ:I

    invoke-virtual {p0, p1, v0, p2}, Landroidx/constraintlayout/widget/Barrier;->ごづごきえ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;IZ)V

    return-void
.end method
