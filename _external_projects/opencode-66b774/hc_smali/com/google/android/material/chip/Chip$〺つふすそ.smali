.class public Lcom/google/android/material/chip/Chip$〺つふすそ;
.super Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/chip/Chip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final synthetic ぉざぅち〻:Lcom/google/android/material/chip/Chip;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/Chip;Lcom/google/android/material/chip/Chip;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-direct {p0, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public 〻ぞまぎな〻(IZ)V
    .registers 4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_a

    iget-object p1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    .line 1
    iput-boolean p2, p1, Lcom/google/android/material/chip/Chip;->のぷのちつ:Z

    .line 2
    invoke-virtual {p1}, Landroid/widget/CheckBox;->refreshDrawableState()V

    :cond_a
    return-void
.end method

.method public ぇぬぎばつ(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    .line 1
    sget v2, Lcom/google/android/material/chip/Chip;->ざっざへづ:I

    invoke-virtual {v1}, Lcom/google/android/material/chip/Chip;->づざかべべ()Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 2
    iget-object v1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    .line 3
    iget-object v2, v1, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    const/4 v3, 0x1

    if-eqz v2, :cond_1e

    .line 4
    iget-boolean v2, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぇとしたべど:Z

    if-eqz v2, :cond_1e

    const/4 v0, 0x1

    :cond_1e
    if-eqz v0, :cond_2b

    .line 5
    iget-object v0, v1, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2b

    .line 6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2b
    return-void
.end method

.method public おぐぴう〸ず(FF)I
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    .line 1
    sget v1, Lcom/google/android/material/chip/Chip;->ざっざへづ:I

    invoke-virtual {v0}, Lcom/google/android/material/chip/Chip;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 2
    iget-object v0, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-static {v0}, Lcom/google/android/material/chip/Chip;->〺つふすそ(Lcom/google/android/material/chip/Chip;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result p1

    if-eqz p1, :cond_18

    const/4 p1, 0x1

    goto :goto_19

    :cond_18
    const/4 p1, 0x0

    :goto_19
    return p1
.end method

.method public ごづごきえ(IILandroid/os/Bundle;)Z
    .registers 5

    const/4 p3, 0x0

    const/16 v0, 0x10

    if-ne p2, v0, :cond_23

    if-nez p1, :cond_e

    iget-object p1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->performClick()Z

    move-result p1

    return p1

    :cond_e
    const/4 p2, 0x1

    if-ne p1, p2, :cond_23

    iget-object p1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    .line 1
    invoke-virtual {p1, p3}, Landroid/widget/CheckBox;->playSoundEffect(I)V

    iget-object v0, p1, Lcom/google/android/material/chip/Chip;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1e

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    const/4 p3, 0x1

    :cond_1e
    iget-object p1, p1, Lcom/google/android/material/chip/Chip;->ぉざぅち〻:Lcom/google/android/material/chip/Chip$〺つふすそ;

    invoke-virtual {p1, p2, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(II)Z

    :cond_23
    return p3
.end method

.method public でどあくず(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {v0}, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ()Z

    move-result v0

    .line 1
    iget-object v1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 2
    iget-object v0, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isClickable()Z

    move-result v0

    .line 3
    iget-object v1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 4
    iget-object v0, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {v0}, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ()Z

    move-result v0

    if-nez v0, :cond_2f

    iget-object v0, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_27

    goto :goto_2f

    .line 5
    :cond_27
    iget-object v0, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "android.view.View"

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    goto :goto_41

    .line 6
    :cond_2f
    :goto_2f
    iget-object v0, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {v0}, Lcom/google/android/material/chip/Chip;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_3a

    const-string v0, "android.widget.CompoundButton"

    goto :goto_3c

    :cond_3a
    const-string v0, "android.widget.Button"

    .line 7
    :goto_3c
    iget-object v1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 8
    :goto_41
    iget-object v0, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_53

    .line 9
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    goto :goto_58

    .line 10
    :cond_53
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_58
    return-void
.end method

.method public ぶでにく〼〳(ILづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 9

    const-string v0, ""

    const/4 v1, 0x1

    if-ne p1, v1, :cond_51

    iget-object p1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {p1}, Lcom/google/android/material/chip/Chip;->getCloseIconContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_e

    goto :goto_30

    .line 1
    :cond_e
    iget-object p1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/いいにぽつ;->mtrl_chip_close_icon_content_description:I

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_26

    move-object v0, p1

    :cond_26
    aput-object v0, v1, v4

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 2
    :goto_30
    iget-object v0, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-static {p1}, Lcom/google/android/material/chip/Chip;->くし〴〺ぅ(Lcom/google/android/material/chip/Chip;)Landroid/graphics/Rect;

    move-result-object p1

    .line 4
    iget-object v0, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 5
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p2, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;)V

    iget-object p1, p0, Lcom/google/android/material/chip/Chip$〺つふすそ;->ぉざぅち〻:Lcom/google/android/material/chip/Chip;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p1

    .line 6
    iget-object p2, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    goto :goto_5d

    .line 7
    :cond_51
    iget-object p1, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 8
    sget-object p1, Lcom/google/android/material/chip/Chip;->でどあくず:Landroid/graphics/Rect;

    .line 9
    iget-object p2, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    :goto_5d
    return-void
.end method
