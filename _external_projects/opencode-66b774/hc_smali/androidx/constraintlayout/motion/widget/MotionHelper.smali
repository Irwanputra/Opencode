.class public Landroidx/constraintlayout/motion/widget/MotionHelper;
.super Landroidx/constraintlayout/widget/ConstraintHelper;
.source ""

# interfaces
.implements Landroidx/constraintlayout/motion/widget/MotionLayout$〳ぜぞぜべっ;


# instance fields
.field public いいにぽつ:Z

.field public てぜきぽく:F

.field public のぷのちつ:[Landroid/view/View;

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->いいにぽつ:Z

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->ぺふねづ〺:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->いいにぽつ:Z

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->ぺふねづ〺:Z

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionHelper;->てぜきぽく(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->いいにぽつ:Z

    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->ぺふねづ〺:Z

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionHelper;->てぜきぽく(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public getProgress()F
    .registers 2

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->てぜきぽく:F

    return v0
.end method

.method public setProgress(F)V
    .registers 7

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->てぜきぽく:F

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    const/4 v1, 0x0

    if-lez v0, :cond_21

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->ぺふねづ〺(Landroidx/constraintlayout/widget/ConstraintLayout;)[Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->のぷのちつ:[Landroid/view/View;

    :goto_13
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->くし〴〺ぅ:I

    if-ge v1, v0, :cond_3c

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->のぷのちつ:[Landroid/view/View;

    aget-object v0, v0, v1

    invoke-virtual {p0, v0, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->setProgress(Landroid/view/View;F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    :cond_21
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    :goto_2b
    if-ge v1, v2, :cond_3c

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroidx/constraintlayout/motion/widget/MotionHelper;

    if-eqz v4, :cond_36

    goto :goto_39

    :cond_36
    invoke-virtual {p0, v3, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->setProgress(Landroid/view/View;F)V

    :goto_39
    add-int/lit8 v1, v1, 0x1

    goto :goto_2b

    :cond_3c
    return-void
.end method

.method public setProgress(Landroid/view/View;F)V
    .registers 3

    return-void
.end method

.method public 〺つふすそ(Landroidx/constraintlayout/motion/widget/MotionLayout;II)V
    .registers 4

    return-void
.end method

.method public くし〴〺ぅ(Landroidx/constraintlayout/motion/widget/MotionLayout;IZF)V
    .registers 5

    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/constraintlayout/motion/widget/MotionLayout;IIF)V
    .registers 5

    return-void
.end method

.method public てぜきぽく(Landroid/util/AttributeSet;)V
    .registers 6

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->てぜきぽく(Landroid/util/AttributeSet;)V

    if-eqz p1, :cond_39

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->MotionHelper:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v0, :cond_36

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->MotionHelper_onShow:I

    if-ne v2, v3, :cond_27

    iget-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->いいにぽつ:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->いいにぽつ:Z

    goto :goto_33

    :cond_27
    sget v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->MotionHelper_onHide:I

    if-ne v2, v3, :cond_33

    iget-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->ぺふねづ〺:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->ぺふねづ〺:Z

    :cond_33
    :goto_33
    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    :cond_36
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_39
    return-void
.end method

.method public びぐびあび(Landroidx/constraintlayout/motion/widget/MotionLayout;I)V
    .registers 3

    return-void
.end method
