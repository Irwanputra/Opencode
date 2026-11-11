.class public Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;
.super Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/slider/BaseSlider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/slider/BaseSlider<",
            "***>;"
        }
    .end annotation
.end field

.field public ざとぅぼこ〺:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lcom/google/android/material/slider/BaseSlider;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/slider/BaseSlider<",
            "***>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Landroid/view/View;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ざとぅぼこ〺:Landroid/graphics/Rect;

    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    return-void
.end method


# virtual methods
.method public ぇぬぎばつ(Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v1}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_17
    return-void
.end method

.method public おぐぴう〸ず(FF)I
    .registers 7

    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v1}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_22

    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    iget-object v2, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ざとぅぼこ〺:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/material/slider/BaseSlider;->は〲ぱなで(ILandroid/graphics/Rect;)V

    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ざとぅぼこ〺:Landroid/graphics/Rect;

    float-to-int v2, p1

    float-to-int v3, p2

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    if-eqz v1, :cond_1f

    return v0

    :cond_1f
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_22
    const/4 p1, -0x1

    return p1
.end method

.method public ごづごきえ(IILandroid/os/Bundle;)Z
    .registers 9

    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a

    return v1

    :cond_a
    const/16 v0, 0x1000

    const/4 v2, 0x1

    const/16 v3, 0x2000

    if-eq p2, v0, :cond_41

    if-eq p2, v3, :cond_41

    const v0, 0x102003d

    if-eq p2, v0, :cond_19

    return v1

    :cond_19
    if-eqz p3, :cond_40

    const-string p2, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    invoke-virtual {p3, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_40

    :cond_24
    invoke-virtual {p3, p2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result p2

    iget-object p3, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    .line 1
    sget-object v0, Lcom/google/android/material/slider/BaseSlider;->えがぐせほち:Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Lcom/google/android/material/slider/BaseSlider;->ぉざぅち〻(IF)Z

    move-result p2

    if-eqz p2, :cond_40

    .line 2
    :goto_32
    iget-object p2, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    .line 3
    invoke-virtual {p2}, Lcom/google/android/material/slider/BaseSlider;->ごづごきえ()V

    .line 4
    iget-object p2, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {p2}, Landroid/view/View;->postInvalidate()V

    .line 5
    invoke-virtual {p0, p1, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻(II)V

    return v2

    :cond_40
    :goto_40
    return v1

    .line 6
    :cond_41
    iget-object p3, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    const/16 v0, 0x14

    .line 7
    sget-object v4, Lcom/google/android/material/slider/BaseSlider;->えがぐせほち:Ljava/lang/String;

    invoke-virtual {p3, v0}, Lcom/google/android/material/slider/BaseSlider;->〺つふすそ(I)F

    move-result p3

    if-ne p2, v3, :cond_4e

    neg-float p3, p3

    .line 8
    :cond_4e
    iget-object p2, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {p2}, Lcom/google/android/material/slider/BaseSlider;->ぺぁあねじ()Z

    move-result p2

    if-eqz p2, :cond_57

    neg-float p3, p3

    :cond_57
    iget-object p2, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {p2}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    add-float/2addr p2, p3

    iget-object p3, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {p3}, Lcom/google/android/material/slider/BaseSlider;->getValueFrom()F

    move-result p3

    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v0}, Lcom/google/android/material/slider/BaseSlider;->getValueTo()F

    move-result v0

    invoke-static {p2, p3, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺふねづ〺(FFF)F

    move-result p2

    iget-object p3, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    .line 9
    invoke-virtual {p3, p1, p2}, Lcom/google/android/material/slider/BaseSlider;->ぉざぅち〻(IF)Z

    move-result p2

    if-eqz p2, :cond_81

    goto :goto_32

    :cond_81
    return v1
.end method

.method public ぶでにく〼〳(ILづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 10

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->おぐぴう〸ず:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p2, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;)V

    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v0}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v2}, Lcom/google/android/material/slider/BaseSlider;->getValueFrom()F

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v3}, Lcom/google/android/material/slider/BaseSlider;->getValueTo()F

    move-result v3

    iget-object v4, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v4}, Landroid/view/View;->isEnabled()Z

    move-result v4

    if-eqz v4, :cond_3f

    cmpl-float v4, v1, v2

    if-lez v4, :cond_34

    const/16 v4, 0x2000

    .line 1
    iget-object v5, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v5, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_34
    cmpg-float v4, v1, v3

    if-gez v4, :cond_3f

    const/16 v4, 0x1000

    iget-object v5, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v5, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 2
    :cond_3f
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    const/4 v6, 0x1

    if-lt v4, v5, :cond_4b

    invoke-static {v6, v2, v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v2

    goto :goto_4c

    :cond_4b
    const/4 v2, 0x0

    :goto_4c
    if-lt v4, v5, :cond_53

    .line 3
    iget-object v3, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 4
    :cond_53
    const-class v2, Landroid/widget/SeekBar;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    .line 5
    iget-object v3, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v3}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_79

    iget-object v3, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v3}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_79
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v6, :cond_b3

    .line 7
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v0}, Lcom/google/android/material/slider/BaseSlider;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_96

    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/いいにぽつ;->material_slider_range_end:I

    goto :goto_a0

    :cond_96
    if-nez p1, :cond_a5

    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/いいにぽつ;->material_slider_range_start:I

    :goto_a0
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_a7

    :cond_a5
    const-string v0, ""

    .line 8
    :goto_a7
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/material/slider/BaseSlider;->ぁごぐすすぃ(F)Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    iget-object v1, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ぉざぅち〻:Lcom/google/android/material/slider/BaseSlider;

    iget-object v1, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ざとぅぼこ〺:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/slider/BaseSlider;->は〲ぱなで(ILandroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;->ざとぅぼこ〺:Landroid/graphics/Rect;

    .line 13
    iget-object p2, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    return-void
.end method
