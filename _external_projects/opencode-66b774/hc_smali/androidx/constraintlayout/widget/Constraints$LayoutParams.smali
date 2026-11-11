.class public Landroidx/constraintlayout/widget/Constraints$LayoutParams;
.super Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/Constraints;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field public 〺〲に〼へ〸:F

.field public ぁないぼぎへ:F

.field public ぅばづそほせ:F

.field public ぉねぞはがぞ:F

.field public がぐくいおす:F

.field public しげにけぃ:F

.field public しぷげへが:F

.field public せだてはぺて:F

.field public つしけおつ:F

.field public にぢ〱ぁな:Z

.field public ぱでかぁ〻〹:F

.field public へえどぜせ:F

.field public へぼ〳〻び:F


# direct methods
.method public constructor <init>(II)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぉねぞはがぞ:F

    const/4 p2, 0x0

    iput-boolean p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->にぢ〱ぁな:Z

    const/4 p2, 0x0

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->しぷげへが:F

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->へぼ〳〻び:F

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぁないぼぎへ:F

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->へえどぜせ:F

    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぅばづそほせ:F

    iput p1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->せだてはぺて:F

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->がぐくいおす:F

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->しげにけぃ:F

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->〺〲に〼へ〸:F

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぱでかぁ〻〹:F

    iput p2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->つしけおつ:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 7

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぉねぞはがぞ:F

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->にぢ〱ぁな:Z

    const/4 v2, 0x0

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->しぷげへが:F

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->へぼ〳〻び:F

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぁないぼぎへ:F

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->へえどぜせ:F

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぅばづそほせ:F

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->せだてはぺて:F

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->がぐくいおす:F

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->しげにけぃ:F

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->〺〲に〼へ〸:F

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぱでかぁ〻〹:F

    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->つしけおつ:F

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    :goto_2b
    if-ge v1, p2, :cond_e1

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v0

    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_alpha:I

    if-ne v0, v2, :cond_3f

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぉねぞはがぞ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぉねぞはがぞ:F

    goto/16 :goto_dd

    :cond_3f
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_elevation:I

    const/16 v3, 0x15

    if-ne v0, v2, :cond_56

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v3, :cond_dd

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->しぷげへが:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->しぷげへが:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->にぢ〱ぁな:Z

    goto/16 :goto_dd

    :cond_56
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_rotationX:I

    if-ne v0, v2, :cond_64

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぁないぼぎへ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぁないぼぎへ:F

    goto/16 :goto_dd

    :cond_64
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_rotationY:I

    if-ne v0, v2, :cond_72

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->へえどぜせ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->へえどぜせ:F

    goto/16 :goto_dd

    :cond_72
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_rotation:I

    if-ne v0, v2, :cond_7f

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->へぼ〳〻び:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->へぼ〳〻び:F

    goto :goto_dd

    :cond_7f
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_scaleX:I

    if-ne v0, v2, :cond_8c

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぅばづそほせ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぅばづそほせ:F

    goto :goto_dd

    :cond_8c
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_scaleY:I

    if-ne v0, v2, :cond_99

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->せだてはぺて:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->せだてはぺて:F

    goto :goto_dd

    :cond_99
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_transformPivotX:I

    if-ne v0, v2, :cond_a6

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->がぐくいおす:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->がぐくいおす:F

    goto :goto_dd

    :cond_a6
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_transformPivotY:I

    if-ne v0, v2, :cond_b3

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->しげにけぃ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->しげにけぃ:F

    goto :goto_dd

    :cond_b3
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_translationX:I

    if-ne v0, v2, :cond_c0

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->〺〲に〼へ〸:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->〺〲に〼へ〸:F

    goto :goto_dd

    :cond_c0
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_translationY:I

    if-ne v0, v2, :cond_cd

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぱでかぁ〻〹:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->ぱでかぁ〻〹:F

    goto :goto_dd

    :cond_cd
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintSet_android_translationZ:I

    if-ne v0, v2, :cond_dd

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v3, :cond_dd

    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->つしけおつ:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->つしけおつ:F

    :cond_dd
    :goto_dd
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2b

    :cond_e1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
