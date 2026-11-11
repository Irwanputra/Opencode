.class public Landroidx/constraintlayout/helper/widget/Flow;
.super Landroidx/constraintlayout/widget/VirtualLayout;
.source ""


# instance fields
.field public てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .registers 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p0, v0, p1, p2}, Landroidx/constraintlayout/helper/widget/Flow;->ごづごきえ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;II)V

    return-void
.end method

.method public setFirstHorizontalBias(F)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->せばぴ〸び:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstHorizontalStyle(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->え〱さぽぜ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstVerticalBias(F)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->〵いどうねぢ:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstVerticalStyle(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づおぴ〱いづ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalAlign(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->ぃぉみぜす:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalBias(F)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->〻だくけはく:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalGap(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->ぉいけぐつ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalStyle(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づあてぐく:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setMaxElementsWrap(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->えげて〱でく:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setOrientation(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づふぱぐそ〹:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPadding(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->〻はぎっぼ:I

    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->びがえ〱な:I

    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->かちして〹づ:I

    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->はぁとそぎ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingBottom(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->びがえ〱な:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingLeft(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->ぺぃつぢぼ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingRight(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->く〱なおぎ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingTop(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->〻はぎっぼ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalAlign(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づ〵ぬきすへ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalBias(F)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->おぬぃかはど:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalGap(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->〴おちすく:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalStyle(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->にぷきなせこ:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setWrapMode(I)V
    .registers 3

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iput p1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->ぎがえべぱど:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public ごづごきえ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;II)V
    .registers 6

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p3

    if-eqz p1, :cond_1d

    invoke-virtual {p1, v0, p2, v1, p3}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->のね〱ばぁぢ(IIII)V

    .line 1
    iget p2, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->ぷちぅぐね:I

    .line 2
    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->ぺでどぜべ:I

    .line 3
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_21

    :cond_1d
    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    :goto_21
    return-void
.end method

.method public てぜきぽく(Landroid/util/AttributeSet;)V
    .registers 8

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/VirtualLayout;->てぜきぽく(Landroid/util/AttributeSet;)V

    new-instance v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-direct {v0}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    if-eqz p1, :cond_1a4

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
    if-ge v2, v0, :cond_1a1

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_android_orientation:I

    if-ne v3, v4, :cond_30

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 1
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づふぱぐそ〹:I

    goto/16 :goto_19d

    .line 2
    :cond_30
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_android_padding:I

    if-ne v3, v4, :cond_44

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 3
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->〻はぎっぼ:I

    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->びがえ〱な:I

    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->かちして〹づ:I

    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->はぁとそぎ:I

    goto/16 :goto_19d

    .line 4
    :cond_44
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_android_paddingStart:I

    const/16 v5, 0x11

    if-ne v3, v4, :cond_5c

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v5, :cond_19d

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 5
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->かちして〹づ:I

    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->ぺぃつぢぼ:I

    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->く〱なおぎ:I

    goto/16 :goto_19d

    .line 6
    :cond_5c
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_android_paddingEnd:I

    if-ne v3, v4, :cond_6e

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v5, :cond_19d

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 7
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->はぁとそぎ:I

    goto/16 :goto_19d

    .line 8
    :cond_6e
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_android_paddingLeft:I

    if-ne v3, v4, :cond_7c

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 9
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->ぺぃつぢぼ:I

    goto/16 :goto_19d

    .line 10
    :cond_7c
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_android_paddingTop:I

    if-ne v3, v4, :cond_8a

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 11
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->〻はぎっぼ:I

    goto/16 :goto_19d

    .line 12
    :cond_8a
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_android_paddingRight:I

    if-ne v3, v4, :cond_98

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 13
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->く〱なおぎ:I

    goto/16 :goto_19d

    .line 14
    :cond_98
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_android_paddingBottom:I

    if-ne v3, v4, :cond_a6

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 15
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->びがえ〱な:I

    goto/16 :goto_19d

    .line 16
    :cond_a6
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_wrapMode:I

    if-ne v3, v4, :cond_b4

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 17
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->ぎがえべぱど:I

    goto/16 :goto_19d

    .line 18
    :cond_b4
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_horizontalStyle:I

    if-ne v3, v4, :cond_c2

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 19
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づあてぐく:I

    goto/16 :goto_19d

    .line 20
    :cond_c2
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_verticalStyle:I

    if-ne v3, v4, :cond_d0

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 21
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->にぷきなせこ:I

    goto/16 :goto_19d

    .line 22
    :cond_d0
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_firstHorizontalStyle:I

    if-ne v3, v4, :cond_de

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 23
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->え〱さぽぜ:I

    goto/16 :goto_19d

    .line 24
    :cond_de
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_lastHorizontalStyle:I

    if-ne v3, v4, :cond_ec

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 25
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->いおてぢび:I

    goto/16 :goto_19d

    .line 26
    :cond_ec
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_firstVerticalStyle:I

    if-ne v3, v4, :cond_fa

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 27
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づおぴ〱いづ:I

    goto/16 :goto_19d

    .line 28
    :cond_fa
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_lastVerticalStyle:I

    if-ne v3, v4, :cond_108

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 29
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->〳に〴あぽ:I

    goto/16 :goto_19d

    .line 30
    :cond_108
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_horizontalBias:I

    const/high16 v5, 0x3f000000    # 0.5f

    if-ne v3, v4, :cond_118

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    .line 31
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->〻だくけはく:F

    goto/16 :goto_19d

    .line 32
    :cond_118
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_firstHorizontalBias:I

    if-ne v3, v4, :cond_126

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    .line 33
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->せばぴ〸び:F

    goto/16 :goto_19d

    .line 34
    :cond_126
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_lastHorizontalBias:I

    if-ne v3, v4, :cond_134

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    .line 35
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->っあつぜっ:F

    goto/16 :goto_19d

    .line 36
    :cond_134
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_firstVerticalBias:I

    if-ne v3, v4, :cond_141

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    .line 37
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->〵いどうねぢ:F

    goto :goto_19d

    .line 38
    :cond_141
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_lastVerticalBias:I

    if-ne v3, v4, :cond_14e

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    .line 39
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->ぴまけ〸だて:F

    goto :goto_19d

    .line 40
    :cond_14e
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_verticalBias:I

    if-ne v3, v4, :cond_15b

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    .line 41
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->おぬぃかはど:F

    goto :goto_19d

    .line 42
    :cond_15b
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_horizontalAlign:I

    const/4 v5, 0x2

    if-ne v3, v4, :cond_169

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 43
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->ぃぉみぜす:I

    goto :goto_19d

    .line 44
    :cond_169
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_verticalAlign:I

    if-ne v3, v4, :cond_176

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 45
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づ〵ぬきすへ:I

    goto :goto_19d

    .line 46
    :cond_176
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_horizontalGap:I

    if-ne v3, v4, :cond_183

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 47
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->ぉいけぐつ:I

    goto :goto_19d

    .line 48
    :cond_183
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_verticalGap:I

    if-ne v3, v4, :cond_190

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 49
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->〴おちすく:I

    goto :goto_19d

    .line 50
    :cond_190
    sget v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_Layout_flow_maxElementsWrap:I

    if-ne v3, v4, :cond_19d

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    const/4 v5, -0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 51
    iput v3, v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->えげて〱でく:I

    :cond_19d
    :goto_19d
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1c

    .line 52
    :cond_1a1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1a4
    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

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

    instance-of p1, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    if-eqz p1, :cond_10

    check-cast p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    iget p1, p3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->ち〴みぎ〻び:I

    const/4 p3, -0x1

    if-eq p1, p3, :cond_10

    .line 1
    iput p1, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;->づふぱぐそ〹:I

    :cond_10
    return-void
.end method

.method public へぬ〴づぞ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;Z)V
    .registers 5

    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Flow;->てぜきぽく:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/なぎぱいぢぎ;

    .line 1
    iget v0, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->かちして〹づ:I

    if-gtz v0, :cond_a

    iget v1, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->はぁとそぎ:I

    if-lez v1, :cond_19

    :cond_a
    if-eqz p2, :cond_13

    iget p2, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->はぁとそぎ:I

    iput p2, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->ぺぃつぢぼ:I

    iput v0, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->く〱なおぎ:I

    goto :goto_19

    :cond_13
    iput v0, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->ぺぃつぢぼ:I

    iget p2, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->はぁとそぎ:I

    iput p2, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/ぺふねづ〺;->く〱なおぎ:I

    :cond_19
    :goto_19
    return-void
.end method
