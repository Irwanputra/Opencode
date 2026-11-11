.class public Landroidx/appcompat/widget/AppCompatCheckBox;
.super Landroid/widget/CheckBox;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/づざかべべ;
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;


# instance fields
.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

.field public final くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

.field public final びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->checkboxStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-static {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->げつ〴ぬぐ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ(Landroid/util/AttributeSet;I)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->びぐびあび(Landroid/util/AttributeSet;I)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 2

    invoke-super {p0}, Landroid/widget/CheckBox;->drawableStateChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ()V

    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_11
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .registers 3

    invoke-super {p0}, Landroid/widget/CheckBox;->getCompoundPaddingLeft()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

    if-eqz v1, :cond_c

    invoke-virtual {v1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->〺つふすそ(I)I

    move-result v0

    :cond_c
    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

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

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->〺つふすそ:Landroid/content/res/ColorStateList;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

    if-eqz v0, :cond_7

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ:Landroid/graphics/PorterDuff$Mode;

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    return-object v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->づざかべべ()V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ(I)V

    :cond_a
    return-void
.end method

.method public setButtonDrawable(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

    if-eqz p1, :cond_15

    .line 1
    iget-boolean v0, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    iput-boolean v0, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->なぎぱいぢぎ:Z

    goto :goto_15

    :cond_f
    const/4 v0, 0x1

    iput-boolean v0, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->なぎぱいぢぎ:Z

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ()V

    :cond_15
    :goto_15
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->ぺぁあねじ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

    if-eqz v0, :cond_c

    .line 1
    iput-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->〺つふすそ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->びぐびあび:Z

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ()V

    :cond_c
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;

    if-eqz v0, :cond_c

    .line 1
    iput-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->づざかべべ:Z

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ()V

    :cond_c
    return-void
.end method
