.class public Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Z

.field public づざかべべ:F

.field public びぐびあび:F


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->げつ〴ぬぐ:Z

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->〺つふすそ:I

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->くし〴〺ぅ:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->びぐびあび:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->づざかべべ:F

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->PropertySet:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    iput-boolean p2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->げつ〴ぬぐ:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    :goto_e
    if-ge v0, p2, :cond_52

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v1

    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->PropertySet_android_alpha:I

    if-ne v1, v2, :cond_21

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->びぐびあび:F

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->びぐびあび:F

    goto :goto_4f

    :cond_21
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->PropertySet_android_visibility:I

    if-ne v1, v2, :cond_36

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->〺つふすそ:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->〺つふすそ:I

    sget-object v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;->びぐびあび:[I

    sget-object v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;->びぐびあび:[I

    aget v1, v2, v1

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->〺つふすそ:I

    goto :goto_4f

    :cond_36
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->PropertySet_visibilityMode:I

    if-ne v1, v2, :cond_43

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->くし〴〺ぅ:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->くし〴〺ぅ:I

    goto :goto_4f

    :cond_43
    sget v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->PropertySet_motionProgress:I

    if-ne v1, v2, :cond_4f

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->づざかべべ:F

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->づざかべべ:F

    :cond_4f
    :goto_4f
    add-int/lit8 v0, v0, 0x1

    goto :goto_e

    :cond_52
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;)V
    .registers 3

    iget-boolean v0, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->げつ〴ぬぐ:Z

    iput-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->げつ〴ぬぐ:Z

    iget v0, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->〺つふすそ:I

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->〺つふすそ:I

    iget v0, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->びぐびあび:F

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->びぐびあび:F

    iget v0, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->づざかべべ:F

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->づざかべべ:F

    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->くし〴〺ぅ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ$びぐびあび;->くし〴〺ぅ:I

    return-void
.end method
