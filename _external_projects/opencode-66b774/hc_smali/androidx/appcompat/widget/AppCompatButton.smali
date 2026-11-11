.class public Landroidx/appcompat/widget/AppCompatButton;
.super Landroid/widget/Button;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;
.implements Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;
.implements Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/なぎぱいぢぎ;


# instance fields
.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

.field public final くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->buttonStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-static {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->げつ〴ぬぐ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->びぐびあび(Landroid/util/AttributeSet;I)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 2

    invoke-super {p0}, Landroid/widget/Button;->drawableStateChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ()V

    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_11
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .registers 2

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->づざかべべ:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_16
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .registers 2

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->びぐびあび:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_16
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .registers 2

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->くし〴〺ぅ:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_16
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .registers 2

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_12

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->なぎぱいぢぎ:[I

    return-object v0

    :cond_12
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .registers 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_d

    const/4 v1, 0x1

    :cond_d
    return v1

    :cond_e
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_17

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->げつ〴ぬぐ:I

    return v0

    :cond_17
    return v1
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〺つふすそ()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->げつ〴ぬぐ:Landroid/content/res/ColorStateList;

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->〺つふすそ:Landroid/graphics/PorterDuff$Mode;

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 6

    invoke-super/range {p0 .. p5}, Landroid/widget/Button;->onLayout(ZIIII)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_10

    .line 1
    sget-boolean p2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-nez p2, :cond_10

    .line 2
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〺つふすそ()V

    :cond_10
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_18

    sget-boolean p2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-nez p2, :cond_18

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび()Z

    move-result p1

    if-eqz p1, :cond_18

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    .line 1
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〺つふすそ()V

    :cond_18
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .registers 6

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_f

    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1, p2, p3, p4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぁごぐすすぃ(IIII)V

    :cond_f
    :goto_f
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .registers 4

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_f

    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ([II)V

    :cond_f
    :goto_f
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .registers 3

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/Button;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_f

    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ(I)V

    :cond_f
    :goto_f
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->づざかべべ()V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundResource(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ(I)V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->いたぷすいだ(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/Button;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setSupportAllCaps(Z)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_9

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_9
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->ぺぁあねじ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 4

    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->なぎぱいぢぎ(Landroid/content/Context;I)V

    :cond_a
    return-void
.end method

.method public setTextSize(IF)V
    .registers 5

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextSize(IF)V

    goto :goto_19

    :cond_8
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatButton;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v1, :cond_19

    if-nez v0, :cond_19

    .line 1
    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび()Z

    move-result v0

    if-nez v0, :cond_19

    .line 2
    iget-object v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぁごぐすすぃ(IF)V

    :cond_19
    :goto_19
    return-void
.end method
